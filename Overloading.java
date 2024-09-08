public class Overloading {
    public static void main(String[] ags){
        String Name = "Shirish";
        int age = 22;
        char Grade = "A";
        double height = 179.5;
        DisplayDetails(Name, age, Grade, Height);
    }
    public static void DisplayDetails(String UserName, int UserAge, char Grade, double height){
        System.out.println("The name is : " + UserName + ". the age is : " + UserAge + ". The grade is : " + Grade + ". The height is : " + height);

    }
}
