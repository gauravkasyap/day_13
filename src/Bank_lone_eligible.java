import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Bank_lone_eligible {
    public static void main(String[] args) {
        System.out.println("Welcome To Lone Bank");
        int Account;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your Account Number: ");
            Account = sc.nextInt();

        Scanner sce= new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int Salary = sce.nextInt();

        Scanner scd = new Scanner(System.in);
        System.out.print("Enter your Accountable: ");
        int Accountbalence = scd.nextInt();

        Scanner sdf = new Scanner(System.in);
        System.out.print("Expected EMI:");
        int ExpectedEmi = scd.nextInt();

        if (Salary>25000){
            System.out.println("you are eligible for CAR lone");
            System.out.println("eligible Lone Amount = 500000 ");
            System.out.println("Eligible EMI =36");
        } else if (Salary>50000) {
            System.out.println("you are eligible for HOME lone");
            System.out.println("eligible Lone Amount = 6000000 ");
            System.out.println("Eligible EMI = 60");
        } else if (Salary>75000) {
            System.out.println("you are eligible for Business lone");
            System.out.println("eligible Lone Amount = 7500000 ");
            System.out.println("Eligible EMI = 84");
        }else {
            System.out.println("Your not Eligible for lone");
        }

    }
}
