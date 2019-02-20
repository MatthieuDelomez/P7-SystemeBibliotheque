
package org.projet.biblio.business.manager;

import java.util.List;
import org.projet.biblio.model.Client;


/**
 * Creation de l'interface qui servira à implémenter les méthodes: 
 * Ajouter | Recuperer | Supp | MAJ un Client
 *
 * 
 * @author Delomez Matthieu
 */
public interface ClientManager {
    


    /**
     * Création des méthodes qui seront implémentées dans ClilentManagerImpl
     *
     * @param client
     */
    void addClient(Client client);
    
    /**
     *
     * @param client
     * @return
     */
    Client getClient(Client client);
    
    /**
     *
     * @param client
     */
    void deleteClientPicture(Client client);
    
    /**
     *
     * @param client
     */
    void updateClient(Client client);
    
    /**
     *
     * @param client
     */
    void deleteClient(Client client);
    

    /**
     * Création d'une liste de client qui
     * va retourner tout les clients.
     * 
     *
     * @return
     */
    List<Client> getAllClient();
    

    /**
     * Création d'une liste des emails clients.
     * 
     *
     * @return
     */
    List<Client> getEmailClient();
    
    
}
