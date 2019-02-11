
package com.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "InfoPretResponse")
@XmlType(name = "InfoPretResponse")
public class InfoPretResponse {
    
    String nomOuvrage;
    String email;
    String dateFinPret;

    public String getNomOuvrage() {
        return nomOuvrage;
    }

    @XmlElement(name = "nomouvrage")
    public void setNomOuvrage(String nomOuvrage) {
        this.nomOuvrage = nomOuvrage;
    }

    public String getEmail() {
        return email;
    }
@XmlElement(name = "email")
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDateFinPret() {
        return dateFinPret;
    }
@XmlElement(name = "datefinpret")
    public void setDateFinPret(String dateFinPret) {
        this.dateFinPret = dateFinPret;
    }
    
    
    
}
