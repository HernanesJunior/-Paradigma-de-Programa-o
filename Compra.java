package com.example;

public class Compra {
    private String produto;
    private double preco;

    public Compra(String produto, double preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public void realizarCompra() {
        System.out.println("Compra realizada: " + produto + " por R$" + preco);
    }
}
