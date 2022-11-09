package day05;
//九九乘法表
//多行多列选择嵌套
//第一个决定了行
//第二个决定了列
public class MultiTable {
    public static void main(String[] args) {
        System.out.println("九九算术乘法表如下：");
        for (int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }

      /*  for(int a=1;a<=10;a++){//10
            for(int b=1;b<=20;b++){//200
                for (int c=1;c<=30;c++){//600000
                    System.out.print(a+"*"+b+"*"+c+"="+a*b*c+"\t"+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
*/        //break跳出一层循环
    }

        /*
         执行过程：
            i=1
            j=1  1*4=1
            j=2
            换行
            i=2
            j=1  1*2=2
            j=2  2*2=4
            j=3
            换行
            i=3
            j=1  3*1=3
            j=2  3*2=6
            j=3  3*3=9
            j=4
            换行
            i=4
            ......
        */
    /*
    外面走一次里面要走完
    时针走一次，里面要走一圈
    */

}
