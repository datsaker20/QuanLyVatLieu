/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author tran dat
 */
public class DataNhanVien {
    public static Connection openConnetion() throws Exception{
        String userName = "sa";
            String password = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSieuThi;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection conn = java.sql.DriverManager.getConnection(url, userName, password);
           return conn;
    }
}
