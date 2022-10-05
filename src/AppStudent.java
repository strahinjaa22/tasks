public class AppStudent {
    public static void main(String[] args) {

        Student[] number = new Student[3];
        number[0] = new Student("Mark", 32,12,2.4);
        number[1] = new Student("John", 23, 5, 2.3);
        number[2] = new Student("Luke", 26, 1,4.5);

        for (int i = 0; i < number.length ; i++) {
                if (number[i].getSemesterNo()>= 0 && number[i].getSemesterNo()<=8) {
                } else {
                    System.out.println("Semester input invalid for student " + number[i].getName() + "! It must be between 0 and 8!");
                }
                if (number[i].getGpa()>=0.0 && number[i].getGpa()<=4.0) {
                } else {
                    System.out.println("GPA input invalid for student " + number[i].getName() + "! It must be between 0.0 and 4.0!");
                }
        }
        for (Student e : number)
            System.out.println("\nName: " + e.getName() + " \nAge: " + e.getAge() + " \nSemester: " + e.getSemesterNo() + "\nGPA: " + e.getGpa());
            System.out.println("\nAverage GPA for these three students is: " + (number[number.length-1].getSum() / number.length));
    }
}
