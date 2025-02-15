import java.util.Scanner;
public class StudentBioData {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter student name :");
    String studentname=input.nextLine();
    System.out.print("Enter student id:");
    int studentid=input.nextInt();
    System.out.print("Enter student age :");
    int  studentage=input.nextInt();
    System.out.print("Enter student fee :");
    float studentfee=input.nextFloat();
    System.out.print("Enter student grade :");
    char studentgrade=input.next().charAt(0);
    
    System.out.println("Student detail:");
    System.out.println("student name="+studentname );
    System.out.println("student id="+studentid );
    System.out.println("student age="+studentage );
    System.out.println("student fee="+studentfee );
    System.out.println("student grade="+studentgrade );





}    
    
}
