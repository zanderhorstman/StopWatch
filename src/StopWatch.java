/*
Enter a time in minutes.
3
 2:59
 2:58
 2:57
 2:56
...

 0: 3
 0: 2
 0: 1
 0: 0
Time over!
*/


import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a time in minutes: ");
        int time = keybd.nextInt();

        //Our first loop should start at time-1
        for (int i = time-1; i >= 0; i--){
            //Our second for loop should start
            for (int j = 59; j >= 0; j = j - 1) {
                System.out.println("Current time: " + i + ":" + j);
            }

        }
        System.out.println("Time over!");


    }
}

