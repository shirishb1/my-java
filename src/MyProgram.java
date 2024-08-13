public class MyProgram{
    public static void main(String[] args){
        //variables
        int first = 10;
        int second = (20+30) - (6/2) * 3;
        int sum = first + second;
        System.out.println(first);
        System.out.println(second);
        System.out.println(sum);
        int third = 10*3*4-2;
        System.out.println(third);
        int sum1 = sum + third;
        System.out.println(sum1);
        System.out.println(first + second + third + sum + sum1);
        int maxrange = Integer.MAX_VALUE;
        int minrange = Integer.MIN_VALUE;
        System.out.println("integer range " + maxrange);
        System.out.println(minrange);
        int sum2 = maxrange + 1;
        int sum3 = minrange - 1;
        System.out.println(sum2);
        System.out.println(sum3);
        byte maxvalue = Byte.MAX_VALUE;
        byte minvalue = Byte.MIN_VALUE;
        System.out.println("byte max value is : " + maxvalue);
        System.out.println("byte min value is : " + minvalue);
        short maxval = Short.MAX_VALUE;
        short minva = Short.MIN_VALUE;
        System.out.println("short max value is : " + maxval);
        System.out.println("short min value is : " + minva);
        long maxval1 = Long.MAX_VALUE;
        long minval1 = Long.MIN_VALUE;
        System.out.println("long max value is : " + maxval1);
        System.out.println("long min value is : " + minval1);
        byte newbytevalue = maxvalue;
        System.out.println(newbytevalue);
        byte newbytevalue2 = (byte) (maxvalue/2);
        System.out.println(newbytevalue2);

// datatypes
        int a = 10;
        byte b = 15;
        short c = 5;
        long longsum = 1000 * (a + b + c);
        System.out.println(longsum);
        short shortsum = (short) (1000 * (a + b + c));
        System.out.println(shortsum);
        float maxval2 = Float.MAX_VALUE;
        float minval2 = Float.MIN_VALUE;
        System.out.println("float max value is : " + maxval2);
        System.out.println("float min value is : " + minval2);
        double maxval3 = Double.MAX_VALUE;
        double minval3 = Double.MIN_VALUE;
        System.out.println(maxval3);
        System.out.println(minval3);
        char mychar = 'a';
        System.out.println(mychar);

        boolean amIabove18 = false;
        if (amIabove18 == true){
            System.out.println("You are eligible to vote");
        }
        if (amIabove18 == false){
            System.out.println("You are not eligible to vote");
        }

        String myname = "shirish";
        String myage = "22";
        String myplace = "Hyderabad";
        System.out.println(myname);
        System.out.println(myage);
        System.out.println(myplace);

        String myinfo = myname +" " + myage +" " + myplace;
        System.out.println(myinfo);
        int d = 1 + 2;
        int value = 10;
        value = value + 10;
        System.out.println(value);
        value = value - 10;
        System.out.println(value);
        value = value * 10;
        System.out.println(value);
        value ++;
        System.out.println(value);
        value --;
        System.out.println(value);
        System.out.println("hi");
        // logical operators
        int bodyTemp = 97;
        if (bodyTemp >= 97){
            System.out.println("You have fever");
        }
        int e = 50;
        int f =  70;
        if ((a <= 50) && (b <= 70)){           // AND operator
            System.out.println("All good");
        }

        int g = 90;
        int h = 100;
        if ((g == 90) || (h > 100)){           // OR operator
            System.out.println("It's all good");
        }
        boolean isitSunday = false;
        if (!isitSunday){                       // NOT operator
            System.out.println("It is not Sunday");
        }
        // Assignment vs Equal operator
        int mobilePrice = 500;
        if (mobilePrice == 450 || mobilePrice >= 500){
            System.out.println("It is under my budget");
        }
        boolean isCold = true;
        if (isCold == true){
            System.out.println("Yes it is cold");
        }
        // Ternary operator
        boolean isMarch = false;
        boolean isNoofDay31 = isMarch ? true : false;
        if (!isNoofDay31) {
            System.out.println("Days are not 31");
        }
        int heightoftruck = 50;
        boolean TruckAllowed =heightoftruck == 50 ? true : false;
        if (TruckAllowed){
            System.out.println("You can cross the bridge");
        }
        // Operator precedence and challenge
        int length = 15;
        int breadth = 10;
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the Triangle is : " + perimeter);

        // Keywords And Expressions
        double myValue = 10;
        System.out.println(myValue);

        int int5 = 10;
        System.out.println("I am expression");

        float area = 100 * 25;

        if (area == 2500){

            System.out.println("This is the area");
        }

        //if-else statement
        int StudentScore = 76;
        if (StudentScore == 100){
            System.out.println("You got 'S' grade");
        } else if (StudentScore > 90 && StudentScore < 100){
            System.out.println("You got 'A' grade");
        } else if (StudentScore > 75 && StudentScore < 90){
            System.out.println("You got 'B' grade");
        } else if (StudentScore > 65 && StudentScore < 75){
            System.out.println("You got 'C' grade");
        } else {
            System.out.println("You Failed");
        }
        // Methods in Java




        myDetails();
        System.out.println("this is a test");
        myDetails();
        System.out.println("Test 2");


        perimeterofRect( length = 10, breadth = 20);
        perimeterofRect( length = 20, breadth = 20);
        //speedofobject(d = 100,e = 10 );
        double topspeed =  speedofobject(d = 100, e = 20);
        double x = 40 * topspeed;
        System.out.println(x);
    }
    public static void myDetails(){
        String myName = "my name is Shirish";
        int age = 22;
        double height = 5.12;
        System.out.println(myName);
        System.out.println(age);
        System.out.println(height);

    }
    public static void perimeterofRect(int length, int breadth){
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the rectangle is : " + perimeter);
    }
    public static double speedofobject(double d, double e){
        if (d == 100) {


            double speed = d / e;
            // System.out.println("Speed is " + speed);
            return speed;

        }else{
            return 0;
        }
    }
}
