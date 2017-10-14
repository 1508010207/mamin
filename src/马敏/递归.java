/**
 * 
 */
package 马敏;

/**
 * @author 敏儿
 *@file:递归.java
*@package:马敏
*@project:马敏
*@date time:2017年10月14日下午1:31:33
*@location:https://github.com/1508010207/mamin.git
 */
public class 递归 {
	public static void main(String[]args){
		printX(1237);
	}
	public static void printX(int n){
		System.out.println("X="+n);
		if(n<5000)
			printX(2*n);
		else {
			printx(n/2);
		}
	}
private static void printx(int n){
	if(n>=1237){
		System.out.println("x="+n);
		printx(n/2);
	}
}
}
