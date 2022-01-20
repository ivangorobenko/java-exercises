package oop.billsBurger;

import oop.billsBurger.burgers.Hamburger;

public class BillsBurger {

    public BillsBurger() {}

    public double sell(Hamburger burger) {
        return burger.calculatePrice();
    }

}
