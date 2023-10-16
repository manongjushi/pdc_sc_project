/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import javax.net.ssl.ManagerFactoryParameters;

/**
 *
 * @author ljh、
 */
public class SearchEngine {
    private static SearchEngine se=new SearchEngine();
    private static ArrayList<String> answerList;
    private static int Index=0;
    private SearchEngine(){}
    public static SearchEngine getSearchEngine(){
        return se;
    }
    public ArrayList<String> getList(){
        return answerList;
    }
    public void search(String str){
        DBManager db=DBManager.getDBmanager();
        answerList=db.searchContain("item", str);
    }
    public int getIndex(){
        return Index;
    }
    public void indexPuls(){
        if(Index<answerList.size()-1){
            Index++;
        }
    }
    public void indexMinus(){
        if(Index>0){
            Index--;
        }
    }
    public String getAnswer(int index){
        return answerList.get(index);
    }
    public boolean isEnd(){
        if(Index==answerList.size()){
            return true;
        }
        return false;
    }
    public boolean isStart(){
        if(Index==0){
            return true;
        }
        return false;
    }
}
