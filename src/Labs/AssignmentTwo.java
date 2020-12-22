package Labs;

public class AssignmentTwo {
    public static void main(String[] args) {
        Student student = new Student("Test", "123456789");
        student.enroll("math");
        student.enroll("politics");
        student.enroll("swimming");

        student.checkBalance();
        student.showCourses();
        student.pay(1000);
        student.checkBalance();
        System.out.println(student.toString());
    }
}

class Student{
    private String name;
    private String ssn;
    private String emailId;
    private static int id = 1000;
    private String userId;
    public String courses = "";
    private static final int cost = 800;
    private int balance = 0;
    private String phone;
    private String city;
    private String state;


    public Student(String name, String ssn){
        id++;
        this.name = name;
        this.ssn = ssn;
        setUserId();
        setEmailId();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private void setEmailId(){
        emailId = name.toLowerCase() + id + "@testschool.com";
        System.out.println("email: " + emailId);
    }

    private void setUserId(){
        int max = 9000;
        int min = 1000;
        int random = (int) (Math.random()*(max - min));
        random = random + min;
        userId = id + "" + random + ssn.substring(5);
        System.out.println("user id: " + userId);
    }

    public void enroll(String course){
        this.courses = this.courses + " " + course;
        System.out.println("you are newly enrolled in " + course);
        balance = balance + cost;
    }

    public void pay(int amount){
        balance = balance - amount;
        System.out.println("you paid: " + amount);
    }

    public void checkBalance(){
        System.out.println("you owe: " + balance);
    }

    public void showCourses(){
        System.out.println("you are currently enrolled in " + courses);

    }

    @Override
    public String toString(){
        return "[name: " + name + "]\n[courses: " + courses + "]\n[balance: " + balance + "]";
    }
}
