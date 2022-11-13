package oo.day01;
//练习教室类
public class Teacher {
    String name;
    int age;
    String subject;
        Teacher(String name,int age,String subject){
            this.name=name;
            this.age=age;
            this.subject=subject;
        }
    void say(){
        System.out.println("我叫"+name+"，今年我"+age+"岁了"+"我教的科目是"+subject);
    }
}
