package io.javabrains.springbootstarter.Die;

import lombok.Data;

@Data
public class AddDieRequest {

    private Integer numSides;
    private Integer numDie;


    public AddDieRequest(Integer numSides, Integer numDie){
        this.numSides = numSides;
        this.numDie = numDie;
    }


}