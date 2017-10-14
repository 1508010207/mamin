/**
 * 
 */
package 马敏;

/**
 * @author 敏儿
 *@file:数字旋转方阵.java
*@package:马敏
*@project:马敏
*@date time:2017年10月14日下午1:33:53
*@location:https://github.com/1508010207/mamin.git
 */
import java.util.Scanner;
public class 数字旋转方阵 {
	private static int n;//方阵的行和列
	private static int[][] a;//保存方阵的值
	private static int number=1;//填充的数字
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	a=new int[n][n];
	f(0,n-1);
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	System.out.printf("%4d",a[i][j]);
	}
	System.out.println();
	}
	}
	public static void f(int begin,int size)
	{
		if(size<0)
	return;
		if(size==0)//最后一圈只剩下一个元素
			{
			a[begin][begin]=number;
			return;
	}
		int h=begin,l=begin;
		for(int i=1;i<=size;i++)
		{
			a[h][l]=number;
			number++;
			h++;
	}
		for(int i=1;i<=size;i++)
		{
			a[h][l]=number;
			number++;
	l++;
	}
	//向上
		for(int i=1;i<=size;i++)
	{
			a[h][l]=number;
			number++;
			h--;
	}
		for(int i=1;i<=size;i++)
		{
			a[h][l]=number;
			number++;
			l--;
			}
		f(l+1,size-2);
		}
	}


