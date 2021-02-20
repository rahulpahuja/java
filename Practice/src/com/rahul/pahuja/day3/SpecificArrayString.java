package com.rahul.pahuja.day3;

//Example 3.3
public class SpecificArrayString {


    //declaring an array
    String[] a;

    //Construction
    public SpecificArrayString(String[] a) {
        this.a = a;
    }

    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5"};
        SpecificArrayString specificArrayString = new SpecificArrayString(array);
        specificArrayString.printString();
        specificArrayString.reverseString();
        System.out.println("Printing reverse of the existing thing");
        specificArrayString.printString();

    }

    /**
     * Prints all the elements of the array
     */
    void printString() {
        for (String x : a) {
            System.out.println(x);
        }

    }

    //Reverses all the elements in the array
    void reverseString() {
        int j = a.length;
        for (int i = 0; i < j; i++) {
            if (j > i + 1) {
                String temp;
                System.out.println("PRE" + a[i] + ":" + a[j]);
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                System.out.println("POST" + a[i] + ":" + a[j]);

            }
            j--;
        }//eof
    }//eom


}
