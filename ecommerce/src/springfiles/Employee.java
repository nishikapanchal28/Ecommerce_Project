package springfiles;

public class Employee {
private int id ;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Employee(int x) {
	this.id=x;
	System.out.println("default constructor");
}  
public Employee(int x,String name) {
	this.id=x;
	this.name=name;
	System.out.println("default constructor");
} 
void show(){  
    System.out.println(id+" "+name);  
}
}