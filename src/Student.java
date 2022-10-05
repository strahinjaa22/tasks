public class Student {
    private String name;
    private int age;
    private int semesterNo;
    private double gpa;
    private static double sum = 0.0;

    public Student(String firstName, int age, int semester, double gpa) {
        this.name = firstName;
        this.age = age;
        this.semesterNo = semester;
        this.gpa = gpa;
        this.sum = getGpa() + sum;
    }

    public double getSum(){
        return sum;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge() {
        this.age = age;
    }

    public int getSemesterNo() {
        return semesterNo;
    }
    public void setSemesterNo() {
            this.semesterNo = semesterNo;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa() {
            this.gpa = gpa;
    }
}
