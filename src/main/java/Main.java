import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        String a = scanner.nextLine();
        System.out.println("Введите b");
        String b = scanner.nextLine();
        System.out.println("Sum is " + bins.sum(a, b));
        System.out.println("Product is " + bins.mult(a, b));
    }
}
