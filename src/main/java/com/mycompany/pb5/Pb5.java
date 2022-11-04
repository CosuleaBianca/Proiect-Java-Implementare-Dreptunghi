/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pb5;

/**
 *
 * @author Jerry
 */
public class Pb5 {

    public static void main(String[] args) {
        Punct A=new Punct(0,3);
        Punct B=new Punct(5,3);
        Punct C=new Punct(5,0);
        Punct D=new Punct(0,0);
        
        Dreptunghi d=new Dreptunghi(A,B,C,D);
        System.out.println("Lungimea: "+d.calculeazaLungimea());
        System.out.println("Latimea: "+d.calculeazaLatimea());
        System.out.println("Perimetru: "+d.calculeazaPerimetru());
        System.out.println("Aria: "+d.calculeazaAria());
        if(d.estePatrat())System.out.println("Este patrat");
        else System.out.println("Nu este patrat");
        
    }
}
