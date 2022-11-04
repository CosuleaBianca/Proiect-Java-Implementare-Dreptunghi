/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pb5;

/**
 *
 * @author Jerry
 */
public class Dreptunghi {
    private Punct A,B,C,D;
    
    public Dreptunghi(Punct A,Punct B,Punct C,Punct D){
        double AB=Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2));
        double BC=Math.sqrt(Math.pow(C.getX()-B.getX(),2)+Math.pow(C.getY()-B.getY(),2));
        double CD=Math.sqrt(Math.pow(D.getX()-C.getX(),2)+Math.pow(D.getY()-C.getY(),2));
        double DA=Math.sqrt(Math.pow(A.getX()-D.getX(),2)+Math.pow(A.getY()-D.getY(),2));
        double AC=Math.sqrt(Math.pow(C.getX()-A.getX(),2)+Math.pow(C.getY()-A.getY(),2));
        double BD=Math.sqrt(Math.pow(D.getX()-B.getX(),2)+Math.pow(D.getY()-B.getY(),2));
        
        if(AB==CD && DA==BC && AC==BD)set(A,B,C,D);
        else System.out.println("Punctele nu formeaza un dreptunghi");
    }
    
    public void set(Punct A,Punct B,Punct C,Punct D){
        if(A.getX()<=20 && A.getY()<=20 && B.getX()<=20 && B.getY()<=20 && C.getX()<=20 && C.getY()<=20 && D.getX()<=20 && D.getY()<=20){
            this.A=A;
            this.B=B;
            this.C=C;
            this.D=D;
        }
        else System.out.println("Punctele au coordonate mai mari decat 20");
    }
    
    public double calculeazaLungimea(){
        double AB=Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2));
        return AB;
    }
    
    public double calculeazaLatimea(){
        double DA=Math.sqrt(Math.pow(A.getX()-D.getX(),2)+Math.pow(A.getY()-D.getY(),2));
        return DA;
    }
    
    public double calculeazaPerimetru(){
        return this.calculeazaLatimea()*2+this.calculeazaLungimea()*2;
    }
    
    public double calculeazaAria(){
        return this.calculeazaLatimea()*this.calculeazaLungimea();
    }
    
    public boolean estePatrat(){
        return this.calculeazaLatimea()==this.calculeazaLungimea();
    }
    
}
