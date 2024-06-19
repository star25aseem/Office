public abstract class Member {
protected String Name;
public String getName() {
    return Name;
}
public void setName(String name) {
    Name = name;
}
private int Age;
public int getAge() {
    return Age;
}
public void setAge(int age) {
    Age = age;
}
protected String Phone_number;
public String getPhone_number() {
    return Phone_number;
}
public void setPhone_number(String phone_number) {
    Phone_number = phone_number;
}
protected String Address;
public String getAddress() {
    return Address;
}
public void setAddress(String address) {
    Address = address;
}
protected int Salary;

public void setSalary(int salary) {
    Salary = salary;
}
protected int Performance_checker_points;
public void PrintSalary(){
    System.out.print(this.Salary);
}
protected static int Off=0;
 abstract int Off();
 public int Checked_In_Office(){
    System.out.println(this.Name+"has Entered the Office");
    return 0;
 }
 public int Checked_out_Office(){
    System.out.println(this.Name+"has left the Office");
    return 0;
 }
}
