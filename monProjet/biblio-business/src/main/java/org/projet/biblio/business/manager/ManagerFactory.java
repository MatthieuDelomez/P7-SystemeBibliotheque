/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.business.manager;

/**
 *
 * @author Ben Gourion
 */
public interface ManagerFactory {
    
    
    /*
    Creation des methodes Manager qui servira à appeler les differentes classes Metier (business) de l'application 
    */
    
    DocumentManager getDocumentManager();
    
    void setDocumentManager(DocumentManager documentManager);
    

    
    PretManager getPretManager();
    
    void setPretmanager(PretManager pretManager);
    
    
    UtilisateurManager getUtilisateurManager();
    
    void setUtilisateurManager(UtilisateurManager utilisateurManager);
    
}
