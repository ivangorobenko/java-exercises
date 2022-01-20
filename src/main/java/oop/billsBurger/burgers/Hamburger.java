package oop.billsBurger.burgers;

import oop.billsBurger.additions.Addition;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    public double getBasePrice() {
        return basePrice;
    }

    public List<Addition> getAdditions() {
        return additions;
    }

    private List<Addition> additions = new ArrayList<>();

    private final double basePrice;

    private String steakType;

    private String roleType;

    private String name;

    public Hamburger(double basePrice, String steakType, String roleType, String name) {
        this.basePrice = basePrice;
        this.steakType = steakType;
        this.roleType = roleType;
        this.name = name;
    }

    public double calculatePrice() {
        List<Addition> additions = this.getAdditions();
        if (additions != null) {
            return additions.stream().map(Addition::getPrice).toList().stream()
                    .reduce(getBasePrice(), Double::sum);
        }
        return getBasePrice();

    }

    public Hamburger addAddition(Addition addition){
        additions.add(addition);
        return this;
    }
}
