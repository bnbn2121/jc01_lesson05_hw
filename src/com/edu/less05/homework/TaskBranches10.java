package com.edu.less05.homework;

/*
 * Составить программу, которая определит площадь какого круга меньше.
 */
public class TaskBranches10 {

	public static void main(String[] args) {
		double radius1;
		double radius2;
		double pi = Math.PI;
		double minArea;

		radius1 = 3.6;
		radius2 = 4;

		if (radius1 == radius2) {
			minArea = 2 * pi * radius1 * radius1;
			System.out.printf("Площади кругов одинаковы и составляют: %.1f", minArea);
		} else if (radius1 < radius2) {
			minArea = 2 * pi * radius1 * radius1;
			System.out.printf("Площадь первого круга меньше и равна: %.1f", minArea);
		} else {
			minArea = 2 * pi * radius2 * radius2;
			System.out.printf("Площадь второго круга меньше и равна: %.1f", minArea);
		}
	}

}
