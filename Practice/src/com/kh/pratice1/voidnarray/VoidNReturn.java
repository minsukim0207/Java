package com.kh.pratice1.voidnarray;
import java.util.Scanner;
/*
 * System.out.println();
 * void Ȱ��
 * return Ȱ��
 * static
 * */
public class VoidNReturn {
	
	Scanner scanner = new Scanner(System.in);
	
	public int practice1() {
		//�� ���� �� ���
		 //Scanner scanner = new Scanner(System.in);
	       
	        int num1 = scanner.nextInt();
	       
	        int num2 = scanner.nextInt();

	        int sum = num1 + num2;
	        
	        return sum;
	        
	    }
	public int practice2() {
		//Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
	    
	}
	public String practice3() {
		 //Scanner scanner = new Scanner(System.in);
	       
	     String input = scanner.nextLine();

	     String reversed = new StringBuilder(input).reverse().toString();
	      
	     return reversed;
	}
	public int practice4() {
		//Scanner scanner = new Scanner(System.in);
       
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;

       
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        return sum;
	}
	public int practice5() {
		//Scanner scanner = new Scanner(System.in);
	       
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];

       
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
	        
	    return max;
	}
	/*
	public void practice6() {
		//Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        boolean isPrime = isPrimeNumber(num);
        
        if (isPrime) {
        	System.out.println(num + "�� �Ҽ��Դϴ�.");
        } else {
        	System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
        }
    }
    
    public  boolean isPrimeNumber(int num) {
        if (num <= 1) {
            System.out.println("2�̻��� ���ڸ� �Է��ϼ���.");
        } else {
        	for (int i = 2; i <= Math.sqrt(num); i++) {
        		if (num % i == 0) {
        		}
            }
        }
		return false;
	}
    */
    
    public void practice7() {
    	/*���� ����� (���� ��� ��ȯ):

    	�޼��� �̸�: calculate

    	�Ű�����: �� ���� �Ǽ�(double Ÿ��) num1�� num2, �׸��� ������(String Ÿ��) operator
    	���: num1�� num2�� operator�� ���� ���ϱ�, ����, ���ϱ�, ������ ������ �����ϰ� ����� ��ȯ��.
    
    */
    	int num1 = scanner.nextInt();
    	int num2 = scanner.nextInt();
    	String operator = scanner.next();
    	
    	System.out.println(calculate(num1, num2, operator));
    }
    
    public static double calculate(int num1, int num2, String operator) {
    	
    	int caseNum = 0;
    	double result = 0;
    	
		if (operator.charAt(0) == '+') caseNum = 1;
		else if (operator.charAt(0) == '-') caseNum = 2;
		else if (operator.charAt(0) == '*') caseNum = 3;
		else if (operator.charAt(0) == '/') caseNum = 4;
		
		switch(caseNum) {
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:
				result = num1 / num2;
				break;
			default :
				break;
		}
		
		return result;
	}
    
    //public practice8() {
    	/*
    	�ܾ� ���� ����:

    	�޼��� �̸�: countWords

    	�Ű�����: ���ڿ�(String Ÿ��) text
    	���: �Էµ� ���ڿ����� ������ �������� �ܾ��� ������ ���� ����� �����(void ���� Ÿ��).
    	
    */

    //}
    public void practice9() {
    	/*
    	�ﰢ�� �� ���:

    	�޼��� �̸�: printTriangle

    	�Ű�����: ���� ����(int Ÿ��) height
    	���: ���̰� height�� �ﰢ�� ����� ���� �����(void ���� Ÿ��).
    	
    */
    	printTriangle(5);
    }
    
    public void printTriangle(int num) {
    	for (int i = 0; i < num; i++) {
    		for (int j = 0; j < i; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
    
    public void practice10() {
    	/*
    	�ζ� ��ȣ ������:
    	Random
    	�޼��� �̸�: generateLottoNumbers

    	�Ű�����: �ζ� ��ȣ�� ����(int Ÿ��) count
    	���: �ߺ����� �ʴ� ������ �ζ� ��ȣ�� count��ŭ �����Ͽ� �����(void ���� Ÿ��).
    */
    	generateLottoNumbers(8);
    }
    
    public void generateLottoNumbers(int num) {
    	
    	int[] lotto = new int[num];
    	
    	for (int i = 0; i < num; i++) {
			if (i == 0) {
			lotto[i] = (int) (Math.random() * 45);
			} else {
				lotto[i] = (int) (Math.random() * 45);
				for (int j = 0; j < i; j++) {
					if (lotto[j] == lotto[i]) {
						i--;
					}
				}
			}
		}
    	
    	for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
    }
}
