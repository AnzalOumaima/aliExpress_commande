/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.dao;

import com.express.aliExpress_commande.bean.Paiement;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long> {

    public Paiement findByReference(String reference);

    public List<Paiement> findeByCommandeReference(String referenceCommande);
}
