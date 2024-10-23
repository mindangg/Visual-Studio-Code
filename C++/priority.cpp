#include <iostream>
#include <algorithm>
using namespace std;

struct Process {
    int id;            // ID của tiến trình
    int burstTime;      // Thời gian thực thi của tiến trình
    int priority;       // Mức độ ưu tiên (số nhỏ hơn nghĩa là ưu tiên cao hơn)
    int waitingTime;    // Thời gian chờ
    int turnaroundTime; // Thời gian hoàn thành
};

// Hàm so sánh dựa trên mức độ ưu tiên của tiến trình
bool comparePriority(Process a, Process b) {
    return a.priority < b.priority;
}

void findWaitingTime(Process proc[], int n) {
    proc[0].waitingTime = 0; // Tiến trình đầu tiên không cần chờ

    // Tính thời gian chờ cho các tiến trình tiếp theo
    for (int i = 1; i < n; i++) {
        proc[i].waitingTime = proc[i - 1].waitingTime + proc[i - 1].burstTime;
    }
}

void findTurnaroundTime(Process proc[], int n) {
    // Thời gian hoàn thành = Thời gian thực thi + Thời gian chờ
    for (int i = 0; i < n; i++) {
        proc[i].turnaroundTime = proc[i].burstTime + proc[i].waitingTime;
    }
}

void findAverageTime(Process proc[], int n) {
    findWaitingTime(proc, n);
    findTurnaroundTime(proc, n);

    int totalWaitingTime = 0, totalTurnaroundTime = 0;

    cout << "\nProcess\tBurst Time\tPriority\tWaiting Time\tTurnaround Time\n";
    for (int i = 0; i < n; i++) {
        totalWaitingTime += proc[i].waitingTime;
        totalTurnaroundTime += proc[i].turnaroundTime;

        cout << proc[i].id << "\t\t" << proc[i].burstTime << "\t\t" 
             << proc[i].priority << "\t\t" << proc[i].waitingTime 
             << "\t\t" << proc[i].turnaroundTime << endl;
    }

    cout << "\nAverage Waiting Time: " << (float)totalWaitingTime / n << endl;
    cout << "Average Turnaround Time: " << (float)totalTurnaroundTime / n << endl;
}

int main() {
    int n; // Số lượng tiến trình

    cout << "Enter number of processes: ";
    cin >> n;

    Process proc[n]; // Tạo mảng các tiến trình

    // Nhập thời gian thực thi và mức độ ưu tiên cho từng tiến trình
    for (int i = 0; i < n; i++) {
        proc[i].id = i + 1;
        cout << "Enter burst time for process " << proc[i].id << ": ";
        cin >> proc[i].burstTime;
        cout << "Enter priority for process " << proc[i].id << ": ";
        cin >> proc[i].priority;
    }

    // Sắp xếp các tiến trình theo mức độ ưu tiên
    sort(proc, proc + n, comparePriority);

    // Tính và in kết quả
    findAverageTime(proc, n);

    return 0;
}
