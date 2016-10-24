package ex;
import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021044 鐘岑哲
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("n=");
		int n=scn.nextInt();
        int i=1;
        int sum=1;
while(i<n){
	i++;	sum=sum*i;

}
System.out.print(sum);

		
		
		
		
		
		
		
		
		
	}

}
