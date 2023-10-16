/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ljh、
 */
public class AccountChecker {
    private static AccountChecker accountChecker=new AccountChecker();
    private AccountChecker(){
        
    }
    public static AccountChecker getAccountChecker(){
        return accountChecker;
    } 
            
    public   boolean checkAccount(String account, String password) {
        DBManager m=DBManager.getDBmanager();
        String str=m.search("people", account);
        if(str.equals(password)) return true;
        return false;
    }
    
}
