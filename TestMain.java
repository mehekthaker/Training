//Define interface "A" with "disp1()" method.
//Define interface "B" derive it from "A" with disp2() method
//Derive class C from B
//Instantiate class "C" and call its members as well as derived from parent interfaces.
public class TestMain {

	public static void main(String args[])
	{
		C cc = new C();
		cc.disp1();	//Calls the method of interface A
		cc.disp2();		//Calls the method of interface B
		cc.methodC();	//Calls the method of class C
		
	}
	
}
