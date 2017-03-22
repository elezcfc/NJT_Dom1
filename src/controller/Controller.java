/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DatabaseBroker;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import model.Osoba;
import model.Radnik;
import model.Student;

/**
 *
 * @author elezs
 */
public class Controller {
    private DatabaseBroker db;
    private static Controller controller;
    
    private Controller () throws ClassNotFoundException, IOException, SQLException{
        db = new DatabaseBroker();
        db.konektujSeNaBazu();
    }
    public static Controller instanceController() throws ClassNotFoundException, IOException, SQLException{
        if(controller == null){
            controller = new Controller();
        }
        else {
            System.out.println("Kontroler vec kreiran");
        }
        return controller;
    }

    public DatabaseBroker getDb() {
        return db;
    }

    public void setDb(DatabaseBroker db) {
        this.db = db;
    }

    public void dodajOsobu(int mlb, String ime, String pol) throws SQLException {
        Osoba o = new Osoba(mlb, ime, pol);
        db.insertOsoba(o);
    }
    public void dodajOsobu(int mlb, String ime, String pol, int brInd, int brPolIsp) throws SQLException{
        Student s = new Student(mlb, ime, pol, brInd, brPolIsp);
        db.insertStudent(s);
    }
    public void dodajOsobu(int mlb, String ime, String pol, int brRK, String naziv) throws SQLException{
        Radnik r = new Radnik(mlb, ime, pol, brRK, naziv);
        db.insertRadnik(r);
    }

    public LinkedList<Radnik> vratiRadnike() throws SQLException {
        LinkedList<Radnik> radnici = new LinkedList<Radnik>();
        ResultSet rs = db.selectRadnike();
        while(rs.next()){
            int mlb = rs.getInt("radnikMlb");
            String ime = rs.getString("imePrezime");
            String pol = rs.getString("pol");
            int brRadneKnj = rs.getInt("brRadneKnjizice");
            String nazivP = rs.getString("nazivPoslodavca");
            Radnik s = new Radnik(mlb, ime, pol, brRadneKnj, nazivP);
            radnici.add(s);
        }
        return radnici;    
    }

    public LinkedList<Student> vratiStudente() throws SQLException {
        LinkedList<Student> studenti = new LinkedList<Student>();
        ResultSet rs = db.selectStudente();
        while(rs.next()){
            int mlb = rs.getInt("Studentmlb");
            String ime = rs.getString("imePrezime");
            String pol = rs.getString("pol");
            int brInd = rs.getInt("brIndexa");
            int brPolIsp = rs.getInt("brPolIsp");
            Student s = new Student(mlb, ime, pol, brInd, brPolIsp);
            studenti.add(s);
        }
        return studenti;
    }

    public LinkedList<Osoba> vratiOsobe() throws SQLException {
        LinkedList<Osoba> osobe = new LinkedList<Osoba>();
        ResultSet rs = db.selectOsobe();
        while(rs.next()){
            int mlb = rs.getInt("MLB");
            String ime = rs.getString("imePrezime");
            String pol = rs.getString("pol");
            Osoba o = new Osoba(mlb, ime, pol);
            osobe.add(o);
        }
        return osobe;
    }

    public void potvrdiTransakciju() throws SQLException {
        db.potvrdiTransakciju();
    }

    public void ponistiTransakciju() throws SQLException {
        db.ponistiTransakciju();
    }

    public void updateOsoba(Osoba o) throws SQLException {
        db.updateOsobu(o);
    }

}
