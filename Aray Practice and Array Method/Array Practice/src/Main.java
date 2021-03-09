public class Main {
    public static void main(String args[]){
        int i;
        int random;
        System.out.println("Problem 1:"); //Problem 1
        int count = 0;
        int[] arr1 = new int[20];
        for (i = 0; i <arr1.length; i++){
            random = (int)(Math.random()*6+1);
            if (random == 1){
                count = count + +1;
            }
            arr1[i]= random;
            System.out.println(i+ " "+ random);
        }
        System.out.println("The number 1 in this array are: "+ count);

        System.out.println();
        System.out.println("Problem 2:");//Problem 2
        int sum = 0;
        int swap = 0;

        int[] arr2 = new int[10];
        for (i = 0; i < arr2.length; i++){
            random = (int)(Math.random()*100+1);
            arr2[i] = random;
            sum= sum + random;
            System.out.println(i +" "+ arr2[i]);
        }
        swap = arr2[0]; // Problem 3
        arr2[0] = arr2[1];
        arr2[1] = swap;
        System.out.println("The average is: "+sum+ "/10 = "+ sum/10);
        System.out.println("Problem 3: Swaping position 0 and 1:");
        System.out.println("0 "+ arr2[0]);
        System.out.println("1 "+ arr2[1]);

        System.out.println("Problem 4");
        int[] arr3 = new int[10];
        int j=0;
        i = 0;
        int z=0;
        for (j = arr3.length-1; j>= 0 ; j--){
            arr3[j] = arr2[i++];
            System.out.println(j + " "+ arr3[j]);
        }
    }
}
