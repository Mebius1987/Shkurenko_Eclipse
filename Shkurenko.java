package Shkurenko;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Shkurenko {

	public static void main(String[] args) {
		// 1. Марафонец прошел S километров со скоростью V метров в секунду
		// (расстояние и скорость вводятся с клавиатуры). Определить, сколько
		// времени он был в пути (часов, минут, секунд)?
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите растояние которое прошел марафонец в километрах");
		double S = sc.nextDouble();
		System.out.println("Введите скорость марафонца м/c");
		double V = sc.nextDouble();
		if (S > 0 && V > 0) {
			double T = S / V;
			double T1 = (int) T; // часов
			double T2 = (T * 100);
			T2 = (int) T2;
			T2 = T2 % 100; // минуты
			double T3 = T * 10000;
			T3 = (int) T3;
			T3 = T3 % 100; // секунды

			System.out.println("Марафонец был в пути " + T1 + " часов, " + T2 + " минут, " + T3 + " секунды.");

		}
		// 2. Пользователь вводит с клавиатуры два дробных числа. Вывести на
		// экран сумму целых частей и сумму дробных.
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите с клавиатуры первое дробное число");
		double first = sc.nextDouble();
		System.out.println("Введите с клавиатуры второе дробное число");
		double second = sc.nextDouble();
		int a = (int) first;
		int b = (int) second;
		System.out.println("Сумма челых частей дробных чисел = " + (a+b) );
		double c = first - a;
		double e = second - b;
		System.out.println("Сумма дробных частей числа = " + (c+e));
		
		// 3. Пользователь вводит с клавиатуры сумму в гривнах (дробное число).
		// Вывести по отдельности количество гривен и количество копеек
		// (например, ввести 45.67 гривен - получить и вывести 45 гривен 67
		// копеек)
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число гривен");
		double gr = sc.nextDouble();
		if ( gr > 0 ){
		double cel = (int )gr;// гривны
		double dr = gr * 100;
		dr = (int) dr;
		dr = dr % 100;
		System.out.println("гривен " + cel + " копеек " + dr );
		} else {
			System.out.println("денег не может быть отрицательное число");
		}
		
		// 4. Пользователь вводит с клавиатуры массу в тоннах (дробное число).
		// Вывести по отдельности количество тонн, килограмм, грамм (например,
		// ввести 126.456789т - получить и вывести 126т 456кг 789г)
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите массу в тоннах");
		double t = sc.nextDouble();
		if (t > 0){
		double tg = (int) t;
		double kgg = (t - tg);
		double g = kgg * 1000000;
		g = g %1000;
		double kg = kgg *1000;		
		System.out.println((int) tg + "т " + (int) kg + "кг " + (int)g + "г");
		} else {
			System.out.println("Масса не может быть отрицательной");
		}
		
		// 5. Пользователь вводит с клавиатуры время в секундах. Перевести это
		// значение в дни, часы, минуты и секунды. Например, 43512 секунд – это
		// 12 часов, 5 минут и 12 секунд.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите время в секундах");
		int sec = sc.nextInt();
		if (sec > 0){
			int dni = sec /24 / 60 /60;
			int dniv = dni * 24 * 60 * 60 - sec;
			int cas = -dniv /60 /60;
			int casv = ((cas * 60 * 60) + (dni* 24 * 60 * 60)) - sec;
			int min = -casv / 60; 
			int seco = ((dni* 24 * 60 * 60) +(cas * 60 * 60) + (min * 60)) - sec;
			System.out.println(sec + " секунд - это " + dni + " дней, " + cas + " часов, " + min + " минут и " + -seco + " секунд.");
		}
		
		// 6. Пользователь вводит с клавиатуры расстояние до аэропорта (в
		// километрах, может быть вещественное значение) и время, за которое
		// нужно доехать (в минутах). Вычислить скорость (км/ч), с которой нужно
		// ехать.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите расстояние до аэропорта");
		double S = sc.nextDouble();
		System.out.println("За сколько надо доехать");
		double T = sc.nextDouble();
		if (S > 0 && T > 0){
			double V = S/(T/60);
			System.out.println("Скорость с которой нужно будет ехать = " + V + "км/ч");
		}
		
		// 7. Пользователь вводит с клавиатуры время начала и время завершения
		// телефонного разговора (часы, минуты и секунды). Посчитать стоимость
		// разговора, если стоимость минуты составляет 15 копеек, с учётом
		// посекундной тарификации.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите время начала разговора часы");
		int hour = sc.nextInt();
		System.out.println("Введите время начала разговора минуты");
		int min = sc.nextInt();
		System.out.println("Введите время начала разговора секунды");
		int sec = sc.nextInt();
		System.out.println("Введите время завершения разговора часы");
		int hour1 = sc.nextInt();
		System.out.println("Введите время завершения разговора минуты");
		int min1 = sc.nextInt();
		System.out.println("Введите время завершения разговора секунды");
		int sec1 = sc.nextInt();
		System.out.println("Разговор начался в " + hour + ":" + min + ":" + sec + ", разговор завершился в " + hour1 + ":" + min1 + ":" + sec1);
		if (hour < 24 && min < 60 && sec < 60 && hour1 < 24 && min1 < 60 && sec1 < 60 && hour > 0 && min > 0 && sec > 0 && hour1 > 0 && min1 > 0 && sec1 > 0){
			int a = (((hour1 * 60 + min1 * 60)*60) + sec1) - ((((hour * 60) + (min * 60))*60) + sec);
			double b = a * 0.25;
			b = b/100;
			double c = b * 100 % 100; 
			
			System.out.println("Пользователь потратит " +(int) b + " грн. " +(int) c + " копейки.");
		} else {
			System.out.println("Формат времени ЧЧ:ММ:СС и только положительное число");
		}
		
		// 8. Пользователь вводит с клавиатуры время в секундах, прошедшее с
		// начала рабочего дня. Посчитать, сколько целых часов ему осталось
		// сидеть на работе, если рабочий день составляет 8 часов.
		Scanner sc = new Scanner(System.in);
		System.out.println("Сколько времени прошло с начала рабочего дня в секундах");
		double sec = sc.nextDouble();
		if (sec > 0){
			double rabota = 8 * 60 * 60;// рабочий день в секундах
			double b = (rabota - sec)/60/60;
			b = (int)b;
			System.out.println("Осталось сидеть на работе " + (int) b );
		} else {
			System.out.println("Время может быть только положительным");
		}
		
		// 9. Пользователь вводит с клавиатуры стоимость одного ноутбука, их
		// количество и процент скидки. Посчитать общую сумму заказа.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите стоимость одного ноутбука");
		double sell = sc.nextDouble();
		System.out.println("Введите количество ноутбуков");
		int kol = sc.nextInt();
		System.out.println("Введите % скидки");
		double skidka = sc.nextDouble();
		if (sell > 0 && kol > 0 && skidka >0){
			double a = sell * kol; 
			a = a - (a*(skidka/100));
			System.out.println("К оплате " + a + " с учетом скидки = " + skidka);
		}
		
		
		// 10. Пользователь вводит с клавиатуры размер одного фильма в
		// гигабайтах (вещественное значение!) и скорость Интернет-соединения в
		// битах в секунду. Определить, за какое время (часы, минуты и секунды)
		// скачается фильм.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер одного фильма");
		double film = sc.nextDouble();
		System.out.println("Введите скорость интернет-соеденения в битах в секунду");
		int skorost = sc.nextInt();
		if(film > 0 && skorost > 0){
			double filmb = film * 1024*1024*1024;// количество бит в фильме
			double ras41 = (filmb /skorost);// количество секунд за которые скачается фильм 
			double ras4 =  ras41/60/60;//вычисляем количество часов
			double rasm = (ras41 - ras4);

			
			
			System.out.println("Фильм размером " + film + " который качается со скоростью " + skorost + " байс/с скачается за " +(int) ras4 + " часа, " + rasm + " минут");
		}
		
		// 11. Пользователь вводит с клавиатуры объем флешки в гигабайтах.
		// Посчитать, сколько на нее поместится фильмов размером 760 Мбайт.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер флешки в гигабайтах");
		double flesh = sc.nextDouble();
		if (flesh > 0 ){
			flesh = flesh * 1024 / 760;
			System.out.println("На флешку поместиться " + (int)flesh + " фильмов размером 760 Мбайт");
		}
		System.out.println("Сильно маленький размер флешки");
		
		// 12. Пользователь вводит с клавиатуры дробное число. Округлить его до
		// двух знаков после запятой и вывести на экран.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите дробное число");
		double first = sc.nextDouble();
		first = new BigDecimal(first).setScale(2, RoundingMode.UP).doubleValue();
		System.out.println(first);
		
		// 13. Преподаватель вводит с клавиатуры количество студентов, сдавших
		// домашние задание, и количество «должников». Посчитать, сколько
		// процентов составляют «должники» от общего числа студентов.
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество студентов сдавших домашние задание");
		int sdali = sc.nextInt();
		System.out.println("Введите количество студентов должников");
		int dolg = sc.nextInt();
		if (sdali > 0 && dolg > 0){
			double a = (double) (100* dolg)/(dolg + sdali);
			System.out.println("Должники состовляют " + a + " процентов от общего числа студентов");
		}
		System.out.println("Число учеников не может быть отрицательным");
		
		// 14. Пользователь вводит с клавиатуры время в секундах, прошедшее с
		// начала дня. Определить, сколько времени (часов, минут и секунд)
		// осталось до полуночи.
		Scanner sc = new Scanner(System.in);
		System.out.println("Сколько врмени прошло с начала дня в секундах");
		int sec = sc.nextInt();
		int na4 = 9*60*60;// начало дня в 9 утра
		int a = (24*60*60) - (na4 + sec);// сколько времени осталось до полуночи
		double b = a /60/60;//час
		double min = (a - (b * 60 * 60))/60;//минуты
		double secf = a - ((b * 60 * 60) + (min * 60));
		System.out.println("Времени осталось до полуночи" + (int) b + " часов " + (int) min + " минут " + (int) secf + " секунды");
		*/
		// 15. Пользователь вводит с клавиатуры объем одного фильма в
		// гигабайтах. Посчитать, сколько дискет понадобится для переноса фильма
		// на другой компьютер (размер дискеты считать равным 1.44 Мбайт).
		// 16. Пользователь вводит с клавиатуры сумму в гривнах, срок вклада в
		// месяцах и процентную ставку за год. Посчитать, сколько денег будет у
		// пользователя в конце срока.
		// 17. Рассчитать площадь поверхности Земли.
		// 18. Какая дата будет через N дней? Рекомендуется использование типа
		// GregorianCalendar.
		//GregorianCalendar g = new GregorianCalendar();
		//System.out.println(g.getTime());
		// 19. В зале у главного тренера Вячеслава занимается N спортсменов.
		// Каждому из них Вячеслав в конце тренировки выдаёт 1 порцию гейнера, а
		// если вес спортсмена менее 80 кг - то дополнительно ещё 1 порцию
		// гейнера и стакан молока. Стакан молока имеет ёмкость 200 мл, а
		// упаковка молока – 0.9 л. Написать программу, которая определит
		// количество пакетов молока и порций гейнера, необходимых тренеру
		// каждый день, для двух условий:
		// а) если в зале 100% всех спортсменов - дрищи (вес меньше 80 кг)
		// б) если в зале 60% всех спортсменов - дрищи (вес меньше 80 кг)

	}

}
