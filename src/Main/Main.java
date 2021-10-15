package Main;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {4,8,3,10,17};//n elements
        System.out.println(aufgabe_1(numbers));
        System.out.println(aufgabe_2(numbers));
        System.out.println(aufgabe_3(numbers));
        System.out.println(aufgabe_4(numbers));

    }

    public static int aufgabe_1(int [] numbers){
        //returns the maximal value of the array
        //Input: int[]
        //Output: int
        int max_val=numbers[0]; 
        for(int value:numbers){
            if(value>max_val)
                max_val=value;
        }
        return max_val;
    }

    public static int aufgabe_2(int [] numbers){
        //returns the minimal value of the array
        //Input: int[]
        //Output: int
        int min_val=numbers[0];
        for(int value:numbers){
            if(value<min_val)
                min_val=value;
        }
        return min_val;
    }

    public static int aufgabe_3(int [] numbers){
        //returns the sum of the maximal n-1 elements
        //Input: int[]
        //Output: int
        int sum=0;
        for(int value:numbers){
            sum+=value;
        }
        sum-=aufgabe_2(numbers);
        return sum;
    }

    public static int aufgabe_4(int [] numbers){
        //returns the sum of the minimal n-1 elements
        //Input: int[]
        //Output: int
        int sum=0;
        for(int value:numbers){
            sum+=value;
        }
        sum-=aufgabe_1(numbers);
        return sum;
    }
}
