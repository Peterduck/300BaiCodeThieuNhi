import java.util.Scanner;
public class lesson4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number element in array");
        int num = sc.nextInt();
        int[] price = new int[num] ;
        for(int i = 0; i<num; i++ ){
            System.out.println("Enter value of element"+ (i+1));
            int value = sc.nextInt();
            price[i] = value;
        }
        for(int j = 0 ; j<num;j++){
            System.out.println(price[j]);
        }
    }
}