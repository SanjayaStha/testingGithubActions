# User Stories for OnTrack Project

## User Story 1: Creating Tasks

**Title**: Create a new task  
**As a**: Teacher  
**I want to**: create a new task with a name, due date, initial status, and comment  
**So that**: I can keep track of my assignments and projects

**Acceptance Criteria**:
1. The system should allow me to create a task with a unique name, due date, initial status (default to `PENDING`), and an optional comment.
2. The task should be added to my task list and should be retrievable later.
3. The system should auto-generate due dates using a predefined range (e.g., within 90 days in the future).

## User Story 2: Viewing All Tasks

**Title**: View all tasks  
**As a**: Student  
**I want to**: view a list of all my tasks  
**So that**: I can see all my assignments and their details at a glance

**Acceptance Criteria**:
1. The system should display a list of all tasks, showing the name, due date, status, and comment for each task.
2. I should be able to retrieve this list at any time.

## User Story 3: Updating Task Status

**Title**: Update the status of a task  
**As a**: Student  
**I want to**: update the status of a task  
**So that**: I can reflect the current progress of my assignment

**Acceptance Criteria**:
1. The system should allow me to update the status of an existing task to one of the predefined statuses (`PENDING`, `ONGOING`, `APPROVED`, `REJECTED`, `COMPLETED`).
2. The task status should be updated and saved.

## User Story 4: Adding Comments to Tasks

**Title**: Add a comment to a task  
**As a**: Student  
**I want to**: add or update a comment on a task  
**So that**: I can add notes or updates relevant to the task

**Acceptance Criteria**:
1. The system should allow me to add or update a comment for an existing task.
2. The comment should be saved and retrievable when I view the task details.

## User Story 5: Requesting an Extension

**Title**: Request an extension for a task  
**As a**: Student  
**I want to**: request an extension for the due date of a task  
**So that**: I can get more time to complete the assignment

**Acceptance Criteria**:
1. The system should allow me to request a 7-day extension for the due date of an existing task.
2. The due date of the task should be updated accordingly and saved.

## User Story 6: Finding a Task by Name

**Title**: Find a task by name  
**As a**: Student  
**I want to**: search for a specific task by its name  
**So that**: I can quickly find and view the details of a particular assignment

**Acceptance Criteria**:
1. The system should allow me to search for a task by its name.
2. The system should return the task details if the task exists; otherwise, it should indicate that the task is not found.

## User Story 7: Simulating Student Activities

**Title**: Simulate student activities  
**As a**: Developer  
**I want to**: simulate various student activities (e.g., creating tasks, updating status, adding comments, requesting extensions)  
**So that**: I can test and demonstrate the functionality of the application

**Acceptance Criteria**:
1. The system should provide a method
