public class DoWhile {
    public static void main(String[] args) {
        //   int count = 1;
//        while(count != 10){
//            System.out.println("The count is: " + count);
//            count++;
//        }
//        for(count = 1; count <= 10; count++){
//            System.out.println("The count is: " + count);
//        }

//        while (true){
//            if (count == 6){
//                break;
//            }
//            System.out.println("The count is: " + count);
//            count++;
//        }
        //same logic with the do-while  loop

//        do{
//            System.out.println("The count is: " + count);
//            count++;
//
//        }while(count != 6);

        // write a method to predict an odd number, if odd return true else return false.
        //in the main using the while loop print all the odd numbers from 5 to 30.
        int number = 5;
        int maxvalue = 29;
        while (number <= maxvalue){
            number ++;
            if (! OddNumberCheck(number)){
                continue;
            }
            System.out.println("The odd number is: " + number);
        }

        boolean check = OddNumberCheck(3);
        System.out.println(check);
    }

    public static boolean OddNumberCheck(int number){
        if ((number % 2) == 1){
            return true;

        } else {
            return false;
        }
    }
}
