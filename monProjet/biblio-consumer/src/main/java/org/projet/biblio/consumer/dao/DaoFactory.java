package org.projet.biblio.consumer.dao;


/**
 * Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
 *
 * @author Delomez Matthieu
 */

public interface DaoFactory {
    
    /* Creation des methodes Dao qui seront implementées dans DaoFactoryImpl*/

    /**
     *
     * @return
     */
    DocumentDao getDocumentDao();
        
    /**
     *
     * @return
     */
    PretDao getPretDao();
    
    /**
     *
     * @return
     */
    ClientDao getClientDao();
    
    /**
     *
     * @return
     */
    BibliothequeDao getBibliothequeDao();
    
    /**
     *
     * @return
     */
    UtilisateurDao getUtilisateurDao();
}
