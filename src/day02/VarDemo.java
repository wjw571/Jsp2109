package day02;
//变量的演示
public class VarDemo {
    public static void main(String[] args) {
        //变量在使用之前必须声明并且初始化
        //变量命名
        /*
        1：只能包含字母、数字、_和$且只能字母和_开头
        2：严格区分大小写
        3：不能使用关键字命名
        4：不建议中文命名
        5：变量一般使用小驼峰命名法，首字母小写，后面的首字母大写
        6：命名一般使用大驼峰命名法，首字母都要大写
         */

        int a;
        int b,c,d;
        a=250;
        a=450;//修改a的值为450
        int e=250;//声明整型变量e并赋值为250
        int h=a+10;//a为450
        a=a+10;//450+10=460在a本身基础上增加10
        System.out.println(a);
        System.out.println("a");//输出a
        System.out.println(h);
    }
}
