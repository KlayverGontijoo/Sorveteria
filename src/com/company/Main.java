package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pedido pedido=new Dinheiro();
        Acai acai = new Acai();
        Sorvete sorvete = new Sorvete();
        pedido.gerarPedido();


        acai.setAdicional(new Tropical());
        acai.fruta();
        acai.chocolate();
        acai.doce();
        acai.cereal();
        sorvete.setCalda(new Morango());
        sorvete.Cobertura();

    }
}
