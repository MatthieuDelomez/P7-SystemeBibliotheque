package org.projet.biblio.consumer.dao;

import java.util.List;
import org.projet.biblio.model.Document;


/**
 * Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
 *
 * @author Delomez Matthieu
 */

public interface DocumentDao {
    
    /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/

    /**
     *
     * @param document
     */
    void addDocument( Document document);
    
    /**
     *
     * @param document
     * @return
     */
    Document getDocument(Document document);
    
    /**
     *
     * @param document
     */
    void deleteDocumentPicture(Document document);
    
    /**
     *
     * @param document
     * @return
     */
    List<Document> getAllDocument(Document document);
    
    /**
     *
     * @param document
     */
    void updateDocument(Document document);
    
    /**
     *
     * @param document
     */
    void deleteDocument(Document document);
    
    /**
     *
     * @return
     */
    List<Document> getDocumentBatch();
    
    
    
}
