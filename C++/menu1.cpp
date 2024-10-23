#include <iostream>
#include <algorithm>
#include <queue>
using namespace std;

struct Process {
    int id;          
    int burstTime;     
    int arrivalTime;    
    int priority;       
    int remainingTime;  
    int waitingTime;   
    int turnaroundTime; 
};

void FCFS(Process proc[], int n) {
    proc[0].waitingTime = 0;
    for (int i = 1; i < n; i++) {
        proc[i].waitingTime = proc[i-1].waitingTime + proc[i-1].burstTime;
    }

    for (int i = 0; i < n; i++) {
        proc[i].turnaroundTime = proc[i].waitingTime + proc[i].burstTime;
    }

    cout << "\nFCFS Scheduling:\n";
    cout << "Process\tBurst Time\tWaiting Time\tTurnaround Time\n";
    for (int i = 0; i < n; i++) {
        cout << proc[i].id << "\t\t" << proc[i].burstTime << "\t\t" 
             << proc[i].waitingTime << "\t\t" << proc[i].turnaroundTime << endl;
    }
}


bool compareBurst(Process a, Process b) {
    return a.burstTime < b.burstTime;
}

void SJF(Process proc[], int n) {
    sort(proc, proc + n, compareBurst);
    proc[0].waitingTime = 0;
    for (int i = 1; i < n; i++) {
        proc[i].waitingTime = proc[i-1].waitingTime + proc[i-1].burstTime;
    }

    for (int i = 0; i < n; i++) {
        proc[i].turnaroundTime = proc[i].waitingTime + proc[i].burstTime;
    }

    cout << "\nSJF Scheduling:\n";
    cout << "Process\tBurst Time\tWaiting Time\tTurnaround Time\n";
    for (int i = 0; i < n; i++) {
        cout << proc[i].id << "\t\t" << proc[i].burstTime << "\t\t" 
             << proc[i].waitingTime << "\t\t" << proc[i].turnaroundTime << endl;
    }
}


bool comparePriority(Process a, Process b) {
    return a.priority < b.priority;
}

void PriorityScheduling(Process proc[], int n) {
    sort(proc, proc + n, comparePriority);
    proc[0].waitingTime = 0;
    for (int i = 1; i < n; i++) {
        proc[i].waitingTime = proc[i-1].waitingTime + proc[i-1].burstTime;
    }

    for (int i = 0; i < n; i++) {
        proc[i].turnaroundTime = proc[i].waitingTime + proc[i].burstTime;
    }

    cout << "\nPriority Scheduling:\n";
    cout << "Process\tBurst Time\tPriority\tWaiting Time\tTurnaround Time\n";
    for (int i = 0; i < n; i++) {
        cout << proc[i].id << "\t\t" << proc[i].burstTime << "\t\t" 
             << proc[i].priority << "\t\t" << proc[i].waitingTime 
             << "\t\t" << proc[i].turnaroundTime << endl;
    }
}


void RoundRobin(Process proc[], int n, int quantum) {
    queue<int> readyQueue;
    int currentTime = 0;

    for (int i = 0; i < n; i++) {
        readyQueue.push(i);
        proc[i].remainingTime = proc[i].burstTime;
        proc[i].waitingTime = 0;
    }

    while (!readyQueue.empty()) {
        int i = readyQueue.front();
        readyQueue.pop();

        if (proc[i].remainingTime > quantum) {
            currentTime += quantum;
            proc[i].remainingTime -= quantum;
            readyQueue.push(i);
        } else {
            currentTime += proc[i].remainingTime;
            proc[i].remainingTime = 0;
            proc[i].turnaroundTime = currentTime;
            proc[i].waitingTime = proc[i].turnaroundTime - proc[i].burstTime;
        }
    }

    cout << "\nRound Robin Scheduling:\n";
    cout << "Process\tBurst Time\tWaiting Time\tTurnaround Time\n";
    for (int i = 0; i < n; i++) {
        cout << proc[i].id << "\t\t" << proc[i].burstTime << "\t\t"
             << proc[i].waitingTime << "\t\t" << proc[i].turnaroundTime << endl;
    }
}

int main() {
    int choice, n, quantum;
    Process proc[100];

    do {
        cout << "\nCPU Scheduling Algorithms\n";
        cout << "1. FCFS (First Come First Served)\n";
        cout << "2. SJF (Shortest Job First)\n";
        cout << "3. Priority Scheduling\n";
        cout << "4. Round Robin\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;
        if (choice == 5) {
            break;
        }

        cout << "Enter number of processes: ";
        cin >> n;

        for (int i = 0; i < n; i++) {
            proc[i].id = i + 1;
            cout << "Enter burst time for process " << proc[i].id << ": ";
            cin >> proc[i].burstTime;

            if (choice == 3) {
                cout << "Enter priority for process " << proc[i].id << ": ";
                cin >> proc[i].priority;
            }
        }

        if (choice == 4) {
            cout << "Enter time quantum for Round Robin: ";
            cin >> quantum;
        }

        switch (choice) {
            case 1:
                FCFS(proc, n);
                break;
            case 2:
                SJF(proc, n);
                break;
            case 3:
                PriorityScheduling(proc, n);
                break;
            case 4:
                RoundRobin(proc, n, quantum);
                break;
            default:
                cout << "Invalid choice!\n";
                break;
        }

    } while (choice != 5);

    cout << "Exiting program...\n";
    return 0;
}
