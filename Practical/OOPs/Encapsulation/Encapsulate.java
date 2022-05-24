package corejava;

public class Encapsulate {

	public static void main(String[] args) {
	//Creating Object of Encapsulation Class
		Encapsulation e = new Encapsulation();
		
	//Setting Value of Variable
		e.setName("Anuja");
		e.setRollno(182590);
		e.setAge(20);
		
	//Displaying Value of The Variable
		System.out.println("Name: "+ e.getName());
		System.out.println("Roll No.: "+ e.getRollno());
		System.out.println("Age: "+ e.getAge());
		
	}

}