package il.ac.shenkar.todo_app.Model.TaskItemEnums;


public enum TaskStatus {
    WAITING("Waiting", 0),
    IN_PROGRESS("In Progress", 1),
    DONE("Done", 2);

    private String stringValue;
    private int intValue;

    private TaskStatus(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}
