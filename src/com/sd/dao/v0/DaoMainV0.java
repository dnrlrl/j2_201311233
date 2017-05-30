package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;

public class DaoMainV0{
  public static void main(String[] args){
    Connection conn=null;
    Statement stmt=null;
    try{
      String path=System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop=new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      //static Connection getConnection(String url,user,password)
      //conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","tkddnjs147");
      conn=DriverManager.getConnection(
        prop.getProperty("URL"),
        prop.getProperty("USER"),
        prop.getProperty("PASSWORD")
      );
      String mySql="CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
      mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      stmt=conn.createStatement();
      stmt.execute(mySql);
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      try{
        if(stmt!=null)stmt.close();
        if(conn!=null)conn.close();
      }catch (Exception e){}
    }
  }
}