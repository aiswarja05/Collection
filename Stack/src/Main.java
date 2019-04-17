
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		String empName;
		  String empId;
		  String salary;
		  String department;
		
		  String[] data= {"Joye","7","50,000","CSE"};
		  String[] data1={"Aiswarja","8","80,000","ECE"};
		
		  Stack<String> L1= new Stack<String>();
		  for(String x:data)
		  L1.push(x);
		  System.out.println(L1);
		  L1.pop();
		  System.out.println(L1);
		  L1.pop();
		  System.out.println(L1);
	}

}
