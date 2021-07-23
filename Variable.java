class Variable{
int a=10;
static int c=30;
public static void main(String... args){
int b=20;
System.out.println(c);
System.out.println(b);
Variable obj=new Variable();
System.out.println(obj.a);
}
}