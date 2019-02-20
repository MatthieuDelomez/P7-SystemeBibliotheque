
package org.projet.biblio.consumer.daoImpl;

import org.projet.biblio.consumer.dao.BibliothequeDao;
import org.projet.biblio.consumer.dao.DaoFactory;
import org.projet.biblio.consumer.dao.DocumentDao;
import org.projet.biblio.consumer.dao.PretDao;
import org.projet.biblio.consumer.dao.ClientDao;
import org.projet.biblio.consumer.dao.UtilisateurDao;


/**
 * Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC.
 * 
 *
 * @author Delomez Matthieu
 */

public class DaoFactoryImpl implements DaoFactory {

    
    
 /* Implémentation des méthodes se trouvant dans l'interface DaoFactory */

    private DocumentDao documentDao;
    
    @Override
    public DocumentDao getDocumentDao(){
        return documentDao;
    }
    
    /**
     *
     * @param documentDao
     */
    public void setDocumentDao(DocumentDao documentDao) {
        this.documentDao = documentDao;
    }
    
    
 //*****************************************************************************//   
      
    private PretDao pretDao;
    
    @Override
    public PretDao getPretDao(){
        
        return pretDao;
    }
    
    /**
     *
     * @param pretDao
     */
    public void setPretDao(PretDao pretDao){
        this.pretDao = pretDao;
    }
    
    
 //*****************************************************************************//   
  
    private ClientDao clientDao;
    
    @Override
    public ClientDao getClientDao(){
        
        return clientDao;
    }
    
    /**
     *
     * @param clientDao
     */
    public void setClientDao(ClientDao clientDao){
        this.clientDao = clientDao;
    }
    
    
  //*****************************************************************************//    
    
    private UtilisateurDao utilisateurDao;
    
    @Override
    public UtilisateurDao getUtilisateurDao(){
        
        return utilisateurDao;
    }
    
    /**
     *
     * @param utilisateurDao
     */
    public void setUtilisateurDao(UtilisateurDao utilisateurDao){
        this.utilisateurDao = utilisateurDao;
    }
    

  //*****************************************************************************//      
    
    private BibliothequeDao bibliothequeDao;
    
   
    @Override
    public BibliothequeDao getBibliothequeDao(){
        
        return bibliothequeDao;
        
    }
    
    /**
     *
     * @param bibliothequeDao
     */
    public void setBibliothequeDao(BibliothequeDao bibliothequeDao){
     
        this.bibliothequeDao = bibliothequeDao;
    }
    

       


}
