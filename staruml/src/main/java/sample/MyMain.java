package sample;

public class MyMain {
	public static void main(String[] args) {
		//SampleClass s = new SampleClass();
		
		// 생성자를 사용하면 메모리를 계속 잡아먹지만
		// 예의 방법을 사용하면 SampleClass를 두번 호출하지만
		// 메모리는 한번만 사용
		
		SampleClass s = SampleClass.getInstance();
		s.samplePrint();
		
		s = SampleClass.getInstance();
		s.samplePrint();
	}
}