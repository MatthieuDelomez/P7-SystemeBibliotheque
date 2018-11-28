/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblio.interfaces;

import com.biblio.bibliotheque.Document;

/**
 *
 * @author Ben Gourion
 */
public interface LibraryInterface {
    
    public int capacity();
    
    public boolean addDocument(Document doc);
    
    public Document searchDocumentById(int refOuvrage);
    
    public boolean editDocument (int idToEdit, String nomOuvrage, int refOuvrage, String quantiteTotal, String nbrEmprunte, String quantiteRestante );
        
    public boolean deleteDocument(int refOuvrage);
    
    }
    

