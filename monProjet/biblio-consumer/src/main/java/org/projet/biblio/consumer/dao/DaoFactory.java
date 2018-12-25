package org.projet.biblio.consumer.dao;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public interface DaoFactory {
    
    /* Creation des methodes Dao qui seront implementées dans DaoFactoryImpl*/
   
    DocumentDao getDocumentDao();
        
    PretDao getPretDao();
    
    ClientDao getClientDao();
    
    BibliothequeDao getBibliothequeDao();
    
    UtilisateurDao getUtilisateurDao();
}
