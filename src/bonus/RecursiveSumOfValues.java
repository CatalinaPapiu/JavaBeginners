package bonus;

public class RecursiveSumOfValues {

    public static int sum = 0;

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println(sum(array,0));
    }

    public static int sum(int[] array, int index) {
        if (index < array.length) {
            return (array[index] + sum(array, index+1));
        }
        else {
            return sum;
        }
    }
}
