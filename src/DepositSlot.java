
public class DepositSlot {
private int currentMoney;
public DepositSlot(int currentMoney) {
	this.currentMoney = currentMoney;
}
public DepositSlot(){
	
}
public int getCurrentMoney() {
	return currentMoney;
}
public void setCurrentMoney(int currentMoney) {
	this.currentMoney = currentMoney;
}
public void depositMoney(int Amount){
	if(Amount<10){
		System.out.println("You can't deposit this amount");
	}
	else{
		System.out.println("You just added: " + Amount + " on your account" + "\nYou currently have: " + ( getCurrentMoney() + Amount ));
	}
}
}
