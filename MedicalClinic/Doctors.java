package MedicalClinic;

public class Doctors {
    private String doctorName;
    private int age;
    private int registrationID;
    private int salary;


    public Doctors(String doctorName, int age, int regigistrationID, int salary) {
        this.doctorName = doctorName;
        this.age = age;
        this.registrationID = regigistrationID;
        this.salary = salary;
    }

    public Doctors() {

    }


    public void setDoctorName(String doctorname) {
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setRegistrationID(int registrationID) {
        this.registrationID = registrationID;
    }

    public int getRegistrationID() {
        return registrationID;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("World is a beautiful");
        }
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        if (salary >= 100 && salary <= 1000)
            this.salary = salary;
    }
        else {
            System.out.println("Set correct value");
    }

    public int getSalary() {
        return salary;
    }
}