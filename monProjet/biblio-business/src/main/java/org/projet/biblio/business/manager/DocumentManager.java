
package org.projet.biblio.business.manager;

import java.util.List;
import org.projet.biblio.model.Document;


/**
 * Creation de l'interface qui servira à implémenter les méthodes: 
 * Ajouter | Recuperer | Supp | MAJ un Document.
 *
 * @author Delomez Matthieu
 */
public interface DocumentManager {
    

    /**
     * Création des méthodes qui seront implémentées dans DocumentManagerImpl
     *
     * @param document
     */
    void addDocument(Document document); // Ajouter un document
    
    /**
     *
     * @param document
     * @return
     */
    Document getDocument (Document document);  // Récupérer un document
    
    /**
     *
     * @param document
     */
    void deleteDocumentPicture(Document document); 
    
    /**
     *
     * @param document
     */
    void updateDocument(Document document);
    
    /**
     *
     * @param document
     */
    void deleteDocument (Document document); // Supprimer un document

    

    /**
     * Liste de document qui va retourner tout les documents
     *
     * @param document
     * @return
     */
    List<Document> getAllDocument(Document document);
    

    /**
     *  Liste de document pour la configuration du batch
     *
     * @return
     */
    List<Document> getDocumentBatch();


    
}
