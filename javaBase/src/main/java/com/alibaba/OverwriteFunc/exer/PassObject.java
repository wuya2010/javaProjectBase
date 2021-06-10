package com.alibaba.OverwriteFunc.exer;

/*
 * （2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
		public void printAreas(Circle c, int time)
在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。例如，times为5，
则输出半径1，2，3，4，5，以及对应的圆面积。
在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示。

 */
public class PassObject {

	/**
	 * 输出圆的半径和圆的面积
	 */
	public void printAreas(Circle c, int time){
		System.out.println("Radius\t\tArea");
		int i = 1;
		for (; i <= time; i++) {
			//设置半径
			c.setRadius(i);
			//输出圆的半径和圆的面积
			System.out.println(c.getRadius() + "\t\t" + c.findArea());
		}
		
		//设置半径
		c.setRadius(i);
		System.out.println("now radius is " + c.getRadius());
	}
}
