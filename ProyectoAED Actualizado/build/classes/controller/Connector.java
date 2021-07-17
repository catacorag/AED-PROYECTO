package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private String USERNAME = "root";
    private String PASSWORD = "frame$90$";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "salud";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;
            
    public Connector(){
        try{
            Class.forName(CLASSNAME);
            
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(ClassNotFoundException e){
            System.err.println("ERROR"+e);
        }catch(SQLException e){
            System.err.println("Error"+e);
        }
    }
    public Connection getConexion(){
        return con;
    }
    
    public static void main(String[] args){
    	Connector con = new Connector();
    }
}