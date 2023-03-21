/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class transaction {
    /*--------------------------------------------------------------------*/
    public abstract static class Transaction{
        private String transCode;
        private Date transDate;
        private Integer price;
        private Integer quantity;

        public Transaction() {
            super();
        } 
        public abstract Double totalMoney();
        
        public void setTransaction(String transCode){
            this.transCode = transCode;
        }
        
        public void setTransDate(Date transDate){
            this.transDate = transDate;
        }
        
        public void setPrice(Integer price){
            this.price = price;
        }
        
        public void setQuantity(Integer quantity){
            this.quantity = quantity;
        }
        
        public String getTransaction(){
            return this.transCode;
        }
        
        public Date getTransDate(){
            return this.transDate;
        }
        
        public Integer getPrice(){
            return this.price;
        }
        
        public Integer getQuantity(){
            return this.quantity;
        }
    }
    
    public static class TransactionGold extends Transaction{
        private String typeGold;
        
        public TransactionGold() {
            super();
        }
        
        public void setTypeGold(String typeGold){
            this.typeGold = typeGold;
        }
        
        public String getTypeGold(){
            return this.typeGold;
        }
        
        public Double totalMoney()
        {
            return Double.valueOf(getPrice() * getQuantity());
        }
        
    }
    
    public static class CurrencyTransaction extends Transaction{
        private Double exchangeRate;
        private CURRENCY currency;
        
        public CurrencyTransaction() {
            super();
        }
        
        public void setExchangeRate(Double exchangeRate){
            this.exchangeRate = exchangeRate;
        }
        
         public Double getExchangeRate(){
            return this.exchangeRate;
        }
         
         public CurrencyTransaction setCurrency(CURRENCY currency){
            this.currency = currency;
            return this;
        }
        
        public CURRENCY getCurrency(){
            return this.currency;
        }
                
        public Double totalMoney()
        {
            var result = 0.0;
            
            if (getCurrency() == CURRENCY.VND){
                result = Double.valueOf(getPrice() * getQuantity());
            }
            else if (getCurrency() == CURRENCY.EURO 
                    || getCurrency() == CURRENCY.USD){
                result = getPrice() * getQuantity() * getExchangeRate();
            } else{
                throw new RuntimeException("Invalid Currency");
            }
 
            return result;
        }      
    }
    
    public enum CURRENCY {
        VND, USD, EURO
    }
    
    public static void main(String[] args) {
        final int One_billion = 1000000000;
        TransactionGold gold = new TransactionGold();
        gold.setPrice(11);
        gold.setQuantity(12);
        gold.setTransDate(new Date());
        gold.setTypeGold("Vang 24K");
        
        CurrencyTransaction currencyTransaction1 = new CurrencyTransaction();
        currencyTransaction1.setPrice(11);
        currencyTransaction1.setQuantity(12);
        currencyTransaction1.setTransDate(new Date());
        currencyTransaction1.setExchangeRate(1.2);
        currencyTransaction1.setCurrency(CURRENCY.VND);   
        
        CurrencyTransaction currencyTransaction2 = new CurrencyTransaction();
        currencyTransaction2.setPrice(11);
        currencyTransaction2.setQuantity(12);
        currencyTransaction2.setTransDate(new Date());
        currencyTransaction2.setExchangeRate(1.2);
        currencyTransaction2.setCurrency(CURRENCY.USD);   
        
        Double tongTienGold = gold.totalMoney();
        Double tongTienVND = currencyTransaction1.totalMoney();
        Double tongTienUSD = currencyTransaction2.totalMoney();
        
        Double everageTransCurr = (tongTienVND + tongTienUSD) / 2;
        
        if (gold.getPrice() > One_billion)
        {
            
        }
       
    }
}
