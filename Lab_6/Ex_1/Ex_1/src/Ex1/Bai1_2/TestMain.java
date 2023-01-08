package Ex1.Bai1_2;

public class TestMain {
    public static void main(String[] args) {
        Person person = new Person("A", "Thanh Xuân");
        System.out.println(person);
        person.setAddress("Cầu Giấy");
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        System.out.println();

        // test student
        Student student = new Student("B", "Ba Đình", "MT&KHTT", 2019, 5.0);
        System.out.println(student);

        student.setProgram("MT&KHTT CLC");
        student.setYear(2020);
        student.setFee(15.0);
        System.out.println(student);
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        System.out.println(student.getFee());
        System.out.println();

        // test staff
        Staff staff = new Staff("C", "Cầu Giấy", "ULIS", 8.0);
        System.out.println(staff);

        staff.setSchool("USSH");
        staff.setPay(8.5);
        System.out.println(staff);
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());



    }
}
