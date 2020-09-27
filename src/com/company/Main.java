package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pedido pedido=new Dinheiro();
        pedido.gerarPedido();

        Acai acai = new Acai();
        acai.setAdicional(new Tropical());
        acai.fruta();
        acai.chocolate();
        acai.doce();
        acai.cereal();
    }
}
