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
		return "擅长钻火圈";
	}

	@Override
	public String act() {
		return "表演者: " + this.getName() + "\n年龄: " + this.getAge() + "岁" + "\n性别: " + this.getSex() + "\n毛色: " + this.getColor()
				+ "\n技能: " + skill() + "\n爱好: " + love();
	}

	@Override
	public String love() {
		return "喜欢吃各种肉类";
	}

}
