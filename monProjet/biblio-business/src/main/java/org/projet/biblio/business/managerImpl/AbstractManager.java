package org.projet.biblio.business.managerImpl;


import org.projet.biblio.consumer.daoImpl.DaoFactoryImpl;

/**
 * Création de la classe abstraite AbstractManager
 */

public abstract class AbstractManager {
    
    
    private static DaoFactoryImpl daoFactory;
    
    
    protected static DaoFactoryImpl getDaoFactory() {
                
           return daoFactory;
    } 
    
    
    public static void setDaoFactory(DaoFactoryImpl daoFactory) {
        
           AbstractManager.daoFactory = daoFactory;
    }
    
    }
