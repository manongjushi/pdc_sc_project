/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ljh、
 */
public class InitPrimitiveQuestion {
    public static void main(String[] args) {
        DBManager db=DBManager.getDBmanager();
        db.connect();
        String question="How to plan your search";
        String answer="step1: Identify what types of information you need\n step2:Compare academic and non-academic information sources";
        Item item=new Item(question, answer);
        itemManager it=itemManager.getitemManager();
        it.additem(item);        
    }
}
