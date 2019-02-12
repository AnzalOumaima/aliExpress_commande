/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_commande.rest.proxy;

import org.springframework.cloud.openfeign.FeignClient;


/**
 *
 * @author Admin
 */
@FeignClient(name="microservice2-offre",url="localhost:8099")
public class OffreProduitProxy {
    
}
