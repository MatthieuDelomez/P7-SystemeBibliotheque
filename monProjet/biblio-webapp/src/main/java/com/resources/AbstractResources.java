/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resources;

import org.projet.biblio.business.managerImpl.ManagerFactoryImpl;



public class AbstractResources {
    
    

    private static ManagerFactoryImpl managerFactory;



    protected static ManagerFactoryImpl getManagerFactory() {

        System.out.println("--->>>> get manager factory : "+managerFactory);

        return managerFactory;

    }



    public static void setManagerFactory(ManagerFactoryImpl managerFactory) {

        AbstractResources.managerFactory = managerFactory;

    }

	

}
    

