import java.util.Scanner;
import java.lang.String;
public class chepter_4_p_set_prob_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("your income:");
        int income= sc.nextInt();

        if (income<=250000){
            System.out.println("you are tax free");
        } else if (income<=500000) {
            System.out.println("your tax is 5%");
        } else if (income<=1000000) {
            System.out.println("your tax is 20%");
        }else {
            System.out.println("your tax is 30%");
        }

        //problem 4
        Scanner bc = new Scanner(System.in);
        System.out.println("enter number(1-7): ");
        int day = bc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("this is not write num");
        }
    }
}
