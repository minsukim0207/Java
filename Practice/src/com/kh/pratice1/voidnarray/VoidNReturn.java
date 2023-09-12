package com.kh.pratice1.voidnarray;
import java.util.Scanner;
/*
 * System.out.println();
 * void 활용
 * return 활용
 * static
 * */
public class VoidNReturn {
	
	Scanner scanner = new Scanner(System.in);
	
	public int practice1() {
		//두 수의 합 계산
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
        	System.out.println(num + "은 소수입니다.");
        } else {
        	System.out.println(num + "은 소수가 아닙니다.");
        }
    }
    
    public  boolean isPrimeNumber(int num) {
        if (num <= 1) {
            System.out.println("2이상의 숫자를 입력하세요.");
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
    	/*계산기 만들기 (연산 결과 반환):

    	메서드 이름: calculate

    	매개변수: 두 개의 실수(double 타입) num1과 num2, 그리고 연산자(String 타입) operator
    	기능: num1과 num2를 operator에 따라 더하기, 빼기, 곱하기, 나누기 연산을 수행하고 결과를 반환함.
    
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
    	단어 개수 세기:

    	메서드 이름: countWords

    	매개변수: 문자열(String 타입) text
    	기능: 입력된 문자열에서 공백을 기준으로 단어의 개수를 세고 결과를 출력함(void 리턴 타입).
    	
    */

    //}
    public void practice9() {
    	/*
    	삼각형 별 출력:

    	메서드 이름: printTriangle

    	매개변수: 양의 정수(int 타입) height
    	기능: 높이가 height인 삼각형 모양의 별을 출력함(void 리턴 타입).
    	
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
    	로또 번호 생성기:
    	Random
    	메서드 이름: generateLottoNumbers

    	매개변수: 로또 번호의 개수(int 타입) count
    	기능: 중복되지 않는 무작위 로또 번호를 count만큼 생성하여 출력함(void 리턴 타입).
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
