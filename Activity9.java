//Activity 9 factorial/fibonacci
package activity.pkg9;
import java.util.Scanner;
public class Activity9 {
    static long factorial(int a){
        if(a == 1){
            return 1;
        }
        else{
            return a * factorial(a - 1);
        }
    }
    static long fibonacci(int a){
        if(a <= 1){
            return a;
        }
        else{
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }
    static void userInput(){
        Scanner sc = new Scanner(System.in);
        String choice;
        do{
        System.out.println("What do you wanna get? factorial/fibonacci?");
        choice = sc.next();
        if("factorial".equals(choice)){
            factorialUI();
            break;
        }
        if("fibonacci".equals(choice)){
            fibonacciUI();
            break;
        }
        }while(!("fibonacci".equals(choice)) || !("factorial".equals(choice)));
    }
    static void factorialUI(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int b = 0; b < a; b++){
            System.out.println("Enter elements:");
            System.out.print("Index ["+b+"]: ");
            int c = sc.nextInt();
            arr[b] = c;
        }
        
        for(int b = 0; b < a; b++){
            System.out.print("f("+arr[b]+")\t");
        }
        System.out.print("\n");
        
        for(int b = 0; b < a; b++){
            System.out.print(factorial(arr[b]) + "\t");
        }
        System.out.print("\n");
    }
    static void fibonacciUI(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int a = sc.nextInt();
        int arr[] = new int [a];
        for(int b = 0; b < a; b++){
            System.out.println("Enter elements:");
            System.out.print("Index ["+b+"]: ");
            int c = sc.nextInt();
            arr[b] = c;
        }
        
        for(int b = 0; b < a; b++){
            System.out.print("f("+arr[b]+")\t");
        }
        System.out.print("\n");
        
        for(int b = 0; b < a; b++){
            System.out.print(fibonacci(arr[b]) + "\t");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
       userInput();
    }
    
}
