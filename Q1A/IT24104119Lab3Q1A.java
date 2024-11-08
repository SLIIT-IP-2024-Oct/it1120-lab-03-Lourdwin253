import java.util.Scanner;
public class IT24104119Lab3Q1A {

public static void main (String[] args) {
System.out.print("Enter the price of 1kg of rice: ");
Scanner input = new Scanner(System.in);
float price = input.nextFloat();

System.out.print("Enter the number of kilograms you want to buy:");
input = new Scanner(System.in);
float weight = input.nextfloat();

System.out.println("The total amount is: " + price*weight); 
}

}