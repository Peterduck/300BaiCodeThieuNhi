import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args){
        String[] s = {"(",")","{","}","[","]"};
        String x = s[0]+s[1];
        String y = s[2]+s[3];
        String z = s[4]+s[5];
        System.out.println("Enter s");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals(x) || input.equals(y) || input.equals(z)){
            System.out.println("Validate!");
        }
        else {
            System.out.println("Error!");
        }
    }
}
