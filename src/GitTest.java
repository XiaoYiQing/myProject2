
public class GitTest {
	
	private int i,j;
	private double z;
	
	public static void main(String[]args){
		System.out.println("Hi There!");
		
		System.out.println("Welcome to the jungle");
		
		//LOL
		
		System.out.println("Awesome");
		
		//This is br3 only, and we are testing whether pulling from master 
		//branch will affect this comment.
		
		System.out.println("br2 last change");
	}
	
	public GitTest(int i){
		this.i = i;
	}
	
	public GitTest(int i, double z){
		this.i = i;
		this.z = z;
	}
	
	public GitTest(int i, int j){
		this.j = j;
		this.i = i;	
	}
	
	public GitTest(int i, int j, double z){
		this.i = i;
		this.j = j;
		this.z = z;
	}
	
}
