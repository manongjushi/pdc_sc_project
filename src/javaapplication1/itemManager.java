/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author ljh、
 */
public class itemManager {
    private static itemManager it=new itemManager();
    private static ArrayList<Item> list;
    public static int Index=0;
    private itemManager(){}
    public static itemManager getitemManager(){
        return it;
    }
    public  void additem(Item item) {
        DBManager m=DBManager.getDBmanager();
        m.write("item", item.getQuestion(), item.getAnswer());
    }
    public void deleteitem(Item item) {
        DBManager m=DBManager.getDBmanager();
        m.delete(item.getQuestion(), "item", "question");
    }
    public ArrayList<Item> getlist(){
        DBManager m=DBManager.getDBmanager();
        list=m.getAll("item");
        return list;
    }
    public int getIndex(){
        return Index;
    }
    public void indexPuls(){
        if(Index<list.size()-1){
            Index++;
        }
    }
    public void indexMinus(){
        if(Index>0){
            Index--;
        }
    }
    public String getQuestion(int Index){
        return list.get(Index).getQuestion();
    }
    public String getAnswer(int Index){
        return list.get(Index).getAnswer();
    }
}
