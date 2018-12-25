
package org.projet.biblio.model;


public class Pret  {
    
    private int refPret;
    private int refClient;
    private int refOuvrage;
    
    private String datePret;
    private String dureePret;
    private String dateFinPret;
    private String nbrExemplaire;
    
    private boolean prolonger;
    

    
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
