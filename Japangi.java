package Study0510;

import java.util.Scanner;

public class Japangi {
	Scanner sc = new Scanner(System.in);
	int coin=0; //���Ǳ� ���ܾ�....
	
	String sangpum[] = {"��ǰ1","��ǰ2","��ǰ3","��ǰ4","��ǰ5","��ǰ6"};
	int price[] = {1000,2000,3000,4000,5000,6000};
	
	int select;
	boolean buyCheck=false; //true�̸� ����ְ� false�̸� �������.
	Japangi()
	{
		while(true)
		{
			System.out.println("[-----------------]");
			System.out.println("[�����ܾ� :"+coin+"�� ]");
			System.out.println("[-----------------]");
			
			
			System.out.println("1.���Ǽ���");
			System.out.println("2.������");
			System.out.println("3.�ܵ���ȯ");
			System.out.println("4.����");
			System.out.print("����:"); select = sc.nextInt();
			
			if(select == 1) 	 { selectGoods();}
			else if(select == 2) { insert();}
			else if(select == 3) { coin=0;}
			else if(select == 4) {break;}
			
		}
		System.out.println("���α׷� ����.");
	}
	void insert()
	{		
		System.out.print("���Աݾ�:"); int inCoin = sc.nextInt();
		coin += inCoin;
		
	}
	void selectGoods()
	{
		System.out.println("��ǰ1(1000��)/��ǰ2(2000��)/��ǰ3(3000��)");
		System.out.println("��ǰ4(4000��)/��ǰ5(5000��)/��ǰ6(6000��)");
		System.out.print("����:"); int sel = sc.nextInt();
		
		coinCheck(sel);//�ܾ��� �����ϴ°� üũ�Ѵ�.
		
		if(buyCheck == true)
		{
			if(sel == 1)      {buy(1);}
			else if(sel == 2) {buy(2);}
			else if(sel == 3) {buy(3);}
			else if(sel == 4) {buy(4);}
			else if(sel == 5) {buy(5);}
			else if(sel == 6) {buy(6);}
		}
	}
	void coinCheck(int selGoods)
	{
		if(selGoods == 1)      { 
			if(coin < price[0]) { System.out.println("���� �����մϴ�.");buyCheck = false;}
			else {buyCheck = true;}
		}
		else if(selGoods == 2) { 
			if(coin < price[1]) { System.out.println("���� �����մϴ�.");buyCheck = false;}
			else {buyCheck = true;}
		}
		else if(selGoods == 3) { 
			if(coin < price[2]) { System.out.println("���� �����մϴ�.");buyCheck = false;} 
			else {buyCheck = true;}
		}
		else if(selGoods == 4) { 
			if(coin < price[3]) { System.out.println("���� �����մϴ�.");buyCheck = false;}
			else {buyCheck = true;}
		}
		else if(selGoods == 5) { 
			if(coin < price[4]) { System.out.println("���� �����մϴ�.");buyCheck = false;} 
			else {buyCheck = true;}
		}
		else if(selGoods == 6) { 
			if(coin < price[5]) { System.out.println("���� �����մϴ�.");buyCheck = false;} 
			else {buyCheck = true;}
		}
		
	}
	void buy(int selGoods)
	{
		if(selGoods == 1)      { coin-= price[0]; System.out.println(sangpum[0]+"���ԿϷ�!");}
		else if(selGoods == 2) { coin-= price[1]; System.out.println(sangpum[1]+"���ԿϷ�!");}
		else if(selGoods == 3) { coin-= price[2]; System.out.println(sangpum[2]+"���ԿϷ�!");}
		else if(selGoods == 4) { coin-= price[3]; System.out.println(sangpum[3]+"���ԿϷ�!");}
		else if(selGoods == 5) { coin-= price[4]; System.out.println(sangpum[4]+"���ԿϷ�!");}
		else if(selGoods == 6) { coin-= price[5]; System.out.println(sangpum[5]+"���ԿϷ�!");}
	}	

}
