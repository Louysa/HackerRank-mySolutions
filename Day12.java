public class Day12 {
    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }

    }

    class Student extends Person {
        private int[] testScores;

        Student(String firstName, String lastName, int idNumber, int[] testScores) {
            super(firstName, lastName, idNumber);
            this.testScores = testScores;
        }
    }
}
