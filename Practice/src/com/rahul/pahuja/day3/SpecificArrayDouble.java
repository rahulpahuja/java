package com.rahul.pahuja.day3;

//Example 3.2
public class SpecificArrayDouble {
    //declaring an array
    double[] a;

    //Construction
    public SpecificArrayDouble(double[] a) {
        this.a = a;
    }

    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5};
        SpecificArrayDouble specificArrayDouble = new SpecificArrayDouble(array);
        specificArrayDouble.printDouble();
        specificArrayDouble.reverseDouble();
        System.out.println("Printing reverse of the existing thing");
        specificArrayDouble.printDouble();
    }

    /**
     * Prints all the elements of the array
     */
    void printDouble() {
        for (double x : a) {
            System.out.println(x);
        }

    }

    //Reverses all the elements in the array
    void reverseDouble() {
        int j = a.length;
        for (int i = 0; i < j; i++) {
            if (j > i + 1) {
                double temp;
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
