/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Stefan Elez
 */
public class Osoba {
    
    private int MLB;
    private String imePrezime;
    //private Date datumRodjenja;
    private String pol;

    public Osoba(int MLB, String imePrezime, String pol) {
        this.MLB = MLB;
        this.imePrezime = imePrezime;
        //this.datumRodjenja = datumRodjenja;
        this.pol = pol;
    }

    public int getMLB() {
        return MLB;
    }

    public void setMLB(int MLB) {
        this.MLB = MLB;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    /*public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }*/

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }
    
}
