package hw1;

//1.請設計一隻Java程式,計算12,6這兩個數值的和與積
	public class HomeWork {
		public static void main(String[] args) {
			int a=12,b=6;
			System.out.println(a+b);
			System.out.println(a*b);
			
//2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
			int total=200,dozen=12;
			int egg=total/dozen;
			System.out.println("200顆蛋共"+egg+"打");
			System.out.println(total%dozen+"顆");
			
//3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
			//一天24hour =1440分=86400秒
			double s=256559;
			double ss=86400;
			double d=s/ss;
			
//4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
//			園面積=圓周率*半徑半徑
//			圓周長=2*半徑*圓周率
			final double PI=3.1415;
			double d=5;
			System.out.println("圓面積="+(PI*d*d));
			System.out.println("圓周長="+(d*2*PI));
			
//5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行
//,請用程式計算10年後,本金加利息共有多少錢
			// A = P (1 + r/n)^ (nt)，其中A為最終的本利和，P為本金，
			// r為年利率，n為計息次數，t為投資年限1。
			//150(1+(0.02/1))^1*10
			int P=1500000;
			double r=0.02;
			int n=1;
			int t=10;
			
		}	
	}

	