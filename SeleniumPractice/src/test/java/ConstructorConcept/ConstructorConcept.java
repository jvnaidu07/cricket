package ConstructorConcept;

import javax.naming.Name;

public class ConstructorConcept {
    //Class variables or instance variables or global variables
    String Name;
    int age;
    int hight;
    public ConstructorConcept(){ //0 parameter constructor
        System.out.println("Default constructor");

    }
    public ConstructorConcept(int i){ //1 parameter constructor
        System.out.println("1 parameter constructor");
        System.out.println(i);
    }
    public ConstructorConcept(int i, int j) { //2 parameter constructor
        System.out.println("2 parameter constructor");
        System.out.println(i+" "+j);

    }
    //here name, age are local variables
    public ConstructorConcept(String name,int age,int hight){
        this.Name=name; //this.class variables=local variables
        this.age=age;
        this.hight=hight;
    }

//  Overloaded constructor.
    public static void main(String[] args) {
        ConstructorConcept obj=new ConstructorConcept("venkat",30,6);
        ConstructorConcept obj1=new ConstructorConcept(30);
        ConstructorConcept obj2=new ConstructorConcept(10,20);

        System.out.println(obj.Name+ " " +obj.age+ " " + obj.hight);


    }

}
