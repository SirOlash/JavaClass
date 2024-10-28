import java.util.Scanner;
public class Largest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter first Integer:");
int first = input.nextInt();
System.out.print("Enter second Integer:");
int second = input.nextInt();
System.out.print("Enter third Integer:");
int third = input.nextInt();
int sum = first+second+third;
int average= sum/3;
int product= first*second*third;


int large;
int small;
if(first>second && first> third){

large=first;}
else if ( second> third){
large=second;}else{
large=third;}
if(first<second && first<third){

small=first;}
else if ( second< third){
small=second;}else{
small=third;}
System.out.printf("the sum is %d%n the average is %d%n the product is %d%n the largest is %d%n the smallest is %d ", sum,average,product,large,small);
 


}
}