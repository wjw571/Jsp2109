package oo.day03;
//学生的类
public class Student {//class关键字
    //成员变量
    String name;
    int age;
    String address;

    //构造方法
    Student(String name, int age, String address){
        this.name=name;//zs.name="zhangsan"
        this.age=age;//zs.age=18
        this.address=address;//zs.address="福州"
    }

    //方法
    void study(){
        System.out.println(name+"在学习....");
    }
    void sayHi(){
        System.out.println("大家好，我叫"+this.name/**这里的this是被省略了，但是仍然存在*/+",今年"+age+"家住在："+address);
    }

}
