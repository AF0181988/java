class parent
{
void disp()
{
System.out.println("parent class execute..");
}
}
class child extends parent
{
void disp1()
{
System.out.println("child class execute..");
}
}
class Grandchild extends child
{
void disp2()
{
System.out.println("Grandchild class execute..");
}
}
class Testmultilevel
{
public static void main(String args[])
{
Grandchild g=new Grandchild();
g.disp();
g.disp1();
g.disp2();
}
}
