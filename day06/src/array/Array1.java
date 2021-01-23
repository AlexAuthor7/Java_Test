package array;

/*
一、数组的概述
  1、数组的理解：


  2、数组的相关概念：
   > 数组名
   > 元素
   > 下标
   > 数组的长度

  3、特点
   > 有序排列的
   > 数组中的空间是连续的
   > 数组本身属于引用数据类型
   > 数组的元素既可以是基本数据类型，也可以是引用数据类型
   > 数组的长度一旦确定，就不能修改

  4、数组的分类
   > 按照维数：一维数组、二维数组。。。。
   > 按照元素类型：基本数据类型，引用数据类型

  5、一维数组的使用
   > 一维数组的声明
   > 如何调用数组指定位置的有元素
   > 如何获取数组的长度
   > 如何遍历数组
   > 数组初始化的值（整形：0 \ 浮点：0.0 \ char型：0或\u0000 ，ps:不是0" \boolean型：false）
                 (引用数据类型：null )
   > 数组的内存解析



 */

public class Array1 {
    public static void main(String[] args) {
        //一维数组的声明和初始化
        int num;//声明
        num = 10;//初始化
        int id = 1001;//声明+初始化
        int[] ids;//声明
        //*静态初始化,数组的初始化和元素的赋值操作 *同时进行*
        ids = new int[]{1001,1002,1002,1004};

        //*动态初始化，数组的初始化和元素的赋值操作 *分开进行*
        String[] names = new String[4];
        //总结：一旦初始化完成，长度就确定了

        names[0] = "熊大";//长度和元素个数相等
        names[1] = "熊二";
        names[2] = "张三";//调用
        names[3] = "李四";
        //*************************************************

        //获取数组长度
        //属性:length
        System.out.println(names.length);//打印数组长度

        //*************************************************
        //遍历数组长度
        for(int i = 0; i < names.length;i++){
            System.out.println(names[i]);

        }


    }
}