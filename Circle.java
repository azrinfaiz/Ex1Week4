package SemuaCircle.CircleKecil;//create package here
//java.sun.com --> pakcage com.sun.java
//package my.edu.utem.ftmk
public class Circle {
	private double jejari,x;
	public static int bilObjekWujud=0;
	//default constructor
	public Circle()
	{
		jejari=1;
		x=5;
		bilObjekWujud++;
		//System.out.println("Default constractur");
	}

	public Circle(double jejari)
	{
		this.jejari=jejari;
		x=5;
		bilObjekWujud++;
	}
	//overloading constructor
	public Circle(double jejari,double x)
	{
		this.jejari = jejari;
		this.x=x;
		bilObjekWujud++;
		// jejari=a;
		// System.out.println("jejari =" + jejari + "String = " +b);
	}

	//method
	public double KiraLuas()
	{
		return jejari*jejari*Math.PI;
	}

	public void setJejari(double jejari){

		this.jejari =jejari;
		System.out.println(jejari);
	}
	public double getJejari(){

		return jejari;
	}
	public String toString(){
		String tentangCirle;
		tentangCirle = "Bil Objek ialah " + bilObjekWujud;
		return tentangCirle;
	}
// public  double UkurLilit (double jejari) {
// 	return 2 * Math.PI*jejari;
// }



}