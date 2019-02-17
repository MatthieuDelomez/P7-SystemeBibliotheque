
package com.responses;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "InfoPretResponse")
@XmlType(name = "InfoPretResponse")
public class InfoPretResponse {
    
    String nomOuvrage;
    String email;
    Date dateFinPret;

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
    public Date getDateFinPret() {
        return dateFinPret;
    }
@XmlElement(name = "datefinpret")
    public void setDateFinPret(Date dateFinPret) {
        this.dateFinPret = dateFinPret;
    }
    
    
    
}
