package com.example.myjavafxapp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DB {
    public static Connection con;
    public static void initialize() throws SQLException {
        //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        try  {
            Class.forName("org.postgresql.Driver");


            if(con!=null)
                System.out.println("sucess");
            else
                System.out.println("faild");
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        con=DriverManager.getConnection( "jdbc:postgresql://localhost:5432/postgres", "raghad", "123456");

    }
    }

/*


    public static ObservableList<instructorTable> getdate() throws SQLException {
        Connection conn =initialize();
        ObservableList<instructorTable> list= FXCollections.observableArrayList();
        try{
            PreparedStatement ps=conn.prepareStatement("select*form driving_school.instructor");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                String ssn = rs.getString(1);
                String fname = rs.getString(2);
                String mname = rs.getString(3);
                String lname = rs.getString(4);
                String phone = rs.getString(5);
                Double salary = rs.getDouble(6);
                String license = rs.getString(7);

                //String gender = re.getString(8);
                // Date date = re.getDate(9);
                System.out.println(fname);
                instructorTable RT = new instructorTable(ssn , fname , mname , lname , phone,salary,license,null,null,null,null);
                list.add(RT);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }*/

  /*  public java.sql.Connection connection(String dbname,String user,String pass){
        System.out.println("5ppppppp");
        java.sql.Connection con=null;
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            System.out.println("llllllll");
            con=DriverManager.getConnection("jdbc::postgresql://localhost:5432/"+dbname,user,pass);
            if(con!=null)
                System.out.println("sucess");
            else
                System.out.println("faild");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();

        }
        return con;
    }*/