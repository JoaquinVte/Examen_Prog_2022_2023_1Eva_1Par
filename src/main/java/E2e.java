public class E2e {
    public static void main(String[] args) {

        /*
        Does NOT compile, we need to cast both the String and the double into an int.
        double num = 1.5f + 1.5d;
        int num2 = "3" + num;
        System.out.println(num2);
         */
        double num = 1.5f + 1.5d;
        int num2 = Integer.parseInt("3") + (int)num;
        System.out.println(num2);
    }
}
