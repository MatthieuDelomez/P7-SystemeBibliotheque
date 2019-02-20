package org.projet.biblio.business.managerImpl;


import org.projet.biblio.consumer.daoImpl.DaoFactoryImpl;

/**
 * Création de la classe abstraite AbstractManager
 * pour pouvoir communiquer avec les Dao.
 * 
 * 
 * @author Delomez Matthieu
 */

public abstract class AbstractManager {
    
    
    private static DaoFactoryImpl daoFactory;
    
    /**
     *
     * @return daoFactory
     */
    protected static DaoFactoryImpl getDaoFactory() {
                
           return daoFactory;
    } 
    
    /**
     *
     * @param daoFactory
     */
    public static void setDaoFactory(DaoFactoryImpl daoFactory) {
        
           AbstractManager.daoFactory = daoFactory;
    }
    
    }
