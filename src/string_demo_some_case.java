public class string_demo_some_case {
    public static void main(String[] args) {

        String name ="Gaurav";
        System.out.println(name);
        int Value = name.length();
        System.out.println(Value);

       String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nontrimstring = "     Gaurav        ";
        System.out.println(nontrimstring);

        String trinstring = nontrimstring.trim();
        System.out.println(trinstring);

        System.out.println(name.substring(3));

        System.out.println(name.substring(2,3));

        System.out.println(name.replace('G','s'));

        System.out.println(name.replace("Gau","A"));

        System.out.println(name.startsWith("Gau"));
        System.out.println(name.endsWith("v"));

        System.out.println(name.charAt(2));
    }
}
