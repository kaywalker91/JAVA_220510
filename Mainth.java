package Study0510;

import java.util.Scanner;

public class Mainth 
{

	public static void main(String[] args) 
	{
		A6 a6 = new A6();
		Thread myth = new Thread(a6);
		myth.start();
		
		A7 a7 = new A7();
		a7.start();
		
		A8 a8 = new A8();
		Thread myth8 = new Thread(a8);
		myth8.start();

	}

}

class A6 implements Runnable
{
	public void run() 
	{
		while(true) 
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) 
			{}
			System.out.println("�ȳ��ϼ���!");
		}
	}
}

class A7 extends Thread 
{
	public void run() 
	{
		while(true) 
		{
			System.out.println("���ɽð��Դϴ�.");
			try
			{
				sleep(2000);
			}catch(InterruptedException ie) {}
		}
	}
}

class A8 extends Thread 
{
	public void run() 
	{
		while(true) 
		{
			System.out.println("�������Դϴ�.");
			try
			{
				Thread.sleep(500);
			}catch(InterruptedException ie) {}
		}
	}
}

