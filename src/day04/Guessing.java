package day04;
//猜数字小游戏
//循环三要素1.2.3.
import java.util.Scanner;
public class Guessing {
    public static void main(String[] args) {
        int num =(int)(Math.random()*1000+1);//系统随机生成
        System.out.println("作弊数字为："+num);
        //int num=250;
        /*
        随机数
        Math.random()------0.0到0.9999999999999.....不包括1
        *1000--------------0.0到999.99999999999.....
        +1-----------------1.0到1000.9999999999......
        (int)强转-----------1到1000

         Math.random()------0.0到0.9999999999999.....不包括1
        *1000--------------0.0到999.99999999999.....
        (int)强转-----------1到1000
        +1-----------------1.0到1000.9999999999......

        */


        System.out.println("开始猜数字吧！");
        Scanner scan=new Scanner(System.in);
        //在外面是三路，几路情况看有几种可能，外面是等于小于大于
        int guess=scan.nextInt();//1.
        while(guess!=num){//2.
        //在里面是两路，因为他在进入while的时候已经判断一次是否等于，所以只剩下两种：小于、大于
            if (guess>num) {
                System.out.println("太大了！");//300太大了
            }else{
                System.out.println("太小了！");//200太小了
            }
            System.out.println("重新猜吧！");
            guess=scan.nextInt();//3.
        }
        System.out.println("恭喜你猜对了");
    }
}
            /*
            执行过程:
                先初始化藏起来的数
                初始化循环变量guess
                进行判断guess和num
                    （带数）
                        1)300！=250   true
                          300>250太大了
                          重新猜吧！
                          guess重新从键盘输入200
                        2)200！=250   true
                          200<250太小了
                          重新猜吧！
                            guess重新从键盘输入250
                        3)250=250 false
                          恭喜你猜对了！

            */
