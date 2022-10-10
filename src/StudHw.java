public class StudHw {
    private String name;
    private int age;
    private int semesterNo;
    private double gpa;

    public StudHw() {
        this.setName(name);
        this.setAge(age);
        this.setSemesterNo(semesterNo);
        this.setGpa(gpa);
    }

    @Override
    public String toString() {
        return "\nStudent name: " + this.name + "\nStudent age: " + this.age + "\nSemester: " + this.semesterNo + "\nGPA: " + this.gpa;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setSemesterNo(int semesterNo) {

        if (semesterNo>=0 && semesterNo<=8) {
            this.semesterNo = semesterNo;
        } else {
            this.semesterNo = -999;
            System.out.println("Error! Semester number must be between 0 and 8!");
        }
    }
    public int getSemesterNo() {
        return this.semesterNo;
    }

    public void setGpa(double gpa) {

        if (gpa >=0.0 && gpa <=4.0) {
            this.gpa = gpa;
        } else {
            this.gpa = -999.99;
            System.out.println("Error! GPA number must be between 0.0 and 4.0");
        }
    }
    public double getGpa(){
        return this.gpa;
    }
}
