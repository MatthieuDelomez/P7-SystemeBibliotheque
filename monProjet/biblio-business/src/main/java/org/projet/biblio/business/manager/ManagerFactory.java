
package org.projet.biblio.business.manager;

/**
 *
 * @author Ben Gourion
 */
public interface ManagerFactory {
    
    


    /**
     * Creation des methodes Manager qui servira à appeler les differentes 
     * classes Metier (business) de l'application.
     * 
     *
     * @return
     */
    DocumentManager getDocumentManager();
    
    /**
     *
     * @param documentManager
     */
    void setDocumentManager(DocumentManager documentManager);

    /**
     *
     * @return
     */
    PretManager getPretManager();
    
    /**
     *
     * @param pretManager
     */
    void setPretManager(PretManager pretManager);
    
    /**
     *
     * @return
     */
    ClientManager getClientManager();
    
    /**
     *
     * @param clientManager
     */
    void setClientManager(ClientManager clientManager);
    
    /**
     *
     * @return
     */
    BibliothequeManager getBibliothequeManager();
    
    /**
     *
     * @param bibliothequeManager
     */
    void setBibliothequeManager(BibliothequeManager bibliothequeManager);
    
    /**
     *
     * @return
     */
    UtilisateurManager getUtilisateurManager();
    
    /**
     *
     * @param utilisateurManager
     */
    void setUtilisateurManager (UtilisateurManager utilisateurManager);
}
