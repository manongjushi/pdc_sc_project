/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ljh、
 */
public class DBManager {
    //Database basic data
    public static Connection conn; 
    public static String url="jdbc:derby:assignmentDB;create=true";
    public static String name="ljh";
    public static String password="1234";
    private static DBManager db=new DBManager();
    private DBManager(){}
    public static DBManager getDBmanager(){
        return db;
    }
    public void connect(){
        try {
            conn=DriverManager.getConnection(url,name,password);
            System.out.println(url+"   connected....");
            Statement statement=conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void creatTablePeople(){
        try {
            Statement statement=conn.createStatement();
            String sqlCreate = "create table people ("
                    + "account varchar(20), password varchar(20)"
                    + ")";
            statement.executeUpdate(sqlCreate);
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void creatTableItem(){
        try {
            Statement statement=conn.createStatement();
            String newTableName="Item";
            String sqlCreate="create table "+newTableName+
                     "(question varchar(1000), answer varchar(1000))";
            statement.executeUpdate(sqlCreate);
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void write(String table,String str1, String str2){
        try {
            Statement statement=conn.createStatement();
            String TableName=table;
            String sqlInsert = "insert into " + TableName + " values('"
                    +str1+"','"+str2+"')";
            statement.executeUpdate(sqlInsert);
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String search(String table,String condition){
        ResultSet rs = null;
        try {
            Statement statement = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            String sqlQuery = "select *" +" from "+table;
            rs = statement.executeQuery(sqlQuery);
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString(1).equals(condition)){
                    return rs.getString(2);
                }
            }
            return "not found";                          
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public  ArrayList<String> searchContain(String table,String condition){
        ResultSet rs = null;
        try {
            Statement statement = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            String sqlQuery = "select *" +" from "+table;
            rs = statement.executeQuery(sqlQuery);
            rs.beforeFirst();
            ArrayList<String> answerList=new ArrayList<>();
            while(rs.next()){
                if(rs.getString(2).contains(condition))
                answerList.add(rs.getString(2));
            }           
            return answerList;                         
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<Item> getAll(String table){
        ResultSet rs = null;
        try {
            Statement statement = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            String sqlQuery = "select *" +" from "+table;
            rs = statement.executeQuery(sqlQuery);
            rs.beforeFirst();
            ArrayList<Item> answerList=new ArrayList<>();
            while(rs.next()){
                Item item=new Item(rs.getString(1),rs.getString(2));
                answerList.add(item);
            }           
            return answerList;                         
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void delete(String str,String table,String condition){
        try {
            Statement statement=conn.createStatement();
            String sqlDelete="DELETE FROM "+table+" WHERE "+condition+" =  '"+str+"'";
            statement.executeLargeUpdate(sqlDelete);
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
