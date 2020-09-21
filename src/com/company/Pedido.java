package com.company;

public abstract class Pedido {
    private void realizarPedido(){
        System.out.println("O seu pedido está sendo processado.");
    }
    private void calcularValor(){
        System.out.println("O valor da sua compra está sendo calculado");
    }
    private void mostrarValor(){
        System.out.println("O valor da sua compra é de.....");
    }
    protected abstract void pagar();

    public void gerarPedido(){
        realizarPedido();
        calcularValor();
        mostrarValor();
        pagar();
    }
}
