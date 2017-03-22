/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import db.DatabaseBroker;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Osoba;
import model.Radnik;
import model.Student;

/**
 *
 * @author Stefan Elez
 */
public class Main {
    public static void main(String[]args){
        try {
            DatabaseBroker db = new DatabaseBroker();
            try {
                db.konektujSeNaBazu();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            Student s = new Student (12, "Paja", "m", 3502103, 4);
            Osoba o = new Osoba(144, "Pera", "m");
            Radnik r = new Radnik(15, "Djosa", "m", 3345, "Gradiliste");
            try{
                db.insertOsoba(o);
                //db.insertStudent(s);
                //db.insertRadnik(r);
                //db.deleteOsoba(o);
                //db.deleteStudent(s);
                //db.deleteRadnik(r);
                db.potvrdiTransakciju();
                System.out.println("Transakcija potvrdjena");
            }catch(Exception e){
                e.printStackTrace();
                db.ponistiTransakciju();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
