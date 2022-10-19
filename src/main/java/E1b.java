public class E1b {
    public static void main(String[] args) {

        for(int i=0,j=10;i<10;i++,j-=2){
            System.out.println(i + " " + j);
        }

        int i=0;
        int j=10;
        do{
            System.out.println(i + " " + j);
            i++;
            j-=2;
        }while (i<10);
    }
}
