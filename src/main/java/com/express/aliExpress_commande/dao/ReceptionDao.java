/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.dao;

import com.express.aliExpress_commande.bean.Reception;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface ReceptionDao extends JpaRepository<Reception, Long> {

    public Reception findByReference(String reference);

  //  public int deleteByCommandeReference(String reference);

    public List<Reception> findByCommandeReference(String reference);
}
