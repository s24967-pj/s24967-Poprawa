package com.example.shopee_s24967;

public class Customer {
    private Integer idCustomer;
    private double saldo;

    public Customer(Integer idCustomer, double saldo) {
        this.idCustomer = idCustomer;
        this.saldo = saldo;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
