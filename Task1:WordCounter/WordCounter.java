import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a paragraph to count a words.\n");
        int count=1;
        String Words = sc.nextLine();
        for(int i=0;i<Words.length()-1;i++){
            if(Words.charAt(i) == ' ' && Words.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.println("Number of total words in this paragraph is : "+count);
    }
}