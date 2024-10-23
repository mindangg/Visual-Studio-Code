#include <iostream>
using namespace std;

struct Process {
    int id;         // ID của tiến trình
    int arrivalTime; // Thời gian đến của tiến trình
    int burstTime;   // Thời gian thực thi của tiến trình
    int waitingTime; // Thời gian chờ
    int turnaroundTime; // Thời gian hoàn thành
};

void findWaitingTime(Process proc[], int n) {
    proc[0].waitingTime = 0;  // Tiến trình đầu tiên không cần chờ

    // Tính thời gian chờ cho các tiến trình tiếp theo
    for (int i = 1; i < n; i++) {
        proc[i].waitingTime = proc[i-1].waitingTime + proc[i-1].burstTime;
    }
}

void findTurnaroundTime(Process proc[], int n) {
    // Thời gian hoàn thành = Thời gian thực thi + Thời gian chờ
    for (int i = 0; i < n; i++) {
        proc[i].turnaroundTime = proc[i].burstTime + proc[i].waitingTime;
    }
}

void findAvgTime(Process proc[], int n) {
    int totalWaitingTime = 0, totalTurnaroundTime = 0;

    findWaitingTime(proc, n);
    findTurnaroundTime(proc, n);

    cout << "Process\tArrival Time\tBurst Time\tWaiting Time\tTurnaround Time\n";

    for (int i = 0; i < n; i++) {
        totalWaitingTime += proc[i].waitingTime;
        totalTurnaroundTime += proc[i].turnaroundTime;
        cout << proc[i].id << "\t" << proc[i].arrivalTime << "\t\t" 
             << proc[i].burstTime << "\t\t" << proc[i].waitingTime 
             << "\t\t" << proc[i].turnaroundTime << endl;
    }

    cout << "Average waiting time = " << (float)totalWaitingTime / n << endl;
    cout << "Average turnaround time = " << (float)totalTurnaroundTime / n << endl;
}

int main() {
    Process proc[] = {{1, 0, 10}, {2, 1, 5}, {3, 2, 8}};
    int n = sizeof(proc) / sizeof(proc[0]);

    findAvgTime(proc, n);

    return 0;
}
