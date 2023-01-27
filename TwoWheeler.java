package week1.day02;

import java.security.DomainCombiner;

public class TwoWheeler {
	public void twoWheeler() {
		int noOfWheels=2;
		System.out.println("Car Wheels"+"="+noOfWheels);
		short noOfMirrors=2;
		System.out.println("Car Mirror = "+noOfMirrors);
		long chassisNumber=5655456424345L;
		System.out.println("Car Chassis Number = "+chassisNumber);
		boolean isPunctured=false;
		System.out.println("Is Car Punctured = "+isPunctured);
	}
	public static void twoWheeler02() {
		String bikeName="Kuwaski";
		System.out.println("Bike Name = "+ bikeName);
		double runningKm=700.52;
		System.out.println("Total KM = "+runningKm);
	}
		public static void main(String []args)
		{
			TwoWheeler a=new TwoWheeler();
			a.twoWheeler();	
			twoWheeler02();
	}
	

}
