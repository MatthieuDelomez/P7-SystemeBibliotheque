
package org.projet.biblio.model;

import java.util.Date;

/**
 * Implementation pour définir le mapping entre les lignes de 
 * résultats d'une requête Sql et les objets java à créer.
 * 
 *
 * @author Delomez Matthieu
 */

public class Pret  {
    
    //=========Attributs=============
    
    private int refPret;
    private int refClient;
    private int refOuvrage;
    
    private Date datePret;
    private String dureePret;
    private Date dateFinPret;
    private String nbrExemplaire;
    
    private boolean prolonger;
    
    
    //=========Getters & Setters=============
    
    /**
     *
     * @return
     */
    public int getRefPret() {
        return refPret;
    }

    /**
     *
     * @return
     */
    public int getRefClient() {
        return refClient;
    }

    /**
     *
     * @return
     */
    public int getRefOuvrage() {
        return refOuvrage;
    }

    /**
     *
     * @return
     */
    public Date getDatePret() {
        return  datePret;
    }

    /**
     *
     * @return
     */
    public String getDureePret() {
        return dureePret;
    }

    /**
     *
     * @return
     */
    public Date getDateFinPret() {
        return dateFinPret;
    }

    /**
     *
     * @return
     */
    public String getNbrExemplaire() {
        return nbrExemplaire;
    }

    /**
     *
     * @return
     */
    public boolean isProlonger() {
        return prolonger;
    }

    /**
     *
     * @param refPret
     */
    public void setRefPret(int refPret) {
        this.refPret = refPret;
    }

    /**
     *
     * @param refClient
     */
    public void setRefClient(int refClient) {
        this.refClient = refClient;
    }

    /**
     *
     * @param refOuvrage
     */
    public void setRefOuvrage(int refOuvrage) {
        this.refOuvrage = refOuvrage;
    }

    /**
     *
     * @param datePret
     */
    public void setDatePret(Date datePret) {
        this.datePret = datePret;
    }

    /**
     *
     * @param dureePret
     */
    public void setDureePret(String dureePret) {
        this.dureePret = dureePret;
    }

    /**
     *
     * @param dateFinPret
     */
    public void setDateFinPret(Date dateFinPret) {
        this.dateFinPret = dateFinPret;
    }

    /**
     *
     * @param nbrExemplaire
     */
    public void setNbrExemplaire(String nbrExemplaire) {
        this.nbrExemplaire = nbrExemplaire;
    }

    /**
     *
     * @param prolonger
     */
    public void setProlonger(boolean prolonger) {
        this.prolonger = prolonger;
    }

    
    
 
    
    
    
    
}
