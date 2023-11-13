/**
 * FCFS scheduling algorithm.
 */
import java.util.List;

public class FCFS implements Algorithm 
{

  // List to store the tasks to be scheduled
  private List<Task> taskList;

  // Constructor to initialize the FCFS scheduler with a list of tasks
  public FCFS(List<Task> taskList) 
  {
    this.taskList = taskList;
  }

  @Override
  public void schedule() 
  {
    System.out.println("FCFS Scheduling Algorithm\n");

    // Loop through the task list in the order they arrive 
    for (int i = 0; i < taskList.size(); i++) 
    {
      Task task = taskList.get(i); // Get the current task from the list

      CPU.run(task, task.getBurst()); // Get the burst time from the CPU
      
      System.out.println("Task " + task.getName() + " finished.\n");
    }
  }

  // We add pickNextTask method because Algorithm.java requires it otherwise we don't need it because the tasks arrive in the order they arrive. 
  @Override
  public Task pickNextTask() 
  {
    return null;
  }
}
