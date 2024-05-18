
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.OnTrack;
import com.example.Status;
import com.example.Task;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TestOnTrack {

    private OnTrack onTrack;

    @BeforeEach
    void setUp() {
        onTrack = new OnTrack();
    }

    @Test
    void testCreateTask() {
        onTrack.createTask(3);
        ArrayList<Task> tasks = onTrack.getAllTasks();
        assertEquals(3, tasks.size(), "Should create 3 tasks");
    }

    @Test
    void testUpdateTaskStatus() {
        onTrack.createTask(1);
        Task task = onTrack.getAllTasks().get(0);
        String taskName = task.getName();
        onTrack.updateTaskStatus(taskName, Status.APPROVED);
        assertEquals(Status.APPROVED, task.getStatus(), "Task status should be updated to APPROVED");
    }

    @Test
    void testAddCommentToTask() {
        onTrack.createTask(1);
        Task task = onTrack.getAllTasks().get(0);
        String taskName = task.getName();
        String comment = "This is a test comment.";
        onTrack.addCommentToTask(taskName, comment);
        assertEquals(comment, task.getComment(), "Task comment should be updated");
    }

    @Test
    void testRequestExtensionForTask() {
        onTrack.createTask(1);
        Task task = onTrack.getAllTasks().get(0);
        String taskName = task.getName();
        Date oldDueDate = task.getDueDate();
        onTrack.requestExtensionForTask(taskName);
        Date newDueDate = task.getDueDate();
        assertNotEquals(oldDueDate, newDueDate, "Task due date should be extended");
    }

    @Test
    void testFindTask() {
        onTrack.createTask(1);
        Task task = onTrack.getAllTasks().get(0);
        String taskName = task.getName();
        Task foundTask = onTrack.findTask(taskName);
        assertNotNull(foundTask, "Should find the task by name");
        assertEquals(task, foundTask, "Found task should be the same as the created task");
    }
}
