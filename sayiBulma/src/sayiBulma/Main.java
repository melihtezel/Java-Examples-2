package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = {3,4,5,8,9,0};
        int aranacak = 6;
        boolean varMı = false;

        for (int sayi:sayilar){
            if(sayi==aranacak){
                varMı=true;
                break;
            }
        }

        if (varMı){
            System.out.println("Sayı mevcuttur..");
        }
        else {
            System.out.println("Sayı mevcut değildir..");
        }

	}

}
