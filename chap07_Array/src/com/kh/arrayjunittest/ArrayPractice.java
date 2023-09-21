package com.kh.arrayjunittest;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	private int[] intArray;
	private String[] strArray;
	
	public ArrayPractice(int size) {
		this.intArray = new int[size];
		for (int i = 0; i < size; i++) {
			intArray[i] = i;
		}
	}
	
	public ArrayPractice() {
		this.strArray = new String[5];
		this.strArray[0] = "1";
		this.strArray[1] = "2";
		this.strArray[2] = "3";
		this.strArray[3] = "4";
		this.strArray[4] = "5";
	}
	
	public int[] getArray() {
		return intArray;
	}
	
	public String[] getStrArray() {
		return strArray;
	}
	public int[] practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) { 
			arr[i] = i + 1; 
		}
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		return arr;
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		int size = 0;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�뼇�쓽 �젙�닔 : ");
		size = scanner.nextInt();
		
		arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		String[] arr = new String[5];
		//String[] arr = {"�궗怨�", "洹�", "�룷�룄", "蹂듭댂�븘", "李몄쇅"};
		
		arr[0] = "�궗怨�";
		arr[1] = "洹�";
		arr[2] = "�룷�룄";
		arr[3] = "蹂듭댂�븘";
		arr[4] = "李몄쇅";
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		char ch = '\u0000';
		String str = "";
		char[] arr = null;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("臾몄옄�뿴 : ");
		str = scanner.nextLine();
		
		System.out.print("臾몄옄 : ");
		ch = scanner.nextLine().charAt(0);
		
		arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		System.out.print(str + "�뿉 " + ch + "媛� 議댁옱�븯�뒗 �쐞移�(�씤�뜳�뒪) : ");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) { 
				System.out.print(i + " ");
				
				count++;
			}
		}

		System.out.println();
		System.out.println(ch + "媛쒖닔 : " + count);
	}
	
	public void practice6() {
		int num = 0;
		String[] arr = {"�썡", "�솕", "�닔", "紐�", "湲�", "�넗", "�씪"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0 ~ 6 �궗�씠 �닽�옄 �엯�젰 : ");
		num = scanner.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.println(arr[num] + "�슂�씪");
		} else {
			System.out.println("�옒紐� �엯�젰�븯�뀲�뒿�땲�떎.");
		}
	}
	
	public void practice7() {
		int sum = 0;
		int size = 0;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�젙�닔 : ");
		size = scanner.nextInt();
		
		arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("諛곗뿴 " + i + "踰덉㎏ �씤�뜳�뒪�뿉 �꽔�쓣 媛� : ");
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("珥� �빀 : " + sum);
	}
	
	
	public void practice8() {
		int size = 0;
		int count = 1;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);		
		
		while(true) {			
			System.out.print("�젙�닔 : ");
			size = scanner.nextInt();

			if(size >= 3 && size % 2 == 1) { 
				arr = new int[size];
				
				for(int i = 0; i < arr.length; i++) {
					arr[i] = count;
					
					if(i < arr.length / 2) {
						count++;
					} else {
						count--;
					}
				}
				
				for(int i = 0; i < arr.length; i++) {
					if(i < arr.length-1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.println(arr[i]);
					}
				}
				
				break;
				
			} else {
				System.out.println("�떎�떆 �엯�젰�븯�꽭�슂.");
			}
		}
	}
	
	public void practice9() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice10() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();

		Arrays.sort(arr);
		
		System.out.println("理쒕�媛� : " + arr[9]);
		System.out.println("理쒖냼媛� : " + arr[0]);
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void practice12() {
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					
					break;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice13() {
		String pId = "";
		char[] origin = null;
		char[] copy = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("二쇰�쇰벑濡앸쾲�샇(-�룷�븿) : ");
		pId = scanner.nextLine();
		
		origin = new char[pId.length()];
		
		for(int i = 0; i < origin.length; i++) {
			origin[i] = pId.charAt(i);
		}
		
		copy = new char[origin.length];
		
		for(int i = 0; i < copy.length; i++) {
			if(i <= 7) { 
				copy[i] = origin[i];
			} else {
				copy[i] = '*';
			}
			
			System.out.print(copy[i]);
		}
	}
}
