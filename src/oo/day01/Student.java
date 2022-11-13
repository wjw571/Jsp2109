package oo.day01;
//学生的类
public class Student {//class关键字
    //成员变量
    String name;
    int age;
    String address;
    //方法
    void study(){

        System.out.println(name+"在学习....");
    }
    void sayHi(){

        System.out.println("大家好，我叫"+name+",今年"+age+"家住在："+address);
    }

}
