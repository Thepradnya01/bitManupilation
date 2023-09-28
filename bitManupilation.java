// two types of bit shift in java- <<- left shift and >>- right shift, left shift shifts the bit to left by desired number, for ex, 1001 << 2 ---> 0100, and 1001>>2 --> 0010
//5= 0101, 5<<1--> 1010 = 2+8=10 and 5>>1: 0010 =2

// In bit manipulation, we do following operation- 1. getBit, 2.setBit, 3. clear, 4.set
//lets make four functions for each of this operation.
// we count index from right side here.


package Basics;

public class bitManupilation {
	
	public static void getBit(int num, int index) {
		int parity=1;                //0001 ,(1010,2)- >> 0100 & 1010= 0      and at index 1, its 1
		int bitmask= 1<<index;
		if((bitmask&num)==0) {
			System.out.println("bit at that index is 0");
		}
		else
			System.out.println("Bit is 1");
		
	}
	
	public static void setBit(int num, int index) {
		                //0001 ,(1010,2)- >> 0100 || 1010= 1110     make bit at index 2, 1.
		int bitmask= 1<<index;
		System.out.println(bitmask | num);
		
	}
	public static void clear(int num, int index) {
		int parity=1;                //0001 ,(1010,1)- >> ~0010 & 1010= 0  --> 1101&1010= 1000    
		int bitmask= 1<<index;
		int new_num= num & ~bitmask;
		System.out.println(new_num);
		
	}
	public static void edit(int num, int index, int k) {
		int parity=1;                //0001 ,(1010,2)- >> ~0100 & 1010= ,1011&1010= 1010       and at index 1, its 1
		int bitmask= 1<<index;
		if(k==1) {
			System.out.println(bitmask | num);
		}
		else if(k==0) {
			int new_num= num & ~bitmask;
			System.out.println(new_num);
		}
		else
			System.out.println("we can edit bit to 1 or 0 only");
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(5<<1);
		
		System.out.println(5>>1);
		
		getBit(10,2);
		getBit(10,1);
		clear(10,1);
		setBit(10,2);
		
		edit(10,2,3);
		edit(10,2,1);
		

	}

}
