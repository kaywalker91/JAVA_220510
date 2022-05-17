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
			System.out.println("안녕하세요!");
		}
	}
}

class A7 extends Thread 
{
	public void run() 
	{
		while(true) 
		{
			System.out.println("점심시간입니다.");
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
			System.out.println("공부중입니다.");
			try
			{
				Thread.sleep(500);
			}catch(InterruptedException ie) {}
		}
	}
}

