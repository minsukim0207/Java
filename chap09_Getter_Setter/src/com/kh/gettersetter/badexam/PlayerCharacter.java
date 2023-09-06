package com.kh.gettersetter.badexam;

public class PlayerCharacter {
	
	private String name;
	private int health;
	private int attackPower;
	
	// getter
	// ������ ���纻�� �Ѱ��ֱ� ������ ���� ��ü�� �����ʹ� �ջ���� ����
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getAttackPower() {
		return attackPower;
	}
	
	// setter
	// �ܺο��� �޼��带 ���� �����Ϳ� �����ϰ� �ȴٸ�
	// �޼ҵ�� �Ű���(�Ű�����)�� �����ؼ� ��ȿ�� ���� �����ͷ� ������ �� ����
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		if (health > 0) {
		this.health = health;
		} else {
			System.out.println("ü���� �����ϴ�.");
		}
	}
	
	public void setAttackPower(int attackPower) { // 0�̸��� ���� �־ ����, ��µ��� ����
		if (attackPower > 0) {
		this.attackPower = attackPower;
		} else {
			this.attackPower = 0;
			System.out.println("Power�� �����մϴ�.");
		}
	}
	
	// ĳ���� ���� ���
	public void displayInfo() {
		System.out.println("ĳ���� ����: " + this.name);
		System.out.println("ü�� ����: " + this.health);
		System.out.println("���� �Ŀ�: " + this.attackPower);
	}
	
	// ĳ���� ������ ����ϴ� �޼���
	public void attack(PlayerCharacter target) {
		System.out.println(this.name + "��(��) " + target.getName() + "��(��) " + this.attackPower + "�������� �����߽��ϴ�.");
		System.out.println("�����߽��ϴ�.");
	}
	
	// �ٸ� ĳ���ͷκ��� ���� �޾��� �� �޼���
	public void takeDamage(int damage) {
		System.out.println("���� �޾ҽ��ϴ�");
	}
}
