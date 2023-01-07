package com.example.myapplication

fun main(){
    var todoclass= Todo()
    var Task1:Task = Task(1,"Ahmed"," prepare for EA exam")
    var Task2: Task = Task (2,"Aljohara"," study enterprise architecture", true)
    var Task3: Task = Task (3,"Reema"," study human computer interaction", true)
    var Task4: Task = Task (4,"Khaled"," continue enterprise architecture")


  todoclass.addTasks(Task1)
  todoclass.addTasks(Task2)
  todoclass.addTasks(Task3)
  todoclass.addTasks(Task4)

    todoclass.showTasks()

   todoclass.specificTask(3)
    todoclass.specificTask(6)

    todoclass.removeTask(Task4)
    todoclass.changetask(Task1)
    todoclass.changetask(Task2)
    todoclass.showTasks()



}

 class Todo() {
     // class has an array property called tasks of type (Task) which has a private set
      var tasks = arrayListOf<Task>()
         private set

// add task, parameter of type task (method)
    fun addTasks(added_Task:Task){
        tasks.add(added_Task)
    println("task with id: ${added_Task.id} have been added")

    }
// Show all the tasks (method)
     fun showTasks() {
    println("-------------------------------------------------")
         println("The tasks are")
         for (t in tasks)
             println(t)
     }
// Print specific task, one parameter of type Int (method)
     fun specificTask(idnum :Int){
    println("-------------------------------------------------")
         for (i in tasks) {
             if (idnum == i.id) {
                 println("the task is ${i} has been found")
                  return
             }
         }
         println("${idnum} task id doesn't exist ")
     }


     // Remove task, parameter of type task (method)
     fun removeTask(removedTask: Task){
         println("-------------------------------------------------")
         println("tasks number before removing elements is:${tasks.size}")
             tasks.remove(removedTask)
         println("${removedTask} has been removed")
         println("tasks number after removing an element is: ${tasks.size}")
     }

     // change task, parameter of type task (method)
     fun changetask(changedtask: Task){
         println("-------------------------------------------------")
         if (changedtask.isCompleted==false)
             changedtask.isCompleted = true
         else
             changedtask.isCompleted= false

          for (i  in tasks)
               if (i==changedtask)(
                       println("task with id: ${changedtask.id} have changed " +
                               "status to ${changedtask.isCompleted}")

                       )
     }





 }
// Create (Task) data class that holds these values : id, name, note, iscompleted has a default value of false
data class Task(
    val id: Int,
    val name: String,
    var note: String,
    var isCompleted: Boolean = false
)


