package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.3,2.5,3.6,7.8};
        double total = 0;
        double max = myList[0];

        for (double number:myList){
            total = total + number;
            System.out.println(number);
            if (max<number){
                max = number;
            }
        }
        System.out.println("Sayıların Toplamı: " + total);
        System.out.println("En Büyük Sayı : " + max);

	}

}
