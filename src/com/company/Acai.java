package com.company;

public class Acai {
    private Adicional adicional;

    public void fruta(){
        this.adicional.fruta();
    }
    public void chocolate(){
        this.adicional.chocolate();
    }
    public void doce(){
        this.adicional.doce();
    }
    public void cereal(){
        this.adicional.cereal();
    }
    public void setAdicional(Adicional adicional){
        this.adicional=adicional;
    }
}
