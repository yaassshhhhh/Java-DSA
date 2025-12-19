
public class Smallest_Number {
    public static int SmallestNum(int numbers[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
        public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Smallest number in this given array is : "+SmallestNum(numbers));
    }
}
