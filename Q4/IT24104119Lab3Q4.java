import java.util.Scanner;
public class IT24104119Lab3Q4{

public static void main (String[] args) {
System.out.print("Enter a five didgit number: ");
Scanner input = new Scanner(System.in);

String number = input.next();

char firstChar = number.charAt(0);
char secondChar = number.charAt(1);
char thirdChar = number.charAt(2);
char fourthChar = number.charAt(3);
char fifthChar = number.charAt(4);

System.out.println(firstChar + " " + secondChar + " " + thirdChar + " " + fourthChar + " " + fifthChar);

}

}