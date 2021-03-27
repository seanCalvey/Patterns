abstract class Customer {
    protected String name;
    protected int age;
    protected double price;

    public Customer(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public abstract double readPrice();

    public void setNewPrice(double price) {
        this.price = price;
    }

}