package model;

public class Clown implements IACT {
	private String name;
	private int years;
	public Clown() {
	}
	
	public Clown(String name,int years) {
		this.setName(name);
		this.setYears(years);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
	public String dress() {
		return "����ʷ�װ��ͷ�ϴ��Ų�ɫ��ñ�ӣ����ϻ��ſ��ŵĲ�ױ";
	}
	@Override
	public String skill() {
		return "�Ųȸ��Σ������Ӽ�ħ������";
	}

	@Override
	public String act() {
		return "������: " + this.getName() + "\n����: " + this.getYears() + "��" + "\n��װ: " + this.dress() + "\n����: "
				+ this.skill();
	}

}
