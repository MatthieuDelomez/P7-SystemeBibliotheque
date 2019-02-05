
package org.projet.biblio.business.manager;

import java.util.List;
import org.projet.biblio.model.Client;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Client
*/
public interface ClientManager {
    
    /*
    Création des méthodes qui seront implémentées dans ClilentManagerImpl
    */    
    void addClient(Client client);
    
    Client getClient(Client client);
    
    void deleteClientPicture(Client client);
    
    void updateClient(Client client);
    
    void deleteClient(Client client);
    
    /*
    Création d'une liste de client
    */
    List<Client> getAllClient();
    
    
}
