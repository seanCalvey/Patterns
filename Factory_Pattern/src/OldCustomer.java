class OldCustomer extends Customer {

    public OldCustomer(String name, int age, double price) {
        super(name, age, price);
    }

    @Override
    public double readPrice() {
        return price;
    }
}
