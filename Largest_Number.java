public class Largest_Number {
    public static int LargestNum(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity (lowest value)

        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                // update largest
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = { 1,2,4,5,6,8,9 };
        System.out.println("Largest number in this given array is :"+LargestNum(numbers));
    }
}
