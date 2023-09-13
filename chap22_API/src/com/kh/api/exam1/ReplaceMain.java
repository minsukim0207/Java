package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {

		ReplaceMain main = new ReplaceMain();
		main.replace1();
		System.out.println();
		main.replace2();
		System.out.println();
		main.replace3();
		System.out.println();
		main.replace4();
		System.out.println();
		main.replace5();
		System.out.println();
		main.replace11();
		System.out.println();
	}
	
	public void replace1() {
		String input = "Hello, world";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		
		String reInput2 = reInput.replace("-", "");
		System.out.println(reInput2);
	}
	
	public void replace2() {
		String input = "Hello, world";
		String reInput = input.replace("world", "Java");
		System.out.println(reInput);
	}
	
	public void replace3() {
		String originName = "Hello, world";
		String copyName = originName.replace("o", "x");
		System.out.println(copyName);
	}
	
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog";
		String copyString = originString.replace("fox", "cat");
		System.out.println(copyString);
	}
	
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog";
		String copyString = originString.replace(" ", "");
		System.out.println(copyString);
	}
	
	public void replace11() {
		String originString = "Hello, world";
		String reAllstr = originString.replaceAll("(?i)world", "Java");
		System.out.println(reAllstr);
	}

}