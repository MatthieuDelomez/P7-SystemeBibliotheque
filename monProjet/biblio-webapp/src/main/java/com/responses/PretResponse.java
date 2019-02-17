
package com.responses;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "PretResponse")
@XmlType(name = "PretResponse")
public class PretResponse {
    
    private int refOuvrage;
    private int refClient;
    private int refPret;
    
    private Date datePret;
    private String dureePret;
    private Date dateFinPret;
    private String nbrExemplaire;
    
    private boolean prolonger;
    
    
    

    public int getRefClient() {
        return refClient;
    }
    
    @XmlElement(name = "refclient")
    public void setRefClient(int refClient) {
        this.refClient = refClient;
    }

    public int getRefPret() {
        return refPret;
    }
    
    @XmlElement(name = "refpret")
    public void setRefPret(int refPret) {
        this.refPret = refPret;
    }
    
    
    public int getRefOuvrage() {
        return refOuvrage;
    }
    
    @XmlElement(name = "refouvrage")
    public void setRefOuvrage(int refOuvrage) {
        this.refOuvrage = refOuvrage;
    }

    public Date getDatePret() {
        return datePret;
    }
    
    @XmlElement(name = "datepret")
    public void setDatePret(Date datePret) {
        this.datePret = datePret;
    }

    public String getDureePret() {
        return dureePret;
    }
    
    @XmlElement(name = "dureePret")
    public void setDureePret(String dureePret) {
        this.dureePret = dureePret;
    }

    public Date getDateFinPret() {
        return dateFinPret;
    }
    
    @XmlElement(name = "datefinpret")
    public void setDateFinPret(Date dateFinPret) {
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
