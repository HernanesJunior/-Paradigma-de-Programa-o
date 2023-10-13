package com.example;

public class Main {
    public static void main(String[] args) {
        Compra compra1 = new Compra("Livro", 30.0);
        Compra compra2 = new Compra("Computador", 1500.0);

        compra1.realizarCompra();
        compra2.realizarCompra();
    }
}


