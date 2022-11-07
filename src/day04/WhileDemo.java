package day04;
//while结构的演示
public class WhileDemo {
    public static void main(String[] args) {
        int times=0;//1）循环变量的初始化
        while(times<5){//2)循环的条件
            System.out.println("行动是成功的阶梯");//----语句块得看情况放在  3）的之前还是之后
            //放在3）之前绝对没错
            times++;//3）循环变量的改变
        }
        System.out.println("继续执行.....");//while结束还是会执行之后语句
        /*
            执行过程（带数）：
                            times=0
                true    输出 times=1
                true    输出 times=2
                true    输出 times=3
                true    输出 times=4
                true    输出 times=5
                false while循环结束
                输出继续执行.....
        */
        int num=1;
        System.out.println("9的乘法表:");
        while(num<=9){
            System.out.println(num+"*9="+num*9);
            num++;
        }
        System.out.println("结束");
        /*
            执行过程：
                1）int num=1  循环变量初始化
                2）num<=9     循环变量的判断条件
                3）                 num=1
                    true   1*9=9    num=2
                    ture   2*9=18   num=3
                    ture   3*9=27   num=4
                    ture   4*9=36   num=5
                    ture   5*9=45   num=6
                    ture   6*9=54   num=7
                    ture   7*9=63   num=8
                    ture   8*9=72   num=9
                    ture   9*9=81   num=10
                    false  while循环结束
、
        */






        /*
            1.while结构：
                1）语法：
                    while（boolean）{
                        语句块;
                    }
                2)执行过程：
                    先判断boolean的值，若为true则执行语句块；
                    再判断boolean的值，若为ture则执行语句块；
                    再判断boolean的值，若为ture则执行语句块；
                       ..........
                    如此循环到false结束
         */
        //先考虑三要素


        System.out.println(Math.random());
    }
}
