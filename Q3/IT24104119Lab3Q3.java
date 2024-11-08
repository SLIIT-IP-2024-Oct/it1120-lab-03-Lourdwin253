import java.util.Scanner;
public class IT24104119Lab3Q3{

public static void main (String[] args) {
System.out.print("Enter the total amount: ");
Scanner input = new Scanner(System.in);
int amount = input.nextInt();

System.out.println("5000 - " + (int)amount/5000);
amount = amount%5000;
System.out.println("1000 - " + (int)amount/1000);
amount = amount%1000;
System.out.println("500 - " + (int)amount/500);
amount = amount%500;
System.out.println("200 - " + (int)amount/200);
amount = amount%200;
System.out.println("100 - " + (int)amount/100);
amount = amount%100;
System.out.println("50 - " + (int)amount/50);
amount = amount%50;
System.out.println("20 - " + (int)amount/20);
amount = amount%20;
System.out.println("10 - " + (int)amount/10);
amount = amount%10;
System.out.println("5 - " + (int)amount/5);
amount = amount%5;
System.out.println("2 - " + (int)amount/2);
amount = amount%2;
System.out.println("1 - " + (int)amount/1);
amount = amount%1;


}

}