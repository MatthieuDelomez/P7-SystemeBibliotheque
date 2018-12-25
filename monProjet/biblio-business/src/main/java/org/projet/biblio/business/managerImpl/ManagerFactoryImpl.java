package org.projet.biblio.business.managerImpl;

import org.projet.biblio.business.manager.BibliothequeManager;
import org.projet.biblio.business.manager.ClientManager;
import org.projet.biblio.business.manager.DocumentManager;
import org.projet.biblio.business.manager.ManagerFactory;
import org.projet.biblio.business.manager.PretManager;
import org.projet.biblio.business.manager.UtilisateurManager;


/*
Classe ManagerFactoryImpl servant à implementer les methodes se trouvant dans l'interface ManagerFactory
*/
public class ManagerFactoryImpl implements ManagerFactory{
    
    

    /*
   Configuration des differentes interfaces Manager
   */

    private DocumentManager documentManager;
    public DocumentManager getDocumentManager() {
        return this.documentManager;
    }
    
    public void setDocumentManager(DocumentManager documentManager){
        this.documentManager = documentManager;
    }
    

    private PretManager pretManager;
    public PretManager getPretManager() {
        return this.pretManager;
    }

    public void setPretManager(PretManager pretManager) {
        this.pretManager = pretManager;
    }

    
    private ClientManager clientManager;
    public ClientManager getClientManager() {
        return this.clientManager;
    }
    
    public void setClientManager(ClientManager clientManager) {
        this.clientManager = clientManager;
    }

    private BibliothequeManager bibliothequeManager;
    public BibliothequeManager getBibliothequeManager() {
        return this.bibliothequeManager;
    }

    public void setBibliothequeManager(BibliothequeManager bibliothequeManager) {
        this.bibliothequeManager = bibliothequeManager;
    }

    private UtilisateurManager utilisateurManager;
    public UtilisateurManager getUtilisateurManager() {
        return this.utilisateurManager;
    }

    public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
        this.utilisateurManager = utilisateurManager;
    }
    
}
