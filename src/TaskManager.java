import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TaskManager {
    private final List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    public void markTaskAsComplete(int index) {
          if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }

    public List<Task> getTasks() {
        return Collections.unmodifiableList(tasks);
    }


}