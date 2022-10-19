import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;

        System.out.print("Enter a phrase: ");
        text = sc.nextLine();

        if (palindrome(text))
            System.out.println("The phrase is a palindrome.");
        else
            System.out.println("The phrase is not a palindrome. ");

    }

    /**
     * @param text Text to check if it's a palindrome
     * @return True if the text is a palindrome. False if not.
     */
    public static boolean palindrome(String text) {

        int lower;
        int upper;
        boolean palindrome;
        String textWithoutWhiteSpaces = "";

        // Remove all whitespaces
        // text = text.replaceAll(" ",""); You can't use replaceAll method
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) != ' ') textWithoutWhiteSpaces += text.charAt(i);

        // Check if the letter is the same as the opposite.
        // We stop when we find one that isn't or when the lower index is higher than the upper one
        palindrome = true;
        lower=0;
        upper=textWithoutWhiteSpaces.length()-1;
        while (lower < upper && palindrome) {

            if (textWithoutWhiteSpaces.charAt(lower) != textWithoutWhiteSpaces.charAt(upper))
                palindrome = false;

            lower++;
            upper--;
        }

        return palindrome;
    }

}
