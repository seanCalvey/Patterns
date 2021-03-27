public class Decorator extends Counter {

    protected Counter counter;

    public Decorator(Counter counter) {
        super();
        this.counter = counter;
    }
}