/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.service.impl;

import com.express.aliExpress_commande.bean.CommandeItem;
import com.express.aliExpress_commande.dao.CommandeItemDao;
import com.express.aliExpress_commande.service.CommandeItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class CommandeItemServiceImpl implements CommandeItemService {

    @Autowired
    CommandeItemDao commandeItemDao;

    @Override
    public List<CommandeItem> findByCommandeReference(String referenceCommande) {
        return commandeItemDao.findByCommandeReference(referenceCommande);
    }

    @Override
    public void creer(CommandeItem item) {
        commandeItemDao.save(item);
    }

    public CommandeItemDao getCommandeItemDao() {
        return commandeItemDao;
    }

    public void setCommandeItemDao(CommandeItemDao commandeItemDao) {
        this.commandeItemDao = commandeItemDao;
    }

}
