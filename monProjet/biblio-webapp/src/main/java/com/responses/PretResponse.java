/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "PretResponse")
@XmlType(name = "PretResponse")
public class PretResponse {
    
    private int refOuvrage;
    
    private String datePret;
    private String dureePret;
    private String dateFinPret;
    private String nbrExemplaire;
    
    private boolean prolonger;
    

    public int getRefOuvrage() {
        return refOuvrage;
    }
    
    @XmlElement(name = "refouvrage")
    public void setRefOuvrage(int refOuvrage) {
        this.refOuvrage = refOuvrage;
    }

    public String getDatePret() {
        return datePret;
    }
    
    @XmlElement(name = "datepret")
    public void setDatePret(String datePret) {
        this.datePret = datePret;
    }

    public String getDureePret() {
        return dureePret;
    }
    
    @XmlElement(name = "dureePret")
    public void setDureePret(String dureePret) {
        this.dureePret = dureePret;
    }

    public String getDateFinPret() {
        return dateFinPret;
    }
    
    @XmlElement(name = "datefinpret")
    public void setDateFinPret(String dateFinPret) {
        this.dateFinPret = dateFinPret;
    }

    public String getNbrExemplaire() {
        return nbrExemplaire;
    }
    
    @XmlElement(name = "nbrexemplaire")
    public void setNbrExemplaire(String nbrExemplaire) {
        this.nbrExemplaire = nbrExemplaire;
    }

    public boolean isProlonger() {
        return prolonger;
    }
    
    @XmlElement(name = "prolonger")
    public void setProlonger(boolean prolonger) {
        this.prolonger = prolonger;
    }
    
    
    
    
}
