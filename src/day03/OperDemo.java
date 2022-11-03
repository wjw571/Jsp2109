package day03;

public class OperDemo {
    public static void main(String[] args) {
        /*
            1.算术运算符：+，-，*，/，%，++，--；
                1）：*注意溢出
                2）：/去除余数
                3）；++/--：自增/自减1，可在变量前也可再变量后
                    3.1）：单独使用时，在前在后都一样
                    3.2）：被使用时，在前在后不一样
                        a++的值为a(a--)
                        ++a的值为a+1(--a)

             2.关系运算符：
                1）>(大于)，<(小于)
                >=(大于或等于)，<=(小于或等于)
                ！=(不等于),==(等于)
                2）关系运算的结果为Boolean型
                关系成立则为true，不成立则为false

             3.逻辑运算符：
                ---短路：某一个位置发生短路，后面的不走了
             1）&&：逻辑(短路)与（同时满足才能为真）
                ---当第一个数为false，则直接为false
                ||：逻辑（短路）或（或者，满足一个则为真）
                ---当第一个数为true，则直接为true
                ！：逻辑非（非真则假，非假则为真）
             2）逻辑运算是建立在关系运算的基础之上的
                逻辑运算结果也是boolean
             4.赋值运算符：
             1）简单赋值运算符
             2）扩展赋值运算符：+=、-=、*=、/=、%=

             5.字符串连接运算符：
             1）+：
                1.1）若两边是数字，则是相加
                1.2）若两边要是字符串，则作为字符串连接
                    char：字符型，必须放在''，1个
                    string:字符串型，必须放在”“中，0个到多个
            同化：只要跟字符串连在一起，都会变成字符串，后续在跟什么连接，把他当作字符串看带

             6.条件（三目）运算符：
             1）语法：
                Boolean？数1：数2
             2）执行过程：
             条件运算是有结果的，结果要么是？号后的数1，要么是：号后的数2
                若为true ，则是整个表达式的结果是？号后的数1
                若是false,则是整个表达式的结果是：号后的数2
         */
        int a=5,b=5,e=4,r=4,h=3,k=3,t=2,m=2;
        e++;
        ++r;
        h--;
        --k;
        System.out.println(e);//只做一件事情，单独使用---5
        System.out.println(r);//---5
        System.out.println(h);//只做一件事情，单独使用---2
        System.out.println(k);//---2
        int c=a++;//被使用干了两件事，1）将a++的值5赋值给c 2）a自增变为6
        int d=++b;//1)将++b的值6赋值给d 2）b自增1变为6
        int q=t--;//被使用干了两件事，1）将t--的值2赋值给了q 2）t自减变为1
        int y=--m;//被使用干了两件事，1）将--m的值1赋值给了y 2）m自减变为1
        System.out.println(a);//---6
        System.out.println(b);//---6

        System.out.println(c);//---5
        System.out.println(d);//---6

        System.out.println(t);//---1
        System.out.println(m);//---1

        System.out.println(q);//---2
        System.out.println(y);//---1

        int u=5,i=10,o=5;
        boolean u1=u>i;
        System.out.println(u1);//false
        System.out.println(u==o);//true
        System.out.println(u>=o);//ture
        System.out.println(u<=o);//ture
        System.out.println(u!=o);//false
        System.out.println(u+o>i);//先算术后关系比较---false
        System.out.println(u%2==0);//false
        System.out.println(o++>5);//false---o++的值为5,同时o自增1为6
        System.out.println(o++>5);//true，因为这时候o为6，同时自增1为7
        System.out.println(++i>10);//true,因为他是先自增1为11

        int a1=5,a2=10,a3=5;
        boolean b2=a2>=a1&&a2<a3;//先做关系在做逻辑最后赋值
        System.out.println(b2);//true&&false=false
        System.out.println(a2<=a3&&a2>a1);//false&&true=false
        System.out.println(a1==a2&&a3>a2);//false&&false=false
        System.out.println(a2!=a3&&a1<a2);//true&&ture=ture

        int c1=5,c2=10,c3=5;
        System.out.println(c2>c1||c2<c3);//true||false=true
        System.out.println(c2<=c3||c2>c1);//false||true=true
        System.out.println(c2!=c3||c1<c2);//true||true=true
        System.out.println(c1==c2||c3>c2);//false||false=false

        //boolean b3=!c1<c2;//!的优先级最高，现在在！a
        boolean b3=!(c1<c2);//!true=false
        System.out.println(b3);
        boolean b4=!(c1>c2);//!false=true
        System.out.println(b4);

        //短路
        int e1=5,e2=10,e3=5;
        boolean e4=e1>e2&&e3++>2;
        System.out.println(e4);//false&&true=false
        System.out.println(e3);//由于短路，前面已经停止运行，则不存在e3++----5
        Boolean e5=e1<e2||e1++>2;
        System.out.println(e5);//true||false=true
        System.out.println(e1);//由于短路，前面已经停止运行，则不存在e1++----5
        //如果是单个&和单个|，则没有短路


        int d1=5;
        d1+=5;//相当于d1=d1+5
        System.out.println(d1);//10
        d1*=2;//相当于d1=d1*2
        System.out.println(d1);//20
        d1/=5;//相当于d1=d1/5
        System.out.println(d1);//4
        d1%=3;//相当于d1=d1%3
        System.out.println(d1);//1
        //面试题：哪一句错了
          /*      short s=5;
                s+=10;//这个没错是因为，扩展运算自带强转 s=（short）（s+10）
                s=s+10;//short在运算时自动变成int，int再给short，则要强制
    */
        int age=22;
        System.out.println("age=");//age=
        System.out.println(age);//22
        System.out.println("age="+age);//不同类型的，要用加号连接---age=22
        System.out.println("我的年龄是"+age);
        System.out.println("我的年龄是"+age+"了");
        String name="WJW";
        System.out.println("name:"+name);//name:WJW
        System.out.println("大家好，我叫"+name);//大家好，我叫WJW
        System.out.println("大家好，我叫"+name+"，今年我"+age+"岁了");//大家好，我叫WJW，今年我22岁了

        System.out.println(10+20+""+30);//30---字符串+30，最后变成3030
        System.out.println(""+10+20+30);//10---字符串+20+30，最后变成102030字符串
        System.out.println(10+20+30+"");//60---字符串，最后是变成了60这个字符串


        int num=5;
        int flag=num>0?1:-1;//true---?号后的数1
        System.out.println(flag);//1
        int num1=-2;
        int flag1=num1>0?1:-1;//false---:号后的数2
        System.out.println(flag1);//-1

        //小案例，比大小
        int num2=8,num3=5;
        int max=num2>num3?num2:num3;//不考虑相等，是因为如果相等，谁给赋值都可以
        System.out.println("最大值为"+max);

    }

}
