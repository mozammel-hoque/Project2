package exception;

public class Math {
    public static void main(String[] args) {
        int a = 6;
        System.out.println("Line 1");
        try {
            System.out.println("Line 2: "+a/0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("your code has isse");
        }
        System.out.println("Line 3");

    }
}
