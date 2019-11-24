import java.util.*;
class Binary
{
public static void main(String[] args)
{
int x,b=0;
Scanner s=new Scanner(System.in);
x=s.nextInt();
while(x!=0)
{
int a=0;
a=x%2;
System.out.print(a);
x=x/2;
}
}
}
