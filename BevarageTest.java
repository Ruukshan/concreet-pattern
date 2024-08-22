import java.util.Scanner;

public class BevarageTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask users if the want extra?
        System.out.print("Do you want extras with your tea? (yes/no): ");
        boolean teaExtra = scanner.nextLine().trim().equalsIgnoreCase("Yes");

        System.out.print("Do you want extras in your coffee? (yes/no): ");
        boolean coffeeExtra = scanner.nextLine().trim().equalsIgnoreCase("Yes");

        // Create instances of Tea and Coffee
        Bevarages tea = new Tea();
        tea.setWantsExtras(teaExtra);
        Bevarages coffee = new Coffee();
        coffee.setWantsExtras(coffeeExtra);

        //Prepare tea
        System.out.println("\nMaking Tea:");
        tea.finalTemplateMethod();

        //Prepare coffee
        System.out.println("\nMaking Coffee:");
        coffee.finalTemplateMethod();

        scanner.close();
    }
}