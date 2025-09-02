public class incriment_dicrement {
   /* public static void main(String[] args) {
        int numOne = 10;
        int numTwo = 5;
        boolean isTrue = true;
        System.out.println(numOne++ + " " + ++numOne); //Output will be 10 12
        System.out.println(numTwo-- + " " + --numTwo); //Output will be 5 3
        System.out.println(!isTrue + " " + ~numOne); //Output will be false -13
    }*/


    public static void main(String[] args) {
        int a = 12 * 3 - 9 / 2;
        int b = 14 * 4 + 175 / 8;
        if (a++ % 2 == 0) {
            if (b-- % 4 == 0) {
                System.out.println("a = " + a + " b = " + b);
            } else {
                System.out.println("a = " + a + " b = " + b);
            }
        } else {
            System.out.println("a = " + a + " b = " + --b);
        }
    }




}
