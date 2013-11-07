/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afrinnova.agentportal.auth;

import com.afrinnova.agentportal.logic.AccountsFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 *
 * @author Unicorn
 */

@Stateless
@TransactionManagement(value= TransactionManagementType.BEAN)
public class UserAuth {
    
    @EJB
    private AccountsFacadeLocal accountFacade;
    
    //authenticate the username and password of the user account, returns false if its null and true if its not
    
    public boolean authenticateUser(String username,String password){
        return this.accountFacade.findUsernameAndPassword(username, password) != null;
    }
    
}
