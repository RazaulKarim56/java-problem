import java.util.Scanner;
public class EVENODD {
public static void main(String[] args) {
    
Scanner input =new Scanner (System.in);
int n;
System.out.print("Enter any number:");
n=input.nextInt();
if(n%2==0){
    System.out.println("Even number");

}
else{
    System.out.println("Odd number");
}
input.close();

} 


} 
