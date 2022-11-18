package ooday03text;

public class Person {
    String name;
    int age;
    String address;
    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void sayHi(){
        System.out.println("大家好，我叫"+name+"今年我"+age+"岁了,"+"我住在"+address);
    }
}
