import java.util.Scanner;

public class FCFS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] burstTime = new int[n];
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];

        // Input Burst Times
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Burst Time for Process P" + (i + 1) + ": ");
            burstTime[i] = sc.nextInt();
        }

        // Calculate Waiting Time
        waitingTime[0] = 0;

        for (int i = 1; i < n; i++) {
            waitingTime[i] = waitingTime[i - 1] + burstTime[i - 1];
        }

        // Calculate Turnaround Time
        for (int i = 0; i < n; i++) {
            turnaroundTime[i] = waitingTime[i] + burstTime[i];
        }

        // Display Results
        System.out.println("\nProcess\tBurst Time\tWaiting Time\tTurnaround Time");

        double totalWT = 0;
        double totalTAT = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(
                    "P" + (i + 1) + "\t\t" +
                            burstTime[i] + "\t\t" +
                            waitingTime[i] + "\t\t" +
                            turnaroundTime[i]);

            totalWT += waitingTime[i];
            totalTAT += turnaroundTime[i];
        }

        System.out.println("\nAverage Waiting Time = " + (totalWT / n));
        System.out.println("Average Turnaround Time = " + (totalTAT / n));

        sc.close();
    }
}