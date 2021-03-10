package DAO;

import java.sql.*;

public class ConecctionDataBase {

    private static Connection  instancia;
    private static String url = "jdbc:mysql://localhost:3306/guiamobydigital";
    private static String username = "root";
    private static String password = "";


    public static Connection getInstance() throws SQLException, ClassNotFoundException {
        if(instancia == null){
            instancia =  DriverManager.getConnection(url,username,password);;
        }
        return instancia;
    }

}
