import java.util.List;

public class TaskReporter {
    public void printCompletedTasks(List<Task> tasks) {
        System.out.println("Tâches terminées :");
        boolean found = false;
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("(Aucune tâche terminée)");
        }
    }

    public void printPendingTasks(List<Task> tasks) {
        System.out.println("Tâches non terminées :");
        boolean found = false;
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("(Aucune tâche en attente)");
        }
    }
}
