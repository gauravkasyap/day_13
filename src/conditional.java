import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {

        int age;
        do {
            Scanner BC = new Scanner(System.in);
            System.out.print("enter your age:");
            age = BC.nextInt();
        }while (age<0);

        switch (age){
            case 18:
                System.out.println("heelo");
                break;
            case 45:
                System.out.println("ifjfijg");
                break;
            case 58:
                System.out.println("giijvm");
            break;
            default:
                System.out.println("hk");
        }


//        if (age > 56) {
//
//            System.out.println("Mor Experiences");
//        } else if (age>34){
//            System.out.println("experiences");
//        } else if (age>=18) {
//            System.out.println("less experience");
//
//        } else {
//            System.out.println("not eligible");
//        }
    }
}
