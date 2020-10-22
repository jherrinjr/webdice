package io.javabrains.springbootstarter.Die;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DieController {

    @Autowired
    private DieService dieService;

    @PostMapping("/diceadd")
    public void addDice(@RequestBody AddDieRequest req) {
        System.out.println("addDice called: received " + req);
        dieService.addDie(req);
    }

    @RequestMapping("/rolldice")
    public List<DieResult> rollDice() {
        System.out.println("rollDice called");
        return dieService.rollDie();
    }
}
