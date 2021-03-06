package OverWrite;
/*
方法的重写(OverRide / OverWrite)
1、重写：子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作。

2、应用：重写以后，当创建子类对象以后，通过子类对象调用子父类中同名的方法时

3、重写的规定：方法的真相，权限修饰符 返回值类型 方法名（形参列表）thows 异常类型{
    //方法体（和原来不一样）
    }
4、约定俗称：子类中的叫  重写方法；父类中的叫 被重写方法；

5、说明：
① 子类父类 方法名和形参列表相同（重写的）
② 子类重写的方法的 权限修饰符 不小于父类被重写的父类权限修饰符
    > 特殊情况：子类不能重写父类中 private 权限的的方法
③ 返回值类型：
    > 如果父类中的方法返回值类型时  void  .子类也只能是void
    > 如果父类方法的返回值类型是A类  则子类重写的返回值类型可以是A类 也可以是A类的子类
    > 如果父类方法的返回值类型是基本数据类型，则子类 重写的方法必须是 相同返回值类型

④ 子类重写的方法抛出的异常类型，不大于父类被重写的方法的异常类型

⑤ 子类和父类中的同名同参数的方法，要么都声明为非satatic(考虑重写)，要么都声明为static的(静态的，不能被重写)
    面试题：区分方法的重载和重写
 */

public class OverWrite1 {

}
