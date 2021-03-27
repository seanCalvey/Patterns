public class YoungCustomer extends Customer{

    public YoungCustomer(String name, int age, double price) {
        super(name, age, price);
    }

    @Override
    public double readPrice() {
        return price * 0.5;
    }
}
