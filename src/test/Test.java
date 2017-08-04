package test;

import java.util.Scanner;

import model.*;

public class Test {
	Scanner sc = new Scanner(System.in);
	IACT bear = new Bear("Bill", 1);
	IACT lion = new Lion("Lain",2,"公狮","灰色");
	IACT monkey = new Monkey("Tom",1,"金丝猴");
	IACT parrot = new Parrot("Rose",1,"牡丹鹦鹉");
	IACT clown = new Clown("Kahle",5);
	/**
	 * 表演菜单展示
	 * @return 表演菜单
	 */
	public void menu() {
		System.out.println("****************欢迎来到太阳马戏团****************");
		System.out.println("*****************请选择表演者*****************");
		System.out.println("**************    1、棕熊        **************");
		System.out.println("**************    2、狮子        **************");
		System.out.println("**************    3、猴子        **************");
		System.out.println("**************    4、鹦鹉        **************");
		System.out.println("**************    5、小丑        **************");
		System.out.println("**************请选择表演者:");
		int num = sc.nextInt();
		perform(num);
	}
	 
	/**
	 * 观众选择表演者，表演者进行表演,观看完后调用是否观看方法
	 * @param num 观众选择的表演者的序号
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
			 System.out.println("*************输入信息不正确，请重新输入*************");
			 num = sc.nextInt();
			 this.perform(num);
			 return;
		 }
		 isWatch();
	 }
	
	/**
	 * 是否继续观看表演
	 * @param i 选择序号
	 */
	public void isWatch() {
		System.out.println("************是否继续观看(1/0)************");
		int i = sc.nextInt();
		if(i == 1) {
			menu();
		}
		else if(i == 0) {
			System.out.println("*************欢迎下次光临*************");
			System.exit(0);
		}
		else {
			System.out.println("*************输入信息不正确，请重新输入*************");
			this.isWatch();
			return;
		}
			
	}
	public static void main(String[] args) {
		Test ts = new Test();
		ts.menu();	
	}
}
