public class StudentList {

    public static void main(String[] args) {

        StudHw studentOne = new StudHw();
        studentOne.setName("Mark");
        studentOne.setAge(33);
        studentOne.setSemesterNo(8);
        studentOne.setGpa(4.3);
        StudHw studentTwo = new StudHw();
        studentTwo.setName("John");
        studentTwo.setAge(23);
        studentTwo.setSemesterNo(8);
        studentTwo.setGpa(2.5);
        StudHw studentThree = new StudHw();
        studentThree.setName("Luke");
        studentThree.setAge(23);
        studentThree.setSemesterNo(8);
        studentThree.setGpa(2.8);

        double average = ((studentOne.getGpa()+studentTwo.getGpa()+ studentThree.getGpa())/3);

        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentThree);
        System.out.println(average);

    }
}
