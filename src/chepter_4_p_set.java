import java.util.Scanner;

public class chepter_4_p_set {
    public static void main(String[] args) {
        //problem_1
        int a=10;
        if (a == 11){
            System.out.println("i am 11");
        }else {
            System.out.println("i am not 11");
        }

        //problem_2

        float Math;
        float physics ;
        float Chemistry;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Marks of Math:");
            Math = sc.nextFloat();

            Scanner bc = new Scanner(System.in);
            System.out.print("Marks of Physics:");
            physics = bc.nextFloat();

            Scanner dc = new Scanner(System.in);
            System.out.print("Marks of Chemistry:");
            Chemistry = dc.nextFloat();
        }while (Math<0&& physics<0&&Chemistry<0);


        if (Math>33&& physics>33&& Chemistry>33){

            float Total_markes = (Math+physics+Chemistry)/3;
            System.out.println("your Total markes:"+Total_markes+"%");
            if (Total_markes>40){
                System.out.println("you pass(-_-)");
            }else {
                System.out.println("you are failed!");
            }
        }else {
            System.out.println("you are not promoted!");
        }

        //problem_3


    }
}
