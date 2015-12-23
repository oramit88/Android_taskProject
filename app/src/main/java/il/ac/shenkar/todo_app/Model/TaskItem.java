package il.ac.shenkar.todo_app.Model;

import java.text.SimpleDateFormat;

import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskPriority;
import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskAccept;
import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskCategory;
import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskStatus;


public class TaskItem {
    private String taskName;
    private TaskStatus taskStatus;
    private TaskPriority taskPriority;
    private TaskAccept taskAccept;
    private TaskCategory taskCategory;
    private String member;
    private SimpleDateFormat dueDate;
    private String location;


    public TaskItem(String taskItemText, TaskStatus taskStatus, TaskPriority taskPriority, TaskAccept taskAccept,
                     TaskCategory taskCategory, String member, String dueDateStr, String location)
    {
        super();
        this.taskName = taskItemText;
        this.taskStatus = taskStatus;
        this.taskPriority = taskPriority;
        this.taskAccept = taskAccept;
        this.taskCategory = taskCategory;
        this.member = member;
        this.location = location;

        SimpleDateFormat simpleDate = new SimpleDateFormat(dueDateStr);
        this.dueDate = simpleDate;
    }


    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskAccept getTaskAccept() {
        return taskAccept;
    }

    public void setTaskAccept(TaskAccept taskAccept) {
        this.taskAccept = taskAccept;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public TaskCategory getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(TaskCategory taskCategory) {
        this.taskCategory = taskCategory;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public SimpleDateFormat getDueDate() {
        return dueDate;
    }

    public void setDueDate(SimpleDateFormat dueDate) {
        this.dueDate = dueDate;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }
}




















