package model;

public class Bear extends Animal implements IACT {
	public Bear() {
	}
	
	public Bear(String name, int age) {
		super(name, age);
	}

	@Override
	public String skill() {
		return "���Ż�����������ɡ����������";

	}

	@Override
	public String act() {
		return "������: " + this.getName() + "\n����: " + this.getAge() + "��" + "\n����: " + skill() + "\n����: " + love();
	}

	@Override
	public String love() {
		return "ϲ������";

	}

}
