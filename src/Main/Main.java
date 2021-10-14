package Main;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {4,8,3,10,17};
        System.out.println(aufgabe_1(numbers));
        System.out.println(aufgabe_2(numbers));

    }

    public static int aufgabe_1(int [] numbers){
        //returns the maximal value of the array
        int max_val=numbers[0];
        for(int value:numbers){
            if(value>max_val)
                max_val=value;
        }
        return max_val;
    }

    public static int aufgabe_2(int [] numbers){
        //returns the minimal value of the array
        int min_val=numbers[0];
        for(int value:numbers){
            if(value<min_val)
                min_val=value;
        }
        return min_val;
    }

}
