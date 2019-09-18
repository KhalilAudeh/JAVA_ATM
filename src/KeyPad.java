public class KeyPad {
public static void Key(){
	for(int i=1;i<10;i++){
		if(i==4){
			System.out.print("-----");
		}
		if(i==7){
			
			System.out.print("Enter");
			
		}
		
		if(i==4||i==7){
			System.out.println();
		}
	
		System.out.print(i+"  ");
	}
	System.out.print("Cancel");
	System.out.println();
	System.out.println("      0" );
}
}
