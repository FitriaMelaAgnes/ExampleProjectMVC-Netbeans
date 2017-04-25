/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.control;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Agnes-PC
 */
public class login_koneksi {
    private static com.mysql.jdbc.Connection koneksi;
    public static com.mysql.jdbc.Connection GetConnection() throws SQLException { 
        if (koneksi == null) {
            com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver(); 
            koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/toko? zeroDateTimeBehavior=convertToNull", "root", ""); 
        } 
        return koneksi; 
    } 
 }
