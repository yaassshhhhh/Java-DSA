public class diamond {
    public static void diamondshape(int n){
        // 1st half
        for(int i=1;i<=n;i++){
            // print spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // print stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.err.println();
        }
        // 2nd half (exact reverse of first half)
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.err.println();
        }
        
    }
    public static void main(String args[]){
        diamondshape(4);
    }
}
