#include <iostream>
#include <queue>
using namespace std;

struct Process {
    int id;            // ID của tiến trình
    int burstTime;      // Thời gian thực thi của tiến trình
    int remainingTime;  // Thời gian thực thi còn lại của tiến trình
    int waitingTime;    // Thời gian chờ
    int turnaroundTime; // Thời gian hoàn thành
};

// Hàm tính thời gian chờ và thời gian hoàn thành cho các tiến trình
void findWaitingAndTurnaroundTime(Process proc[], int n, int quantum) {
    queue<int> readyQueue; // Hàng đợi sẵn sàng cho tiến trình
    int currentTime = 0;   // Thời gian hiện tại

    // Đưa tất cả các tiến trình vào hàng đợi
    for (int i = 0; i < n; i++) {
        readyQueue.push(i);
        proc[i].remainingTime = proc[i].burstTime; // Khởi tạo thời gian còn lại
        proc[i].waitingTime = 0;  // Khởi tạo thời gian chờ
    }

    while (!readyQueue.empty()) {
        int i = readyQueue.front(); // Lấy tiến trình ở đầu hàng đợi
        readyQueue.pop();

        // Nếu thời gian thực thi còn lại lớn hơn quantum
        if (proc[i].remainingTime > quantum) {
            currentTime += quantum;
            proc[i].remainingTime -= quantum;
            // Đưa tiến trình trở lại hàng đợi
            readyQueue.push(i);
        } else {
            // Nếu thời gian thực thi còn lại nhỏ hơn hoặc bằng quantum
            currentTime += proc[i].remainingTime;
            proc[i].remainingTime = 0;
            // Tính thời gian hoàn thành và thời gian chờ
            proc[i].turnaroundTime = currentTime;
            proc[i].waitingTime = proc[i].turnaroundTime - proc[i].burstTime;
        }
    }
}

// Hàm tính thời gian trung bình
void findAverageTime(Process proc[], int n, int quantum) {
    findWaitingAndTurnaroundTime(proc, n, quantum);

    int totalWaitingTime = 0, totalTurnaroundTime = 0;

    cout << "\nProcess\tBurst Time\tWaiting Time\tTurnaround Time\n";
    for (int i = 0; i < n; i++) {
        totalWaitingTime += proc[i].waitingTime;
        totalTurnaroundTime += proc[i].turnaroundTime;

        cout << proc[i].id << "\t\t" << proc[i].burstTime << "\t\t"
             << proc[i].waitingTime << "\t\t" << proc[i].turnaroundTime << endl;
    }

    cout << "\nAverage Waiting Time: " << (float)totalWaitingTime / n << endl;
    cout << "Average Turnaround Time: " << (float)totalTurnaroundTime / n << endl;
}

int main() {
    int n, quantum;

    cout << "Enter number of processes: ";
    cin >> n;

    Process proc[n]; // Tạo mảng các tiến trình

    // Nhập thời gian thực thi cho từng tiến trình
    for (int i = 0; i < n; i++) {
        proc[i].id = i + 1;
        cout << "Enter burst time for process " << proc[i].id << ": ";
        cin >> proc[i].burstTime;
    }

    // Nhập giá trị quantum
    cout << "Enter time quantum: ";
    cin >> quantum;

    // Tính và in kết quả
    findAverageTime(proc, n, quantum);

    return 0;
}
