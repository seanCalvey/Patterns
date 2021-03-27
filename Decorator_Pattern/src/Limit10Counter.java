public class Limit10Counter extends Decorator {

    public Limit10Counter(Counter counter) {
        super(counter);
    }

    public int readValue() {
        return counter.readValue();
    }

    public void increment() {
        if (readValue() >= 10) {
            System.out.println("Limit 10 reached");
        } else {
            counter.increment();
        }
    }

    public void decrement() {
        counter.decrement();
    }
}