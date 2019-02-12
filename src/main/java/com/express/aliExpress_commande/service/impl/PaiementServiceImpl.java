/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.service.impl;

import com.express.aliExpress_commande.bean.Commande;
import com.express.aliExpress_commande.bean.Paiement;
import com.express.aliExpress_commande.dao.PaiementDao;
import com.express.aliExpress_commande.service.CommandeService;
import com.express.aliExpress_commande.service.PaiementService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class PaiementServiceImpl implements PaiementService {

    @Autowired
    private PaiementDao paiementDao;
    @Autowired
    private CommandeService commandeService;

    @Override
    public Paiement findByReference(String reference) {
        return paiementDao.findByReference(reference);
    }

    @Override
    public List<Paiement> findeByCommandeReference(String referenceCommande) {
        return paiementDao.findeByCommandeReference(referenceCommande);
    }

    @Override
    public int Payer(String referenceCommande, double montant) {
        Commande commande = commandeService.findByReference(referenceCommande);
        if (commande == null) {
            return -1;
        } else {
            List<Paiement> paiements = paiementDao.findeByCommandeReference(referenceCommande);
            double totalPaiement = 0;
            for (Paiement paiement : paiements) {
                totalPaiement += paiement.getPrix();
            }
            if (commande.getMontantTotal() < totalPaiement + montant) {
                Paiement paiement = new Paiement();
                paiement.setDatePaiement(new Date());
                paiement.setPrix(montant);
                paiement.setCommande(commande);
                return 1;
            } else {
                return -2;
            }
        }
    }

    @Override
    public int checkPaiement(String referenceCommande) {
        Commande commande = commandeService.findByReference(referenceCommande);
        if (commande == null) {
            return -1;
        } else {
            List<Paiement> paiements = paiementDao.findeByCommandeReference(referenceCommande);
            double totalPaiement = 0;
            for (Paiement paiement : paiements) {
                totalPaiement += paiement.getPrix();
            }
            if (commande.getMontantTotal() == totalPaiement) {
                return 1;
            } else {
                return -2;
            }
        }
    }

    public PaiementDao getPaiementDao() {
        return paiementDao;
    }

    public void setPaiementDao(PaiementDao paiementDao) {
        this.paiementDao = paiementDao;
    }

    public CommandeService getCommandeService() {
        return commandeService;
    }

    public void setCommandeService(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

}
