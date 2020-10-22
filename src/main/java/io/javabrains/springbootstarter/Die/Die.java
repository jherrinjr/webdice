package io.javabrains.springbootstarter.Die;

import lombok.Data;
import java.util.Random;


@Data
public class Die {

    private Integer numSides;

    private final Random rand = new Random();


    public Die(){

    }

    public Die(Integer numSides){
        super();
        this.numSides = numSides;
    }

    public Integer roll() {
        return (rand.nextInt((int) numSides)+1);
    }
}
