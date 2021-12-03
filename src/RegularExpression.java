import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern P=Pattern.compile("[anurag is s student]+");
        System.out.println("enter the target string");
        Matcher M=P.matcher(sc.nextLine());
        int c=0;
        while (M.find()){
            c++;
            System.out.println(M.group()+"here the string index" +M.start()+"--"+M.end());
        }
        System.out.println("count the number of present in  the given string"+"  "+c);
    }
}
