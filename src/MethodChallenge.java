public class MethodChallenge {
    public static void main(String[] aregs){
        String studentname = "shirish bandari";
        int studentMarks = 84;
        char studGrade = gradeCalculator(studentMarks);
        displaydetails(studentname, studGrade);
    }
    public static char gradeCalculator(int Marks) {
        char Grade;
        if (Marks > 90 && Marks <= 100){
            Grade = 'S';
        } else if (Marks > 80 && Marks <= 90){
            Grade = 'A';

        } else if (Marks > 70 && Marks <= 80){
            Grade = 'B';

        }else {
            Grade = 'F';
        }
        return Grade;
    }
    public static void displaydetails(String Name,char studentGrade){
        System.out.println("The student Name is : " + Name + ". He Scored a Grade : " + studentGrade);
    }
}
