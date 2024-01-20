import java.util.Scanner;

public class WordCounter{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a paragraph.\n");
        int count=1;
        String paragraph = sc.nextLine();
        for(int i=0; i<paragraph.length()-1;i++){
            if(paragraph.charAt(i) == ' ' && paragraph.charAt(i+1) != ' '){
                count++;  
            }
        }
        System.out.println("Number of total word count : "+count);
    }
}