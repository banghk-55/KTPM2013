public class test() {
		public void giaipt(int a, int b){
			int kq = -b/a;
			return kq;
		}

	 	static void test1(){
	 		int kq = giaipt(1,1);
	 		if(kq == -1)
	 			System.out.println("dung");
	 		else
	 			System.out.println("sai");
	 	}

	 	public static void main(String [] args){
	 		test1();
	 	}
}