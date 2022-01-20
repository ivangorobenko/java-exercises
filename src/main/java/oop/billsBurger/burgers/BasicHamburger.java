package oop.billsBurger.burgers;

import oop.billsBurger.additions.Addition;

public class BasicHamburger extends Hamburger {
    public BasicHamburger() {
        super(10, "MEAT", "BREAD", "BASIC_BURGER");
    }

    @Override
    public BasicHamburger addAddition(Addition addition) {
        if (this.getAdditions().size() < 4) super.addAddition(addition);
        return this;
    }
}
