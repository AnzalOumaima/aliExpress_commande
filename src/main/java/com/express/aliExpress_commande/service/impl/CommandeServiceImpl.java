/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.service.impl;

import com.express.aliExpress_commande.bean.Commande;
import com.express.aliExpress_commande.bean.CommandeItem;
import com.express.aliExpress_commande.dao.CommandeDao;
import com.express.aliExpress_commande.service.CommandeItemService;
import com.express.aliExpress_commande.service.CommandeService;
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
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    private CommandeDao commandeDao;
    @Autowired
    private CommandeItemService commandeItemService;
    @Autowired
    private ReceptionService receptionService;

    @Override
    public Commande findByReference(String reference) {
        return commandeDao.findByReference(reference);
    }

//    @Override
//    public int payer(String reference, double montant) {
//        Commande commande = findByReference(reference);
//        if (commande == null) {
//            return -1;
//        } else if (montant + commande.getMontantpaye() > commande.getMontantTotal()) {
//            return -2;
//        } else {
//            commande.setMontantpaye(montant + commande.getMontantpaye());
//            commandeDao.save(commande);
//            return 1;
//        }
//    }
    @Override
    public int creer(Commande commande) {
        Commande c = findByReference(commande.getReference());
        if (c != null) {
            return -1;
        } else {
            commande.setDateCreation(new Date());
            commandeDao.save(commande);
            return 1;
        }

    }

    @Override
    public int save(Commande commande) {
        int res = creer(commande);
        if (res < 0) {
            return -1;
        } else if (commande.getCommandeItems() == null) {
            return -2;
        } else {
            double total = 0;
            List<CommandeItem> items = commande.getCommandeItems();
            for (CommandeItem item : items) {
                item.setCommande(commande);
                commandeItemService.creer(item);
                total += item.getPrix() * item.getQte();
                commande.setMontantTotal(total);
                commandeDao.save(commande);
            }
            return 1;
        }
    }

    @Override
    public int delete(Commande commande) {
        Commande c = findByReference(commande.getReference());
        if (c == null) {
            return -1;
        } else {
            int res = commandeItemService.deleteByCommandeReference(commande.getReference());
            int rest = receptionService.deleteByCommandeReference(commande.getReference());
            if (res < 0) {
                return -2;
            } else {
                commandeDao.delete(commande);
                return 1;
            }
        }
    }

    public CommandeDao getCommandeDao() {
        return commandeDao;
    }

    public void setCommandeDao(CommandeDao commandeDao) {
        this.commandeDao = commandeDao;
    }

    public CommandeItemService getCommandeItemService() {
        return commandeItemService;
    }

    public void setCommandeItemService(CommandeItemService commandeItemService) {
        this.commandeItemService = commandeItemService;
    }

    public ReceptionService getReceptionService() {
        return receptionService;
    }

    public void setReceptionService(ReceptionService receptionService) {
        this.receptionService = receptionService;
    }

}
