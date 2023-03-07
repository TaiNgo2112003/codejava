/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Admin
 */
public class Lab7_SVpoly {

    public abstract class SVPoly {

        private String HoTen;
        private String Nghanh;

        public SVPoly(String HoTen, String Nghanh) {
            this.HoTen = HoTen;
            this.Nghanh = Nghanh;
        }

        public String getHoTen() {
            return HoTen;
        }

        public void setHoTen(String HoTen) {
            this.HoTen = HoTen;
        }

        public String getNghanh() {
            return Nghanh;
        }

        public void setNghanh(String Nghanh) {
            this.Nghanh = Nghanh;
        }

        abstract double getDiem();

        public void getHocLuc() {
            if (getDiem() >= 9) {
                System.out.println("Hoc Luc Xuat Xac.");
            } else if (getDiem() > 7.5) {
                System.out.println("Hoc Luc Gioi.");
            } else if (getDiem() >= 6.5) {
                System.out.println("Hoc Luc Khac.");
            } else if (getDiem() >= 5) {
                System.out.println("Hoc Luc Trung Binh.");
            } else {
                System.out.println("Hoc Luc Ngu.");
            }
        }

        public SVPoly() {

        }

    }

    public class SVIT extends SVPoly {

        private double diem_Java;
        private double diem_CSS;
        private double diem_Html;

        public SVIT(double diem_Java, double diem_CSS, double diem_Html, String HoTen) {
            super(HoTen, HoTen);
            this.diem_Java = diem_Java;
            this.diem_CSS = diem_CSS;
            this.diem_Html = diem_Html;
        }

        @Override
        public double getDiem() {
            return (2 * diem_Java + diem_CSS + diem_Html) / 4;
        }

    }

    public class SVBiz extends SVPoly{
        private double diemMarketing;
        private double diemSale;

        public SVBiz(double diemMarketing, double diemSale, String HoTen, String Nghanh) {
            super(HoTen, Nghanh);
            this.diemMarketing = diemMarketing;
            this.diemSale = diemSale;
        }
        @Override
        public double getDiem(){
            return (2*diemMarketing+diemSale)/3;
        }
    }
    
}
