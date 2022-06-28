public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //syntax
        //datatype[] variable_name = new datatype[size];
        //store 5 roll numbers:
        int[] rnos = new int[5];
        // and all these 5 elements will be 0 by default
        System.out.println(rnos[0]);//0
        // or directly
        int[] rnos2 = {23,56,12,36,89};
        //int[] this represents the type of data stored in array
        //all elements of array should be of same data type

        int[] ros;
        // declaration of array. ros is getting defined in the stack
        // => happens at compile time
        ros = new int[5];
        //new is used to create an object;
        // initialisation: actual object is being created in the heap memory =>
        // happens at runtime(dynamic memory allocation(DMA))
        //DMA => assigning the memory space during execution time or runtime
        //Array objects in java may not be continuous;

        String[] arr = new String[4];// by default all elements will be null
        System.out.println(arr[0]);//null
    }
}