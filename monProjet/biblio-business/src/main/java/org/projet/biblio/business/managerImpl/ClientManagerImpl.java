/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.business.managerImpl;

import org.projet.biblio.business.manager.ClientManager;
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
    
}
