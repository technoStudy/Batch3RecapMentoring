package Lesson16_Encapsulation;

/*
OOP principals

Abstraction
Polymorphism
Inheritance
Encapsulation

Why to encapsulate
  - to protect data
  - to prevent inconsistencies

 */

public class Student {
    private int schoolId;

    public Student(int schoolId){
        this.schoolId = schoolId;
    }

    public int getSchoolId() {
        return schoolId;
    }

}

class AnotherClass {
    public static void main(String[] args) {
        Student student = new Student(36);
        System.out.println(student.getSchoolId());  // it has only getter, that is, read-only
    }

}

