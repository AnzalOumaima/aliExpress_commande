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
public class CommandeVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String reference;
    private String dateCreation;
    private String montantTotal;
    private ClientVo clientVo;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(String montantTotal) {
        this.montantTotal = montantTotal;
    }

    public ClientVo getClientVo() {
        return clientVo;
    }

    public void setClientVo(ClientVo clientVo) {
        this.clientVo = clientVo;
    }

}
