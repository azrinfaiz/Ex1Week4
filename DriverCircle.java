import SemuaCircle.CircleKecil.Circle; //import spesific class/all class from package
public class DriverCircle{

	

	public static void main(String[] args){


		Circle bulat = new Circle();
		System.out.println("Print apa? " + bulat);

		Circle bulat1 =new Circle(76);
		System.out.println("Print apa? " + bulat1);

		Circle bulat2 = new Circle(8,3);
		System.out.println("Print apa? " + bulat2);

		// System.out.println("Jejari bulat1 + " + bulat1.getJejari());
		// System.out.println("Jejari bulat + " + bulat.getJejari());
		// bulat2.setJejari(35);
		// System.out.println("Jejari bulat2 + " + bulat1.getJejari());
		 
		//System.out.printf("Luas ialah : %2.2f",bulat.KiraLuas()); //printf& format guna ',' //println guna +
		System.out.println("Ukurlilit = " + UkurLilit(bulat2.getJejari()));
		System.out.println("Luas ialah " + KiraLuas(bulat2));
		System.out.println("Papar ialah = " + Papar());
	}
	//static method that return a reference
	public static Circle Papar()
	{
		int j =5;
		return new Circle(j); //create objek
	}
	//static method call by reference
public static double KiraLuas(Circle b){
	return b.getJejari()*b.getJejari()*Math.PI;
}
public static double UkurLilit (double jejari) {
	return 2 * Math.PI*jejari;
}

}