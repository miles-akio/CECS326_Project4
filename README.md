Miles Shinmachi
Alina Anwar
CECS 326 SEC 02
CECS 326 - Project 4

For Project 4, we are given the topic of CPU Scheduling. In this assignment we are required to implement and design several classic CPU scheduling algorithms in order to properly execute at the right tim.

Thus, the algorithm is split into 6 seperate files: FCFS.java, Priority.java, RR.java, Algorithm.java, CPU.java, and Task.java. 

For FCFS.java:

    - We created this file to simulate the FCFS scheduling algorithm. Here we create a private list to store the tasks to be scheduled. In addition, we create a public FCFS algorithm which is the constructor to help initialize the FCFS scheduler with a list of tasks. Finally, we add a pixNextTask method so that the task arrives in the order it arrives.

For Priority.java:

    - We created this file to be the non-preemptive priority scheduling algorithm where we import both List and Collection to grow. We then create the Priority constructor to help initialize the Priority scheduler with a list of tasks. In addition, there is a schedule function which implements the overall scheduling that Algorithm.java is being used to do.


For RR.java:

    - We created this file to implement the non-preemptive scheduling algorith when using the Round Robin method. The overall goal if this file is to run tasks according to round-robin scheduling. In this case, we import Queue, List, LinkedList and Collections for it to be implemented within this file. We create the overall Round Robin function which implements the Algorithm.java work so that creates a copy of tasks queue for sorting and will schedule forever until the quantum time is greater than 0.

For Algorithm.java: 

    - We created this file to be used as the interface which is represented as a generic scheduling algoritm where it invokes the scheduler function & selects the next task using the appropriate scheduling algorithm as well as the pickNextTask algorithm.

For CPU.java:

    - We created this file to be used as the "Virtual" CPU where it maintains the system time. Within the CPU class we run the specified task for the specified slice of time where it prints out the statement "Will run" along with the value of the task time.

For Task.java:

    - We created this file to be represnting of the task that is to be scheduled by the use of the scheduling algorithm. In this file, each of the public tasks will be represented as a string name, int tid, int priority and int burst whih are unique information to help distinguish each task being passed into the program. 


Overall, when running the program, you would need to run RoadController to simulate the program. 

    - Once it runs, the program will output the correct solution which is represented in the instructions
    - Once the correct output is shown, the program itself will stop 

