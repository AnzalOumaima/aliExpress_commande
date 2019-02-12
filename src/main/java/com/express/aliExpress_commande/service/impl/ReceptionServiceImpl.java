/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.service.impl;

import com.express.aliExpress_commande.bean.Reception;
import com.express.aliExpress_commande.bean.ReceptionItem;
import com.express.aliExpress_commande.dao.ReceptionDao;
import com.express.aliExpress_commande.service.ReceptionItemService;
import com.express.aliExpress_commande.service.ReceptionService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class ReceptionServiceImpl implements ReceptionService {

    @Autowired
    private ReceptionDao receptionDao;
    @Autowired
    private ReceptionItemService receptionItemService;

    @Override
    public Reception findByReference(String reference) {
        return receptionDao.findByReference(reference);
    }

    @Override
    public List<Reception> findByCommandeReference(String reference) {
        return receptionDao.findByCommandeReference(reference);
    }

    @Override
    public int save(Reception reception, List<ReceptionItem> items) {
        Reception rec = findByReference(reception.getReference());
        if (rec != null) {
            return -1;
        } else if (items == null) {
            return -2;
        } else {
            reception.setDateCreation(new Date());
            double total = 0;
            for (ReceptionItem item : items) {
                item.setReception(reception);
                total += item.getPrix() * item.getQte();
                reception.setMontantTotal(total);
                receptionItemService.creer(item);
                receptionDao.save(reception);
            }
            return 1;
        }
    }

    @Override
    public int deleteByCommandeReference(String reference) {
        List<Reception> receptions = findByCommandeReference(reference);
        if (receptions == null) {
            return -1;
        } else {
            for (Reception reception : receptions) {
                int res = receptionItemService.deleteByReceptionReference(reception.getReference());
                if (res > 0) {
                    receptionDao.delete(reception);
                }
            }
            return 1;
        }
    }

    public ReceptionDao getReceptionDao() {
        return receptionDao;
    }

    public void setReceptionDao(ReceptionDao receptionDao) {
        this.receptionDao = receptionDao;
    }

    public ReceptionItemService getReceptionItemService() {
        return receptionItemService;
    }

    public void setReceptionItemService(ReceptionItemService receptionItemService) {
        this.receptionItemService = receptionItemService;
    }

}
