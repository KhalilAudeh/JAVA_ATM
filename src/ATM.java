
public class ATM {
private Screen s;
private CardReader cr;
private CashDispenser cd;
private DepositSlot ds;
private KeyPad k;
private BankServices bs;
ATM(){
}
public ATM(Screen s, CardReader cr, CashDispenser cd, DepositSlot ds, BankServices bs) {
	this.s = s;
	this.cr = cr;
	this.cd = cd;
	this.ds = ds;
	this.bs = bs;
}
public void withradaw2(int Amount){
	cd.withradaw(Amount);
}
public void deposit2(int Amount){
	ds.depositMoney(Amount);
}
}
