import java.util.Scanner;

public class mario {
    public static void main(String[] args) {

        int n;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bricks:");
            n = sc.nextInt();
        } while (n < 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
