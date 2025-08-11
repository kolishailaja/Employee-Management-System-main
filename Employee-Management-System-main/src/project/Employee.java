package project;

/**
 * <b>Employee class</b> </br>
 * The main Work of this class is to store the employee details and hide it from
 * getting any details.
 * 
 * @author Prathamesh
 *
 */
public class Employee {
    private String fname, mname, lname, address, id;
    private int salary, age, postID;
    private String postName;

    // Constructor for add
    public Employee(String fname, String mname, String lname, String address, int salary, int age, String postName) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.address = address;
        this.salary = salary;
        this.age = age;
        this.postName = postName;
    }

    // Constructor for update
    public Employee(String fname, String mname, String lname, String address, int salary, int age, String postName, String id) {
        this(fname, mname, lname, address, salary, age, postName);
        this.id = id;
    }

    // Getters
    public String getFname() { return fname; }
    public String getMname() { return mname; }
    public String getLname() { return lname; }
    public String getAddress() { return address; }
    public int getSalary() { return salary; }
    public int getAge() { return age; }
    public String getID() { return id; }
    public String getPostName() { return postName; }
    public int getPostID() { return postID; } // You may need to set this based on your DB logic
}
