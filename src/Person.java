public class Person {
private String fName;
private String lName;
public Person(){
}
public Person(String fName,String lName){
	this.fName = fName;
	this.lName = lName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getfName() {
	return fName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getlName() {
	return lName;
}
public String toString() {
	return "Kindly Enter your first name: "+getfName() + "and last name: "+getlName();
	}
}
