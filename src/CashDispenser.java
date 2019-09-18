
public class CashDispenser {
private int CurrentMoney;

public CashDispenser(int currentMoney) {
	
	CurrentMoney = currentMoney;
}
public CashDispenser(){
	
}
public int getCurrentMoney() {
	return CurrentMoney;
}
public void setCurrentMoney(int currentMoney) {
	CurrentMoney = currentMoney;
}
public void withradaw(int Amount){
	if(Amount==getCurrentMoney() || Amount<getCurrentMoney()){
		System.out.println("You still have: " + (getCurrentMoney() - Amount) + "\nAnd you took: " + Amount);
	}
	else {
		System.out.println("You can't withradaw this amount, bye.");
	}
}
}
