package il.ac.shenkar.todo_app.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import il.ac.shenkar.todo_app.R;

public class CreateTaskActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);
        final Button taskButton = (Button)this.findViewById(R.id.createTaskButton);

        // category combobox
        Spinner spinner = (Spinner)findViewById(R.id.taskSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.taskCategory_array,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        taskButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.taskName);
                String newTodoText = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("taskItemText", newTodoText);
                setResult(1, intent);
                finish();
            }
        });
    }
}










