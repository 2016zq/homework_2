package model;

public class Bear extends Animal implements IACT {
	public Bear() {
	}
	
	public Bear(String name, int age) {
		super(name, age);
	}

	@Override
	public String skill() {
		return "挽着花篮，打着雨伞，自立走秀";

	}

	@Override
	public String act() {
		return "表演者: " + this.getName() + "\n年龄: " + this.getAge() + "岁" + "\n技能: " + skill() + "\n爱好: " + love();
	}

	@Override
	public String love() {
		return "喜欢卖萌";

	}

}
