public class No32 {

    public static void main(String[] args){
        System.out.println(countOne(115));
    }

    private static long countOne(int n){
        long count = 0;
        long i = 1;
        long current=0;after=0,before=0;

        while((n // i) !=0){
        }}

public class No33{

    public static void main(String[] args){
        int[] array = {321, 32, 3};
        printMin(array);
    }

    private static void printMin(int[] array){
        int[] clone = array.clone();
        printMin(clone, 0, clone.length-1);

        for(int i: clone)
            System.out.println(i);
    }

    private static void printMin(int[] array,int start, int end){

        if (start < end){
            int main_number = array[end]
            int small_cur = start;

            for (int j=start; j<end;j++){
                if (isSmall
