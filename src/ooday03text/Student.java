package ooday03text;

public class Student extends Person{
    String stuId;
    Student(String name,int age,String address,String stuId){
        super(name, age, address);
        this.stuId=stuId;
    }
    void sayHi() {
        System.out.println("大家好，我叫"+name+"今年我"+age+"岁了,"+"我的学号是："+stuId+"我住在"+address);
    }
}
