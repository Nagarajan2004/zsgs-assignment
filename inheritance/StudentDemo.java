package inheritance;

class Student {
    private String name;
    private int age;
    private long phoneNo;
    private String address;

    public Student(String name, int age,long phoneNo,String address) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public long getPhoneNo(){
        return phoneNo;
    }
    public String getAddress(){
        return  address;
    }
}


class ZSGSStudent extends Student {
    private int rollNumber;

    public ZSGSStudent(String name, int age,long phoneNo,String address, int rollNumber) {
        super(name, age, phoneNo, address);
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
    	ZSGSStudent student1 = new ZSGSStudent("nagarajan", 20, 9847283472L, "120-1, 1st street, tenkasi", 19);
    	ZSGSStudent student2 = new ZSGSStudent("hari bala", 21, 6847323373L, "120-1, 1st street, tenkasi", 30);
    	ZSGSStudent student3 = new ZSGSStudent("krishnamoorthy", 21, 9977379268L, "120-1, 1st street, tenkasi", 38);
    	ZSGSStudent student4 = new ZSGSStudent("gowtham", 21, 6847283499L, "120-1, 1st street, tenkasi", 15);
    	
    	System.out.println("Student name : " +student1.getName());
    	System.out.println("age : " +student1.getAge());
    	System.out.println("rool number : "+student1.getRollNumber());
    	System.out.println("phone Number : " +student1.getPhoneNo());
    	System.out.println("address : " + student1.getAddress());
    	System.out.println();
    	System.out.println("Student name : " +student2.getName());
    	System.out.println("age : " +student2.getAge());
    	System.out.println("rool number : "+student2.getRollNumber());
    	System.out.println("phone Number : " +student2.getPhoneNo());
    	System.out.println("address : " + student2.getAddress());
    	System.out.println();
    	System.out.println("Student name : " +student3.getName());
    	System.out.println("age : " +student3.getAge());
    	System.out.println("rool number : "+student3.getRollNumber());
    	System.out.println("phone Number : " +student3.getPhoneNo());
    	System.out.println("address : " + student3.getAddress());
    	System.out.println();
    	System.out.println("Student name : " +student4.getName());
    	System.out.println("age : " +student4.getAge());
    	System.out.println("rool number : "+student4.getRollNumber());
    	System.out.println("phone Number : " +student4.getPhoneNo());
    	System.out.println("address : " + student4.getAddress());

    }
}
