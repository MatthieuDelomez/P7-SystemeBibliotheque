/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.daoImpl;

import org.projet.biblio.consumer.dao.BibliothequeDao;
import org.projet.biblio.consumer.dao.DaoFactory;
import org.projet.biblio.consumer.dao.DocumentDao;
import org.projet.biblio.consumer.dao.PretDao;
import org.projet.biblio.consumer.dao.ClientDao;
import org.projet.biblio.consumer.dao.UtilisateurDao;



/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public class DaoFactoryImpl implements DaoFactory {
    
    
    
    
    
 /* Implémentation des méthodes se trouvant dans l'interface DaoFactory */

    private DocumentDao documentDao;
    
    public DocumentDao getDocumentDao(){
        return documentDao;
    }
    
    public void setDocumentDao(DocumentDao documentDao) {
        this.documentDao = documentDao;
    }
    
    
    

    
    
    private PretDao pretDao;
    
    public PretDao getPretDao(){
        
        return pretDao;
    }
    
    public void setPretDao(PretDao pretDao){
        this.pretDao = pretDao;
    }
    
    
    
    
    
    private ClientDao clientDao;
    
    public ClientDao getClientDao(){
        
        return clientDao;
    }
    
    public void setClientDao(ClientDao clientDao){
        this.clientDao = clientDao;
    }
    
    
    
    
    private UtilisateurDao utilisateurDao;
    
    public UtilisateurDao getUtilisateurDao(){
        
        return utilisateurDao;
    }
    
    public void setUtilisateurDao(UtilisateurDao utilisateurDao){
        this.utilisateurDao = utilisateurDao;
    }
    

    
    
    private BibliothequeDao bibliothequeDao;
    
    public BibliothequeDao getBibliothequeDao(){
        
        return bibliothequeDao;
        
    }
    
    public void setBibliothequeDao(BibliothequeDao bibliothequeDao){
     
        this.bibliothequeDao = bibliothequeDao;
    }
    

       


}
