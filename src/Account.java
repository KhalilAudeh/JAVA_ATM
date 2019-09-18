public class Account {
	private int id;
	private Date openDate;
	private Person p;
	private double balance;

	Account() {
	}

	public Account(int id, Date openDate, Person p, double balance) {
		this.id = id;
		this.openDate = openDate;
		this.p = p;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {

		this.p = p;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return "Account [id=" + id + ", openDate=" + openDate.toString() + ", p=" + p.toString() + ", balance=" + balance + "]";
	}

}
