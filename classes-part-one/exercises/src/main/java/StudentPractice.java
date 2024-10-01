public class StudentPractice {
    public static void main(String[] args){
        Student kelly = new Student("Kelly Turner", 12345);
        kelly.setNumberOfCredits(1);
        kelly.setGpa(4.0);
        System.out.println(kelly.getStudentId());
    }
}
