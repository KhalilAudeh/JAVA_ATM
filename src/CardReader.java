import java.util.Scanner;
public class CardReader {
private String type;
private int pinCard;
public CardReader(String type, int pinCard) {
	this.type = type;
	this.pinCard = pinCard;
}
public CardReader(){
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getPinCard() {
	return pinCard;
}
public void setPinCard(int pinCard) {
	this.pinCard = pinCard;
}
public void checkingSecurity(String type, int Pincode){
	Scanner scan = new Scanner(System.in);
	int a = 1;
	while(a<3){
	if(type.equals(getType()) && Pincode==getPinCard()){
		System.out.println("Welcome to our ATM.");
		a=4;
	}
	else if(!type.equals(getType())){
		System.out.println("Sorry, you are not allowed to access to our ATM.");
		a=4;
	}
	else if(Pincode!=getPinCard()){
		System.out.println("Wrong Pin code, you still have 1 more opportunity: ");
		Pincode = scan.nextInt();
		a+=1;
	}
	scan.close();
	}
}
}
