package il.ac.shenkar.todo_app.Controller;

import java.util.List;

import il.ac.shenkar.todo_app.Model.DataAccess;
import il.ac.shenkar.todo_app.Model.IDataAccess;
import il.ac.shenkar.todo_app.Model.TaskItem;


public class TaskController implements ITasksController {
    private IDataAccess dataAccessObject;

    public TaskController() { dataAccessObject = DataAccess.getInstance(); }

    public List<TaskItem> GetTasksList() {
        return dataAccessObject.GetTasksList();
    }

    public void AddItemToList(TaskItem item)
    {
        dataAccessObject.SetTaskItem(item);
    }

}
