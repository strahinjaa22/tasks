public class AppStudent {
    public static void main(String[] args) {

        double sum = 0.0;
        int validGpaStudents = 0;
        Student[] list = new Student[3];
        list[0] = new Student("Mark", 32,3,2.0);
        list[1] = new Student("John", 23, 5, 2.0);
        list[2] = new Student("Luke", 26, 1,4.0);

        for (int i = 0; i < list.length ; i++) {
                if (list[i].getSemesterNo()>= 0 && list[i].getSemesterNo()<=8) {
                    if (list[i].getGpa()>=0.0 && list[i].getGpa()<=4.0) {
                        sum += list[i].getGpa();
                        validGpaStudents++;
                    } else {
                        System.out.println("GPA input invalid for student " + list[i].getName() + "! It must be between 0.0 and 4.0!");
                    }
                } else {
                    System.out.println("Semester input invalid for student " + list[i].getName() + "! It must be between 0 and 8!");
                    System.out.println("Please enter a valid semester for student " + list[i].getName());
                }
        }
        for (Student s : list)
            System.out.println("\nName: " + s.getName() + " \nAge: " + s.getAge() + " \nSemester: " + s.getSemesterNo() + "\nGPA: " + s.getGpa());
            System.out.println("\nAverage GPA for these " + validGpaStudents +" students is: " + (sum/validGpaStudents));
    }
}
