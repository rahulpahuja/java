package com.rahul.pahuja.day3;

//Example 3.1
public class SpecificArrayInt {
    //declaring an array
    int[] a;

    //Construction
    public SpecificArrayInt(int[] a) {
        this.a = a;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        SpecificArrayInt specificArrayInt = new SpecificArrayInt(array);
        specificArrayInt.printInt();
        specificArrayInt.reverseInt();
        System.out.println("Printing reverse of the existing thing");
        specificArrayInt.printInt();
    }

    /**
     * Prints all the elements of the array
     */
    void printInt() {
        for (int x : a) {
            System.out.println(x);
        }

    }

    //Reverses all the elements in the array
    void reverseInt() {
        int j = a.length;
        for (int i = 0; i < j; i++) {
            if (j > i + 1) {
                int temp;
                System.out.println("PRE" + a[i] + ":" + a[j]);
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                System.out.println("POST" + a[i] + ":" + a[j]);

            }
            j--;
        }//eof
    }//eom

    private void swap(int i, int j) {

    }


}
