/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author drago
 */
public class Serializar {
    Serializar(){
        Date d=new Date();
        System.out.println(d);
        try {
            FileOutputStream f=new FileOutputStream("date.ser");
            ObjectOutputStream s=new ObjectOutputStream(f);
            s.writeObject(d);
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String arg[]){
        new Serializar();
    
    }
}
