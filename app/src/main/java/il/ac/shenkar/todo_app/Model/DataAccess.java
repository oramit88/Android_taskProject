package il.ac.shenkar.todo_app.Model;

import java.util.ArrayList;
import java.util.List;

import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskAccept;
import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskCategory;
import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskPriority;
import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskStatus;


public class DataAccess implements IDataAccess {
    private static DataAccess instance;
    private List<TaskItem> tasksList;


    public DataAccess()
    {
        this.tasksList = new ArrayList<TaskItem>();
    }


    public static DataAccess getInstance()
    {
        if(instance ==  null)
            instance = new DataAccess();
        return instance;
    }


    public List<TaskItem> GetTasksList() {
        return CreateTasksList();
    }

    public List<TaskItem> CreateTasksList() {
        TaskItem taskItem1 = new TaskItem("Buy coffee", TaskStatus.WAITING, TaskPriority.LOW,
                TaskAccept.ACCEPT, TaskCategory.CLEANING, "Or", "01/01/2016", "Shenkar");
        tasksList.add(taskItem1);

        TaskItem taskItem2 = new TaskItem("Do my homework", TaskStatus.DONE, TaskPriority.NORMAL,
                TaskAccept.REJECT, TaskCategory.COMPUTERS, "Keren", "01/02/2016", "Shenkar");
        tasksList.add(taskItem2);

        TaskItem taskItem3 = new TaskItem("Clean my apartment", TaskStatus.IN_PROGRESS, TaskPriority.URGENT,
                TaskAccept.WAITING, TaskCategory.ELECTRICITY, "Walker", "01/03/2016", "Shenkar");
        tasksList.add(taskItem3);

        return tasksList;
    }

    public void SetTaskItem(TaskItem item)
    {
        tasksList.add(item);
    }

}
