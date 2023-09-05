package com.kh.classBM;
import com.kh.classAM.*;

public class BM extends AM {
	
		public void am() {
		publicMethod();
		protectedMethod();
		// main 메서드에서 직접 호출을 하거나
		// 접근제한자를 가지고 있어서 같은 패키지
		// extends 사용해서 호출
		// defaultMethod();
		// privateMethod();
		}
}
