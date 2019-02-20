
package com.responses;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe Response
 *
 * @author Delomez Matthieu
 */

@XmlRootElement(name = "InfoPretResponse")
@XmlType(name = "InfoPretResponse")
public class InfoPretResponse {
    
   //=========Attributs=============
    
    String nomOuvrage;
    String email;
    Date dateFinPret;
    
    //=========Getters & Setters=============

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
    @XmlElement(name = "nomouvrage")
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
    @XmlElement(name = "email")
    public void setEmail(String email) {
        this.email = email;
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
     * @param dateFinPret
     */
    @XmlElement(name = "datefinpret")
    public void setDateFinPret(Date dateFinPret) {
        this.dateFinPret = dateFinPret;
    }
    
    
    
}
