import java.util.PriorityQueue;


public class Main {

	public static void main(String[] args) {
		String empName;
		  String empId;
		  String salary; 
		
		  String[] data= {"Joye","7","50,000","CSE"};
		  String[] data1={"Aiswarja","8","80,000","ECE"};
		
		  PriorityQueue<String> L1= new PriorityQueue<String>();
		  for(String x:data) {
			  L1.add(x);
			  
		  }
		  System.out.println(L1);
	}

}
