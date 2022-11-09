package day05;
//出题算题测试
//随机加法运算器
import java.awt.*;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int num1 = (int) (Math.random() * 100 + 1);
            int num2 = (int) (Math.random() * 100 + 1);
            int add = num1 + num2;
            System.out.println("这里是随机加法运算器");
            System.out.println("欢迎进行测试，题目一共10题");
            System.out.println("(" + i + ")" + num1 + "+" + num2 + "=" + "?");
            System.out.println("开始算吧！");
            int usernum = scan.nextInt();

            if (usernum == -1) {
                System.out.println("提前结束啦！");
                break;
            } else if (usernum != add) {
                System.out.println("算错啦！");
            } else {
                System.out.println("算对啦");
                sum += 10;
            }
        }
        System.out.println("总分为"+sum);
    }
}
