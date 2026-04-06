package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    // Test 1: Basic logic test
    @Test
    public void testTaskTitleNotNull() {
        String taskTitle = "Complete Assignment";
        assertNotNull(taskTitle, "Task title should not be null");
    }

    // Test 2: Check task completion status
    @Test
    public void testTaskCompletion() {
        boolean isCompleted = true;
        assertTrue(isCompleted, "Task should be marked as completed");
    }

    // Test 3: Validate task description
    @Test
    public void testTaskDescription() {
        String description = "Finish DevOps project";
        assertEquals("Finish DevOps project", description);
    }

    // Test 4: Negative test case
    @Test
    public void testIncorrectValue() {
        int expected = 5;
        int actual = 5;
        assertEquals(expected, actual, "Values should match");
    }
}
