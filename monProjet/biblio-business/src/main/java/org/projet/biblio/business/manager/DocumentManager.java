/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.business.manager;

import java.util.List;
import org.projet.biblio.model.Document;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Utilisateur
*/

public interface DocumentManager {
    
     /*
    Création des méthodes qui seront implémentées dans DocumentManagerImpl
    */
    
    void addDocument(Document document);
    
    Document getDocument (Document document);
    
    void deleteDocumentPicture(Document document);
    
    void updateDocument(Document document);
    
    void deleteDocument (Document document);
    
    /*
    Création d'une liste de document qui sera affichée dans une page jsp
    */
    List<Document> getAllDocument();
    
}
