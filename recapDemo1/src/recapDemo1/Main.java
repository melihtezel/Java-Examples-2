package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 15;
		int sayi2 = 25;
		int sayi3 = 5;
		
		int enbüyük = sayi1;

	if(enbüyük<sayi2) {
		enbüyük = sayi2;
	}
	else if(sayi3>enbüyük) {
		enbüyük = sayi3;
	}
	
	
	System.out.println("En büyük sayi = "+ enbüyük);
	
	}

}
