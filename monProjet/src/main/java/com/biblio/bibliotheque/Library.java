/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblio.bibliotheque;

import com.biblio.interfaces.LibraryInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Ben Gourion
 */
public class Library implements LibraryInterface {
    
    private ArrayList<Document> listDoc;
    private int nbrDocuments;
    private int capacity;
    
    
    public Library(int capacity){
        this.capacity = capacity;
        listDoc = new ArrayList<>();
    }
    
    
    
    @Override
    public int capacity(){
        
        return this.capacity;
    }
    
    
    @Override
    public boolean addDocument(Document doc){
        
        if(listDoc.size() < capacity){
            listDoc.add(doc);
            sort();
            return true;
        }
        
        return false;
            
        }
    
    @Override
    public  Document searchDocumentById(int refOuvrage){
        for(Document doc : listDoc){
            if(doc.getRefOuvrage() == refOuvrage)
                return doc;
        }
        
        return null;
    }
    
    
    @Override
    public boolean editDocument(int IdToEdit, String nomOuvrage, int refOuvrage, String quantiteTotal, String nbrEmprunte, String quantiteRestante ) {
        for(int i = 0;  i <= listDoc.size();  i++){
            if(listDoc.get(i).getRefOuvrage() == IdToEdit){
                
                if(listDoc.get(i).getClass() == Document.class){
                    Document document = new Document(nomOuvrage, refOuvrage, quantiteTotal, nbrEmprunte, quantiteRestante);
                    listDoc.remove(i);
                    listDoc.add(document);
                } else{
                    Document doc = new Document(nomOuvrage, refOuvrage, quantiteTotal, nbrEmprunte, quantiteRestante);
                    listDoc.remove(i);
                    listDoc.add(doc);
                }
                
                sort();
                return true;
                
            }
        }
        
        return false;
    }
    
    @Override
    public boolean deleteDocument(int refOuvrage){
        for(int i =0; i <= listDoc.size(); i++){
            if(listDoc.get(i).getRefOuvrage() == refOuvrage){
                listDoc.remove(i);
                sort();
                return true;
            }
        }
        
        return false;
    }
    
    public int getNbrDocuments(){
        return listDoc.size();
    }
    
    private void sort(){
        Collections.sort(listDoc, new Comparator<Document>() {
            @Override public int compare(Document doc1, Document doc2) {
                return doc1.getRefOuvrage() - doc2.getRefOuvrage();
            }
        });
    }
    
    
    public void showDocuments(){
        for (Document doc : listDoc){
            System.out.println("Id : " + doc.getRefOuvrage() + "Titre et auteur : " + doc.getNomOuvrage());
        }
    }    
}
