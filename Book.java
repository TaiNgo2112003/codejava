/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Book {

    public static class sach {

        private String maSach;
        private String ngayNhap;
        private double donGia;
        private int soLuong;
        private String NXB;

        Scanner scanner = new Scanner(System.in);

        public sach(String maSach, String ngayNhap, int donGia, int soLuong, String NXB) {
            super();
            this.maSach = maSach;
            this.ngayNhap = ngayNhap;
            this.donGia = donGia;
            this.soLuong = soLuong;
            this.NXB = NXB;
        }

        public sach() {
            super();
        }

        public String getMaSach() {
            return maSach;
        }

        public void setMaSach(String maSach) {
            this.maSach = maSach;
        }

        public String getNgayNhap() {
            return ngayNhap;
        }

        public void setNgayNhap(String ngayNhap) {
            this.ngayNhap = ngayNhap;
        }

        public double getDonGia() {
            return donGia;
        }

        public void setDonGia(int donGia) {
            this.donGia = donGia;
        }

        public int getSoLuong() {
            return soLuong;
        }

        public void setSoLuong(int soLuong) {
            this.soLuong = soLuong;
        }

        public String getNXB() {
            return NXB;
        }

        public void setNXB(String NXB) {
            this.NXB = NXB;
        }

        public void nhap() {
            System.out.println("Nhap Ma Sach ne: ");
            maSach = scanner.nextLine();

            System.out.println("Nhap Ngay Nhap Sach ne: ");
            ngayNhap = scanner.nextLine();

            System.out.println("Nhap Don Gia vao:  ");
            donGia = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Nhap So Luong Sach ne: ");
            soLuong = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Nhap Nha Xuat Ban:  ");
            NXB = scanner.nextLine();

        }

        @Override
        public String toString() {
            return "sach{" + "maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong=" + soLuong + ", NXB=" + NXB + '}';
        }

    }

    public static class sachGiaoKhoa extends sach {

        private String status;
        private int number;

        public sachGiaoKhoa(String status, String maSach, String ngayNhap, int donGia, int soLuong, String NXB) {
            super(maSach, ngayNhap, donGia, soLuong, NXB);
            this.status = status;
        }

        public String isStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public sachGiaoKhoa() {
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String tinhTrangSach(int x) {
            switch (number) {
                case 0:
                    status = "cu";
                    break;
                case 1:
                    status = "moi";
                    break;
                default:
                    break;
            }
            return status;
        }

        @Override
        public void nhap() {
            super.nhap();
            System.out.print("Nhập tình trạng sách (0 - cũ/ 1 - mới): ");
            number = scanner.nextInt();
        }

        public String toString() {
            return super.toString() + ", tình trạng sách: " + this.tinhTrangSach(number);
        }
    }
    public static  class SachThamKhao extends  sach{
        private double thue, thanhTien;

        public SachThamKhao(double thue, double thanhTien, String maSach, String ngayNhap, int donGia, int soLuong, String NXB) {
            super(maSach, ngayNhap, donGia, soLuong, NXB);
            this.thue = thue;
            this.thanhTien = soLuong *donGia;
        }

        public SachThamKhao() {
            super();
            
        }

        public double getThue() {
            return thue;
        }

        public void setThue(double thue) {
            this.thue = thue;
        }

     
  
        
    }
}
