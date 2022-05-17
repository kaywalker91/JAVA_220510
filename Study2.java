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
			System.out.println("�ȳ��ϼ���.---------1�ʿ��ѹ���");
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
			System.out.println("���ɽð��Դϴ�.-------------2�ʿ��ѹ���");
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
			System.out.println("�������Դϴ�. --------0.5�ʿ� �ѹ���");
		}
	}
	
}














