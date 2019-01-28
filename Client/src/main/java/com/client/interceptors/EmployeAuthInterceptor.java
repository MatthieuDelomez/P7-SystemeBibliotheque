
package com.client.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


public class EmployeAuthInterceptor extends AbstractInterceptor {
    
    

    @Override
    public String intercept(ActionInvocation pInvocation) throws Exception {

        String vResult;
        
        if (pInvocation.getInvocationContext().getSession().get("employe") != null) {
            
            vResult = pInvocation.invoke();
            
        } else {
            
            vResult = "error-forbidden";
        }
        return vResult;
    }
}
