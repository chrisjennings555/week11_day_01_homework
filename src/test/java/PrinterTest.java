import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void Before(){
        printer = new Printer(5,10);
    }

    @Test
    public void getPaperVolume(){
        assertEquals(5, printer.getPaperVolume());
    }

    @Test
    public void getTonerVolume(){
        assertEquals(10, printer.getTonerVolume());
    }

    @Test
    public void printPages() {
        assertEquals(3, printer.printPages(2,1));
    }

    @Test
    public void refillPrinter() {
        assertEquals(5, printer.refillPrinter());
    }


}
