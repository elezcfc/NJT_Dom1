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
public class Radnik extends Osoba{
    
    private int brRadneKnjizice;
    private String nazivPoslodavca;
    
    public Radnik(int MLB, String imePrezime, String pol, int b, String n) {
        super(MLB, imePrezime, pol);
        brRadneKnjizice = b;
        nazivPoslodavca = n;
    }

    public int getBrRadneKnjizice() {
        return brRadneKnjizice;
    }

    public void setBrRadneKnjizice(int brRadneKnjizice) {
        this.brRadneKnjizice = brRadneKnjizice;
    }

    public String getNazivPoslodavca() {
        return nazivPoslodavca;
    }

    public void setNazivPoslodavca(String nazivPoslodavca) {
        this.nazivPoslodavca = nazivPoslodavca;
    }
    
}
