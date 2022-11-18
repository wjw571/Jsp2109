package ooday05;

public class StaticDemo {
    public static void main(String[] args) {
    Loo o1=new Loo();
    o1.show();
    Loo o2=new Loo();
    o2.show();
    Loo o3=new Loo();
    o3.show();
    //Loo.b;,常常通过类名点访问
    System.out.println(Loo.b);
    Moo.test();//常常通过类名点来访问
    Poo p=new Poo();
    //new了一个对象，然后马上执行static块，后在执行构造方法
    Poo p1=new Poo();
    Poo p2=new Poo();
    //而且static只会走一次，构造方法new几个对象，就会走几次
    }


}
class Poo{//演示静态块
    static{
        System.out.println("静态块");
    }
    Poo(){
        System.out.println("构造方法");
    }
}



class Noo{//演示静态方法
    int a;
    //show()需要访问对象的数据，意味着与对象有关，所以不能做成静态的
    void show(){
        System.out.println(a);
    }
    //plus()不需要访问对象的数据，意味着与对象无关，所以能做成静态的
    void plus(int num1,int num2){
        int num=num1+num2;
        System.out.println(num);
    }
}




class Moo{//演示静态方法
    int a;//实例变量（对象点）
    static int b;//静态变量（类名点）

    void show(){//普通方法是有一个隐式this
        System.out.println(this.a);//this指代当前对象
        System.out.println(Moo.b);//静态默认前面有一个Moo.b
    }
    static void test(){//方法一旦加this，就没有隐式this
        //静态方法没有隐式this传递
        //没有this就意味着没有对象（this表示当前对象）
        //而实例变量a必须通过对象点访问的
        //所以如下代码编译错误，哪怕自己加this也是报错，他不认识
        //而静态变量不依赖对象，他是靠类名点
        //System.out.println(a);
        System.out.println(b);
    }
}


class Loo{//演示静态变量
    int a;
    static int b;
    Loo(){ a++;b++;}
    void show(){
        System.out.println("a="+a+"b="+b);
    }
}
