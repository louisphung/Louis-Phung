public class Main {
    static int adding(int[] arr , int num){
        int[] arr1 = new int[arr.length+1];
        int j = 0;
        arr1[arr1.length-1] = num;
        for (j = 0; j< arr.length; j++){
            arr1[j]= arr[j];
            System.out.println(j + " "+ arr[j]);
        }
        System.out.println("5 " + num);
        return 0;
    }

    static int deleting(int[] arr){
        int[] arr2= new int[arr.length-1];
        int j = 0;
        for (j = 0; j< arr2.length; j++){
            arr2[j]= arr[j];
            System.out.println(j+ " "+arr2[j]);
        }
        return 0;
    }

    static int inserting(int[] arr , int position, int num ){
        int[] arr1 = new int[arr.length+1];
        int j = 0;
        System.out.print("num: "+num);
        System.out.println("   position: "+ position);
        for (j= arr1.length-1; j> position; j--){
            arr1[j] = arr[j-1];
            //System.out.println(j+" "+ arr1[j]);
        }
        arr1[position] = num;
        //System.out.println(position+" "+ num);
        for (j=0; j< position; j++){
            arr1[j] = arr[j];
            //System.out.println(j+" "+arr1[j]);
        }
        for (j=0; j<arr1.length; j++){
            System.out.println(j+ " "+ arr1[j]);
        }
        return 0;
    }

    public static void main(String[] args){
        int[] arr= new int[5];
        int random=0;
        int i;
        for (i = 0; i<arr.length; i++){
            random= (int)(Math.random()*100+1);
            arr[i] = random;
            System.out.println(i + " "+ arr[i]);
        }

        System.out.println("Problem 1: Adding a number to the array");
        System.out.println(adding(arr,100));
        System.out.println("Problem 2: Deleting the last value");
        System.out.println(deleting(arr));
        System.out.println("Problem 3: Inserting the number into the index position");
        System.out.println(inserting(arr,1, 900));
    }
}
