package test;

import java.util.Scanner;

import model.*;

public class Test {
	Scanner sc = new Scanner(System.in);
	IACT bear = new Bear("Bill", 1);
	IACT lion = new Lion("Lain",2,"��ʨ","��ɫ");
	IACT monkey = new Monkey("Tom",1,"��˿��");
	IACT parrot = new Parrot("Rose",1,"ĵ������");
	IACT clown = new Clown("Kahle",5);
	/**
	 * ���ݲ˵�չʾ
	 * @return ���ݲ˵�
	 */
	public void menu() {
		System.out.println("****************��ӭ����̫����Ϸ��****************");
		System.out.println("*****************��ѡ�������*****************");
		System.out.println("**************    1������        **************");
		System.out.println("**************    2��ʨ��        **************");
		System.out.println("**************    3������        **************");
		System.out.println("**************    4������        **************");
		System.out.println("**************    5��С��        **************");
		System.out.println("**************��ѡ�������:");
		int num = sc.nextInt();
		perform(num);
	}
	 
	/**
	 * ����ѡ������ߣ������߽��б���,�ۿ��������Ƿ�ۿ�����
	 * @param num ����ѡ��ı����ߵ����
	 */
	public void perform(int num) {
		 switch(num) {
		 case 1:
			 System.out.println(bear.act());
			 break;
		 case 2:
			 System.out.println(lion.act());
			 break;
		 case 3:
			 System.out.println(monkey.act());
			 break;
		 case 4:
			 System.out.println(parrot.act());
			 break;
		 case 5:
			 System.out.println(clown.act());
			 break;
		 default:
			 System.out.println("*************������Ϣ����ȷ������������*************");
			 num = sc.nextInt();
			 this.perform(num);
			 return;
		 }
		 isWatch();
	 }
	
	/**
	 * �Ƿ�����ۿ�����
	 * @param i ѡ�����
	 */
	public void isWatch() {
		System.out.println("************�Ƿ�����ۿ�(1/0)************");
		int i = sc.nextInt();
		if(i == 1) {
			menu();
		}
		else if(i == 0) {
			System.out.println("*************��ӭ�´ι���*************");
			System.exit(0);
		}
		else {
			System.out.println("*************������Ϣ����ȷ������������*************");
			this.isWatch();
			return;
		}
			
	}
	public static void main(String[] args) {
		Test ts = new Test();
		ts.menu();	
	}
}
