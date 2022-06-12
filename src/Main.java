import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int apple;
        int orange;
        int quantity;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc jablek");
        apple = scanner.nextInt();
        System.out.println("Podaj ilosc pomaranczy");
        orange = scanner.nextInt();
        System.out.println("Podaj ilosc monet");
        quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            if (apple <= orange) {
                apple = apple + 1;
            } else {
                orange = orange + 1;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
        System.out.println(apple - orange);
    }
}
