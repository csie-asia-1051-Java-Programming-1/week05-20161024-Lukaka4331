package ex;
import java.util.Random;


/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Random rnd=new Random();
	
		int a=rnd.nextInt(10);

		int data[][]=new int[10][10];
		for(int i=1;i<=10;i++){		 

			for(int j=1;j<=10;j++){		
                
				 a=rnd.nextInt(10);


		 System.out.print(i);		   System.out.print(j);
		}System.out.println();
			}
	
		
		
		
		
		

	}

}
