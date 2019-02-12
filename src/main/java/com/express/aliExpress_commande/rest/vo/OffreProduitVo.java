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
public class OffreProduitVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String reference;
    private String libelle;
    private ProduitVo ProduitVo;
    private String qte;
    private String prix;
    private String remise;
    private String referenceFournisseur;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public ProduitVo getProduitVo() {
        return ProduitVo;
    }

    public void setProduitVo(ProduitVo ProduitVo) {
        this.ProduitVo = ProduitVo;
    }

    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getRemise() {
        return remise;
    }

    public void setRemise(String remise) {
        this.remise = remise;
    }

    public String getReferenceFournisseur() {
        return referenceFournisseur;
    }

    public void setReferenceFournisseur(String referenceFournisseur) {
        this.referenceFournisseur = referenceFournisseur;
    }

}
