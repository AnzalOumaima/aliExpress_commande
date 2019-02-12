/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.service.impl;

import com.express.aliExpress_commande.bean.ReceptionItem;
import com.express.aliExpress_commande.dao.ReceptionItemDao;
import com.express.aliExpress_commande.service.CommandeItemService;
import com.express.aliExpress_commande.service.ReceptionItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class ReceptionItemServiceImpl implements ReceptionItemService {

    @Autowired
    private ReceptionItemDao receptionItemDao;
//    @Autowired
//    private ReceptionService receptionService;

    @Override
    public List<ReceptionItem> findByReceptionReference(String referenceReception) {
        return receptionItemDao.findByReceptionReference(referenceReception);
    }

    @Override
    public int deleteByReceptionReference(String referenceReception) {
        return receptionItemDao.deleteByReceptionReference(referenceReception);
    }

    @Override
    public List<ReceptionItem> findByReferenceProduit(String referenceProduit) {
        return receptionItemDao.findByReferenceProduit(referenceProduit);
    }

    @Override
    public void creer(ReceptionItem item) {
        receptionItemDao.save(item);
    }

    public ReceptionItemDao getReceptionItemDao() {
        return receptionItemDao;
    }

    public void setReceptionItemDao(ReceptionItemDao receptionItemDao) {
        this.receptionItemDao = receptionItemDao;
    }

}
