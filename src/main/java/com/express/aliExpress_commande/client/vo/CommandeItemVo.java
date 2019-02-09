/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.client.vo;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class CommandeItemVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String prix;
    private String qte;
    private String referenceOffreProduit;
    private CommandeVo commandeVo;

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }

    public String getReferenceOffreProduit() {
        return referenceOffreProduit;
    }

    public void setReferenceOffreProduit(String referenceOffreProduit) {
        this.referenceOffreProduit = referenceOffreProduit;
    }

    public CommandeVo getCommandeVo() {
        return commandeVo;
    }

    public void setCommandeVo(CommandeVo commandeVo) {
        this.commandeVo = commandeVo;
    }

}
