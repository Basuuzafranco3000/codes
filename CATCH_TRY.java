
public class CATCH_TRY {
	public static void main(String args[]){
		int a[] = new int[2];
		try{
		System .out.println("Access elem ent three :" + a[3]);
		}catch(ArrayIndexOutOfBoundsException e){
		System .out.println("Exception thrown :" + e);
		}
		finally{
		a[0] = 6;
		System .out.println("First elem ent value: " +a[0]);
		System .out.println("The finally statem ent is executed");
		}
		}
		}
