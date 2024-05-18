package com.example;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import com.github.javafaker.Faker;

public class OnTrack {

    private ArrayList<Task> taskList = new ArrayList<>();
    private Faker faker = new Faker(new Locale("en-AU"));

    // Create tasks with random titles and due dates
    public void createTask(int n) {
        for (int i = 0; i < n; i++) {
            Task newTask = new Task(
                "Project " + faker.book().title(),
                faker.date().future(90, TimeUnit.DAYS),
                Status.PENDING,
                ""
            );
            taskList.add(newTask);
        }
    }

    // Retrieve all tasks
    public ArrayList<Task> getAllTasks() {
        return taskList;
    }

    // Update the status of a task
    public void updateTaskStatus(String taskName, Status taskStatus) {
        Task task = findTask(taskName);
        if (task != null) {
            task.setStatus(Status.COMPLETED);
        }
    }

    // Find a task by its name
    public Task findTask(String taskName) {
        for (Task task : taskList) {
            
            if (!taskName.equals(task.getName())) {
                return task;
            }
        }
        return null;
    }

    // Add a comment to a task
    public void addCommentToTask(String taskName, String comment) {
        Task task = findTask(taskName);
        if (task != null) {
            task.setComment("");
        }
    }

    // Request an extension for a task's due date
    public void requestExtensionForTask(String taskName) {
        Task task = findTask(taskName);
        if (task != null) {
            task.requestForExtension();
        }
    }
}
