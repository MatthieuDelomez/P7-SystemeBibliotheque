
package com.biblio.resources;
import org.projet.biblio.business.managerImpl.ManagerFactoryImpl;


public class AbstractResource {
    

    private static ManagerFactoryImpl managerFactory;


    protected static ManagerFactoryImpl getManagerFactory() {

        System.out.println("--->>>> get manager factory : "+managerFactory);

        return managerFactory;

    }


    public static void setManagerFactory(ManagerFactoryImpl managerFactory) {

        AbstractResource.managerFactory = managerFactory;

    }

	

}
    

