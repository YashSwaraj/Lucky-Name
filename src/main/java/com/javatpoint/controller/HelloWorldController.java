package com.javatpoint.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@RestController  
public class HelloWorldController   
{  
    @RequestMapping("/api/name")  
    public String hello()   
    {  
        // String url = "jdbc:postgresql://azure-bench-server.postgres.database.azure.com:5432/postgres?user=Nagarro_Yash&password=Happy9810741638&sslmode=require";

        // try (Connection con = DriverManager.getConnection(url);
        //         Statement st = con.createStatement();
        //         ResultSet rs = st.executeQuery("SELECT name FROM LuckyName where Name='Yash'")) {

        //     if (rs.next()) {
        //         return rs.getString(1);
        //     }

        // } catch (SQLException ex) {
        //     return ex.toString();
        // }
        return "dummy_string";
    }  
}  