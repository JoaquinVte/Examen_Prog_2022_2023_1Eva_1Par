public class E2b {
    public static void main(String[] args) {

        /*
        Does NOT compile, we need to casting the String into a float number first. In addition, either we need to casting 333 into a String
        float num = "23.5" + 1;
        System.out.println(num + 333);
         */

        float num = Float.parseFloat("23.5") + 1;
        System.out.println(num + String.valueOf(333));
    }
}
