public class E2a {
    public static void main(String[] args) {

        /*
        Does NOT compile, we need to casting the real number to do it. In addition, we need to cast the number into a char
        int num = 'A' + 1.4;
        System.out.println(num);
        */
        int num = 'A' + (int)1.4; // OR int num = (int)('A' + 1.4);
        System.out.println((char)num);

    }
}
