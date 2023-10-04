import java.util.Scanner;

class Student {
    long studentNumber;
    long phoneNumber;
    String name;
    String major;

    void getStudentNumber(long studentNumber) {
            this.studentNumber = studentNumber;
        }
    void getName(String name) {
        this.name = name;
    }
    void getMajor(String major) {
        this.major = major;
    }
    void getPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    long setStudentNumber(){
        return studentNumber;
    }
    String setName() {
        return name;
    }
    String setMajor() {
        return major;
    }
    String setPhoneNumber() {
        String phoneNumber2;
        String lastPhoneNumber;
        phoneNumber2 = Long.toString(this.phoneNumber);
        lastPhoneNumber = "010-" + phoneNumber2.substring(2,6) + "-" + phoneNumber2.substring(6,10);
        return lastPhoneNumber;
    }
}


public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            long studentNumber = sc.nextLong();
            String name = sc.next();
            String major = sc.next();
            long phoneNumber = sc.nextLong();

            Student student = new Student();
            student.getStudentNumber(studentNumber);
            student.getName(name);
            student.getMajor(major);
            student.getPhoneNumber(phoneNumber);

            students[i] = student;
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (Student student : students) {
            System.out.println("입력된 학생들의 정보는 다음과 같습니다." + student.setStudentNumber()+ " " + student.setName()+ " " + student.setMajor() + " " + student.setPhoneNumber());

        }
    }

}