package Java_Task_3;

public class StudentResultAnalyzer {
    public static boolean validateMarks(int mark1, int mark2, int mark3, int mark4, int mark5) {
        return (mark1 >= 0 && mark1 <= 100) &&
                (mark2 >= 0 && mark2 <= 100) &&
                (mark3 >= 0 && mark3 <= 100) &&
                (mark4 >= 0 && mark4 <= 100) &&
                (mark5 >= 0 && mark5 <= 100);
    }

    public static int calculateTotal(int mark1, int mark2, int mark3, int mark4, int mark5) {
        return mark1 + mark2 + mark3 + mark4 + mark5;
    }

    public static double calculateAverage(int totalMarks, int numberOfSubjects) {
        return (double) totalMarks / numberOfSubjects;
    }

    public static char calculateGrade(double averageMark) {
        if (averageMark >= 90) {
            return 'A';
        } else if (averageMark >= 80) {
            return 'B';
        } else if (averageMark >= 70) {
            return 'C';
        } else if (averageMark >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static String checkPerformance(char grade) {
        switch (grade) {
            case 'A':
                return "Excellent";
            case 'B':
                return "Very Good";
            case 'C':
                return "Good";
            case 'D':
                return "Pass";
            default:
                return "Fail";
        }
    }
    public static void displayReport(String studentName,
    int mark1,
    int mark2,
    int mark3,
    int mark4,
    int mark5,
    int totalMarks,
    double averageMark,
    char grade,
     String performanceStatus) {

        System.out.println("========== Student Result Report ==========");
        System.out.println("Student Name      : " + studentName);
        System.out.println("Subject 1 Mark    : " + mark1);
        System.out.println("Subject 2 Mark    : " + mark2);
        System.out.println("Subject 3 Mark    : " + mark3);
        System.out.println("Subject 4 Mark    : " + mark4);
        System.out.println("Subject 5 Mark    : " + mark5);
        System.out.println("Total Marks       : " + totalMarks);
        System.out.println("Average Mark      : " + averageMark);
        System.out.println("Final Grade       : " + grade);
        System.out.println("Performance Status: " + performanceStatus);
    }

    public static void main(String[] args) {

        String studentName = "Ali";
        int subject1 = 85;
        int subject2 = 90;
        int subject3 = 78;
        int subject4 = 88;
        int subject5 = 95;
        int numberOfSubjects = 5;
        if (validateMarks(subject1, subject2, subject3, subject4, subject5)) {
            int totalMarks = calculateTotal(subject1, subject2, subject3, subject4, subject5);
            double averageMark = calculateAverage(totalMarks, numberOfSubjects);
            char grade = calculateGrade(averageMark);
            String performanceStatus = checkPerformance(grade);
            displayReport(studentName,
                    subject1,
                    subject2,
                    subject3,
                    subject4,
                    subject5,
                    totalMarks,
                    averageMark,
                    grade,
                    performanceStatus);

        } else {

            System.out.println("Invalid marks. Please check the student grades.");
        }
    }

}
