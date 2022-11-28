import java.util.*;
class Even_Odd{
public static void main (String []args){
Scanner obj = new Scanner (System.in);
int num;
System.out.println("Enter any number");
num=obj.nextInt();
if(num%2==0){
System.out.println("Number is Even");
}
else{
System.out.println("Number is Odd");
}
}
}
