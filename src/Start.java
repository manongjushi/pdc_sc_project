
import javaapplication1.DBManager;
import windowGUI.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ljh、
 */
public class Start {
    public static void main(String[] args) {
        LoginFrame x=new LoginFrame();
        x.setVisible(true);
        DBManager m=DBManager.getDBmanager();
        m.connect();
    }
}
