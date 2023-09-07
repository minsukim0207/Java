package com.kh.thisSample;

class MyClass {
			
			int myField;
			
			MyClass() {
				this(0); // this() ����ؼ� �ٸ� ������ ȣ��
			}
			
			MyClass(int value) {
				this.myField = value;
			}
			
			void printValue() {
				System.out.println("myField�� ��: " + this.myField);
			}
		}


public class ThisMain {
// this
// �ν��Ͻ� �ڽ��� ����Ű�� ���� ����
// ��ü�� �ּҰ� ����
// this ��ü(�ν��Ͻ�) �ڽ��� ����Ű�� �������� ��ü(�ν��Ͻ�)�� �ּҰ� ����
// this() ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ���
	public static void main(String[] args) {
		
		MyClass myclass1 = new MyClass(); // ù��° ������ ȣ��
		
		MyClass myclass2 = new MyClass(10); // �ι�° ������ ȣ��
		
		myclass1.printValue();
		myclass2.printValue();
		
	}
}