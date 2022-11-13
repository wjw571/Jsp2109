package oo.day02;
//方法的重载
import oo.day01.Student;

public class Aoo {
    String name;
    int age;
    String address;
    Aoo(int age1,String address1){

        age=age1;
        address=address1;
    }
    void say(){
        System.out.println(name+age+address);
    }




    void show(){}
    void show(String name){System.out.println(name);}
    void show (int age){System.out.println(age);}
    void show (String name,int age){System.out.println(name+age);}
    void show (int age,String name){System.out.println(age+name);}
    //int show (){return 1;}//重载与返回值类型无关
    //void show(String address){}//重载与参数名称无关
}
