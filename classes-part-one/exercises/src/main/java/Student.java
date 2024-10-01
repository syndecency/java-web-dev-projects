public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        public Student(String aName, int aStudentId) {
                this.name = aName;
                this.studentId = aStudentId;
        }

        public void setNumberOfCredits(int aNumber) {
                this.numberOfCredits = aNumber;
        }

        public void setGpa(double aGpa) {
                this.gpa = aGpa;

        }

        public String getName() {
                return name;
        }

        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
