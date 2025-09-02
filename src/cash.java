import java.util.Scanner;

public class cash {

    public static void main(String[] args) {
        int ruppes;

        do {
            Scanner sc =  new Scanner(System.in);
            System.out.print("How much change:");
            ruppes = sc.nextInt();
        }while (ruppes<0);
//**********this is from lower created function se******************//
        int twothaousend = calculate_twothousand(ruppes);
        ruppes -=(twothaousend*2000);

        int fivehundred =calculate_fivehundrade(ruppes);
        ruppes -=(fivehundred*500);

        int twohundred= calculate_twohundred(ruppes);
         ruppes -=(twohundred*200);

        int hundred= calculate_hundred(ruppes);
        ruppes-=(hundred*100);

        int fifty = calculate_fifty(ruppes);
        ruppes -=(fifty*50);

        int ruppes1 = calculate_twenty(ruppes);
        ruppes = ruppes - (ruppes1 *20);

        int ruppes2 = calculate_ten(ruppes);
        ruppes = ruppes -(ruppes2 *10);

        int ruppes3 = calculate_five(ruppes);
        ruppes = ruppes - (ruppes3 *5);

        int ruppes4 = calculate_two(ruppes);
        ruppes = ruppes -(ruppes4 *2);

        int ruppes5 = calculate_one(ruppes);
        ruppes = ruppes- (ruppes5);

        System.out.println("change of two thousand:"+twothaousend);
        System.out.println("change of Five hundred:"+fivehundred);
        System.out.println("change of Two hundred:"+twohundred);
        System.out.println("change of Fifty:"+fifty);
        System.out.println("change of Twenty:"+ruppes1);
        System.out.println("change of Ten:"+ruppes2);
        System.out.println("change of Five:"+ruppes3);
        System.out.println("change of Two:"+ruppes4);
        System.out.println("change of One:"+ruppes5);
        int Total_ruppes= ruppes1+ruppes2+ruppes3+ruppes4+ruppes5+twothaousend+twohundred+fifty+fivehundred+hundred;
        System.out.println("Total changes: "+ Total_ruppes);

    }

    public static int calculate_twothousand(int ruppes){
        int twothousand =0;
        while (ruppes>=2000){
            twothousand++;
            ruppes -=2000;
        }
        return twothousand;
    }

    public static int calculate_fivehundrade(int ruppes){
        int fivehundrade =0;
        while (ruppes >=500){
            fivehundrade++;
            ruppes -=500;
        }
        return fivehundrade;
    }

    public static int calculate_twohundred(int ruppes){
        int twohundred =0;
        while (ruppes >=200){
            twohundred++;
            ruppes -=200;
        }
        return twohundred;
    }

    public static int calculate_hundred(int ruppes){
        int hundred = 0;
        while (ruppes>=100){
            hundred++;
            ruppes-=100;
        }
        return hundred;
    }

//    *************for fifty rupees changes*********//
    public static int calculate_fifty(int ruppes){
        int fifty = 0;
        while (ruppes>=50){
            fifty++;
            ruppes -=50;
        }
        return fifty;
    }

    public static int calculate_twenty(int ruppes){
        int twenty = 0;
        while (ruppes >=20){
            twenty++;

            ruppes= ruppes-20;
        }
         return twenty;
    }
    public static int calculate_ten(int ruppes){
        int ten =0;
        while ( ruppes >=10){
            ten++;
            ruppes = ruppes-10;
        }
        return ten;
    }

    public static int calculate_five(int ruppes){
         int five = 0;
         while(ruppes >=5){
               five++;
               ruppes = ruppes-5;
         }
         return five;
    }
    public static int calculate_two(int ruppes){
        int two = 0;
        while (ruppes >=2){
            two++;
            ruppes =ruppes -2;
        }
        return two;
    }
    public static int calculate_one(int ruppes){
        int one =0;
        while (ruppes >=1){
           one++;
            ruppes =ruppes-1;
        }
        return one;
    }
}

