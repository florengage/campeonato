package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App
{
    public static void main( String[] args ) {
        try {
            String url = "jdbc:mysql://localhost:3306/phpmyadmin/index.php?route=/table/structure&db=mysql&table=equipo";
            String username = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, username, password ) ;
            Statement Statement = connection.createStatement();
            ResultSet resultSet = Statement.executeQuery("SELECT * FROM EQUIPO");

            while (resultSet.next()){
                System.out.println(resultSet.getString("nombre") + " " + resultSet.getString("titulares") + " " + resultSet.getString("puntos") + " " + resultSet.getString("partidosJugados"));
            }
            connection.close();
            Statement.close();
            resultSet.close();



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

