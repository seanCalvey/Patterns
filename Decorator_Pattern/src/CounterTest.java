
import java.util.Scanner;

public class CounterTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Counter counter = new NoNegative(new Limit10Counter(new Counter()));

        int choice = 1;

        while (choice != 5) {


            System.out.println();
            System.out.println("1.Increment");
            System.out.println("2.Decrement");
            System.out.println("3.Read Value");
            System.out.println("4.Exit");


            System.out.print("Please enter a value-->");
            choice = sc.nextInt();
            if (choice == 1) {
                counter.increment();
                System.out.println("\n Value= " + counter.readValue() + "\n");
            } else if (choice == 2) {
                counter.decrement();
                System.out.println("\n Value= " + counter.readValue() + "\n");
            } else if (choice == 3) {
                System.out.println("\n Value= " + counter.readValue() + "\n");
            }
        }  // end while
    }
}
