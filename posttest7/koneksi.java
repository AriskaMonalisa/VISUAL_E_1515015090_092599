/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest7;
import posttest4.*;
import modul7.*;
 import java.sql.*;
    import javax.swing.JOptionPane;
    

/**
 *
 * @author Monalisa
 */
public class koneksi {
    private static Connection con;
    public static Connection getConnection(){
        try{
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pratikum_visual","root","");
            JOptionPane.showMessageDialog(null, "koneksi berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "koneksi gagal:" +e.getMessage());
        }
        return con;
        }
    }

