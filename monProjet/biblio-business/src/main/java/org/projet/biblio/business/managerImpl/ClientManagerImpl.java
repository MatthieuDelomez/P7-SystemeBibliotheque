package org.projet.biblio.business.managerImpl;

import java.util.List;
import org.projet.biblio.business.manager.ClientManager;
import static org.projet.biblio.business.managerImpl.AbstractManager.getDaoFactory;
import org.projet.biblio.model.Client;


/*
Creation de la classe ClientManagerImpl qui implemente l'interface ClientManager
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
   public List<Client> getAllClient() {
       
   System.out.println("---->>> manager getAllClient");
   return getDaoFactory().getClientDao().getAllClient();

                   }
    
}
