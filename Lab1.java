import java.lang.*;
public class Lab1{
public static void main(String arg[]){

//System.out.println("Hi!!");
//System.out.printf("I'm Humna Mustafa\n");
//System.out.print("BS Software Engineering Student");
//System.out.print("FA25-BSE-051");
 
// Comparison Program       

int number = 5;
if (number>0) 
  System.out.println("The number is positive");
else if (number<0) 
  System.out.println("The number is negative");
 else 
  System.out.println("The number is zero");
        
// Traingle Pattern

for(int i=1;i<10;i++){
for (int j=1; j<=i;j++){
System.out.print("*");}
System.out.println("");}
}
}