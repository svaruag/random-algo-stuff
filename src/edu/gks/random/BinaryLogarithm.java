/**
 * 
 */
package edu.gks.random;


/**
 * @author gaurav
 *
 */
public class BinaryLogarithm {

	public static int binaryLogarithm(int n) {
		if (n == 0)
			return -1;
		int p = 0;
		if (n >= 1 << 16) {// >= 65536
			n >>= 16;
			p += 16;
			System.out.println("1st IF: n="+n+", p="+p);
		}
		if (n >= 1 << 8) {//256
			n >>= 8;
			p += 8;
			System.out.println("2nd IF: n="+n+", p="+p);
		}
		if (n >= 1 << 4) {//16
			n >>= 4;
			p += 4;
			System.out.println("3rd IF: n="+n+", p="+p);
		}
		if (n >= 1 << 2) {//4
			n >>= 2;
			p += 2;			
			System.out.println("4th IF: n="+Integer.toBinaryString(n)+", p="+p);
		}
		if (n >= 1 << 1) {//2
			p += 1;
			System.out.println("5th IF: n="+n+", p="+p);
		}
		return p;
	}
	
	public static long exponentiationBySquare(int x, int n){
		if(n==0) return 1;
		else if (n==1) return x;
		else if(n%2==0) return exponentiationBySquare(x*x, n/2);
		else return x*exponentiationBySquare(x*x, (n-1)/2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long x1 = System.currentTimeMillis();
		//4294967296
//		System.out.println(binaryLogarithm(6666666));
		System.out.println(Math.pow(7, 20));
//		System.out.println(exponentiationBySquare(7, 20));
		System.out.println(System.currentTimeMillis()-x1);
	}
}