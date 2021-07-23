class ArithmaticOperations{

int add(int a,int b){
int addResult=a+b;
return addResult;
}
int sub(int x,int y){
int subResult=x-y;
return subResult;
}
int mul(int m,int n){
int mulResult=m*n;
return mulResult;
}
int div(int r,int s){
int divResult=r/s;
return divResult;
}
int mod(int e,int f){
int modResult=e%f;
return modResult;
}
public static void main(String[] args){

ArithmaticOperations op=new ArithmaticOperations();

int addition= op.add(20,10);
System.out.println("Addition result:"+addition);

int substraction= op.sub(20,10);
System.out.println("substraction result:"+substraction);

int multiplication= op.mul(20,10);
System.out.println("multiplication result:"+multiplication);

int division= op.div(20,10);
System.out.println("division result:"+division);

int modulous= op.mod(20,11);
System.out.println("modulous result:"+modulous);
}
}
