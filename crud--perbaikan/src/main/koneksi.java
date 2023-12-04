/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author IQBAL
 */
public class koneksi {
    public static Connection sambungdatabase(){
        try {
            MysqlDataSource db = new MysqlDataSource();
            db.setDatabaseName("kelasc");
            db.setUser("root"); 
            db.setPassword(""); 
            db.setServerName("localhost"); 

            Connection k = db.getConnection();
            
            System.out.println("tersambung");
            return k;
        }
        catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }  
        return null;
    } 
}
