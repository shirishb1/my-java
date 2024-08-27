public class Overloading {
    public static void main (String[] args){
        String Name  = "Shirish";
        int Age = 22;
        char Grade = 'A';
        double Height = 179.5;
        DisplayDetails(Name, Age, Grade, Height);
        DisplayDetails(Name, Age, Grade);
        DisplayDetails(Name, Age);
        DisplayDetails(Name);
        DisplayDetails(Grade, Age);
        DisplayDetails();
    }
    public static void DisplayDetails(String UserName, int UserAge, char Grade, double Height){
        System.out.println("The name is: " + UserName + ". The age is: " + UserAge + ". The grade is:" + Grade + ". The height is:" + Height);
    }
    public static void DisplayDetails(String UserName, int UserAge, char Grade){
        System.out.println("The name is: " + UserName + ". The age is: " + UserAge + ". The grade is:" + Grade);
    }
    public static void DisplayDetails(String UserName, int UserAge){
        System.out.println("The name is: " + UserName + ". The age is: " + UserAge);
    }
    public static void DisplayDetails(String UserName){
        System.out.println("The name is: " + UserName);
    }
    public static void DisplayDetails(char Grade, int UserAge){
        System.out.println("The grade is: " + Grade + ". The age is" + UserAge);
    }
    public static void DisplayDetails(){
        System.out.println("I know nothing");
    }
}
