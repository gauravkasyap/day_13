class moj {
    public static void main(String[] args) {
        // Coefficients of the quadratic equation
        int a = 1;
        int b = 4;
        int c = 4;

        // Calculate the discriminant
       int discriminant = b * b - 4 * a * c;

        float x, y;

        if (discriminant == 0) {

            x = (float)(-b) / (2 * a);
            System.out.println("The root is " + x);
        } else if (discriminant > 0) {
            x = (float)(-b + Math.sqrt(discriminant)) / (2 * a);
            y = (float)(-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The values of the roots are x: " + x + " and y: " + y);
        } else {

            System.out.println("The equation has no real roots");
        }
    }
}
