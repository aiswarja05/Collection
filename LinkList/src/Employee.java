import java.util.LinkedList;
import java.util.List;

public class Employee {
	  public static void main(String[] args) {
		  String empName;
		  String empId;
		  String salary;
		  String department;
		
		  String[] data= {"Joye","7","50,000","CSE"};
		  String[] data1={"Aiswarja","8","80,000","ECE"};
		
		  LinkedList<String> list1= new LinkedList<String>();
		  
		 
		 list1.addFirst("M");
		 list1.addLast("a");
		 list1.addLast("b");
		 list1.add("L");
		 //list1.removeFirst();
		 list1.getFirst();
		 list1.get(1);
		 
		 System.out.println(list1);
		 System.out.println(list1.subList(1, 4));
		 
		 list1.subList(2, 4);
		//list1.add(data1);
		 

}
	  
	  public void removeFromTo(int from,int to,LinkedList<String> list1) {
		  list1.subList(from, to);
			 
		}
}
