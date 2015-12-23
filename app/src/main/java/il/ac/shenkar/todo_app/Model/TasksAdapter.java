package il.ac.shenkar.todo_app.Model;

import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import il.ac.shenkar.todo_app.R;


public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.ViewHolder> {
    private List<TaskItem> tasksItems;


    public TasksAdapter(List<TaskItem> tasksItems) {
        this.tasksItems = tasksItems;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView task_textView;
        TextView task_slutView;

        public ViewHolder (View parentView) {
            super(parentView);

            task_textView = (TextView) parentView.findViewById(R.id.todoTextView);
            task_slutView = (TextView) parentView.findViewById(R.id.slutView);
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {  // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_todo_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TaskItem taskItem = tasksItems.get(position);

        holder.task_textView.setText(taskItem.getTaskName());
        holder.task_slutView.setText(taskItem.getDueDate().toLocalizedPattern());
    }

    @Override
    public int getItemCount() {
        return tasksItems.size();
    }

}

















