package hw2;
public class HomeWork2 {
//	• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	public static void main(String[] args) {
//		int sum=0;
//		for (int i=2;i<=1000;i+=2 ){
//		sum = sum+ i;
//		}
//		System.out.println(sum);
////	
////	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
//		int b=1;
//		for(int a=1;a<=10;a++) {
//			b=b*a; }
//			System.out.println(b);
////	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
//		int result	=1;
//		int d=1;
//		while(d<=10){
//		result*=d;
//		d++;}
//		System.out.println(result);
	
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
		double y=0;
		for(int x=1;x<=10;x++) {
			y=Math.pow(x,2);
		System.out.print(y);
			}
		}
	
		
	}
