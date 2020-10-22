package io.javabrains.springbootstarter.Die;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DieService {



    private List<Die> dice = new ArrayList<Die>();

    //still need to build process in which dice are added
    public void addDie(AddDieRequest req) {
        for (int i = 0; i < req.getNumDie(); i++) {
            dice.add(new Die(req.getNumSides()));
        }
        System.out.println("Add die Service run: Die in queue" + dice);
    }

    //need to build dice roll logic
    public List<DieResult> rollDie(){
        int roll=0;
        System.out.println("rollDie service started");
        List<DieResult> results = new ArrayList<>();
        for (Die d: dice) {
            System.out.println("Roll dice loop ");
            roll = d.roll();
            results.add(new DieResult(d.getNumSides(), roll));
            System.out.println("Rolled 1 " + d.getNumSides() +"sided die and got "+ roll);
        }
        return results;
    }
}
