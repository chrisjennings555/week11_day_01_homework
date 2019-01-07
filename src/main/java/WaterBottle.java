public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = 100;
    }

    public int takeDrink() {
        return (this.volume - 10);
    }

    public int emptyBottle() {
        return (this.volume - this.volume);
    }

    public int refillBottle() {
        return ((this.volume - this.volume) + 100);
    }
}
