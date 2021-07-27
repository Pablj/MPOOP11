/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 *
 * @author drago
 */
public class Deserealizar {

    public Deserealizar() {
        Date d=null;
        try {
            FileInputStream f= new FileInputStream("date.ser");
            ObjectInputStream s= new ObjectInputStream(f);
            d=(Date) s.readObject();
            s.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }  
        System.out.println("Daserealizar objeto Date de date.ser");
        System.out.println("Date"+d);
    }
    public static void main(String[] args) {
        new Deserealizar();
    }
}
