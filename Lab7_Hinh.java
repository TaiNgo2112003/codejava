/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Admin
 */
public class Lab7_Hinh {

    public static class ChuNhat {

        private double rong;
        private double dai;

        public double getChuVi() {
            return (rong + dai) * 2;
        }

        public double getDienTich() {
            return dai * rong;
        }

        public void xuat() {
            System.out.println("Chieu dai: " + dai + "\nChieu rong: " + rong + "\nDien Tich" + getDienTich() + "Chu vi: " + getChuVi());
        }

        public ChuNhat(double rong, double dai) {
            this.rong = rong;
            this.dai = dai;
        }
        public ChuNhat(){
            
        }
    }
    public   static class  vuong extends ChuNhat{
      public vuong(double canh){
          super(canh, canh);
          double rong =canh;
          
      }
      @Override
      public void xuat(){
          System.out.println("Dien Tich Hinh Vuong: "+getDienTich()+"\n Chu Vi Hinh Vuong: "+ getChuVi());
      }
      
    }
    
    
    public class main{
        public static void main(String[] args) {
            ChuNhat cn = new ChuNhat(); 
            cn.xuat();
            
            
        }
    }
}
