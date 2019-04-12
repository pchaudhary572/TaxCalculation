package com.example.taxcalculation;

public class TAX {
    private double anualSalary, taxAmount, tax1, tax2, tax3;

    public TAX(double msalary) {
        anualSalary = msalary*12;
    }

    public double getAnualSalary() {
        return anualSalary;
    }

    public void setAnualSalary(double anualSalary) {
        this.anualSalary = anualSalary;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double taxCalculate(){
        if(anualSalary<=200000){
            tax1=anualSalary/100;
            return tax1;
        }else  if(anualSalary>=200000 && anualSalary<=350000){
            tax1=(200000*1)/100;
            anualSalary= anualSalary-200000;
            tax2=(anualSalary*15)/100;
            return tax1+tax2;
        }else if(anualSalary>=350000){
            tax1=(200000*1)/100;
            anualSalary= anualSalary-200000;
            tax2=(150000*15)/100;
            anualSalary= anualSalary-150000;
            tax3=(anualSalary*25)/100;
            return tax1+tax2+tax3;
        }
        return 0;
    }
}
