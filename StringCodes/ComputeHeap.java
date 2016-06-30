
public class ComputeHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b =null;
		Runtime r= Runtime.getRuntime();
		
		System.out.println("Total Memory "+r.totalMemory());
		System.out.println("Free Memory "+r.freeMemory());
		System.out.println("Used Memory "+(r.totalMemory()-r.freeMemory()));
		long startTime = System.currentTimeMillis();
		for(long i = 1 ; i<=200000; i++){
		//	b= "Hello"+i;
			b = new String("Hello");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Memory "+r.totalMemory());
		System.out.println("Free Memory "+r.freeMemory());
		System.out.println("Used Memory "+(r.totalMemory()-r.freeMemory()));
		System.out.println("Total Time Taken "+(endTime-startTime));

	}

}
