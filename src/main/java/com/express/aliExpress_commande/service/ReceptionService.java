/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.service;

import com.express.aliExpress_commande.bean.Reception;
import com.express.aliExpress_commande.bean.ReceptionItem;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ReceptionService {

    public Reception findByReference(String reference);

    public List<Reception> findByCommandeReference(String reference);

    public int save(Reception reception, List<ReceptionItem> items);

    public int deleteByCommandeReference(String reference);

}
