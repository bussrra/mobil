package com.example.uygulama1;

import java.util.Random;

public class Asker {
    private Integer atesGucu;
    public Integer getAtesGucu(){
        return atesGucu;
    }
    public void setAtesGucu(Integer atesGucu){
        this.atesGucu=atesGucu;
    }
    private Integer sans;
    public Integer getSans(){
        return sans;
    }
    public void setSans(Integer sans){
        this.sans=sans;
    }
    public Asker(Integer atesGucu, Integer sans){
        this.atesGucu=atesGucu;
        this.sans=sans;
    }

}
