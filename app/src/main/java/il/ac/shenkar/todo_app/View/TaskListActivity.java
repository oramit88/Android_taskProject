package il.ac.shenkar.todo_app.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;

import il.ac.shenkar.todo_app.Controller.ITasksController;
import il.ac.shenkar.todo_app.Controller.TaskController;
import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskAccept;
import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskCategory;
import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskPriority;
import il.ac.shenkar.todo_app.Model.TaskItemEnums.TaskStatus;
import il.ac.shenkar.todo_app.R;
import il.ac.shenkar.todo_app.Model.TaskItem;
import il.ac.shenkar.todo_app.Model.TasksAdapter;


public class TaskListActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ITasksController controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        controller = new TaskController();
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new TasksAdapter(controller.GetTasksList());
        mRecyclerView.setAdapter(mAdapter);


        Button addNewTaskButton = (Button)this.findViewById(R.id.AddTaskButton);
        addNewTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   // what will happen when we click ADD NEW TASK
                Intent addTaskActivity = new Intent(v.getContext(), CreateTaskActivity.class);
                startActivityForResult(addTaskActivity, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            String taskItemText = data.getStringExtra("taskItemText").toString();
            controller.AddItemToList(new TaskItem(taskItemText, TaskStatus.WAITING, TaskPriority.NORMAL,
                    TaskAccept.WAITING, TaskCategory.GENERAL, "newMember", "15/05/2016", "Shenkar"));
        }
    }

}
