package model;

public class Monkey extends Animal implements IACT {
	private String type;

	public Monkey() {
	}

	public Monkey(String name, int age, String type) {
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
		return "����ֳ�����ľ��";
	}

	@Override
	public String act() {
		return "������: " + this.getName() + "\n����: " + this.getAge() + "��" + "\nƷ��: " + this.getType() + "\n����: "
				+ skill() + "\n����: " + love();
	}

	@Override
	public String love() {
		return "ϲ��ģ���˵Ķ�������";
	}

}
