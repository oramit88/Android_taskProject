package il.ac.shenkar.todo_app.Model.TaskItemEnums;


public enum TaskAccept {
    WAITING("Waiting", 0),
    ACCEPT("Accept", 1),
    REJECT("Reject", 2);

    private String stringValue;
    private int intValue;

    private TaskAccept(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}
