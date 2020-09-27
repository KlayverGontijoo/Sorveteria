package com.company;

public class Tropical implements Adicional {
    @Override
    public void fruta() {
        System.out.println("Banana");
    }

    @Override
    public void chocolate() {
        System.out.println("5Stars");
    }

    @Override
    public void doce() {
        System.out.println("Mel");
    }

    @Override
    public void cereal(){
        System.out.println("Aveia");
    }
}
