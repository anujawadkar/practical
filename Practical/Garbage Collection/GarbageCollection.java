package corejava;

public class GarbageCollection {

	
		public void finalize(){System.out.println("garbage collected object");}
		public static void main(String args[]){
			GarbageCollection S1=new GarbageCollection();
		GarbageCollection S2=new GarbageCollection();
		S1=null;
		S2=null;
		System.gc();
		}
		}
	


