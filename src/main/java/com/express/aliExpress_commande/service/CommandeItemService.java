/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.service;

import com.express.aliExpress_commande.bean.CommandeItem;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface CommandeItemService {

    public List<CommandeItem> findByCommandeReference(String referenceCommande);

   // public CommandeItem creer(String referenceProduit, long qte, double prix, String referenceCommande);

    public void creer(CommandeItem item);

}
