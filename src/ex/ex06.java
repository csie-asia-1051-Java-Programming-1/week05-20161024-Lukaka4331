package ex;
import java.util.Scanner;
/*
 * Topic: �Y�Ӱ}�C���t���Ҧ��ǥͪ��Ǹ��A���èS�����Ӥj�p���ǱƦC�C�мg�@�{���̾Ǹ��j�p�ƦC�ñN���G��X�C
 * Date: 2016/10/24
 * Author: 105021044 ���­�
 */

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("�X�����??");
		int n=scn.nextInt();
		int data[]=new int[n];		
        for(int i=0;i<n;i++){
        	data[i]=scn.nextInt();
        }
		for(int i=0;i<data.length-1;i++){
			for(int j=0;j<data.length-1;j++){
				if(data[j+1]>data[j]){
					int temp=data[j+1];
					data[j+1]=data[j];
					data[j]=temp;
				}
			}
		}
		System.out.print("�Ǹ��Ƨ�:");
		for(int j=0;j<n;j++){
			System.out.print(data[j]+" ");
		}
		
		
	}

}
