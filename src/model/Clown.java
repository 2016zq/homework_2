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
		return "身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆";
	}
	@Override
	public String skill() {
		return "脚踩高跷，进行杂技魔术表演";
	}

	@Override
	public String act() {
		return "表演者: " + this.getName() + "\n艺龄: " + this.getYears() + "年" + "\n着装: " + this.dress() + "\n技能: "
				+ this.skill();
	}

}
