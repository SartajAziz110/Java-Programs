import java.util.*;
class Single_Operator{
public static void main(String []args){
int x=10;
System.out.println(x);
System.out.println(x++);
System.out.println(x);
System.out.println(++x);
System.out.println(x--);
System.out.println(--x);
System.out.println(x);
int a=10,b=12,R;
R=a+b;
System.out.println("The Addition is"+R);
R=a-b;
System.out.println("The Subtraction is "+R);
R=a*b;
System.out.println("The Multiplication is "+R);
R=a/b;
System.out.println("The Divion is"+R);
R=a%b;
System.out.println("The Reminder is "+R);
Scanner obj = new Scanner (System.in);
int n1,n2,n3;
System.out.println("Enter Any Three Numbers! ");
n1=obj.nextInt();
n2=obj.nextInt();
n3=obj.nextInt();
if(n1>n2 && n1>n3){
 System.out.println("The Largest Number is"+n1);
}
else if(n2>n1 && n2>n3){
 System.out.println("The Largest Number is"+n2);
}
else {
 System.out.println("The Largest Number is"+n3);
}
}
}
