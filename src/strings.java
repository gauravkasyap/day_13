public class strings {
    String[] name = {"Sachin","Harsh","Patel","Putin"};
    void show(){
        System.out.println("My favourite names:");
        for (int i=0;i<5;i++){
            System.out.println(name[i]);
        }
    }

    public static void main(String[] args) {
        strings s = new strings();
        s.show();
    }
}
