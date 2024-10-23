#include <bits/stdc++.h>
using namespace std;

struct Process {
    int id;          
    int arrivalTime;  
    int burstTime;     
    int waitingTime; 
    int turnaroundTime; 
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


void FCFS()
{
    Process proc[] = {{1, 0, 10}, {2, 1, 5}, {3, 2, 8}};
    int n = sizeof(proc) / sizeof(proc[0]);

    findAvgTime(proc, n);
}


bool compareBurstTime(Process a, Process b) {
    return a.burstTime < b.burstTime;
}


void findAverageTime(Process proc[], int n) {
    findWaitingTime(proc, n);
    findTurnaroundTime(proc, n);

    // Tính tổng thời gian chờ và tổng thời gian hoàn thành
    int totalWaitingTime = 0, totalTurnaroundTime = 0;

    cout << "\nProcess\tBurst Time\tWaiting Time\tTurnaround Time\n";
    for (int i = 0; i < n; i++) {
        totalWaitingTime += proc[i].waitingTime;
        totalTurnaroundTime += proc[i].turnaroundTime;

        cout << proc[i].id << "\t\t" << proc[i].burstTime << "\t\t" 
             << proc[i].waitingTime << "\t\t" << proc[i].turnaroundTime << endl;
    }

    cout << "\nAverage Waiting Time: " 
         << (float)totalWaitingTime / n << endl;
    cout << "Average Turnaround Time: " 
         << (float)totalTurnaroundTime / n << endl;
}



void SJF()
{
        int n; // Số lượng tiến trình

    cout << "Enter number of processes: ";
    cin >> n;

    Process proc[n]; // Tạo mảng các tiến trình

    // Nhập thời gian đến và thời gian thực thi cho từng tiến trình
    for (int i = 0; i < n; i++) {
        proc[i].id = i + 1;
        cout << "Enter burst time for process " << proc[i].id << ": ";
        cin >> proc[i].burstTime;
    }

    // Sắp xếp các tiến trình theo thời gian thực thi
    sort(proc, proc + n, compareBurstTime);

    // Tính và in kết quả
    findAverageTime(proc, n);


}






struct Process {
    int id;            // ID của tiến trình
    int burstTime;      // Thời gian thực thi của tiến trình
    int priority;       // Mức độ ưu tiên (số nhỏ hơn nghĩa là ưu tiên cao hơn)
    int waitingTime;    // Thời gian chờ
    int turnaroundTime; // Thời gian hoàn thành
};


bool comparePriority(Process a, Process b) {
    return a.priority < b.priority;
}



void Priority()
{
    int n;
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
}

void RoundRobin()
{
    
}



























int main()
{
    int choice = 1;
    cout<<"1. First Come First Serve\n";
    cout<<"2. Shortest Job First\n";
    cout<<"3. Priority Scheduling\n";
    cout<<"4. First Come First Serve\n";
    cin>>choice;

    switch (choice)
    {
    case 1:
        FCFS();
        break;
    case 2:
        SJF();
        break;
    case 3:
        Priority();
        break;
    case 4:
        RoundRobin();
        break;

    default:
        break;
    }
}