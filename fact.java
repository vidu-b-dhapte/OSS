class fact
{
 int factorial(int number)
{
int f=1;
for(int i=1;i<=number;i++)
{
f=f*i;
}
return f;
}
 public static void main(String args[])
 {
   fact f1=new fact();
   int result=f1.factorial(5);
    System.out.println("fact="+result);
   }
}
#hye this is me
