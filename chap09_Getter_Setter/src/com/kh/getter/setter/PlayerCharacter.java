package com.kh.getter.setter;

public class PlayerCharacter {
	
	private String name;
	private int health;
	private int attackPower;
	
	// getter
	// 데이터 복사본을 넘겨주기 때문에 원래 객체의 데이터는 손상되지 않음
	
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
	// 외부에서 메서드를 통해 데이터에 접근하게 된다면
	// 메소드는 매개값(매개변수)을 검증해서 유효한 값만 데이터로 저장할 수 있음
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHealth(int health) {
		if (health > 0) {
		this.health = health;
		} else {
			System.out.println("체력이 없습니다.");
		}
	}
	
	public void setAttackPower(int attackPower) { // 0미만의 값을 넣어도 저장, 출력되지 않음
		if (attackPower > 0) {
		this.attackPower = attackPower;
		} else {
			this.attackPower = 0;
			System.out.println("Power가 부족합니다.");
		}
	}
	
	// 캐릭터 정보 출력
	public void displayInfo() {
		System.out.println("캐릭터 정보: " + name);
		System.out.println("체력 정보: " + health);
		System.out.println("공격 파워: " + attackPower);
	}
	
	// 캐릭터 공격을 출력하는 메서드
	public void attack(PlayerCharacter target) {
		System.out.println(name + "이(가) " + target.getName() + "을(를) " + attackPower + "데미지로 공격했습니다.");
		System.out.println("공격했습니다.");
	}
	
	// 다른 캐릭터로부터 공격 받았을 때 메서드
	public void takeDamage(int damage) {
		System.out.println("공격 받았습니다");
	}
}
