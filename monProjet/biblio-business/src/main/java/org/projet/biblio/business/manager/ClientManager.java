/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.business.manager;


import org.projet.biblio.model.Client;


/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Utilisateur
*/

public interface ClientManager {
    
    /*
    Création des méthodes qui seront implémentées dans UserManagerImpl
    */
    
    void addClient(Client client);
    
    Client getClient(Client client);
    
    void deleteClientPicture(Client client);
    
    void updateClient(Client client);
    
    void deleteClient(Client client);
    
    
}
