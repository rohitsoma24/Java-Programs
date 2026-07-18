package Java.interviewpgms;

public class secondlargestInArray {

    public static void main(String[] args) {
        int[] a = {20, 30, 10, 5, 15, 40};

        // Fix 1: Initialize to the minimum possible value
        int L = Integer.MIN_VALUE;
        int secondL = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > L) {
                secondL = L;
                L = num;
            }
            // Fix 2: Handle numbers smaller than L but larger than secondL
            else if (num > secondL && num != L) {
                secondL = num;
            }
        }

        System.out.println("Print 2nd largest number - " + secondL);
    }
}
