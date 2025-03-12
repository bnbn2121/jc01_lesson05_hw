package com.edu.less05.homework;

/*
 * С помощью оператора while напишите программу вывода 
 * всех четных чисел в диапазоне от 2 до 100 включительно.
 */
public class TaskCycles04 {

	public static void main(String[] args) {
		int number = 2;
		while (number <= 100) {
			System.out.print(number + " ");
			number += 2;
		}

	}

}
