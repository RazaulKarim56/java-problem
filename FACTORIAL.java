import java.util.Scanner;
public class FACTORIAL {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n,fact=1;
    System.out.print("Enter any numer :");
    n=input.nextInt();
    for(int i=1;i<=n;i++){
    fact=fact*i;
    }
    System.out.println("Factorial=" +fact);
    input.close();
}    
}
