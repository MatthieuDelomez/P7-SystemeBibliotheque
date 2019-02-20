package org.projet.biblio.business.managerImpl;

import org.projet.biblio.business.manager.BibliothequeManager;
import org.projet.biblio.business.manager.ClientManager;
import org.projet.biblio.business.manager.DocumentManager;
import org.projet.biblio.business.manager.ManagerFactory;
import org.projet.biblio.business.manager.PretManager;
import org.projet.biblio.business.manager.UtilisateurManager;


/**
 * Classe ManagerFactoryImpl servant à implementer les methodes se trouvant dans l'interface ManagerFactory.
 * 
 *
 * @author Ben Gourion
 */

public class ManagerFactoryImpl implements ManagerFactory{
    

    /*
   Configuration des differentes interfaces Manager
   */

    private DocumentManager documentManager;
    @Override
    public DocumentManager getDocumentManager() {
        return this.documentManager;
    }
    
    @Override
    public void setDocumentManager(DocumentManager documentManager){
        this.documentManager = documentManager;
    }
    

    private PretManager pretManager;
    @Override
    public PretManager getPretManager() {
        return this.pretManager;
    }

    @Override
    public void setPretManager(PretManager pretManager) {
        this.pretManager = pretManager;
    }

    
    private ClientManager clientManager;
    @Override
    public ClientManager getClientManager() {
        return this.clientManager;
    }
    
    @Override
    public void setClientManager(ClientManager clientManager) {
        this.clientManager = clientManager;
    }

    private BibliothequeManager bibliothequeManager;
    @Override
    public BibliothequeManager getBibliothequeManager() {
        return this.bibliothequeManager;
    }

    @Override
    public void setBibliothequeManager(BibliothequeManager bibliothequeManager) {
        this.bibliothequeManager = bibliothequeManager;
    }

    private UtilisateurManager utilisateurManager;
    @Override
    public UtilisateurManager getUtilisateurManager() {
        return this.utilisateurManager;
    }

    @Override
    public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
        this.utilisateurManager = utilisateurManager;
    }
    
}
