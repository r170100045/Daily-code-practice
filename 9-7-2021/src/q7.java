
public class q7 {

	public static void main(String[] args) {
			int limit = 500;
			int var = 2;
			int a, b, c =0;
			while(var<limit) {
				for(int i=1; i<var; i++) {
					a = var*var - i*i;
					b = 2*i*var;
					c = i*i + var*var;
					if(c>limit) {
						break;
					}
					System.out.println(a + " " + b + " " + c);
				}
				var++;
			}
	}

}
