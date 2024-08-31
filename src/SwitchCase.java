public class SwitchCase {
    public static void main(String[] args){
        int mySwitchValue = 6;
        switch(mySwitchValue){
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3:
                System.out.println("The value is 3");
                break;
            case 4: case 5: case 6:
                System.out.println("The value is 4 or 5 or 6");
                break;
            default:
                System.out.println("A default value");
        }
    }
}
