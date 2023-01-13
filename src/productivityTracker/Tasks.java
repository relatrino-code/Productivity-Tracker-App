/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productivityTracker;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Aditya Khandelwal
 */

class Task{
    String t=new String();
    boolean x=false;
}
public class Tasks {
    
        Scanner myObj = new Scanner(System.in);

    ArrayList<Task> tasks = new ArrayList<>();
    Task s=new Task();
    public void add_task()
    {
        
        s.t = "";
        s.x = false;
        tasks.add(s);
    }
   // int n=tasks.size();
    // Task s1=new Task();
    
    public String get_task(int i)
    {
        //  s1=tasks.get(i);
               return tasks.get(i).t;
                    
                      
    }
}
