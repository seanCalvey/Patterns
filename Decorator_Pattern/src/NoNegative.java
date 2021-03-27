public class NoNegative extends Decorator {

    public NoNegative(Counter counter) {
        super(counter);
    }

    public int readValue() {
        return counter.readValue();
    }

    public void increment() {
        counter.increment();
    }

    public void decrement() {
        if (readValue() <= 0) {
            System.out.println("Already 0");
        } else {
            counter.decrement();
        }
    }
}