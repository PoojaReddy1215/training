class Student {
          int id;
          String name;
          String percentage;
          

void behaviour(){
System.out.println(id+" "+name+" "+percentage+" "+"She is a good content writter...!");
}
void behaviour1(){
System.out.println(id+" "+name+" "+percentage+" "+"She is a good dancer...!");
}
void behaviour2(){
System.out.println(id+" "+name+" "+percentage+" "+"She is a good singer...!");
}
void behaviour3(){
System.out.println(id+" "+name+" "+percentage+" "+"He is a athletic...!");
}
void behaviour4(){
System.out.println(id+" "+name+" "+percentage+" "+"He is good at pencil sketch drawing...!");
}

public static void main(String... args){
      Student pooja = new Student();
      pooja.id=101;
      pooja.name="Pooja";
      pooja.percentage="70%";
      pooja.behaviour();
Student spoorthi = new Student();
      spoorthi.id=102;
      spoorthi.name="Spoorthi";
      spoorthi.percentage="95%";
      spoorthi.behaviour1();
Student tejashwini = new Student();
      tejashwini.id=103;
      tejashwini.name="Tejashwini";
      tejashwini.percentage="82%";
      tejashwini.behaviour2();
Student sidhu = new Student();
      sidhu.id=104;
      sidhu.name="Sidhu";
      sidhu.percentage="75%";
      sidhu.behaviour3();
Student adhi = new Student();
      adhi.id=105;
      adhi.name="Adhi";
      adhi.percentage="80%";
      adhi.behaviour4();
}
}
