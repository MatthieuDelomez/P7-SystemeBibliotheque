/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblio.bibliotheque;

import com.biblio.interfaces.PretInterface;
import javax.jws.WebService;

/**
 *
 * @author Ben Gourion
 */
@WebService
public class Pret implements PretInterface {
    
    private int refPret;
    private int refClient;
    private int refOuvrage;
    
    private String datePret;
    private String dureePret;
    private String dateFinPret;
    private String nbrExemplaire;
    
    private boolean prolonger;
    
    
    public Pret(int refPret, int refClient, int refOuvrage, String datePret, String dureePret, String dateFinPret, String nbrExemplaire, boolean prolonger){
        this.refPret = refPret;
        this.refClient = refClient;
        this.refOuvrage = refOuvrage;
        this.datePret = datePret;
        this.dureePret = dureePret;
        this.dateFinPret = dateFinPret;
        this.nbrExemplaire = nbrExemplaire;
        this.prolonger = prolonger;
    }

    
    public int getRefPret() {
        return refPret;
    }

    public int getRefClient() {
        return refClient;
    }

    public int getRefOuvrage() {
        return refOuvrage;
    }

    public String getDatePret() {
        return datePret;
    }

    public String getDureePret() {
        return dureePret;
    }

    public String getDateFinPret() {
        return dateFinPret;
    }

    public String getNbrExemplaire() {
        return nbrExemplaire;
    }

    public boolean isProlonger() {
        return prolonger;
    }

    public void setRefPret(int refPret) {
        this.refPret = refPret;
    }

    public void setRefClient(int refClient) {
        this.refClient = refClient;
    }

    public void setRefOuvrage(int refOuvrage) {
        this.refOuvrage = refOuvrage;
    }

    public void setDatePret(String datePret) {
        this.datePret = datePret;
    }

    public void setDureePret(String dureePret) {
        this.dureePret = dureePret;
    }

    public void setDateFinPret(String dateFinPret) {
        this.dateFinPret = dateFinPret;
    }

    public void setNbrExemplaire(String nbrExemplaire) {
        this.nbrExemplaire = nbrExemplaire;
    }

    public void setProlonger(boolean prolonger) {
        this.prolonger = prolonger;
    }

    
    
 
    
    
    
    
}
