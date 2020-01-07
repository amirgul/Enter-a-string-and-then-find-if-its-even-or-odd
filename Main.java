import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter one line sentence");
        String sentence =keyboard.nextLine();
        int length = sentence.length();
        System.out.println("length is: " + length);
        char lastIndex = sentence.charAt(sentence.length()-1);
        String last = Character.toString(lastIndex);
        if((last.equals("?"))&&(length%2==0))
        {
            System.out.println("YES YES this is even");
        }
        else if(last.equals("?")&&(length%2 == 1))
        {
            System.out.println("OH NO THIS IS ODD");
        }
        else if(last.equals("!"))
        {
            System.out.println("WOW WOW exclamation mark");
        }
        else
            System.out.println("all good");

    }
}
