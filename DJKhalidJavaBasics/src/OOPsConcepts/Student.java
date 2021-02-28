package OOPsConcepts;

public class Student {
String fn= "";
String ln= "";
int age;

public Student() {
	fn= "";
	ln= "";
	age= 0;
} // above and below are the 2 ways of making constructor
public Student (String firstName, String lastName, int newAge) { //<******* this part is clled the definition of the method
	fn="firstName";
	ln="lastName";
	age= newAge;
}
public Student ( String firstName) {
	fn = firstName;
	ln= "";
	age = 0;
}
public String getFirstName() {
	return fn;
}

}
