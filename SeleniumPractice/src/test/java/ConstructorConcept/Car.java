package ConstructorConcept;

public class Car {
        String Name;
        int Price;
        String Engine;
        String modelNumber;
     //It is a special method that is used to initialize objects.The constructor is called when an object of a class is created.
    // It can be used to set initial values for object attributes.
    // In Java, a constructor is a block of codes similar to the method.
// constructor is a method which has same name as class name
        public Car(String Name,int Price, String Engine,String modelNumber){
            this.Name=Name;
            this.Price=Price;
            this.Engine=Engine;
            this.modelNumber=modelNumber;
    }

    public static void main(String[] args) {
        Car obj1=new Car("BMW",20,"automatic","A21");
        Car obj2=new Car("honda",38,"automatic","B32");
        Car obj3=new Car("audi",10,"semi automatic","C43");

        System.out.println(obj1.Name+" "+obj1.Price+" "+obj1.Engine+" "+obj1.modelNumber);
        System.out.println(obj2.Name+" "+obj2.Price+" "+obj2.Engine+" "+obj2.modelNumber);
        System.out.println(obj3.Name+" "+obj3.Price+" "+obj3.Engine+" "+obj3.modelNumber);
    }
}
