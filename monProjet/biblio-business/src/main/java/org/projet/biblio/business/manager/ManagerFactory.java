
package org.projet.biblio.business.manager;


public interface ManagerFactory {
    
    
    /*
    Creation des methodes Manager qui servira à appeler les differentes classes Metier (business) de l'application 
    */
    
    DocumentManager getDocumentManager();
    
    void setDocumentManager(DocumentManager documentManager);

    
    PretManager getPretManager();
    
    void setPretManager(PretManager pretManager);
    
    
    ClientManager getClientManager();
    
    void setClientManager(ClientManager clientManager);
    
    
    BibliothequeManager getBibliothequeManager();
    
    void setBibliothequeManager(BibliothequeManager bibliothequeManager);
    
    
    UtilisateurManager getUtilisateurManager();
    
    void setUtilisateurManager (UtilisateurManager utilisateurManager);
}
