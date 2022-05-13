class testclass
{
 int rollno;
 String name,location;
}
class maintest
{
 public static void main(String args[])
 { 
  testclass t=new testclass();
  t.rollno=25;
  t.name="kuttyma";
  t.location="bangalore";
  System.out.println(t.rollno);
  System.out.println(t.name);
  System.out.println(t.location);
  System.out.println();
 }
}