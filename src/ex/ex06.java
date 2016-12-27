package ex;import java.util.Scanner;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021044 鐘岑哲
 */

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scn=new Scanner(System.in);
          int n=scn.nextInt();
          int data[]=new int [n];
          int data1[]=new int [n];
          int sum=0;
          int c=-1;
          for(int i=0;i<n;i++){
        	  data[i]=scn.nextInt();
          }
          for(int i=0;i<n;i++){
        	  for(int j=0;j<n;j++){
        		while(data[j]>sum){
        			sum=data[j];
        			c=j;
        		}
        	}
        	data1[i]=sum;
        	data[c]=-1;
        	sum=0;
        	c=0;
          }
          for(int i=0;i<n;i++){
        	  System.out.print(data1[i]+" ");
          }

	}

}
