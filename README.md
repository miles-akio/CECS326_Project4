Miles Shinmachi
Alina Anwar
CECS 326 SEC 02
CECS 326 - Project 4

For Project 4, we are given the topic of CPU Scheduling. In this assignment, we are required to implement and design several classic CPU scheduling algorithms in order to properly execute at the right time.

Thus, the algorithm is split into 4 seperate files: FCFS.java, Priority.java, and RR.java 

For FCFS.java:

    - We created this file to simulate the FCFS scheduling algorithm. Here we create a private list to store the tasks to be scheduled. In addition, we create a public FCFS algorithm which is the constructor to help initialize the FCFS scheduler with a list of tasks. Finally, we add a pixNextTask method so that the task arrives in the order it arrives.

For Priority.java:

    - We created this file to be the non-preemptive priority scheduling algorithm where we import both List and Collection to grow. We then create the Priority constructor to help initialize the Priority scheduler with a list of tasks. In addition, there is a schedule function that implements the overall scheduling that Algorithm.java is being used to do.


For RR.java:

    - We created this file to implement the non-preemptive scheduling algorithm when using the Round Robin method. The overall goal of this file is to run tasks according to round-robin scheduling. In this case, we import Queue, List, LinkedList, and Collections for it to be implemented within this file. We create the overall Round Robin function which implements the Algorithm.java work so that creates a copy of the tasks queue for sorting and will schedule forever until the quantum time is greater than 0.


Overall, when running the program, you would need to run RoadController to simulate the program. 

    - Once it runs, the program will output the correct solution which is represented in the instructions
    - Once the correct output is shown, the program itself will stop 

