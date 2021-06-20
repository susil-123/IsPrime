import java.util.Scanner;

class IsPrime{
public static void main(String[] args)
{Scanner sc = new Scanner(System.in);
System.out.println("Please insert any number");
int num=sc.nextInt();
boolean Isprime =true;
for(int i=2;i<num;i++)
{
if(num%i==0)
{Isprime=false;
break;}
}
if(Isprime)
{System.out.println(num+" is a prime number");}
else
{System.out.println(num+" is not a prime number");}
}

}
