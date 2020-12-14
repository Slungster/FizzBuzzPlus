public class Hiker {

    public static void printNumbers() {
        boolean multipleThree;
        boolean multipleFive;
        for(int i=0; i <= 100; i++){
            multipleThree= multipleOrContainsThree(i);
            multipleFive= multipleOrContainsFive(i);

            if (!multipleThree && !multipleFive) {System.out.println(i);}

        }
    }

    public static boolean multipleOrContainsThree(int value) {
        if( (value%3 == 0) || (String.valueOf(value).contains("3"))){
            System.out.println("...Fizz...");
            return true;
        }
        return false;
    }

    public static boolean multipleOrContainsFive(int value) {
        if( (value%5 == 0) || (String.valueOf(value).contains("5"))){
            System.out.println("...Buzz...");
            return true;
        }
        return false;

    }

}
