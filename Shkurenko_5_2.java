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
		// 1. ����������, ����������� �� ����������� ������ ����� ��� �������,
		// ���� ��� �������. ������ ������� ����� �������.
		System.out.println("������� ������ ���������� ����� ");
		double x = sc.nextDouble();
		System.out.println("������� ������ ���������� ����� ");
		double y = sc.nextDouble();
		System.out.println("������� ������ ���������� ����� ����� ������");
		double x1 = sc.nextDouble();
		System.out.println("������� ������ ���������� ����� ����� ������");
		double y1 = sc.nextDouble();
		if (x == x1 ){
			System.out.println("�������� ����� ��� �������");
		} else if (y == y1) {
		System.out.println("�������� ����� ��� �������");
		} else
			System.err.println("�� �������� ����� ��� ������� � ����� ��� �������");
			*/
		/*
		// 2. ���������, ����� �� �������� ����� ������������ �����. ��������,
		// ����� 3.14 � 2.5 � ����� ������������ �����, � ����� 5 � 10.0 � ���.
		System.out.println("������� �����");
		double a = sc.nextDouble();
		if (a == (int) a){
			System.out.println("����� �� ����� ������������ �����");
		} else
			System.out.println("����� ����� ������������ �����");
			*/
		/*
		// 3. �������� ���������, ������� ���������� ������������ ������ �����
		// ��� ������, � � ����� ���������� �������� ����� ��� (��������, 6 �
		// ��� �������). ������ � �������������� if � switch.
		System.out.println("������� ����� ��� ������");
		int a = sc.nextInt();

		if (a > 0 && a < 8){
			String den;
			switch (a){
			case 1: 
				den = "�����������";
			break;
			case 2: 
				den = "�������";
			break;
			case 3: 
				den = "�����";
			break;
			case 4: 
				den = "�������";
			break;
			case 5: 
				den = "�������";
			break;
			case 6: 
				den = "�������";
			break;
			case 7: 
				den = "�����������";
			break;
			default: 
				den = "�� ���� ������";
			break;
			} 
			System.out.println(den);

		}else
				System.out.println("��� ������ ����� ���� �� 1 �� 7");
			
	
		}
		*/
		/*
		// 4. ������� � ���������� ������� ����� (���������� �����, �����,
		// ������). ��������� ������������ �������� ��������.
		System.out.println("������� ������� ����� ����");
		int hh1 = sc.nextInt();
		System.out.println("������� ������� ����� ������");
		int mm1 = sc.nextInt();
		System.out.println("������� ������� ����� �������");
		int ss1 = sc.nextInt();
		if (hh1 >= 0 && hh1 <= 23 && mm1 >= 0 && mm1 <=59 && ss1 >= 0 && ss1 <=59){
			System.out.println("�������� ������� ���������");
		} else
			System.out.println("�� ��������� ������");
		*/
		/*
		// 5. ������ � ���������� ������������ ����� �����������
		// (��������������) ������, � ���������� �������� �� �� ����������
		// (��������� ����� ��� ������ � ��� ��������� ���� ������).
		System.out.println("������� ����� �����������(��������������) ������");
		int bil = sc.nextInt(); 
		int bil1 = bil / 100000;
		int bil2 = bil / 10000 % 10;
		int bil3 = bil / 1000 % 10;
		int bil4 = bil / 100 % 10;
		int bil5 = bil / 10 % 10;
		int bil6 = bil %10;
		if (bil > 99999 && bil <= 999999){
			if (bil1 + bil2 + bil3 == bil4 + bil5 + bil6){
				System.out.println("���������� ����� ����������");
			} else 
				System.out.println("�������� ������ ����� ���� �� ����������");
		} else
			System.out.println("����� � ��� ����� 6 ����");
			*/
			
		/*
		// 6. ������� � ���������� ��� � ������� ��������. ����������, ���� ��
		// ��� �� ������.
		System.out.println("������� ��� �������� f(female) ��� m(man)");
		char pol = sc.next().charAt(0);
		System.out.println("������� ������� ��������");
		int voz = sc.nextInt();
			if ((int)pol == 102 && voz >= 0 && voz < 56 || (int)pol == 109 && voz >= 0 && voz < 61){
				System.out.println("���� ��� �� ������");
			} else 
				System.out.println("��� ���� �� ������");
		}
		*/
		/*
		// 7. �������� ����� (���� � ������) � ��������� ������� �����������,
		// ��������������� ��������� ������� (��������, ����� 15 ����� 6 �����
		// � ��������� ����������� ������� �����).
		System.out.println("������� ������� ������ �����");
		int hh = sc.nextInt();
		System.out.println("������� ������� ������ �����");
		int mm = sc.nextInt();
		if (hh < 24 && hh >= 0){
					if (hh > 6 && hh <12){
			System.out.println("������ ����");
		}else if (hh >= 12 && hh < 18){
			System.out.println("������ ����");
		}else if (hh >= 18 && hh < 23){
			System.out.println("������ �����");
		} else 
			System.out.println("������ ����");
		} else 
			System.out.println("�������� ������ �������");;
			*/
		/*
		// 8. ��������� �������� ���������� ���� � �����. ������ ���� � ���,
		// ������� ��������� � ���, ������� ����� �� ������� ��� ��������
		// (��������� ��� = ���� - 110).
		System.out.println("������� ���� ����");
		double rost = sc.nextDouble();
		System.out.println("������� ���� ���");
		double ves = sc.nextDouble();
		rost = new BigDecimal(rost).setScale(2, RoundingMode.UP).doubleValue();
		ves = new BigDecimal(ves).setScale(2, RoundingMode.UP).doubleValue();
		double vsei = rost - 110;
		vsei = new BigDecimal(vsei).setScale(2, RoundingMode.UP).doubleValue();
		if (ves > 0 && rost > 0){
		if (ves > (rost - 110)){
			System.out.println("��� ���� �������� " + (vsei - ves) + " ��");
		} else if (ves < (rost - 110)){
			System.out.println("��� ���� ������� " + (vsei - ves) + " ��");
		} 
		}else
			System.out.println("���� � ��� �� ����� ���� ��������������");
			*/
		/*
		// 9. ������ ����� ���� (����, ����� � ��� �������� �� �����������).
		// ��������� ������������ �������� ��������. ������� ���� ����������
		// ��� (������������ ����������� ���������� ������ Java �����
		// GregorianCalendar ���������!)
		System.out.println("������� ���");
		int god = sc.nextInt();
		System.out.println("������� �����");
		int mes = sc.nextInt();
		System.out.println("������� ����");
		int den = sc.nextInt();
		if (mes > 0 && mes <= 12){
			if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 ){
				if(den == 31){
					System.out.println("1." + (mes+1) + "." + god );
				} else if (den <= 31){
					System.out.println((den +1) + "." + mes + "." + god);
				} else
					System.out.println("�������� ���������� ���� � ������");
					
				} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
					if(den == 30){
						System.out.println("1." + (mes+1) + "." + god );	
					} else if (den <= 30){
						System.out.println((den +1) + "." + mes + "." + god);
					} else
						System.out.println("�������� ���������� ���� � ������");
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
							System.out.println("�������� ���������� ���� � ������");
					}
				} else if (mes == 12){
					if(den == 31){
						System.out.println("1." + ("1.") + (god + 1) );
					} else if (den <= 31){
						System.out.println((den +1) + "." + mes + "." + god);
				} else
					System.out.println("�������� ���������� ���� � ������");
			
				
				
			
			}
		}
	}
}
*/
		/*
		// 10. �������� ���������, ������� ���������� ������������ �������
		// �������� �� ������ (1 � �����, 2 � ������ � ��.), � � �����
		// ����������, ����� ����� ����� ��������� ��������. � ������ ������
		// ���� ���� �� 10 ��������.
		System.out.println("�������� �������� �� ������");
		System.out.println("1)�����");
		System.out.println("2)������");
		System.out.println("3)������");
		System.out.println("4)����");
		System.out.println("5)����");
		System.out.println("6)����");
		System.out.println("7)������");
		System.out.println("8)�����");
		System.out.println("9)������");
		System.out.println("10)������");
		System.out.println("11)�����");
		System.out.println("12)������");
		System.out.println("13)������");
		int giv = sc.nextInt();
		if (giv >= 1 && giv <= 13){
			String zvyk;
			switch (giv){
			case 1: 
				zvyk = "���";
			break;
			case 2: 
				zvyk = "���";
			break;
			case 3: 
				zvyk = "���";
			break;
			case 4: 
				zvyk = "����";
			break;
			case 5: 
				zvyk = "���";
			break;
			case 6: 
				zvyk = "��";
			break;
			case 7: 
				zvyk = "����";
			break;
			case 8: 
				zvyk = "����";
			break;
			case 9: 
				zvyk = "���";
			break;
			case 10: 
				zvyk = "�����";
			break;
			case 11: 
				zvyk = "��������";
			break;
			case 12: 
				zvyk = "�����";
				break;
			case 13: 
				zvyk = "����";
				break;
			default: 
				zvyk = "�� ���� ������";
			break;
			} 
			System.out.println(zvyk + zvyk);

		}else
				System.out.println("�������� � ��� ����� ���� �� 1 �� 13");
			}
		
		
		// 11. �������� ���� "�, �����������!". �� ������ �� ������� ����������
		// �������, � �������� �������. ������������ ����� - ���� ��������.
		// ���������� ����� � ��������� � ���������� �������. ���� ��� ������
		// ���������� � � ����� ��������� ��������� � ������. �� ������� �����
		// ����������� ����������� �����, ���������, ������ � �������, ��������
		// ������� � ��.
		System.out.println("�� �������� ���� \"�, �����������\"");
		System.out.println("");
		System.out.println("� ��� ������ ������");
		System.out.println("");
		System.out.println("������� ����� \"2 + 2 * 2\"");
		System.out.println("");
		System.out.println("�������� �����:");
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
				otvet = "�� �������";
				System.out.println("�� ��������� � ���������");
			return;
			case 3: 
				otvet = "��� �� ��������";
			break;
			default:
				System.out.println("�� ������� �� ������������ �����");
				return;

			}			System.out.println(otvet);
		
		System.out.println("������� ����� \"2 + 2\"");
		System.out.println("");
		System.out.println("�������� �����:");
		System.out.println("1)1");
		System.out.println("2)2");
		System.out.println("3)3");
		System.out.println("4)4");
		int vopros2 = sc.nextInt();
		switch (vopros2){
		case 1: 
		case 2:
		case 3: 
			otvet = "�� �������";
			System.out.println("�� ��������� � ���������");
		return;
		case 4: 
			otvet = "��� �� ��������";
		break;
		default:
			System.out.println("�� ������� �� ������������ �����");
			return;
		}			System.out.println(otvet);
		
		System.out.println("����� ������ ������ ���� � ������");
		System.out.println("");
		System.out.println("�������� �����:");
		System.out.println("1)����");
		System.out.println("2)����");
		System.out.println("3)�����");
		System.out.println("4)�����");
		int vopros3 = sc.nextInt();
		switch (vopros3){
		case 1: 
		case 4:
		case 3: 
			otvet = "�� �������";
			System.out.println("�� ��������� � ���������");
		return;
		case 2: 
			otvet = "��� �� ��������";
		break;
		default:
			System.out.println("�� ������� �� ������������ �����");
			return;
		}			System.out.println(otvet);
		
		System.out.println("����� �� �������� ������� �� ����� ������?");
		System.out.println("");
		System.out.println("�������� �����:");
		System.out.println("1)��");
		System.out.println("2)���");
		System.out.println("3)��� ����������");
		System.out.println("4)���� ������ ���� �������");
		int vopros4 = sc.nextInt();
		switch (vopros4){
		case 2: 
		case 4:
		case 3: 
			otvet = "�� �������";
			System.out.println("�� ��������� � ���������");
		return;
		case 1: 
			otvet = "��� �� ��������";
		break;
		default:
			System.out.println("�� ������� �� ������������ �����");
			return;
		}			System.out.println(otvet);

		System.out.println("����� �� ������������� ��������� � ���� ������ ������������� � ��������?");
		System.out.println("");
		System.out.println("�������� �����:");
		System.out.println("1)��");
		System.out.println("2)���");
		System.out.println("3)��� ����������");
		System.out.println("4)�� ��������� ������� �� �����");
		int vopros5 = sc.nextInt();
		switch (vopros5){
		case 2: 
		case 4:
		case 3: 
			otvet = "�� �������";
			System.out.println("�� ��������� � ���������");
		return;
		case 1: 
			otvet = "��� �� ��������";
		break;
		default:
			System.out.println("�� ������� �� ������������ �����");
			return;
		}			System.out.println(otvet);
		
		System.out.println("���� ������� ������� ��� � �����, �� �������?");
		System.out.println("");
		System.out.println("�������� �����:");
		System.out.println("1)��");
		System.out.println("2)���");
		System.out.println("3)��� ����������� ����� ����");
		System.out.println("4)���, ������ ������� �������� ��� ����� ��� �����. ���� ����� ������� ���� � ����� �����, ����� ��������� � ��������� ������� ��� � �����������, � ��� ��������� �����������.");
		int vopros6 = sc.nextInt();
		switch (vopros6){
		case 2: 
		case 1:
		case 3: 
			otvet = "�� �������";
			System.out.println("�� ��������� � ���������");
		return;
		case 4: 
			otvet = "��� �� ��������";
		break;
		default:
			System.out.println("�� ������� �� ������������ �����");
			return;
		}			System.out.println(otvet);
		
		

		*/
		/*
		// 12. ������������ ������ � ���������� ���������� �������� �� �������,
		// ������� ������������� �������������� ����������� �� �����. ���������
		// ��������, ����� ������ ��� �������, ����� ��� �����, � �����
		// ���������� ������� ������ �� ������, � ��������� �������� �����,
		// ��������� ������� � ����������� ���� � ׸���� ����.
		System.out.println("������� ����������� �� �����");
		double c = sc.nextDouble();
		if (c < -10 ){
		System.out.println("�����");
		System.out.println("������ ��������� " + (c -5) + " �����������");
		System.out.println("����� �� 2 �/c");
		System.out.println("�������� ������� ��������");
		System.out.println("����������� ���� � ������ ����" + (c + 10));
		} else if (c < 10 && c > -10){
			System.out.println("�������");
			System.out.println("������ ��������� " + (c + 3) + " �����������");
			System.out.println("����� �� 1 �/c");
			System.out.println("�������� ����������");
			System.out.println("����������� ���� � ������ ����" + (c + 5));
		} else if (c > 10 && c < 25){
			System.out.println("�����");
			System.out.println("������ ��������� " + (c + 2) + " �����������");
			System.out.println("����� �� 3 �/c");
			System.out.println("�������� ����������");
			System.out.println("����������� ���� � ������ ����" + (c + 1));
		} else if (c > 25){
			System.out.println("�����");
			System.out.println("������ ��������� " + (c -1) + " �����������");
			System.out.println("����� �� 4 �/c");
			System.out.println("�������� �����");
			System.out.println("����������� ���� � ������ ����" + (c + 5));
	
		// 13. ����������� ��������� ���������������. ������������ ������
		// ������. ��������� ����� ��������� ����� �� ������ �������
		// ��������������� ������� (5 �������������, 5 �������������, 10
		// ����������� ���������).
		System.out.println("��� ������������ ��������� ������������� 0.1");
		System.out.println("������� ������");
		String	vopros = sc.nextLine();
		Random r = new Random();
		int c = r.nextInt(19) + 1;
		switch (c){
			case 1:
				System.out.println("������������ ����� �����������");
				break;
			case 2:
				System.out.println("�������� ����� ����");
				break;
			case 3:
				System.out.println("��������� ������ ����� ���������������");
				break;
			case 4:
				System.out.println("������� �� ����������� ������ ����� �����������");
				break;
			case 5:
				System.out.println("�������� ��������� �������");
				break;
			case 6:
				System.out.println("���� ����� � ���� ��� ������� ����� ���-�� ������");
				break;
			case 7:
				System.out.println("�������� �������� ���");
				break;
			case 8:
				System.out.println("��������� ��-�� ���������� �����");
				break;
			case 9:
				System.out.println("������� �� ������ ������� �� ��������");
				break;
			case 10:
				System.out.println("����� ����� ������� ���� ����");
				break;
			case 11:
				System.out.println("����������� ���� ����� ������� � ���� ���� �����");
				break;
			case 12:
				System.out.println("� ��� ������ ����� ����� ���������� �������");
				break;
			case 13:
				System.out.println("��� ���� ������� ����");
				break;
			case 14:
				System.out.println("��� ���� �����������");
				break;
			case 15:
				System.out.println("���������� � ������� �������");
				break;
			case 16:
				System.out.println("���� ���� �������� ��� ���������");
				break;
			case 17:
				System.out.println("� ����� ��� ���� ��������� ����������");
				break;
			case 18:
				System.out.println("����������� ��� ������� ����");
				break;
			case 19:
				System.out.println("������� ������� ����� ��� ������������ � ����� ��������");
				break;
			case 20:
				System.out.println("��������� ������� ������������ ������");
				break;
			default:
				System.out.println("�� ������� �� ������������ �����");
				return;
			}	
				
				
		*/
		// 14.	������������ ��������� ���� ������ �������� (����� � �����). ��������� ���������� ���� ������� ������������ � ���������� ��� ���� �������� �� ��������� ������.
		System.out.println("������� ����� ������ ��������");
		int data = sc.nextInt();
		System.out.println("������� ����� ������ ��������");
		int mec = sc.nextInt();
		System.out.println(data + "." + mec);
		if (mec == 3 && data >= 21 || mec == 4 && data <= 19){ //oven
			System.out.println("����.\n����� �������� �� ��� ������ ");
			System.out.println("�� ���� ������ �� ������ ����� ���. ����� ����� ��������� � ����� ����������. � ����� �������� ������������� ���� ����������� ��������� �������� ����-�� �� �����, �� ��� �� ����� ��� ������ �� ������� �������������. �� ������� ������������ ���������� � ����� ����� - � �������� ���������, �������. �� ��������� � ����� ����� � �������, �������, ��������, ��������� ���� ����������. � ����� ������ ���� ������������ ��������� ��-�� �������� ���������� �����������. �� ������� ������� ��� ���� �� ������� �������. ������ ����� ��������� ��� ���������.");
		}
		//15.	������ ����� N ����� �� M ������ �� ���� ������. ������ ������ ���� �� X ��� � ������. ������ ����� ������� ���� ������ � ���� ��������� ����, ������� ����� ������. �� ������� ���� �������� ����, ���� ��������� ���� �� Z ������ �� ������� (� ������ ���, �� ��� ����� ����� � ��)? ������ ����� �����, ���������� ������� � ���������, � ����� ��������� ����� � ������ ���� ����� ����������.

	}
}





	
	

