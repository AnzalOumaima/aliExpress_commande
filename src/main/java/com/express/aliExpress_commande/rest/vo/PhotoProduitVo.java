/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.rest.vo;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class PhotoProduitVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String lien;
    private String description;
    private OffreProduitVo offreProduitVo;

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OffreProduitVo getOffreProduitVo() {
        return offreProduitVo;
    }

    public void setOffreProduitVo(OffreProduitVo offreProduitVo) {
        this.offreProduitVo = offreProduitVo;
    }

}
