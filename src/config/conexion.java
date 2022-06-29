/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.*;

/**
 *
 * @author Samir, Darwin Hincho
 * BD_LAB06 EPIS UNSA
 */
public class conexion {
    Connection connection = null;
    public conexion(){
        
        try{
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/lab05";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,password);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
