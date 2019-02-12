/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.service;

import com.express.aliExpress_commande.bean.ReceptionItem;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ReceptionItemService {

    public List<ReceptionItem> findByReceptionReference(String referenceReception);

    public int deleteByReceptionReference(String referenceReception);

    public List<ReceptionItem> findByReferenceProduit(String referenceProduit);

    public void creer(ReceptionItem item);

}
