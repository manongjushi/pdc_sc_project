/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ljh、
 */
public class accountManager {
    private static accountManager a=new accountManager();
    private accountManager(){}
    public static accountManager getManager(){
        return a;
    }
    public  void addAccount(User user) {
       DBManager m=DBManager.getDBmanager();
       m.write("people", user.getAccount(), user.getPassword());
    }

    public void deleteAccount(User user) {
        DBManager m=DBManager.getDBmanager();
        m.delete(user.getAccount(), "people", "account");
    }
    
}
