package oop.billsBurger;

import oop.billsBurger.additions.*;
import oop.billsBurger.burgers.BasicHamburger;
import oop.billsBurger.burgers.DeluxeBurger;
import oop.billsBurger.burgers.HealthyHamburger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillsBurgerTest {

    @Test
    public void should_sell_a_basic_burger_with_no_additional_items() {
        //GIVEN
        BillsBurger billsBurger = new BillsBurger();

        //WHEN
        double calculatedPrice = billsBurger.sell(new BasicHamburger());

        //THEN
        assertEquals(10, calculatedPrice);
    }

    @Test
    public void should_sell_a_basic_burger_with_letuce_pickles_and_tomatoes() {
        //GIVEN
        BillsBurger billsBurger = new BillsBurger();
        BasicHamburger burger = new BasicHamburger();
        burger.addAddition(new Letuce()).addAddition(new Tomato()).addAddition(new Pickles());

        //WHEN
        double calculatedPrice = billsBurger.sell(burger);

        //THEN
        assertEquals(13, calculatedPrice);
    }

    @Test
    public void should_sell_a_basic_burger_with_only_one_addition() {
        //GIVEN
        BillsBurger billsBurger = new BillsBurger();
        BasicHamburger burger = new BasicHamburger();
        burger.addAddition(new Letuce());

        //WHEN
        double calculatedPrice = billsBurger.sell(burger);

        //THEN
        assertEquals(11, calculatedPrice);
    }

    @Test
    public void should_not_be_able_to_add_more_than_4_additions_to_basic_burger() {
        //GIVEN
        BasicHamburger burger = new BasicHamburger();
        burger.addAddition(new Letuce()).addAddition(new Tomato()).addAddition(new Carrot()).addAddition(new Bacon());

        //WHEN
        burger.addAddition(new Pickles());

        //THEN
        assertEquals(4, burger.getAdditions().size());
    }

    @Test
    public void should_sell_healthy_burger() {
        //GIVEN
        BillsBurger billsBurger = new BillsBurger();
        HealthyHamburger burger = new HealthyHamburger();
        burger.addAddition(new Letuce());

        //WHEN
        double calculatedPrice = billsBurger.sell(burger);

        //THEN
        assertEquals(15,calculatedPrice);
    }

    @Test
    public void should_not_be_able_to_add_more_than_6_additions_to_healthy_burger() {
        //GIVEN
        HealthyHamburger burger = new HealthyHamburger();
        burger.addAddition(new Letuce()).
                addAddition(new Tomato())
                .addAddition(new Carrot())
                .addAddition(new Bacon())
                .addAddition(new OnionRings())
                .addAddition(new Pickles());

        //WHEN
        burger.addAddition(new Cheese());

        //THEN
        assertEquals(6, burger.getAdditions().size());
    }

    @Test
    public void should_sell_deluxe_burger() {
        //GIVEN
        BillsBurger billsBurger = new BillsBurger();
        DeluxeBurger burger = new DeluxeBurger();

        //WHEN
        double calculatedPrice = billsBurger.sell(burger);

        //THEN
        assertEquals(20, calculatedPrice);
    }

    @Test
    public void should_not_be_able_to_add_extra_additions_to_deluxe_burger() {
        //GIVEN
        DeluxeBurger burger = new DeluxeBurger();

        //WHEN
        burger.addAddition(new Cheese());

        //THEN
        assertEquals(2, burger.getAdditions().size());
    }
}