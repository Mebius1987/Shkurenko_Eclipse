package Shkurenko;

import java.util.Scanner;

public class Shkurenko_4_1 {

	public static void main(String[] args) {
		/*
		// 1.​ Ввести число, и определить – чётное оно, или нет.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		int first = sc.nextInt();
		if ((first % 2)==0) {
			System.out.println("Вы ввели число " + first	+ " и оно четное");
			
		} else	System.out.println("Вы ввели число " + first	+ " и оно нечетное");
		*/
		/*
		// 2.​ Ввести три числа и найти наименьшее среди них.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число");
		int first = sc.nextInt();
		System.out.println("Введите второе число");
		int two = sc.nextInt();
		System.out.println("Введите третье число");
		int three = sc.nextInt();
		if (first < two && first < three) {
			System.out.println("Вы ввели числа " + first + ", " + two + ", " + three + " Наименьшее из них " + first);
		} else if (two < first && two < three) {
			System.out.println("Вы ввели числа " + first + ", " + two + ", " + three + " Наименьшее из них " + two);
		} else if (three < first && three < two){
			System.out.println("Вы ввели числа " + first + ", " + two + ", " + three + " Наименьшее из них " + three);
		}
		*/
		/*
		// 3.​ Ввести число, и выяснить - положительное оно, отрицательное, или
		// равно нулю?
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		double chislo = sc.nextDouble();
		if (chislo > 0){
			System.out.println("Число " + chislo + " является положетельным");
		} else if ((chislo < 0)){
			System.out.println("Число " + chislo + " является отрицательным");
		}else 
		System.out.println("Число " + chislo + " равно нулю");
		*/
		/*
		// 4.​ Реализовать калькулятор. Вводятся 2 любых вещественных числа в
		// переменные a и b. Необходимо вывести на экран меню с пунктами:

		// 1) a + b

		// 2) a – b

		// 3) a * b

		// 4) a / b

		// 5) a % b
		// При выборе соответствующего пункта меню происходит вывод результата
		// вычисления (должна быть проверка деления на 0!)
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое вещественное число");
		double a = sc.nextDouble();
		System.out.println("Введите второе вещественное число");
		double b = sc.nextDouble();
		System.out.println("1)" + a + " + " + b);
		System.out.println("2)" + a + " - " + b);
		System.out.println("3)" + a + " * " + b);
		System.out.println("4)" + a + " / " + b);
		System.out.println("5)" + a + " % " + b);
		System.out.println("");
		System.out.println("Введите какое действие требуется выполнить");
		int c = sc.nextInt();
		if (c > 0 && c < 6) {
			if (c == 1) {
				System.out.println("1)" + a + " + " + b + "=" + (a + b));
			}else if (c == 2) {
				System.out.println("2)" + a + " - " + b + "=" + (a - b));
			}else if (c == 3) {
				System.out.println("3)" + a + " * " + b + "=" + (a * b));
			}else if (c == 4 && a != 0 && b != 0) {
				System.out.println("4)" + a + " / " + b + "=" + (a / b));
			}else if (c == 5) {
				System.out.println("5)" + a + " % " + b + "=" + (a * (b/100)));
			}
		}
		
		*/
		
		/*
		// 5.​ Ввести с клавиатуры символ. Определить, чем он является: цифрой,
		// буквой или знаком пунктуации.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите с клавиатуры символ");
		char c = sc.next().charAt(0);
		if ((int)c >= 65 && (int)c <=90 || (int)c>=97&&(int)c<=122){
			System.out.println("Вы ввели с клавиатуры букву");
		} else if ((int) c >= 48 && (int)c <=57 || (int) c == 45){
			System.out.println("Вы ввели с клавиатуры цифру");
		} else 
			System.out.println("Вы ввели с клавиатуры знак пунктуации");
		
		*/
		/*
		// 6.​ Ввести с клавиатуры число и проверить, принадлежит ли это число
		// диапазону от N до M (включительно).
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		double chislo = sc.nextDouble();
		System.out.println("Введите число которое является началом диапазона");
		double N = sc.nextDouble();
		System.out.println("Введите число которое является концом диапазона");
		double M = sc.nextDouble();
		if (chislo >= N && chislo <= M){
			System.out.println("Число входит в диапазон");
		} else 
			System.out.println("число не входит в диапазон");
		*/
		/*
		// 7.​ Написать программу для проверки кратности числа X числу Y (оба
		// числа вводятся с клавиатуры).
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число кратность которого будем проверять");
		double X = sc.nextDouble();
		System.out.println("Введите второе число ");
		double Y = sc.nextDouble();
		double c = X % Y;
		if (c == 0){
			System.out.println("Число " + X + " кратно числу " + Y);
		} else 
		System.out.println("Число " + X + " не кратно числу " + Y);
		*/
		/*
		// 8.​ Ввести число и определить кратно ли оно 3, 5, и 7 одновременно.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число для определения кратности 3, 5, 7");
		double chislo = sc.nextDouble();
		if ((chislo %3) == 0 && (chislo % 5) == 0 && (chislo % 7) == 0){
			System.out.println("Число " + chislo + " кратно 3, 5, 7 одновременно");
		} else 
			System.out.println("Число " + chislo + " не кратно 3, 5, 7 одновременно");
		*/
		/*
		// 9.​ Показать модуль введённого числа.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		int a = sc.nextInt();
		if (a > 0){
			System.out.println("Модуль числа " + a + " = " + a);
		} else if (a < 0){
			System.out.println("Модуль числа " + a + " = " + (-a));
			
		}
		*/
		/*
		// 10.​ Вводится целое число (не более 4 разрядов!). Определить
		// количество цифр в нём.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число не больше 4 разрядов");
		int a = sc.nextInt();
		if ((a %10) == a){
			System.out.println("Число содержит 1 цифру");
		} else if ((a %100) == a){
			System.out.println("Число содержит 2 цифры");
		} else if ((a %1000) == a){
			System.out.println("Число содержит 3 цифры");
		} else if ((a %10000) == a){
			System.out.println("Число содержит 4 цифры");
		} else
		System.out.println("Не соблюдены условия \"Вводится целое число (не более 4 разрядов!)\" ");
		*/
		/*
		// 11.​ Ввести с клавиатуры пятизначное число и определить, является ли
		// оно палиндромом (т.е. одинаково читается в обоих направлениях -
		// например, 12321 будет палиндромом, а 12345 – не палиндром).
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите пятизначное число для определения является ли оно палиндромом");
		int a = sc.nextInt();
		if ((a / 10000) == (a % 10) && (a / 1000 % 10) == ( a / 10 % 10)){
			System.out.println("Число " + a + " является палиндромом");
		} else
			System.out.println("Число " + a + " не является палиндромом");
		*/
		// 12.​ Пользователь задаёт координаты верхнего левого, и нижнего
		// правого угла прямоугольника, а также координаты точки (X,Y) в
		// декартовой системе координат. Принадлежит ли точка этому
		// прямоугольнику?
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координату X для верхнего левого  угла прямоугольника");
		double xkor1 = sc.nextDouble();
		System.out.println("Введите координату Y для верхнего левого  угла прямоугольника");
		double ykor1 = sc.nextDouble();
		System.out.println("Введите координаты x для нижнего правого угла прямоугольника");
		double xkor2 = sc.nextDouble();
		System.out.println("Введите координаты y для нижнего правого угла прямоугольника");
		double ykor2 = sc.nextDouble();
		System.out.println("Введите координаты точки x");
		double x = sc.nextDouble();
		System.out.println("Введите координаты точки y");
		double y = sc.nextDouble();
		if (x <= xkor1 && x >= xkor2 && y <= ykor1 && y >= ykor2 ){
			System.out.println("Точка принадлежит прямоугольнику");
		} else
			System.out.println("Точка не принадлежит прямоугольнику");
		// 13.​ Найти максимальное значение среди 4 переменных, используя
		// тернарный оператор.

	}

}
