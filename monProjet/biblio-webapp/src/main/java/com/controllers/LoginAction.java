/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.projet.biblio.model.Utilisateur;
import webapp.WebappHelper;

/**
 *
 * @author Ben Gourion
 */
public class LoginAction extends ActionSupport implements ServletRequestAware, SessionAware{
    
   
    private HttpServletRequest servletRequest;

    @Override
    public void setServletRequest(HttpServletRequest pRequest) {
        this.servletRequest = pRequest;
    }
    
        // ----- Eléments Struts
    private Map<String, Object> session;

    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
    
        // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private String pseudo;
    private String motpasse;


    // ==================== Getters/Setters ====================
    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pPseudo) {
        pseudo = pPseudo;
    }
    public String getMotPasse() {
        return motpasse;
    }
    public void setMotPasse(String pMotpasse) {
        motpasse = pMotpasse;
    }


    // ==================== Méthodes ====================
    /**
     * Action permettant la connexion d'un utilisateur
     * @return input / success
     */
public String doLogin() {
    String vResult = ActionSupport.INPUT;
    if (!StringUtils.isAllEmpty(pseudo, motpasse)) {
        try {
            Utilisateur vUtilisateur
                    = WebappHelper.getManagerFactory().getUtilisateurManager()
                                  .getUtilisateur(pseudo, motpasse);

            // Ajout de l'utilisateur en session
            this.session.put("user", vUtilisateur);

            vResult = ActionSupport.SUCCESS;
        } catch (Exception pEx) {
            this.addActionError("Identifiant ou mot de passe invalide !");
        }
    }
    return vResult;
}

    /**
     * Action de déconnexion d'un utilisateur
     * @return success
     */
    public String doLogout() {
        
        // Invalidation de la session
        this.servletRequest.getSession().invalidate();

        return ActionSupport.SUCCESS;
    }
}
    

