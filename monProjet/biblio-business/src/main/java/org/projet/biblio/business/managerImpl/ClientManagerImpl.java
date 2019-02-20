package org.projet.biblio.business.managerImpl;

import java.util.List;
import org.projet.biblio.business.manager.ClientManager;
import static org.projet.biblio.business.managerImpl.AbstractManager.getDaoFactory;
import org.projet.biblio.model.Client;



/**
 * Creation de la classe ClientManagerImpl qui implemente l'interface ClientManager.
 * 
 *
 * @author Delomez Matthieu
 */

public class ClientManagerImpl extends AbstractManager implements ClientManager{

    @Override
    public void addClient(Client client) {
        
        getDaoFactory().getClientDao().addClient(client);   
    }

    
    @Override
    public Client getClient(Client client) {
        return getDaoFactory().getClientDao().getClient(client);   
    }

    
    @Override
    public void deleteClientPicture(Client client) {
       getDaoFactory().getClientDao().deleteClientPicture(client);  
    }

    
    @Override
    public void updateClient(Client client) {
       getDaoFactory().getClientDao().updateClient(client);  
    }

    
    @Override
    public void deleteClient(Client client) {
       getDaoFactory().getClientDao().deleteClient(client);   
    }
    
    /* Implementation de la methode liste des publications /*/
    @Override
   public List<Client> getAllClient() {
       
   return getDaoFactory().getClientDao().getAllClient();

                   }
   
   /*
   Méthode qui va récupérer les email des clients.
   */
    @Override
   public List<Client> getEmailClient() {
       return getDaoFactory().getClientDao().getEmailClient();
   }
    
}
