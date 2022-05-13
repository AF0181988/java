class amstrongnumber
{
  public static void main(String args[])
  {
    int number=345,n,temp,sum=0; 
    n=number;
    while(n>0)
    {
      temp=n%10;
      sum=sum+(temp*temp*temp);
      n=n/10;
    }
  if(sum==n)
  System.out.println(number+" is an amstrong number");
  else
  System.out.println(number+" is not an amstrong number");
  }
}