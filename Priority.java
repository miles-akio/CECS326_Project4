/**
 * Non-preemptive priority scheduling algorithm.
 */

import java.util.List;
import java.util.Collections;

public class Priority implements Algorithm 
{
  private List<Task> task_list; // List to store the tasks to be scheduled

  // Constructor to initialize the Priority scheduler with a list of tasks
  public Priority(List<Task> task_list) 
  {
    this.task_list = task_list;
  }

  //We implement schedule because Algorithm.java requires it
  @Override
  public void schedule() 
  {
    System.out.println("Non-preemptive Priority Scheduling Algorithm\n");

    //Sort the task list by priority in descending order
    Collections.sort(task_list, (task1, task2) -> task2.getPriority() - task1.getPriority());

    //Loop through the sorted task list to execute tasks in priority order
    for (int i = 0; i < task_list.size(); i++) 
    {
      Task task = task_list.get(i); //Get the current task from the sorted list

      CPU.run(task, task.getBurst());//Run the task on the CPU for its burst time

      // Print a message indicating that the task has finished
      System.out.println("Task " + task.getName() + " finished.\n");
    }
  }

  // We add pickNextTask method because Algorithm.java requires it 
  @Override
  public Task pickNextTask() 
  {
    return null;
  }
}
