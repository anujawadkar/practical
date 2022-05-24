package corejava;

class SimpleInheritance {
	public void print() {
		System.out.println("Anuja");	
	}
}
class SimpleOne extends SimpleInheritance {
	public void show() {
		System.out.println("Wadkar");
	}
}

class SimpleInheritance1{
	
	public static void main(String[] args) {		
		SimpleOne s= new SimpleOne();
		s.print();
		s.show();
		s.print();
		}
}