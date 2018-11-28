/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblio.interfaces;

import com.biblio.bibliotheque.Pret;

/**
 *
 * @author Ben Gourion
 */
public interface PretInterface  {
    
    
    public int refPret();
    
    public int refClient();
    
    public int refOuvrage();
    
    public String datePret();
    
    public String dureePret();
    
    public String dateFinPret();
    
    public String nbrexemplaire();
    
    public boolean prolonger(Pret prolonger);
    

}
