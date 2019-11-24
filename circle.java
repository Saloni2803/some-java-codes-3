public class circle extends rectangle
{
circle(int a,int b)
{
super(a,b);
System.out.println(3.14*a*a);
}
public static void main(String[] args)
{
circle s1=new circle(5,9);
}
}
class rectangle extends shape
{
int c,d;
rectangle(int a,int b)
{
super(a);
c=a;
d=b;
System.out.print(c*d);
}
class shape
{
int y;
shape(int z)
{
y=z;
}
}
