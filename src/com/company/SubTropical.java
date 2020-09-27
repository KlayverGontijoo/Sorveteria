package com.company;

public class SubTropical implements Adicional {
    @Override
    public void fruta() {
        System.out.println("Kiwi");
    }

    @Override
    public void chocolate() {
        System.out.println("Diamante Negro");
    }

    @Override
    public void doce() {
        System.out.println("Leite Condensado");
    }

    @Override
    public void cereal(){
        System.out.println("Paçoca");
    }
}
