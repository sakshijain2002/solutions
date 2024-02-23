import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your integer :");
        int n = sc.nextInt();
        while(n!=0){
            n =n/10;
            count++;
        }
        System.out.println("The number of digits in integer are :" +count);
    }
}
