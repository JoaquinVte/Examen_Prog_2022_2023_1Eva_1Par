import java.util.Scanner;

public class E6 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String text,wordToReplace,substituteWord;

        System.out.println("Enter a phrase: ");
        text = sc.nextLine();
        System.out.println("Enter a word: ");
        wordToReplace= sc.nextLine();
        System.out.println("Enter a Word:");
        substituteWord= sc.nextLine();

        System.out.println("Resultado:");
        System.out.println(replace(text,wordToReplace,substituteWord));

    }

    /**
     *
     * @param text Original text
     * @param word Word to be replaced
     * @param substituteWord Word to substitute
     * @return The text without word, and the substituteWord in its place
     */
    public static String replace (String text, String word,String substituteWord){

        String result = "";
        int i=0;

        // we need to check if the word is empty. In this case we have to return the text without any changes.
        if(word.length()==0)
            return text;

        // We go through the text, checking if the text contains the word
        while(i<text.length()){

            // If the text contains the word, we replace it,
            // and advance the index by the length of the word
            if(contains(text,word,i)) {
                result += substituteWord;
                i+=word.length();
            }else{
                // If the text doesn't contains the word, we only copy the character at position i,
                // and advance the index one step.
                result += text.charAt(i);
                i++;
            }
        };

        return result;
    }

    /**
     *
     * @param text Text to check
     * @param word Word to find
     * @param index Index to start to check
     * @return True if the word is at the index position. False if not.
     */
    private static boolean contains (String text,String word,int index){
        boolean contains = true;

        // Check if the word fits in the text
        if(index+word.length()>text.length())
            return false;

        // Check if all word's caracters match in the text
        int i=0;
        while(i<word.length() && contains){

            if(word.charAt(i)!=text.charAt(index))
                contains=false;

            i++;
            index++;
        }

        return contains;
    }
}