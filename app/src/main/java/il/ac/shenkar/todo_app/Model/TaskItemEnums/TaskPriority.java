package il.ac.shenkar.todo_app.Model.TaskItemEnums;


public enum TaskPriority {
    NORMAL("Normal", 0),
    LOW("Low", 1),
    URGENT("Urgent", 2);

    private String stringValue;
    private int intValue;

    private TaskPriority(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}
