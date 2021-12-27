package honda;
import java.util.Scanner;
public class honda{
	public static void main(String[] args){
		jbi j=new jbi();
		j.agriloan();
		j.bikeloan();
		j.loan();
		
	}
}
abstract class rbi{
	//public int a;
	//rbi(int a){
		
	//}
	
	public void loan(){
		System.out.println("abstract class loan");
	}
	protected void bikeloan(){
		System.out.println("abstract class bike loan");
	}
	
	abstract void educationloan();
	abstract void agriloan();
}

class jbi extends rbi{

	void educationloan(){
		
	}
	
	void agriloan(){
		
	}
}