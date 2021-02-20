package com.rahul.pahuja.day3;

public class StringReversal {
    String value;

    public StringReversal(String value) {
        this.value = value;
    }

    String reverseStringByCharacter() {

        String result ="";
        if(value!=null&&value.length()>0){
            for (int i = value.length()-1; i >-1 ; i--) {
                result +=value.charAt(i);
            }
        }

        return result;
    }//eom

    /**
     * Prints all the elements of the array
     */
    void printString() {
        System.out.println(value);

    }

    public static void main(String[] args) {
        StringReversal stringReversal =  new StringReversal("Rahul");
        stringReversal.printString();
        String reverse = stringReversal.reverseStringByCharacter();
        System.out.println("The reverse of the String is "+reverse);
    }
}
