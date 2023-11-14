class Course {
    protected String code;
    protected String name;
    public Course(String c, String n) {
        this.code = c;
        this.name = n;
    }
    public String getCode() { return code; }
    public String getName() { return name; }
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name;
    }
}
class OnlineCourse extends Course{
    public OnlineCourse(String c, String n) {
        super(c, n);
    }

    @Override
    public String toString(){
        return super.toString() + ", Type: Online";
    }

}
class OfflineCourse extends Course {
    public OfflineCourse(String c, String n) {
        super(c,n);
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Offline";
    }

}


public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201","Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012","C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}