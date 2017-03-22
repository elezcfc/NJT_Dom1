/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import model.Osoba;
import model.Radnik;
import model.Student;

/**
 *
 * @author Stefan Elez
 */
public class DatabaseBroker {
    
    Connection connection; 
    
    public void konektujSeNaBazu() throws ClassNotFoundException, IOException, SQLException {
         Class.forName(Util.getInstance().getDriver());
         String url = Util.getInstance().getUrl();
         String user = Util.getInstance().getUser();
         String password = Util.getInstance().getPass();
         connection = DriverManager.getConnection(url, user, password);
         connection.setAutoCommit(false);
        System.out.println("Uspesna konekcija");
    }
    
    public void raskiniKonekciju() throws SQLException{
        connection.close();
        System.out.println("Raskinuta konekcija");
    }
    
    public void potvrdiTransakciju() throws SQLException{
        connection.commit();
        System.out.println("Potvrdjena transakcija");
    }
    
    public void ponistiTransakciju() throws SQLException{
        connection.rollback();
        System.out.println("Ponistena transakcija");
    }
    
    public void insertOsoba(Osoba o) throws SQLException {
        String upit = "INSERT INTO osoba(MLB, imePrezime, pol) VALUES ("+o.getMLB()+",'"+o.getImePrezime()+"', '"+o.getPol()+"')";
        //String upit = "INSERT INTO osoba(MLB, imePrezime, datumRodj, pol) VALUES (1, )"
        System.out.println(upit);
        Statement statement = connection.createStatement();
        //PreparedStatement statement=connection.prepareStatement(upit);
        statement.executeUpdate(upit);
        statement.close();
    }
    
    public void insertStudent(Student s) throws SQLException{  
        Osoba o = new Osoba(s.getMLB(), s.getImePrezime(), s.getPol());
        insertOsoba(o);
        System.out.println("Ubacena osoba");
        String upit = "INSERT INTO student(Studentmlb, brIndexa, brPolIsp, imePrezime, pol) VALUES("+s.getMLB()+", "+s.getBrIndexa()+", "+s.getBrPolozenihIspita()+", '"+o.getImePrezime()+"', '"+o.getPol()+"')";
        System.out.println(upit);
        Statement statement = connection.createStatement();
        statement.executeUpdate(upit);
        statement.close();
    }
    
    public void insertRadnik(Radnik r) throws SQLException {
        Osoba o = new Osoba(r.getMLB(), r.getImePrezime(), r.getPol());
        insertOsoba(o);
        System.out.println("Ubacena osoba");
        String upit = "INSERT INTO radnik(radnikMlb, brRadneKnjizice, nazivPoslodavca, imePrezime, pol) VALUES("+r.getMLB()+", "+r.getBrRadneKnjizice()+",'"+r.getNazivPoslodavca()+"','"+o.getImePrezime()+"', '"+o.getPol()+"' )";
        System.out.println(upit);
        Statement statement = connection.createStatement();
        statement.executeUpdate(upit);
        statement.close();
    }
    public void deleteOsoba(Osoba o) throws SQLException{
        String upit = "DELETE FROM osoba WHERE mlb="+o.getMLB();
        System.out.println(upit);
        Statement statement = connection.createStatement();
        statement.executeUpdate(upit);
        statement.close();
    }
    public void deleteStudent(Student s) throws SQLException{
        Osoba o = new Osoba(s.getMLB(), s.getImePrezime(), s.getPol());
        String upit = "DELETE FROM student WHERE Studentmlb="+s.getMLB();
        System.out.println(upit);
        Statement statement = connection.createStatement();
        statement.executeUpdate(upit);
        deleteOsoba(o);
        statement.close();
    }
    public void deleteRadnik(Radnik s) throws SQLException{
        Osoba o = new Osoba(s.getMLB(), s.getImePrezime(), s.getPol());
        String upit = "DELETE FROM radnik WHERE radnikMlb="+s.getMLB();
        System.out.println(upit);
        Statement statement = connection.createStatement();
        statement.executeUpdate(upit);
        deleteOsoba(o);
        statement.close();
    }

    public ResultSet selectOsobe() throws SQLException {
        String upit = "SELECT * FROM osoba";
        Statement statement  = connection.createStatement();
        ResultSet rs = statement.executeQuery(upit);
        return rs;
    }

    public ResultSet selectStudente() throws SQLException {
        String upit = "SELECT * FROM student";
        Statement statement  = connection.createStatement();
        ResultSet rs = statement.executeQuery(upit);
        return rs;
    }

    public ResultSet selectRadnike() throws SQLException {
        String upit = "SELECT * FROM radnik";
        Statement statement  = connection.createStatement();
        ResultSet rs = statement.executeQuery(upit);
        return rs;
    }

    public void updateOsobu(Osoba o) throws SQLException {
        String upit = "UPDATE osoba"
                + " SET imePrezime = '"+o.getImePrezime()+"', pol = '"+o.getPol()+"'"
                + " WHERE mlb = "+o.getMLB()+";";
        Statement statement = connection.createStatement();
        statement.executeUpdate(upit);
    }
    
}
