package day05;
//for()循环结构演示----与次数相关的
public class ForDemo {
    public static void main(String[] args) {
        int a=1;
        System.out.println("9的乘法表:");
        for(;a<10;a++){
            System.out.println(a+"*9="+a*9);
        }
        int b=1;
        System.out.println("9的乘法表:");
        for(;b<10;){
            b++;
            System.out.println(b+"*9="+b*9);
        }



        for(int times=0;times<5;times++){
            System.out.println("行动是成功的阶梯");
        }
        System.out.println("继续执行......");
        /*
        执行过程：
            times=0   true  输出  times++
            times=1   true  输出  times++
            times=2   true  输出  times++
            times=3   true  输出  times++
            times=4   true  输出  times++
            times=5   false  退出for循环，继续执行
        */

        /*
        执行过程：
            num=1    true   输出    num++
            num=2    true   输出    num++
            num=3    true   输出    num++
            num=4    true   输出    num++
            num=5    true   输出    num++
            num=6    true   输出    num++
            num=7    true   输出    num++
            num=8    true   输出    num++
            num=9    true   输出    num++
            num=10   false   退出循环
        * */
        System.out.println("倒过来的9的乘法表：");
        for(int num=9;num>=1;num--){
            System.out.println(num+"*9="+num*9);
        }
        System.out.println("输出13579的9乘法表：");
        for (int num=1;num<10;num+=2){
            System.out.println(num+"*9="+num*9);
        }

        //break:跳出循环，循环结束，配着if使用，在某种特定条件下结束循环

        System.out.println("倒过来的且只要前六个9的乘法表：");
        for(int num=9;num>=1;num--){
            if(num==3){
                break;
            }
            System.out.println(num+"*9="+num*9);
        }

        //continue:跳过循环体中剩余语句进入下一个循环
        System.out.println("倒过来的且跳过3的9的乘法表：");
        for(int num=9;num>=1;num--){
            if(num%3==0){
                continue;//跳过循环体中剩余语句进入下一个循环
            }
            System.out.println(num+"*9="+num*9);
        }
        /*
        num=1  1*9=9
        num=2  2*9=9
        num=3 if true  使其跳过3的循环，进入下一个
        num=4  4*9=36
        num=5  5*9=45
        num=6 if true  使其跳过3的循环，进入下一个
        num=7  7*9=63
        num=8  8*9=72
        num=9 if true  使其跳过3的循环，进入下一个
        */



    }
        /*
        变量的重名作用域：作用域重叠时，变量不能同名
        */
    //如何选三种循环结构
    /*
    先看循环是否与次数相关：
        若相关，直接选择for
        若无关，看要素一和要素三是否相同
            若相同则，do while
            若不相同，while

    * */







}
