package day04;
//do..while结构的演示
//Guessing游戏的改造
import java.util.Scanner;
public class DoWhileDemo {
    public static void main(String[] args) {
        /*
        2.do...while结构：
            1）语法:
                do{
                    语法快;
                }while(boolean);
            2）执行过程：
                先执行语句块，再去判断Boolean的值，若为true则
                再执行语句块，再判断Boolean的值，若为true则
                再执行语句块，再判断Boolean的值，直到false则，while循环结构结束
        */
        Scanner scan=new Scanner(System.in);
        int num =(int)(Math.random()*1000+1);//系统随机生成
        System.out.println("作弊数字为："+num);
        int guess;
        System.out.println("开始猜吧！");
        do{
            guess=scan.nextInt();//1+3
            if(guess>num){
                System.out.println("猜大了，重新猜吧！");
            }else if(guess<num){
                System.out.println("猜小了，重新猜吧！");
            }else{
                System.out.println("恭喜你猜对了！");
            }
        }while(guess!=num);//2
            /*
            执行过程：
                定义一个num随机数进行猜测
                进行输出随机数进行作弊
                定义一个guess变量先不做初始化
                输出开头提示开始猜吧
                进入do先执行guess赋值
                然后进行比对大小---带数（1000，900，925）
                1000>925猜大来，重新猜    1000！=925 true
                继续执行，重新从键盘输入一个数字900
                900<925猜小了，重新猜     900！=925  true
                继续执行，重新从键盘输入一个数字925
                925==925，恭喜你猜对了     925==925  false
                退出do....whlie循环  结束



            */
    }
}
