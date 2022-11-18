package ooday03text;

public class Teacher extends Person{
    double salary;
    Teacher(String name,int age,String address,double salary){
        super(name, age, address);
        this.salary=salary;
    }
    void sayHi(){
        System.out.println("大家好，我叫"+name+"今年我"+age+"岁了,"+"工资为："+salary+"我住在"+address);
    }
}
