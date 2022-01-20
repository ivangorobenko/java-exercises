package oop.billsBurger.burgers;


import oop.billsBurger.additions.Addition;

public class HealthyHamburger extends Hamburger {
    public HealthyHamburger() {
        super(14, "MEAT", "RYE", "HEALTHY_BURGER");
    }

    @Override
    public HealthyHamburger addAddition(Addition addition) {
        if (this.getAdditions().size() < 6) super.addAddition(addition);
        return this;
    }
}
