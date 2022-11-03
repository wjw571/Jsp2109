package day03;
//if(结构的演示)
public class IfDemo {
    public static void main(String[] args) {
        /*
        if结构：走一条路
        例子：满500打八折
        if结构
            1）语法：
            if(boolean){
                执行语句-----不一定执行
            }
            2）执行过程：
            执行顺序看boolean
                若boolean为true，则语句执行{}里面的语句，然后整个结束
                若boolean为false，则语句执行{}之外的语句

         */
        //带数（6，5，4）
    int num=4;
    if(num%2==0){
        System.out.println("num是偶数");
    }
    System.out.println("继续执行...");
    //带数（600，500，400）
    double prices=400;
    if(prices>=500){
        prices*=0.8;
    }
        System.out.println("最终金额为："+prices);
    System.out.println("结算");

        System.out.println();
    }
}
