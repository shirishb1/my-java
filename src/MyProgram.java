public class MyProgram{
    public static void main(String[] args){
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
        System.out.println(maxrange);
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
    }
}
