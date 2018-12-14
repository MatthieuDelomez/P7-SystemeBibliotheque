

package com.client.action;




public class LoginAction{
/*  
        // ----- Eléments Struts
    private Map<String, Object> session;

    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
    
    private String pseudo;
    private String motPasse;
    
    
    // Getters & Setters
    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }
    
    
    
    //================    Méthodes =================
    /*
    Action permettant la connexion d'un utilisateur 
    @return input / succes
    */
  /*  public String doLogin(){
        
        String vResult = ActionSupport.INPUT;
        
            if ( !StringUtils.isAllEmpty(pseudo, motPasse) ) {
                try {
            Utilisateur utilisateur = webappHelper.getManagerFactory().getUtilisateurManager().getUtilisateur(pseudo, motPasse);
            
            //Ajout de l'utilisateur en session
            this.session.put("utilisateur", utilisateur);
            
            vResult = ActionSupport.SUCCESS;
            
            } catch (Exception pE){
                    this.addActionError("Identifiant ou password invalide !");
        }
  }
        
        return vResult;
        
    }
    
    
    /*
    Action de déconnexion d'un utilisateur
    @return success
    */
 /*   public String doLogout(){
        
        //Suppression de l'utilisateur lors de la déconnexion
        this.session.remove("utilisateur");
        
        return ActionSupport.SUCCESS;
                
   }
    
    
    */
}
