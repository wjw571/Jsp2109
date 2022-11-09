package day05;
//数组的演示
public class ArrayDemo {
    public static void main(String[] args) {

       /*
        数组：
            相同数据类型元素的集合
            是一种数据类型（引用类型）
            定义：
                在一个数据类型后面加个[]则就是数组
                    列子：
                    数据类型   变量名
                    int[]     a;
            int[] a;//声明整型数组变量a
            double[] a;//声明浮点型数组变量a
            boolean[] a;//声明布尔型数组变量a
            int 和int[]是两种完全不同的数据类型
            int[] a=new int[num];//num表示a可以装多少数据
            int[] a=new int[5];//声明整型数组a，包含5个元素，每个元素都是int类型，默认值为0
            double[] b=new double[10];//声明浮点型数组b，包含10个元素，每个元素都是double型，默认值为0.0
            boolean[] d=new boolean[26];//声明布尔型数组d，包含26个元素，每个元素都是boolean型，默认值为false
            书[] 书柜=new 书[20];
            衣服[] 衣柜=new 衣服[30];


           初始化：
            int[] arr=new int[3];//0,0,0
            int[] arr={2,5,8}//2,5,8
            int[] arr=new int[]{2,5,8};//2,5,8

            int[] arr;
            arr={2,5,8}//编译错误

            int[] arr;
            arr=new int[]{2,5,8};//可以


            访问：访问的数组中的元素
                通过数组名.length可以获取数组的长度（元素个数）
                int[] arr=new int[10];
                System.out.println(arr.length)

                通过下表/索引来访问数组中的元素
                下标从0开始，最大到（数组的长度-1）
                int[] arr=new int[3];//0,0,0
                //给第一个元素赋值为100
                //给第二个元素赋值为200
                //给第三个元素赋值为300

                arr[0]=200;//标号
                arr[1]=200;//标号
                arr[2]=200;//标号
                System.out.println(arr[arr.length-1]);//输出最后一个元素

                int a=0;
                int b=0;
                int c=0;
                //给第二个数赋值100
            遍历/迭代：从头到尾挨个走一遍
                for(int i=0;i<arr.length;i++){//遍历所有元素
                //arr[i]------代表每个元素
                arr[i]=100;
                    System.out.println(arr[i]);
                }
         */
        int[] arr=new int[3];
        arr[0]=100;//arr的第一个元素为100
        arr[1]=200;//
        arr[2]=300;//
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);
        int[] arr1=new int[10];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=(int)(Math.random()*100);//0-99的随机数
            System.out.println(arr1[i]);
        }

    }
}
