/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.service;

import com.express.aliExpress_commande.bean.Commande;

/**
 *
 * @author Admin
 */
public interface CommandeService {

    public Commande findByReference(String reference);

  //  public int payer(String reference, double montant);

    public int creer(Commande commande);

    public int save(Commande commande);

}
