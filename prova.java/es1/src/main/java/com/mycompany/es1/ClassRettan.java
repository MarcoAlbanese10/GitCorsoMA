package com.mycompany.es1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marco.albanese
 */
public class ClassRettan {

  
  private int larghezza;

  private int altezza;

  public ClassRettan(int l, int h)
  {

    this.larghezza = l;

    this.altezza = h;
  }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
    
    
  
  private int calcolArea(int l,int h){
      int area=l*h;
      return area;
  }
  
    public static void main(String[] args) {
        ClassRettan x = new ClassRettan(6,2);
        x.setAltezza(5);
        int area = x.calcolArea(x.getLarghezza(),x.getAltezza());
        System.out.println(area);
    } 
    
  
  
  
  

    
    
    
}
