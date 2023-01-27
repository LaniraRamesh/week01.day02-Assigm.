package week1.day02;

public class MobilePhone
{
float displayInches=6.6F;
static short mobileRam=8;
static short mobileRom=128;

    public  void mobileSpec()
{
	String mobileBrandName="Samsung";
	System.out.println("Mobile Brand = "+mobileBrandName);
	char mobileLogo='S';
	System.out.println("Mobile Logo = "+mobileLogo);
	short noOfMobilePiece=9;
	System.out.println("Mobile Pieces = "+noOfMobilePiece);
	int modelNumber=415646;
	System.out.println("Model Number = "+modelNumber);
	long mobileImeiNumber=4687654635L;
	System.out.println("mobile IMEI Number = "+mobileImeiNumber);
	float mobilePrice=25666.9f;
	System.out.println("mobilePrice = "+mobilePrice);
	boolean isDamaged=false;
	System.out.println("Is Damaged = "+isDamaged);
    }	

public static void main(String []args)
{
	MobilePhone b=new MobilePhone();
	System.out.println("Display inches ="+b.displayInches);
	System.out.println("Mobile Ram = "+mobileRam+"GB");
	System.out.println("Mobile Rom = "+mobileRom+"GB");
	b.mobileSpec();
}
	
	
	
	

}
