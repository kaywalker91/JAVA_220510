package Study0510;

public class Study2 {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.start();
		
		Test2 test2 = new Test2();
		test2.start();
		
		Test3 test3 = new Test3();
		Thread th = new Thread(test3);
		th.start();

	}

}

class Test1 extends Thread{
	public void run() {	
		while(true)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println("안녕하세요.---------1초에한번씩");
		}
	}
}
class Test2 extends Thread{
	public void run() {
		while(true)
		{
			try {
				sleep(2000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println("점심시간입니다.-------------2초에한번씩");
		}
	}
}
class Test3 implements Runnable{	
	public void run() {	
		while(true)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println("공부중입니다. --------0.5초에 한번씩");
		}
	}
	
}














