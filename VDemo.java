//Define an interface "Vehicle" with start() function. Now derive classes like "TwoWheeler", 
//"ThreeWheeler", "FourWheeler", etc. from "Vehicle" and override start() function. define a class "VDemo"
//in which write main() function. In the main() function create an array of Vehicle class.
//In this array store instances of sub classes. Traverse through the array and call "start()"
//only if there is a class "ThreeWheeler".
public class VDemo {

	public static void main(String args[])
	{
		Vehicle vehicle[] = new Vehicle[3];
		
		/*Vehicle v1 = new Vehicle() {
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				
			}
		};*/
		
		//v1.start();
		vehicle[0] = new TwoWheeler();
		vehicle[1] = new ThreeWheeler();
		vehicle[2] = new FourWheeler();		//storing instances of subclasses
		
		for(int i = 0; i<3; i++)
		{
			if(vehicle[i].getClass().getName().equals("ThreeWheeler"))
			{
				vehicle[i].start();
			}
		}
	}
	
}
