package model;

public class Lion extends Animal implements IACT {
	private String color, sex;
	
	public Lion() {
	}
	
	public Lion(String name, int age, String sex, String color) {
		super(name, age);
		this.setColor(color);
		this.setSex(sex);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String skill() {
		return "�ó����Ȧ";
	}

	@Override
	public String act() {
		return "������: " + this.getName() + "\n����: " + this.getAge() + "��" + "\n�Ա�: " + this.getSex() + "\nëɫ: " + this.getColor()
				+ "\n����: " + skill() + "\n����: " + love();
	}

	@Override
	public String love() {
		return "ϲ���Ը�������";
	}

}
