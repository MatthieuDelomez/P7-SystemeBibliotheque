/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.dao;

import org.projet.biblio.model.Client;


/*
Creation du pattern Dao (Data Access Objet) pour communiquer avec la base de données via l'interface ClientDao
*/

public interface ClientDao {
    
  /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/
 
    void addClient(Client client);
    
    Client getClient(Client client);
    
    void deleteClientPicture(Client client);
    
    void updateClient(Client client);
    
    void deleteClient(Client client);
    
}
