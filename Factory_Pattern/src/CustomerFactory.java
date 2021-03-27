public class CustomerFactory{
    public Customer getCustomer(String name, int age, double price){
        if(age < 17){
            return new YoungCustomer(name,age,price);
        } else {
            return new OldCustomer(name,age,price);
        }
    }
}
