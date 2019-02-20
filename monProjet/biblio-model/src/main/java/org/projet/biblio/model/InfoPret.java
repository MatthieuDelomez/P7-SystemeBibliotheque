
package org.projet.biblio.model;

import java.util.Date;

/**
 * Implementation pour définir le mapping entre les lignes de 
 * résultats d'une requête Sql et les objets java à créer.
 * 
 *
 * @author Delomez Matthieu
 */

public class InfoPret {
    
     //=========Attributs=============
    
    Date dateFinPret;
    String nomOuvrage;
    String email;
    
    
     //=========Getters & Setters=============
    
    /**
     *
     * @return
     */
    public Date getDateFinPret() {
        return dateFinPret;
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
     * @return
     */
    public String getNomOuvrage() {
        return nomOuvrage;
    }

    /**
     *
     * @param nomOuvrage
     */
    public void setNomOuvrage(String nomOuvrage) {
        this.nomOuvrage = nomOuvrage;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
