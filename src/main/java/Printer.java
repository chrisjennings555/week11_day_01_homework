public class Printer {
    private int pages;
    private int toner;

    public Printer(int pages, int toner){
        this.pages = 5;
        this.toner = 10;
    }

    public int getPaperVolume() {
        return this.pages;
    }

    public int getTonerVolume() {
        return this.toner;
    }

    public int printPages(int pages, int copies) {
        return (this.pages - (pages * copies));
    }

    public int printToner(int )

    public int refillPrinter() {
        return ((this.pages - this.pages) + 5);
    }


}
