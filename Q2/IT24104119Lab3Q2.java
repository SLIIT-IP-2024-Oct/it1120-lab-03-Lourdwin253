import java.util.Scanner;
public class IT24104119Lab3Q2{

public static void main (String[] args) {
System.out.print("Enter the monthly salary: ");
Scanner input = new Scanner(System.in);
float salary = input.nextFloat();

System.out.print("Enter the number of OT hours: ");
input = new Scanner(System.in);
float OtHours = input.nextFloat();

System.out.print("Enter the OT hourly rate: ");
input = new Scanner(System.in);
float OtHourlyRate = input.nextFloat();

double finalSalary = salary+(OtHours * OtHourlyRate);

System.out.println("The total salary including OT is: " + finalSalary); 
}

}