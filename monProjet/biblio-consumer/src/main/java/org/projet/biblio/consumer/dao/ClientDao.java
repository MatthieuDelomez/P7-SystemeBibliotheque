package org.projet.biblio.consumer.dao;

import java.util.List;
import org.projet.biblio.model.Client;


/**
 * Creation du pattern Dao (Data Access Objet) pour communiquer
 * avec la base de données via l'interface ClientDao.
 * 
 *
 * @author Delomez Matthieu
 */

public interface ClientDao {
    
     /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/

    /**
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
     *
     * @return
     */
    List <Client>getAllClient();
    
    /**
     *
     * @return
     */
    List<Client>getEmailClient();
    
}
