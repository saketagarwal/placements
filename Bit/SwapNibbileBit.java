package test;

public class SwapNibbileBit {
	
	public static void main(String[] args) {
		
		int a = 100;
		
		int b = a>>4;
		byte bb = (byte) b;
		int c = a<<4;
		int cb = (byte) c;
		
		
		System.out.println(bb|cb);
		
		
	}

}
