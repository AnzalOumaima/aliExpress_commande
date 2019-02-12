/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.service;

import com.express.aliExpress_commande.bean.Paiement;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PaiementService {

    public Paiement findByReference(String reference);

    public List<Paiement> findeByCommandeReference(String referenceCommande);

    public int Payer(String referenceCommande, double montant);

    public int checkPaiement(String referenceCommande);

}
