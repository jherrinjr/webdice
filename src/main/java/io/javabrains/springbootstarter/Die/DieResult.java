package io.javabrains.springbootstarter.Die;

import lombok.Data;

@Data
public class DieResult {

    private int numSides;
    private int rollResult;


    public DieResult(){

    }

    public DieResult(int numSides, int rollResult){
        super();
        this.numSides = numSides;
        this.rollResult = rollResult;
    }



}