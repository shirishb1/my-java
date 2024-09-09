public class ParsingValues {
    public static void main(String[] args){
        String myString = "2500.215";
        double myDoubleValue = Double.parseDouble(myString);
        System.out.println(myString);
        myString = myString + 1;
        myDoubleValue += 1;
        System.out.println(myString);
        System.out.println(myDoubleValue);
//        int myIntValue = Integer.parseInt(myString);
//        System.out.println(myString);
//        myIntValue = myIntValue + 1;
//        System.out.println("New value: " + myIntValue);
    }
}
