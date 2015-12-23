package il.ac.shenkar.todo_app.Model.TaskItemEnums;


public enum TaskCategory {
    CLEANING("Cleaning", 0),
    ELECTRICITY("Electricity", 1),
    COMPUTERS("Computers", 2),
    GENERAL("General", 3),
    OTHER("Other", 4);

    private String stringValue;
    private int intValue;

    private TaskCategory(String toString, int value) {
        stringValue = toString;
        intValue = value;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}
