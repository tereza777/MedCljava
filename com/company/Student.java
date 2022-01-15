package com.company;

public class Student {
    private String firstname;
    private String email;
    private int age;

    public void setAge(int age) {
        if (age >= 18 && age <= 22) {
            this.age = age;
        } else
            System.out.println("Set the value");
    }

    public int getAge() {
        return age;
    }

    public void setFirstname(String firstname) {
        boolean check = true;
        for (int i = 1; i < firstname.length(); i++) {
            if (firstname.charAt(i) < 'a' || firstname.charAt(i) > 'z') {
                check = false;
                break;
            }
            if (firstname.charAt(0) < 'A' || firstname.charAt(0) > 'Z') {
                check = false;
                break;
            }
        }
        if (check) {
            this.firstname = firstname;
        } else {
            System.out.println("The name will not contain symbols and capital letters and will start capital letter");
        }
    }

    public String getFirstName() {
        return firstname;
    }

}
