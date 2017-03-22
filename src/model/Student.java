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
public class Student extends Osoba{
    
    private int brIndexa;
    private int brPolozenihIspita;
    
    public Student(int MLB, String imePrezime, String pol, int i, int b) {
        super(MLB, imePrezime, pol);
        brIndexa = i;
        brPolozenihIspita = b;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public int getBrPolozenihIspita() {
        return brPolozenihIspita;
    }

    public void setBrPolozenihIspita(int brPolozenihIspita) {
        this.brPolozenihIspita = brPolozenihIspita;
    }
    
    
    
}
