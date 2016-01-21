package Shkurenko;

import java.util.Scanner;

public class Shkurebko_6 {

	public static void main(String[] args) {
		
		//1.	Вывести на экран горизонтальную линию из звёздочек. Число звёздочек указывает пользователь. 
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сколько звездочек");
		int a = sc.nextInt();
		for (int x = 0; x < a; x++) {
			System.out.print("*");
			} 
		//2.	Написать программу, выводящую на экран только четные целые числа из диапазона от 1 до 100.
		
		for (int x = 1; x <= 100; x++)
			if (x % 2 == 0){
			System.out.println(x);
			}
			
		//3.	Вычислить сумму чисел в диапазоне от M до N. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число M");
		int M = sc.nextInt();
		System.out.println("Введите число N");
		int N = sc.nextInt();
		while (M <= N){
			int a = M + N;
					System.out.println(a);
			M++;
		}
		
		//4.	Программа печатает таблицу соответствия температур по Цельсию и Фаренгейту  в указанном диапазоне.
		
		int C1 = -1;// начало диапазона
		int C2 = 110;// конец
		while (C1 < C2){
			int F = C1 + 32;
			System.out.println("Температура по Цельсию = " + C1 + ",  а температура по Фаренгейту = " + F);
			C1++;
			
		}
		
		//5.	Написать программу, вычисляющую факториал введённого числа.
		
		System.out.println("Введите число факториал которого требуется посчитать");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int y=1;
	    for (int i = 1; i <= number; i++){
	        y=y*i;
	    }
	    System.out.print(number + " != " + y);

			
		
		//6.	С клавиатуры вводится целое число любой разрядности. Определить количество цифр в нём и их сумму. 
		
		System.out.println("Введите число");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int start = 1;
		while (start < number){
			number /= 10;	
			start++;
		}
		System.out.println(start);
		
		//7.	С клавиатуры вводится целое число любой разрядности. Необходимо перевернуть это число, 
		// т.е.  цифры должны располагаться в обратном порядке (например, вводим число 1234 – в результате будет 4321).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите целое число");
		int number = sc.nextInt();
		int a= 0;
		while (number > 0){
		a = number % 10;
		number /=10;
		System.out.print(a);
		}
		//8.	С клавиатуры вводится целое число. Вывести на экран все числа, на которые введённое число делится без остатка. Например, для 60 такими числами станут 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60.
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int start = 1;
		while (start <= number){
			//System.out.println(number + "%" +  start + "=" + number % start);
			start++;
			if (number % start == 0){
				System.out.println(start);
		}
		}
		//9.	С клавиатуры вводится целое число. Определить, является ли оно простым. Простое число делится без остатка 
		//только на 1 и само на себя.
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int start = 2;
		boolean isSimple = true; //сколько раз получился 0
		while(start < number){
			
			if (number % start == 0){
				isSimple = false;
				break;

			}
			start++;
		}
			System.out.println(isSimple);
		
		//10.	Проверить, есть ли во введённом числе одинаковые цифры подряд.
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number > 10){
		if (number % 10 == number /10 %10){
			System.out.println("повторяются");
			break;
		} 
			number /=10;
		}
		if (number <=10){
			System.out.println("не повторяются");
		}
		//11.	Ввести с клавиатуры число. Проверить, что все цифры этого числа расположены в неубывающем порядке
		//      (например, число 11299 соответствует заданию, а число 22044 нет).
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number > 0){
		if (number % 10 <= number /10 % 10 ){
		System.out.println("Расположены в убывающем порядке");
		return;
		}
		number /= 10;
		}
		System.out.println("Всё ок");
		//12.	Написать игру «Угадай число». Пользователь мысленно загадывает число от 0 до 1000, компьютер отгадывает его за минимальное количество попыток.
		
		int min = 1;
		int max = 1000;
		System.out.println("Загадайте число от " + min + " до " + max);
		int L = min;
		int R = max;
		int M ;
		Scanner sc = new Scanner(System.in);
		int choice;//выбор 1, 2, 3
		int n = 0;
		while (L <= R){
			M = (L + R) / 2;
			n++;
			System.out.println("может быть это " + M + " ?");
			System.out.println("нажми 1 - если число угадано \n 2 - если ваше число меньше " + M + "\n 3 - если ваше число больше " + M);
			choice = sc.nextInt();
			if(choice < 1 || choice >3){
				System.out.println("ошибка");
				break;
			}
			switch(choice){
			case 1 :
				System.out.println("Число угадано за " + n + " попыток!");
				return;
			case 2 :
				R = M - 1;
				break;
			case 3 :
				L = M + 1;
				break;
				
			}
		}
		System.out.println("Вы ошиблись");
		
		//13.	Показать номера и общее количество всех счастливых трамвайных билетов с шестизначными номерами.
		int start = 111111;
		int over = 999999;
		while (start <= over){
			if(((start%10) + (start /10 %10) + (start / 100 %10)) == ((start /1000 % 10) + (start / 10000 % 10) + (start / 100000))){
				System.out.println(start);
			}
			start++;
		}
		
		//14.	Показать на экран все восьмизначные числа, цифры в которых не повторяются. Эти числа должны делиться на 12345 без остатка. Показать общее количество найденных чисел.
		int start = 0;
		int del = 12345;
		int min = 10000000;
		int max = 99999999;
		while (min % del !=0)min++;
		int a, b, c ,d ,e ,f ,g, h;
		while (min <= max){
			h = min % 10;
			g = min /10 % 10;
			f = min / 100 % 10;
			e = min / 1000 % 10;
			d = min / 10000 % 10;
			c = min / 100000 % 10;
			b = min / 1000000 % 10;
			a = min / 10000000 % 10;
			if (!(a == b || a == c || a == d || a == e || a == f || a == g || a == h || b == c || b == d || b == e || b == f || b == g || b == h || c == d || c == e || c == f || c == g || c == h || d == e || d == f || d == g || d == h || e == f || e == g || e == h || f == g || f == h || g == h)){
				System.out.println(min);
				
			}
			
			start++;
			min +=del;
		}
		System.out.println("Naideno chisel = " + start);
		
		*/
		//15.	Написать программу, позволяющую переводить любое число из десятичной системы счисления в 2, 8 и 16-ричную систему.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число");
		int nomer = sc.nextInt();
		System.out.println("Выберите систему счисления \nдля 2 нажмите 1\nдля 8 нажмите 2\nдля 16 нажмите 3");
		int sist = sc.nextInt();
		if (sist == 1){
		int dvoic = 0;
		String temp = "";
		while(nomer != 0){
			dvoic = nomer % 2;
			temp = dvoic + temp;
			nomer /= 2;
		}System.out.print(temp);
		} else if (sist == 2){
			int vosm = 0;
			String temp = "";
			while(nomer != 0){
				vosm = nomer % 8;
				temp = vosm + temp;
				nomer /= 8;
			}System.out.print(temp);
		} else if (sist == 3){
			int shest = 0;
			String temp = "";
			String temp2 = "";
			while(nomer != 0){
				shest = nomer % 16;
				switch (shest){
				case 11: 
					temp2 = "A";
					temp = temp2 + temp;
				break;
				case 12: 
					temp2 = "B";
					temp = temp2 + temp;
				break;
				case 13: 
					temp2 = "C";
					temp = temp2 + temp;
				break;
				case 14: 
					temp2 = "D";
					temp = temp2 + temp;
				break;
				case 15: 
					temp2 = "E";
					temp = temp2 + temp;
				break;
				case 16: 
					temp2 = "F";
					temp = temp2 + temp;
				break;
				}
				temp = shest + temp;
				nomer /= 16;
			}System.out.print(temp);
			
			}
		//16.	Реализовать игровую программу «Однорукий бандит» (игровой автомат). В начале игры пользователю выдаётся 5000 кредитов. Случайным образом на барабанчиках выпадает три значения от 0 до 7. Призовые комбинации: 0 0 0, 1 1 1, 2 2 2, 3 3 3, 4 4 4, 5 Х Х, 5 5 Х, 5 5 5, 7 Х Х, 7 7 Х, 7 7 7 (на месте Х может быть любая цифра). Штрафная комбинация: 6 6 6. Все остальные комбинации нейтральные. В любом случае, за показ новой комбинации с игрового счёта пользователя снимается определённая фиксированная сумма денег. Необходимо назначить различные вознаграждения за выпадение призовых комбинаций. Комбинации можно показывать через JOptionPane.showMessageDialog, например. Зациклить работу приложения. Игра заканчивается поражением, если деньги закончились. Игра заканчивается победой, если выпадает джек-пот (7 7 7).
		/*
		int bet = 20;
		int score = 500;
		String temp = sc.next();
		while(score >= bet){
		int a = (int)(Math.random()*7)+1;
		int b = (int)(Math.random()*7)+1;
		int c =	(int)(Math.random()*7)+1;
		
		System.out.println(a + " "  + b + " " + c);
		for (int i = 1;  i <= 7; i++)
		if (a == b && a == c && a == i){
			System.out.println("win");
			score+=10;
		}
		//17.	Королю нужно убить дракона, но средства его казны – ограничены.  Нужно создать программу, которая поможет рассчитать минимальное количество копейщиков, которое необходимо, чтобы убить дракона. Данные очков здоровья и атаки дракона и одного копейщика вводятся с клавиатуры. Защиту, удачу, мораль, меткость и т.п. не учитывать. Копейщики наносят удар первыми (общий нанесённый урон – это сумма атак всех живых копейщиков). Если атака дракона превышает значение очков здоровья копейщика (например, у копейщика хп 10, а атака дракона - 15),  то копейщик погибает, а оставшийся урон действует на оставшихся в живых копейщиков. Например, жизнь дракона 500, атака 55, жизнь одного копейщика 10, атака 10, а количество копейщиков - 20. Лог боя для данного примера должен выглядеть так:
		//•	Копейщики атакуют (урон 200) – у дракона осталось 300 очков здоровья.
		//•	Дракон атакует (урон 55) – осталось 15 копейщиков, один из которых ранен (осталось 5 очков здоровья).
		//•	Копейщики атакуют (урон 150) – у дракона осталось 150 очков здоровья.
		//•	Дракон атакует (урон 55) – осталось 9 копейщиков.
		//•	Копейщики атакуют (урон 90) – у дракона осталось 60 очков здоровья.
		//•	Дракон атакует (урон 55) – осталось 4 копейщика, один из которых ранен (осталось 5 жизней).
		//•	Копейщики атакуют (урон 40) – у дракона осталось 20 очков здоровья.
		//•	Дракон атакует  и побеждает.
			*/
	}
}



	


