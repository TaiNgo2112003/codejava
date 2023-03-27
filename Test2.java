
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Test2 {

    abstract class car {

        Scanner scanner = new Scanner(System.in);
        protected String licensePlates, carColor, Brand;

        public car() {
            super();
        }
        //VOCABULARY: license plates: biển số xe

        public void Output() {

        }

        public void Input() {
            System.out.println("Pls enter the license places:");
            licensePlates = scanner.nextLine();
            System.out.println("Enter color car: ");
            carColor = scanner.nextLine();
            System.out.println("Enter brand: ");
            Brand = scanner.nextLine();

        }

        public abstract double totalM();

        public Scanner getScanner() {
            return scanner;
        }

        public void setScanner(Scanner scanner) {
            this.scanner = scanner;
        }

        public String getLicensePlates() {
            return licensePlates;
        }

        public void setLicensePlates(String licensePlates) {
            this.licensePlates = licensePlates;
        }

        public String getCarColor() {
            return carColor;
        }

        public void setCarColor(String carColor) {
            this.carColor = carColor;
        }

        public String getBrand() {
            return Brand;
        }

        public void setBrand(String Brand) {
            this.Brand = Brand;
        }

        public car(String licensePlates, String carColor, String Brand) {
            super();
            this.licensePlates = licensePlates;
            this.carColor = carColor;
            this.Brand = Brand;
        }

        @Override
        public String toString() {
            return "car{" + "licensePlates=" + licensePlates + ", carColor=" + carColor + ", Brand=" + Brand + '}';
        }
    }

    public static class Bus extends car {

        private int soTuyenBus;
        private float doDaiLT;

        @Override
        public double totalM() {
            if (doDaiLT > 20) {
                return 10000;
            }
            return 5000;
        }

        public Bus(int soTuyenBus, float doDaiLT, String licensePlates, String carColor, String Brand) {
            super(licensePlates, carColor, Brand);
            this.soTuyenBus = soTuyenBus;
            this.doDaiLT = doDaiLT;
        }

        public int getSoTuyenBus() {
            return soTuyenBus;
        }

        public void setSoTuyenBus(int soTuyenBus) {
            this.soTuyenBus = soTuyenBus;
        }

        public float getDoDaiLT() {
            return doDaiLT;
        }

        public void setDoDaiLT(float doDaiLT) {
            this.doDaiLT = doDaiLT;
        }

        public Bus() {
            super();
        }

        @Override
        public void Input() {
            super.Input();
            System.out.println("Nhập số tuyến xe bus: ");
            soTuyenBus = scanner.nextInt();
            System.out.println("Nhập độ dài lộ trình: ");
            doDaiLT = scanner.nextFloat();
        }

        @Override
        public String toString() {
            return "Bus{" + "soTuyenBus=" + soTuyenBus + ", doDaiLT=" + doDaiLT + '}';
        }
    }
        
    
    //VOCABULARY: tonnage: trọng tải
    public static class Truck extends car{
        private float tonnage;

        public Truck(float tonnage, String licensePlates, String carColor, String Brand) {
            super(licensePlates, carColor, Brand);
            this.tonnage = tonnage;
        }

        public Truck() {
            super();
        }

        public float getTonnage() {
            return tonnage;
        }

        public void setTonnage(float tonnage) {
            this.tonnage = tonnage;
        }
        @Override
         public double totalM() {
             if(tonnage < 3)
                 return 15000;
             return 30000;
         }
          @Override
        public void Input() {
            super.Input();
              System.out.println("Enter the tonnage of truck car: "); tonnage = scanner.nextFloat();
        }

        @Override
        public String toString() {
            return "Truck{" + "tonnage=" + tonnage + '}';
        }
    }
    
    
    public static  class Vehicle_Management  {
        ArrayList<Truck> arrTrucks = new ArrayList<>();
        ArrayList<Bus> arrBuses = new  ArrayList<>();
        int number_of_BusCar, number_of_TruckCar;      
       double totalBus =0, totalTruck =0;
        
     public void TOTAL(){
      
         System.out.println("Tổng số tiền qua trạm xe bus: ");
        for(int i=0; i<arrBuses.size(); i++){
       
            
                    }
     }
       
   
      
        
    }
}
