import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double origPrice;
        CustomerFactory customerFactory = new CustomerFactory();

        System.out.print("Enter Name:");
        String name = sc.next();

        System.out.print("Enter Age:");
        int age = sc.nextInt();

        System.out.print("Enter Gross Price:");
        origPrice = sc.nextDouble();

        Customer customer = customerFactory.getCustomer(name, age, origPrice);
        int choice = 1;
        double val;
        while (choice != 4) {
            System.out.println("1: Enter New Price");
            System.out.println("2: Read Net Price");
            System.out.println("3: Enter New Customer Details:");
            System.out.println("4: Exit");
            System.out.print("Please enter a value-->");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Price:");
                    val = sc.nextDouble();
                    customer.setNewPrice(val);
                }
                case 2 -> {
                    double res = customer.readPrice();
                    System.out.println("Price: " + res);
                }
                case 3 -> {
                    System.out.print("Enter Name:");
                    name = sc.next();
                    System.out.print("Enter Age:");
                    age = sc.nextInt();
                    System.out.print("Enter Gross Price:");
                    origPrice = sc.nextDouble();
                    customer = customerFactory.getCustomer(name, age, origPrice);
                }
            }
        }
    }
}
