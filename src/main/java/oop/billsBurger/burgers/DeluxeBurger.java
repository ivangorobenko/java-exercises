package oop.billsBurger.burgers;

import oop.billsBurger.additions.Addition;
import oop.billsBurger.additions.Chips;
import oop.billsBurger.additions.Drink;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super(14, "MEAT", "BREAD", "DELUXE_BURGER");
        super.addAddition(new Chips());
        super.addAddition(new Drink());
    }

    @Override
    public DeluxeBurger addAddition(Addition addition) {
        return this;
    }
}