/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class B1_Very_Important {

    public static class ChuyenXe {

        private String msChuyen, hoTenTX;
        private int soXe;
        private double doanhThu ;
      

        public ChuyenXe(String msChuyen, String hoTenTX, int soXe, double doanhThu) {
            super();
            this.msChuyen = msChuyen;
            this.hoTenTX = hoTenTX;
            this.soXe = soXe;
            this.doanhThu = doanhThu;
        }

        public String getMsChuyen() {
            return msChuyen;
        }

        public void setMsChuyen(String msChuyen) {
            this.msChuyen = msChuyen;
        }

        public String getHoTenTX() {
            return hoTenTX;
        }

        public void setHoTenTX(String hoTenTX) {
            this.hoTenTX = hoTenTX;
        }

        public int getSoXe() {
            return soXe;
        }

        public void setSoXe(int soXe) {
            this.soXe = soXe;
        }

        public double getDoanhThu() {
            return doanhThu;
        }

        public void setDoanhThu(double doanhThu) {
            this.doanhThu = doanhThu;
        }

        @Override
        public String toString() {
            return "ChuyenXe{" + "msChuyen=" + msChuyen + ", hoTenTX=" + hoTenTX + ", soXe=" + soXe + ", doanhThu=" + doanhThu + '}';
        }

        public ChuyenXe() {
            super();
        }

    }

    public static class cxNoiThanh extends ChuyenXe {

        public int soTuyen;
        public float soKM;

        public cxNoiThanh(int soTuyen, float soKM, String msChuyen, String hoTenTX, int soXe, double doanhThu) {
            super(msChuyen, hoTenTX, soXe, doanhThu);
            this.soTuyen = soTuyen;
            this.soKM = soKM;
        }

        public int getSoTuyen() {
            return soTuyen;
        }

        public void setSoTuyen(int soTuyen) {
            this.soTuyen = soTuyen;
        }

        public float getSoKM() {
            return soKM;
        }

        public void setSoKM(float soKM) {
            this.soKM = soKM;
        }

        @Override
        public String toString() {
            return "cxNoiThanh{" + "soTuyen=" + soTuyen + ", soKM=" + soKM + '}';
        }

    }

    public static class cxNgoaiThanh extends ChuyenXe {

        private String noiDen;
        private int soNgayDiDuoc;

        public cxNgoaiThanh(String noiDen, int soNgayDiDuoc, String msChuyen, String hoTenTX, int soXe, double doanhThu) {
            super(msChuyen, hoTenTX, soXe, doanhThu);
            this.noiDen = noiDen;
            this.soNgayDiDuoc = soNgayDiDuoc;
        }

        public String getNoiDen() {
            return noiDen;
        }

        public void setNoiDen(String noiDen) {
            this.noiDen = noiDen;
        }

        public int getSoNgayDiDuoc() {
            return soNgayDiDuoc;
        }

        public void setSoNgayDiDuoc(int soNgayDiDuoc) {
            this.soNgayDiDuoc = soNgayDiDuoc;
        }

        @Override
        public String toString() {
            return "cxNgoaiThanh{" + "noiDen=" + noiDen + ", soNgayDiDuoc=" + soNgayDiDuoc + '}';
        }

    }

    public static class QuanLyChuyenXe {

        ArrayList<ChuyenXe> lsChuyenXe;
        Scanner sc;
        ChuyenXe cx;
        int Chon;

        public QuanLyChuyenXe() {
            super();
            lsChuyenXe = new ArrayList<>();
            sc = new Scanner(System.in);
        }

        public void nhap(int n) {
            for (int i = 0; i < n; i++) {
                System.out.println("1: Chuyen Xe Noi Thanh");
                System.out.println("2: Chuyen Xe NgoaiThanh");
                System.out.println("3: Thoat");
                Chon = sc.nextInt();
                sc.nextLine();

                switch (Chon) {
                    case 1: {
                        String msChuyen, hoTenTX;
                        int soXe;
                        double doanhThu;
                        int soTuyen;
                        float soKM;
                        System.out.println("Nhap Ma So Chuyen: ");
                        msChuyen = sc.nextLine();

                        System.out.println("Nhap Ho Ten tx: ");
                        hoTenTX = sc.nextLine();

                        System.out.println("Nhap  So Xe: ");
                        soXe = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Nhap  So Tuyen: ");
                        soTuyen = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Nhap So KM: ");
                        soKM = sc.nextFloat();
                        sc.nextLine();

                        System.out.println("Doanh Thu: ");
                        doanhThu = sc.nextDouble();
                        sc.nextLine();

                        cx = new cxNoiThanh(soTuyen, soKM, msChuyen, hoTenTX, soXe, doanhThu);
                        lsChuyenXe.add(cx);
                        System.out.println("Update successful");

                    }
                    break;
                    case 2: {
                        String msChuyen, hoTenTX;
                        int soXe;
                        double doanhThu;
                        String noiDen;
                        int soNgayDiDuoc;
                        System.out.println("Nhap Ma So Chuyen: ");
                        msChuyen = sc.nextLine();

                        System.out.println("Nhap Ho Ten tx: ");
                        hoTenTX = sc.nextLine();

                        System.out.println("Nhap  So Xe: ");
                        soXe = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Nhap  Noi Den: ");
                        noiDen = sc.nextLine();

                        System.out.println("Nhap So KM: ");
                        soNgayDiDuoc = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Doanh Thu: ");
                        doanhThu = sc.nextDouble();
                        sc.nextLine();

                        cx = new cxNgoaiThanh(noiDen, soNgayDiDuoc, msChuyen, hoTenTX, soXe, doanhThu);
                        lsChuyenXe.add(cx);
                        System.out.println("Update successful");

                    }
                    break;
                    default:
                        break;
                }
            }
        }

        public void Xuat() {
            for (ChuyenXe cx : lsChuyenXe) {
                System.out.println(cx.toString());
            }
        }

        public void TongDoanhThuTungLoai() {
            double doanhThucCXNoiThanh = 0;
            double doanhThucCXNgoaiThanh = 0;
            for (ChuyenXe chuyenXe : lsChuyenXe) {
                if (cx instanceof  cxNoiThanh ) {
                    doanhThucCXNoiThanh += cx.getDoanhThu();
                            
                }
                if( cx instanceof  cxNgoaiThanh){
                    doanhThucCXNgoaiThanh +=cx.getDoanhThu();
                }
            }
            System.out.println("\n Tong doanh thu tuyen xe noi thanh: "+doanhThucCXNoiThanh);
                System.out.println("\n Tong doanh thu tuyen xe ngoai thanh: "+doanhThucCXNgoaiThanh);
        
        }
    }

}
