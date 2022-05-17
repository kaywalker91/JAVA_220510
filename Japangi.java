package Study0510;

import java.util.Scanner;

public class Japangi {
	Scanner sc = new Scanner(System.in);
	int coin=0; //자판기 총잔액....
	
	String sangpum[] = {"상품1","상품2","상품3","상품4","상품5","상품6"};
	int price[] = {1000,2000,3000,4000,5000,6000};
	
	int select;
	boolean buyCheck=false; //true이면 살수있고 false이면 살수없음.
	Japangi()
	{
		while(true)
		{
			System.out.println("[-----------------]");
			System.out.println("[현재잔액 :"+coin+"원 ]");
			System.out.println("[-----------------]");
			
			
			System.out.println("1.물건선택");
			System.out.println("2.돈투입");
			System.out.println("3.잔돈반환");
			System.out.println("4.종료");
			System.out.print("선택:"); select = sc.nextInt();
			
			if(select == 1) 	 { selectGoods();}
			else if(select == 2) { insert();}
			else if(select == 3) { coin=0;}
			else if(select == 4) {break;}
			
		}
		System.out.println("프로그램 종료.");
	}
	void insert()
	{		
		System.out.print("투입금액:"); int inCoin = sc.nextInt();
		coin += inCoin;
		
	}
	void selectGoods()
	{
		System.out.println("상품1(1000원)/상품2(2000원)/상품3(3000원)");
		System.out.println("상품4(4000원)/상품5(5000원)/상품6(6000원)");
		System.out.print("선택:"); int sel = sc.nextInt();
		
		coinCheck(sel);//잔액이 부족하는걸 체크한다.
		
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
			if(coin < price[0]) { System.out.println("돈이 부족합니다.");buyCheck = false;}
			else {buyCheck = true;}
		}
		else if(selGoods == 2) { 
			if(coin < price[1]) { System.out.println("돈이 부족합니다.");buyCheck = false;}
			else {buyCheck = true;}
		}
		else if(selGoods == 3) { 
			if(coin < price[2]) { System.out.println("돈이 부족합니다.");buyCheck = false;} 
			else {buyCheck = true;}
		}
		else if(selGoods == 4) { 
			if(coin < price[3]) { System.out.println("돈이 부족합니다.");buyCheck = false;}
			else {buyCheck = true;}
		}
		else if(selGoods == 5) { 
			if(coin < price[4]) { System.out.println("돈이 부족합니다.");buyCheck = false;} 
			else {buyCheck = true;}
		}
		else if(selGoods == 6) { 
			if(coin < price[5]) { System.out.println("돈이 부족합니다.");buyCheck = false;} 
			else {buyCheck = true;}
		}
		
	}
	void buy(int selGoods)
	{
		if(selGoods == 1)      { coin-= price[0]; System.out.println(sangpum[0]+"구입완료!");}
		else if(selGoods == 2) { coin-= price[1]; System.out.println(sangpum[1]+"구입완료!");}
		else if(selGoods == 3) { coin-= price[2]; System.out.println(sangpum[2]+"구입완료!");}
		else if(selGoods == 4) { coin-= price[3]; System.out.println(sangpum[3]+"구입완료!");}
		else if(selGoods == 5) { coin-= price[4]; System.out.println(sangpum[4]+"구입완료!");}
		else if(selGoods == 6) { coin-= price[5]; System.out.println(sangpum[5]+"구입완료!");}
	}	

}
