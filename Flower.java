class Flower{
          String name;
          String color;
          int noOfPetals;

void blooming(){
System.out.println(color+" "+name+" is blooming...!");
}

void shedFragrance(){
System.out.println(color+" "+name+
       " is shedding fragrance...!");
}
public static void main(String... args){
      Flower jasmine = new Flower();
        jasmine.name = "Jasmine";
        jasmine.color = "White";
        jasmine.noOfPetals = 7;
        jasmine.blooming();
        jasmine.shedFragrance();
}
}

