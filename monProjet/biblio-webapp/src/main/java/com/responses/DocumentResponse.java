
package com.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DocumentResponse")
@XmlType(name = "DocumentResponse")
public class DocumentResponse {
    
    private int refOuvrage;
    private int refBibliotheque;
    
    private String nomOuvrage;
    private String quantiteTotal;
    
    

    public int getRefOuvrage() {
        return refOuvrage;
    }
    
    @XmlElement(name = "refouvrage")
    public void setRefOuvrage(int refOuvrage) {
        this.refOuvrage = refOuvrage;
    }

    public int getRefBibliotheque() {
        return refBibliotheque;
    }
    
    @XmlElement(name = "refbibliotheque")
    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    public String getNomOuvrage() {
        return nomOuvrage;
    }
    
    @XmlElement(name = "nomouvrage")
    public void setNomOuvrage(String nomOuvrage) {
        this.nomOuvrage = nomOuvrage;
    }

    public String getQuantiteTotal() {
        return quantiteTotal;
    }
    
    @XmlElement(name = "quantitetotal")
    public void setQuantiteTotal(String quantiteTotal) {
        this.quantiteTotal = quantiteTotal;
    }


    
    
    
}
