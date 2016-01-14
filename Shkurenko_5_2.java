package Shkurenko;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Shkurenko_5_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		// 1. Определить, параллельна ли определённая прямая линия оси ординат,
		// либо оси абсцисс. Прямая задаётся двумя точками.
		System.out.println("Введите первую координату точки ");
		double x = sc.nextDouble();
		System.out.println("Введите вторую координату точки ");
		double y = sc.nextDouble();
		System.out.println("Введите первую координату точки конца прямой");
		double x1 = sc.nextDouble();
		System.out.println("Введите вторую координату точки конца прямой");
		double y1 = sc.nextDouble();
		if (x == x1 ){
			System.out.println("паральна линии оси ординат");
		} else if (y == y1) {
		System.out.println("паральна линии оси абсцисс");
		} else
			System.err.println("не паральна линии оси абсцисс и линии оси абсцисс");
			*/
		/*
		// 2. Проверить, имеет ли введённое число вещественную часть. Например,
		// числа 3.14 и 2.5 – имеют вещественную часть, а числа 5 и 10.0 – нет.
		System.out.println("Введите число");
		double a = sc.nextDouble();
		if (a == (int) a){
			System.out.println("Число не имеет вещественную часть");
		} else
			System.out.println("Число имеет вещественную часть");
			*/
		/*
		// 3. Написать программу, которая предлагает пользователю ввести номер
		// дня недели, и в ответ показывает название этого дня (например, 6 –
		// это суббота). Решить с использованием if и switch.
		System.out.println("Введите номер дня недели");
		int a = sc.nextInt();

		if (a > 0 && a < 8){
			String den;
			switch (a){
			case 1: 
				den = "Понедельник";
			break;
			case 2: 
				den = "Вторник";
			break;
			case 3: 
				den = "Среда";
			break;
			case 4: 
				den = "Четверг";
			break;
			case 5: 
				den = "Пятница";
			break;
			case 6: 
				den = "Суббота";
			break;
			case 7: 
				den = "Воскресенье";
			break;
			default: 
				den = "Не знаю такого";
			break;
			} 
			System.out.println(den);

		}else
				System.out.println("Дни недели могут быть от 1 до 7");
			
	
		}
		*/
		/*
		// 4. Указать с клавиатуры текущее время (количество часов, минут,
		// секунд). Проверить корректность введённых значений.
		System.out.println("Введите текущее время часы");
		int hh1 = sc.nextInt();
		System.out.println("Введите текущее время минуты");
		int mm1 = sc.nextInt();
		System.out.println("Введите текущее время секунды");
		int ss1 = sc.nextInt();
		if (hh1 >= 0 && hh1 <= 23 && mm1 >= 0 && mm1 <=59 && ss1 >= 0 && ss1 <=59){
			System.out.println("Значения введены корректно");
		} else
			System.out.println("Вы допустили ошибку");
		*/
		/*
		// 5. Ввести с клавиатуры шестизначный номер трамвайного
		// (троллейбусного) билета, и определить является ли он счастливым
		// (совпадают суммы трёх первых и трёх последних цифр билета).
		System.out.println("Введите номер трамвайного(троллейбусного) билета");
		int bil = sc.nextInt(); 
		int bil1 = bil / 100000;
		int bil2 = bil / 10000 % 10;
		int bil3 = bil / 1000 % 10;
		int bil4 = bil / 100 % 10;
		int bil5 = bil / 10 % 10;
		int bil6 = bil %10;
		if (bil > 99999 && bil <= 999999){
			if (bil1 + bil2 + bil3 == bil4 + bil5 + bil6){
				System.out.println("Поздравляю билет счастливый");
			} else 
				System.out.println("выбирите другой билет этот не счастливый");
		} else
			System.out.println("Билет у нас имеет 6 цифр");
			*/
			
		/*
		// 6. Указать с клавиатуры пол и возраст человека. Определить, пора ли
		// ему на пенсию.
		System.out.println("Введите пол человека f(female) или m(man)");
		char pol = sc.next().charAt(0);
		System.out.println("Введите возраст человека");
		int voz = sc.nextInt();
			if ((int)pol == 102 && voz >= 0 && voz < 56 || (int)pol == 109 && voz >= 0 && voz < 61){
				System.out.println("рано еще на пенсию");
			} else 
				System.out.println("уже пора на пенсию");
		}
		*/
		/*
		// 7. Вводится время (часы и минуты) – программа выводит приветствие,
		// соответствующее введённому времени (например, ввели 15 часов 6 минут
		// – выводится приветствие «добрый день»).
		System.out.println("Введите сколько сейчас часов");
		int hh = sc.nextInt();
		System.out.println("Введите сколько сейчас минут");
		int mm = sc.nextInt();
		if (hh < 24 && hh >= 0){
					if (hh > 6 && hh <12){
			System.out.println("Доброе утро");
		}else if (hh >= 12 && hh < 18){
			System.out.println("Добрый день");
		}else if (hh >= 18 && hh < 23){
			System.out.println("Добрый вечер");
		} else 
			System.out.println("Доброй ночи");
		} else 
			System.out.println("неверный формат времени");;
			*/
		/*
		// 8. Программа подсчета идеального веса к росту. Ввести рост и вес,
		// вывести сообщение о том, сколько нужно кг набрать или сбросить
		// (идеальный вес = рост - 110).
		System.out.println("Введите свой рост");
		double rost = sc.nextDouble();
		System.out.println("Введите свой вес");
		double ves = sc.nextDouble();
		rost = new BigDecimal(rost).setScale(2, RoundingMode.UP).doubleValue();
		ves = new BigDecimal(ves).setScale(2, RoundingMode.UP).doubleValue();
		double vsei = rost - 110;
		vsei = new BigDecimal(vsei).setScale(2, RoundingMode.UP).doubleValue();
		if (ves > 0 && rost > 0){
		if (ves > (rost - 110)){
			System.out.println("Вам надо сбросить " + (vsei - ves) + " кг");
		} else if (ves < (rost - 110)){
			System.out.println("Вам надо набрать " + (vsei - ves) + " кг");
		} 
		}else
			System.out.println("рост и вес не могут быть отрицательными");
			*/
		/*
		// 9. Ввести любую дату (день, месяц и год вводятся по отдельности).
		// Проверить корректность введённых значений. Вывести дату следующего
		// дня (использовать стандартные встроенные классы Java вроде
		// GregorianCalendar запрещено!)
		System.out.println("Введите год");
		int god = sc.nextInt();
		System.out.println("Введите месяц");
		int mes = sc.nextInt();
		System.out.println("Введите день");
		int den = sc.nextInt();
		if (mes > 0 && mes <= 12){
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 ){
				if(den == 31){
					System.out.println("1." + (mes+1) + "." + god );
				} else if (den <= 31){
					System.out.println((den +1) + "." + mes + "." + god);
				} else
					System.out.println("Неверное количество дней в месяце");
					
				} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
					if(den == 30){
						System.out.println("1." + (mes+1) + "." + god );	
					} else if (den <= 30){
						System.out.println((den +1) + "." + mes + "." + god);
					} else
						System.out.println("Неверное количество дней в месяце");
				} else if (mes == 2){
					if (((god % 4 == 0) && !(god % 100 == 0)) || (god % 400 == 0)){
						if (den == 29){
							System.out.println("1." + (mes+1) + "." + god );
						} else if (den <= 29){
							System.out.println((den +1) + "." + mes + "." + god);
						} else if (den == 28){
							System.out.println("1." + (mes+1) + "." + god );
						} else if (den <= 28){
							System.out.println((den +1) + "." + mes + "." + god);
						} else 
							System.out.println("Неверное количество дней в месяце");
					}
				} else if (mes == 12){
					if(den == 31){
						System.out.println("1." + ("1.") + (god + 1) );
					} else if (den <= 31){
						System.out.println((den +1) + "." + mes + "." + god);
				} else
					System.out.println("Неверное количество дней в месяце");
			
				
				
			
			}
		}
	}
}
*/
		/*
		// 10. Написать программу, которая предлагает пользователю выбрать
		// животное из списка (1 – кошка, 2 – собака и тд.), и в ответ
		// показывает, какие звуки издаёт выбранное животное. В списке должно
		// быть хотя бы 10 животных.
		System.out.println("Выберите животное из списка");
		System.out.println("1)Кошка");
		System.out.println("2)Собака");
		System.out.println("3)Овечка");
		System.out.println("4)Коза");
		System.out.println("5)Утка");
		System.out.println("6)Гусь");
		System.out.println("7)Корова");
		System.out.println("8)Индюк");
		System.out.println("9)Свинья");
		System.out.println("10)Курица");
		System.out.println("11)Петух");
		System.out.println("12)Лошадь");
		System.out.println("13)Голубь");
		int giv = sc.nextInt();
		if (giv >= 1 && giv <= 13){
			String zvyk;
			switch (giv){
			case 1: 
				zvyk = "Мяу";
			break;
			case 2: 
				zvyk = "Гав";
			break;
			case 3: 
				zvyk = "Мее";
			break;
			case 4: 
				zvyk = "Беее";
			break;
			case 5: 
				zvyk = "Кря";
			break;
			case 6: 
				zvyk = "Га";
			break;
			case 7: 
				zvyk = "Мууу";
			break;
			case 8: 
				zvyk = "Фууу";
			break;
			case 9: 
				zvyk = "Хрю";
			break;
			case 10: 
				zvyk = "Кудах";
			break;
			case 11: 
				zvyk = "Кукареку";
			break;
			case 12: 
				zvyk = "Рыыыи";
				break;
			case 13: 
				zvyk = "Гуль";
				break;
			default: 
				zvyk = "Не знаю такого";
			break;
			} 
			System.out.println(zvyk + zvyk);

		}else
				System.out.println("животных у нас может быть от 1 до 13");
			}
		
		
		// 11. Написать игру "О, счастливчик!". На экране по очереди появляются
		// вопросы, и варианты ответов. Неправильный выбор - игра окончена.
		// Правильный ответ – переходим к следующему вопросу. Если все ответы
		// правильные – в конце выводится сообщение о победе. По желанию можно
		// реализовать несгораемые суммы, подсказки, работу с файлами, звуковые
		// эффекты и тд.
		System.out.println("Мы начинаем игру \"О, счастливчик\"");
		System.out.println("");
		System.out.println("И так первый вопрос");
		System.out.println("");
		System.out.println("Сколько будет \"2 + 2 * 2\"");
		System.out.println("");
		System.out.println("Выбирети ответ:");
		System.out.println("1)2");
		System.out.println("2)8");
		System.out.println("3)6");
		System.out.println("4)4");
		int vopros1 = sc.nextInt();
		String otvet = null;
		//if (vopros1 >= 1 && vopros1 <=4){
			switch (vopros1){
			case 1: 
			case 2:
			case 4: 
				otvet = "не угадали";
				System.out.println("вы проиграли к сожелению");
			return;
			case 3: 
				otvet = "Ура вы выиграли";
			break;
			default:
				System.out.println("вы выбрали не существующий ответ");
				return;

			}			System.out.println(otvet);
		
		System.out.println("Сколько будет \"2 + 2\"");
		System.out.println("");
		System.out.println("Выбирети ответ:");
		System.out.println("1)1");
		System.out.println("2)2");
		System.out.println("3)3");
		System.out.println("4)4");
		int vopros2 = sc.nextInt();
		switch (vopros2){
		case 1: 
		case 2:
		case 3: 
			otvet = "не угадали";
			System.out.println("вы проиграли к сожелению");
		return;
		case 4: 
			otvet = "Ура вы выиграли";
		break;
		default:
			System.out.println("вы выбрали не существующий ответ");
			return;
		}			System.out.println(otvet);
		
		System.out.println("Когда обычно бывает снег в Одессе");
		System.out.println("");
		System.out.println("Выбирети ответ:");
		System.out.println("1)Лето");
		System.out.println("2)Зима");
		System.out.println("3)Осень");
		System.out.println("4)Весна");
		int vopros3 = sc.nextInt();
		switch (vopros3){
		case 1: 
		case 4:
		case 3: 
			otvet = "не угадали";
			System.out.println("вы проиграли к сожелению");
		return;
		case 2: 
			otvet = "Ура вы выиграли";
		break;
		default:
			System.out.println("вы выбрали не существующий ответ");
			return;
		}			System.out.println(otvet);
		
		System.out.println("Можно ли получать энергию от удара молнии?");
		System.out.println("");
		System.out.println("Выбирети ответ:");
		System.out.println("1)Да");
		System.out.println("2)Нет");
		System.out.println("3)Это фантастика");
		System.out.println("4)Дома каждый день получаю");
		int vopros4 = sc.nextInt();
		switch (vopros4){
		case 2: 
		case 4:
		case 3: 
			otvet = "не угадали";
			System.out.println("вы проиграли к сожелению");
		return;
		case 1: 
			otvet = "Ура вы выиграли";
		break;
		default:
			System.out.println("вы выбрали не существующий ответ");
			return;
		}			System.out.println(otvet);

		System.out.println("Будет ли металлическая пластинка в моей голове притягиваться к магнитам?");
		System.out.println("");
		System.out.println("Выбирети ответ:");
		System.out.println("1)Да");
		System.out.println("2)Нет");
		System.out.println("3)Это фантастика");
		System.out.println("4)Да постоянно страдаю от этого");
		int vopros5 = sc.nextInt();
		switch (vopros5){
		case 2: 
		case 4:
		case 3: 
			otvet = "не угадали";
			System.out.println("вы проиграли к сожелению");
		return;
		case 1: 
			otvet = "Ура вы выиграли";
		break;
		default:
			System.out.println("вы выбрали не существующий ответ");
			return;
		}			System.out.println(otvet);
		
		System.out.println("Если человек говорит сам с собой, он безумен?");
		System.out.println("");
		System.out.println("Выбирети ответ:");
		System.out.println("1)Да");
		System.out.println("2)Нет");
		System.out.println("3)Это калькулятор умеет тоже");
		System.out.println("4)Нет, данный феномен известен как «речь для себя». Люди часто говорят сами с собой вслух, когда находятся в состоянии стресса или в одиночестве, и это абсолютно естественно.");
		int vopros6 = sc.nextInt();
		switch (vopros6){
		case 2: 
		case 1:
		case 3: 
			otvet = "не угадали";
			System.out.println("вы проиграли к сожелению");
		return;
		case 4: 
			otvet = "Ура вы выиграли";
		break;
		default:
			System.out.println("вы выбрали не существующий ответ");
			return;
		}			System.out.println(otvet);
		
		

		*/
		/*
		// 12. Пользователь вводит с клавиатуры количество градусов по Цельсию,
		// которое соответствует предполагаемой температуре за окном. Программа
		// сообщает, тепло сейчас или холодно, жарко или мороз, а также
		// генерирует прогноз погоды на завтра, с указанием скорости ветра,
		// возможных осадков и температуры воды в Чёрном море.
		System.out.println("Введите температуру за окном");
		double c = sc.nextDouble();
		if (c < -10 ){
		System.out.println("Мороз");
		System.out.println("Завтра ожидается " + (c -5) + " температура");
		System.out.println("Ветер СЗ 2 м/c");
		System.out.println("Возможен сильный снегопад");
		System.out.println("Температура воды в Черном море" + (c + 10));
		} else if (c < 10 && c > -10){
			System.out.println("Холодно");
			System.out.println("Завтра ожидается " + (c + 3) + " температура");
			System.out.println("Ветер СЮ 1 м/c");
			System.out.println("Возможно потепление");
			System.out.println("Температура воды в Черном море" + (c + 5));
		} else if (c > 10 && c < 25){
			System.out.println("Тепло");
			System.out.println("Завтра ожидается " + (c + 2) + " температура");
			System.out.println("Ветер ЮЗ 3 м/c");
			System.out.println("Возможно потепление");
			System.out.println("Температура воды в Черном море" + (c + 1));
		} else if (c > 25){
			System.out.println("Жарко");
			System.out.println("Завтра ожидается " + (c -1) + " температура");
			System.out.println("Ветер СЗ 4 м/c");
			System.out.println("Возможен дождь");
			System.out.println("Температура воды в Черном море" + (c + 5));
	
		// 13. Реализовать программу «Предсказатель». Пользователь вводит
		// вопрос. Программа выдаёт случайный ответ из набора заранее
		// предусмотренных ответов (5 положительных, 5 отрицательных, 10
		// нейтральных вариантов).
		System.out.println("Вас преветствует программа предсказатель 0.1");
		System.out.println("Введите вопрос");
		String	vopros = sc.nextLine();
		Random r = new Random();
		int c = r.nextInt(19) + 1;
		switch (c){
			case 1:
				System.out.println("Удовольствие будет безгранично");
				break;
			case 2:
				System.out.println("Радостно будет всем");
				break;
			case 3:
				System.out.println("Ликование победы будет продолжительным");
				break;
			case 4:
				System.out.println("Восторг от проделанной работы будет невероятным");
				break;
			case 5:
				System.out.println("Уважение добьетесь сегодня");
				break;
			case 6:
				System.out.println("Горе будет с теми кто сегодня будет что-то делать");
				break;
			case 7:
				System.out.println("Отчаяние поглатит Вас");
				break;
			case 8:
				System.out.println("Огорчение из-за нерешенных задач");
				break;
			case 9:
				System.out.println("Тревога за вашего любимца не напрасна");
				break;
			case 10:
				System.out.println("Скука будет сегодня весь день");
				break;
			case 11:
				System.out.println("Любопытство ваше может сыграть с вами злую шутку");
				break;
			case 12:
				System.out.println("В эти лунные сутки может возникнуть соблазн");
				break;
			case 13:
				System.out.println("Ваш ждет обычный день");
				break;
			case 14:
				System.out.println("Ваш ждет путешествие");
				break;
			case 15:
				System.out.println("Помечтайте о дальних странах");
				break;
			case 16:
				System.out.println("Этот день принесет Вам подсказку");
				break;
			case 17:
				System.out.println("К этому дню надо отнестись нейтрально");
				break;
			case 18:
				System.out.println("Задумайтесь над прошлым днем");
				break;
			case 19:
				System.out.println("Главное правило этого дня прислушатесь к своей интуиции");
				break;
			case 20:
				System.out.println("Правильно оцените происходящее вокруг");
				break;
			default:
				System.out.println("вы выбрали не существующий ответ");
				return;
			}	
				
				
		*/
		// 14.	Пользователь указывает дату своего рождения (число и месяц). Программа определяет знак зодиака пользователя и составляет для него гороскоп на ближайшую неделю.
		System.out.println("Введите число своего рождения");
		int data = sc.nextInt();
		System.out.println("Введите месяц своего рождения");
		int mec = sc.nextInt();
		System.out.println(data + "." + mec);
		if (mec == 3 && data >= 21 || mec == 4 && data <= 19){ //oven
			System.out.println("Овен.\nОбщий гороскоп на эту неделю ");
			System.out.println("На этой неделе Вы будете полны сил. Самое время воплощать в жизнь задуманное. С такой активной деятельностью есть вероятность невзначай зацепить кого-то за живое, но тем не менее для многих Вы станете вдохновителем. Не бойтесь использовать окружающих в своих целях - в пределах разумного, конечно. Не забывайте о своей семье и друзьях, которые, вероятно, чувствуют себя покинутыми. К концу недели Ваша динамичность поутихнет из-за внезапно возникшего препятствия. Не спешите бросать все силы на тушение пламени. Вместо этого позвольте ему прогореть.");
		}
		//15.	Валера купил N куриц по M гривен за одну курицу. Каждая курица несёт по X яиц в неделю. Валера решил открыть свой бизнес и стал продавать яйца, которые несут курицы. За сколько дней окупятся куры, если продавать яйца по Z гривен за десяток (с учётом НДС, но без учёта сбора в ПФ)? Сроком жизни куриц, влажностью воздуха в курятнике, а также скоростью ветра и фазами луны можно пренебречь.

	}
}





	
	

