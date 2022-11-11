package day06;
//方法的演示
public class MethodDemo {
    public static void main(String[] args) {
        //say();//无返回值无参数调用
        //sayHi("wjw");//String name=“wjw”
        //sayHi("zhangsan");//再次调用，可多次调用
        sayHello("wjw",25);//String name="zhangsan",int age=25----调用的是实参
        sayHello("lisi",56);//String name="lisi",int age=56
        double a=getNum();//getNum()的值就是return后的8.88
        System.out.println(a);//模拟对返回值的后续操作
        int b=plus(100,200);//这是传直接量
        //这样子不会写死掉
        int m=100,n=200;
        int c=plus(m,n);
        //单个传参数
        int d=max(100);
        int[] e=textArray();
        System.out.println(e.length);
        for (int i=0;i<e.length;i++){
            System.out.print(e[i]+"\t");
        }
        System.out.println();
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("继续......");
        a();
        System.out.println(444);
    }
    //多参无返回值
    public static void sayHello(String name,int age){//----形参（定义的）
        if(age>50){//再某种特定条件下结束方法
            return;//结束方法
        }
        System.out.println("大家好，我叫"+name+",今年"+age+"岁了");
    }
    //有参无返回值
    public static void sayHi(String name ){

        System.out.println("大家好，我叫"+name+",今年"+"22"+"岁了");
    }
    //无参无返回值
    public static void say(){

        System.out.println("大家好，我叫wjw，今年22岁了");
    }
    //无参有返回值
    public static double getNum(){
        //若方法有返回值，必须要有一个return来返回一个对应类型的数据；
        return 8.88;//必须匹配,写死了
        //作用1）结束方法的执行   2）返回结果给调用方
    }
    //多参有返回值
    public static int plus(int num1,int num2){
        int num=num1+num2;
        return num;//返回的是num的数
        //返回的是 num1+num2
    }
    //有参返回值
    public static int max(int max){
        return max;
    }
    //数组无参返回值
    public static int[] textArray(){
    int[] arr={2,5,6,8};
    return arr;//其实返回的是arr里面的数值
    }
    //方法的嵌套，在方法中调用方法
    public static void a(){
        System.out.println(111);
        b();
        System.out.println(222);
    }
    public static void b(){
        System.out.println(333);
    }

}
