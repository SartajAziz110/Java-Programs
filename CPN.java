import java.util.*;
class CPN{
public static void main(String []args){
Scanner obj = new Scanner (System.in);
int matric,inter,test;
float cpn;
System.out.println("Enter Your Matric Marks.");
matric = obj.nextInt();
System.out.println("Enter Your Inter Marks.");
inter = obj.nextInt();
System.out.println("Enter Your Test Marks.");
test = obj.nextInt();
matric = matric * 10/1000;
inter = inter * 30/1000;
test = test * 60/100;
cpn = matric + inter + test;
System.out.println("Total CPN is"+cpn);
}
}
