/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.dao;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public interface DaoFactory {
    
    /* Creation des methodes Dao qui seront implementées dans DaoFactoryImpl*/
   
    DocumentDao getDocumentDao();
        
    PretDao getPretDao();
    
    UtilisateurDao getUtilisateurDao();
}
