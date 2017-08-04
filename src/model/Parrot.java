package model;

public class Parrot extends Animal implements IACT {
	private String type;

	public Parrot() {
	}

	public Parrot(String name, int age, String type) {
		super(name, age);
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String skill() {
		return "�ó�ģ��";
	}

	@Override
	public String act() {
		return "������: " + this.getName() + "\n����: " + this.getAge() + "��" + "\nƷ��: " + this.getType() + "\n����: "
				+ skill() + "\n����: " + love();
	}

	@Override
	public String love() {
		return "ϲ���Լ��������";
	}

}
