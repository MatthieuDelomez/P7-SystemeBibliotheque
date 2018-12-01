/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.business.managerImpl;

import org.projet.biblio.consumer.daoImpl.DaoFactoryImpl;

/**
 * Création de la classe abstraite AbstractManager
 */

public abstract class AbstractManager {
    
    private static DaoFactoryImpl daofactory;
    
    
    protected static DaoFactoryImpl getDaoFactory() {
        
        System.out.println("----> getDaoFactory :" +daoFactory);
        
        return daoFactory;
    } 
    
    
    public static void setDaoFactory(DaoFactoryImpl daoFactory) {
        
        AbstractManager.daoFactory = daofactory;
    }
    
}
