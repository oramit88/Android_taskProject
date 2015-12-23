package il.ac.shenkar.todo_app.Model;

import java.util.List;


public interface IDataAccess {
    List<TaskItem> GetTasksList();
    void SetTaskItem(TaskItem item);
}
