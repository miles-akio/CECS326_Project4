/**
 * Non-preemptive priority scheduling algorithm using RR.
 *
 * This algorithm will run tasks according to round-robin scheduling.
 */

import java.util.Queue;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class RR implements Algorithm 
{
  private Queue<Task> taskQueue;
  private final int q_time = 10; // Quantum time is 10 as per the instructions 

  public RR(List<Task> tasks) 
  {
    this.taskQueue = new LinkedList<>(tasks);
  }

  @Override
  public void schedule() 
  {
    System.out.println("Non-preemptive Priority Scheduling with RR\n");

    // Create a copy of the task queue for sorting
    List<Task> sortedTasks = new LinkedList<>(taskQueue);
    Collections.sort(sortedTasks, (task1, task2) -> task2.getPriority() - task1.getPriority());

    // Loop until all tasks are scheduled
    while (!sortedTasks.isEmpty()) {
      Task curr_task = sortedTasks.remove(0); // Get the task with the highest priority
      int remainBurstTime = curr_task.getBurst(); //get remaining burst time 

      // Round Robin Scheduling with the quantum time as 10
      while (remainBurstTime > 0) 
      {
        int executionTime = Math.min(remainBurstTime, q_time); //we use min to ensure the burst time is not greater than the quantum time
        CPU.run(curr_task, executionTime); // Use CPU to print
        remainBurstTime -= executionTime;

        // Print remaining burst time
        System.out.println("Remaining Burst Time for Task " + curr_task.getName() + ": " + remainBurstTime);
      }

      System.out.println("Task " + curr_task.getName() + " finished.\n");
    }
  }

  @Override
  public Task pickNextTask() 
  {
    if (!taskQueue.isEmpty()) //checks for the tasks in the Queue 
    {
      return taskQueue.peek(); //returns the tasks at the front of the Queue
    }
    return null;
  }
}
