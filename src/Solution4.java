import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element from the user
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        double median = 0;
        int length = arr.length;
        if(length%2 ==0){
            // If the length of the array is even, take the average of the middle two elements
            median = (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
        } else if(length%2 !=0){
            // If the length of the array is odd, take the middle element
            median = arr[length / 2];

        }
        else{
            System.out.println("-1");
        }
        System.out.println(median);


    }
}
