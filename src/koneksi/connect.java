/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
/**
 *
 * @author Cryan
 */
public class connect {
    static Connection koneksi;

    public static Connection getConnection(){
        try{
            koneksi=DriverManager.getConnection("jdbc:mysql://localhost/cryan_xirpl2","root","");
           }catch (Exception e){
               JOptionPane.showConfirmDialog(null,"koneksi gagal");
           }return koneksi;
    }
}
