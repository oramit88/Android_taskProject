package il.ac.shenkar.todo_app.Controller;

import java.util.List;

import il.ac.shenkar.todo_app.Model.TaskItem;


public interface ITasksController {
    List<TaskItem> GetTasksList();
    void AddItemToList(TaskItem item);
}
