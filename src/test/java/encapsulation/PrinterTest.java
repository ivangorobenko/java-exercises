package encapsulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {
    @Test
    public void should_create_printer_with_correct_valid_toner_and_duplex() {
        //GIVEN
        int tonerLevel = 20;

        //WHEN
        Printer printer = new Printer(tonerLevel, true);

        //THEN
        System.out.println(printer.getPagesPrinted());
        assertEquals(0,printer.getPagesPrinted());
        assertTrue(printer.isDuplex());
        assertEquals(tonerLevel,printer.getTonerLevel());
    }

    @Test
    public void should_create_indicate_if_printer_is_created_with_invalid_toner_level() {
        //GIVEN
        int tonerLevel1 = 110;
        int tonerLevel2 = -10;

        //WHEN
        Printer printer1 = new Printer(tonerLevel1, true);
        Printer printer2 = new Printer(tonerLevel2, true);

        //THEN

        assertEquals(-1,printer1.getTonerLevel());
        assertEquals(-1,printer2.getTonerLevel());
    }

    @Test
    public void should_be_able_to_add_toner_to_printer(){
        //GIVEN
        int currentTonerLevel = 20;
        Printer printer = new Printer(currentTonerLevel, false);

        //WHEN
        printer.addToner(80);

        //THEN
        assertEquals(100,printer.getTonerLevel());
    }

    @Test
    public void should_not_add_toner_to_printer_if_is_overflown(){
        //GIVEN
        int currentTonerLevel = 20;
        Printer printer = new Printer(currentTonerLevel, false);

        //WHEN
        int resultingTonerLevel = printer.addToner(90);

        //THEN
        assertEquals(20,printer.getTonerLevel());
        assertEquals(-1,resultingTonerLevel);
    }

    @Test
    public void should_not_add_toner_to_printer_if_level_to_add_is_not_valid(){
        //GIVEN
        int currentTonerLevel = 20;
        Printer printer = new Printer(currentTonerLevel, false);

        //WHEN
        int resultingTonerLevel = printer.addToner(-10);

        //THEN
        assertEquals(20,printer.getTonerLevel());
        assertEquals(-1,resultingTonerLevel);
    }

    @Test
    public void should_print_pages(){
        //GIVEN
        Printer printer = new Printer(20, false);

        //WHEN
        printer.print(2);

        //THEN
        assertEquals(2,printer.getPagesPrinted());
    }

    @Test
    public void should_print_pages_double_in_duplex_mode(){
        //GIVEN
        Printer printer = new Printer(20, true);

        //WHEN
        printer.print(5);

        //THEN
        assertEquals(3,printer.getPagesPrinted());
    }
}