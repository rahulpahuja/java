package com.rahul.pahuja.day3;

//Ex 3.5
public class GenericArray<T> {
    T[] a;

    GenericArray(T[] x) {
        a = x;
    }

    T getData(int i) {
        return a[i];
    }

    void printData(T[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
            System.out.println();
        }
    }

    void reverseArray(T[] b) {
        int front = 0, rear = b.length - 1;
        T temp;
        while (front < rear) {
            temp = b[rear];
            b[rear] = a[front];
            a[front] = temp;
            front++;
            rear--;
        }

    }
}

class GenericArrayDemo {
    public static void main(String[] args) {
        Integer[] x = {10, 20, 30, 40, 50};

        GenericArray<Integer> genericArray = new GenericArray<>(x);

        genericArray.printData(x);

        genericArray.reverseArray(x);

        genericArray.printData(x);

        String[] a = {"R", "A", "H", "U", "L"};

        GenericArray<String> genericArrayS = new GenericArray<>(a);

        genericArrayS.printData(a);

        genericArrayS.reverseArray(a);

        genericArrayS.printData(a);


        Double[] z = {1.241, 1.242, 1.243, 1.244, 1.255};

        GenericArray<Double> genericArrayD = new GenericArray<>(z);

        genericArrayD.printData(z);

        genericArrayD.reverseArray(z);

        genericArrayD.printData(z);

    }
}