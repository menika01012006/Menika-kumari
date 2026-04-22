// Load tasks when page opens
document.addEventListener("DOMContentLoaded", showTasks);

// Add Task
function addTask() {
  let input = document.getElementById("taskInput");
  let taskText = input.value.trim();

  if (taskText === "") return;

  let tasks = JSON.parse(localStorage.getItem("tasks")) || [];

  // store as object (for future features)
  tasks.push({
    text: taskText,
    completed: false
  });

  localStorage.setItem("tasks", JSON.stringify(tasks));

  input.value = "";
  showTasks();
}

// Show Tasks
function showTasks() {
  let taskList = document.getElementById("taskList");
  taskList.innerHTML = "";

  let tasks = JSON.parse(localStorage.getItem("tasks")) || [];

  tasks.forEach((task, index) => {
    let li = document.createElement("li");

    // Task text
    let span = document.createElement("span");
    span.innerText = task.text;

    // Mark complete
    if (task.completed) {
      span.style.textDecoration = "line-through";
    }

    span.onclick = function () {
      toggleComplete(index);
    };

    // Delete button
    let deleteBtn = document.createElement("button");
    deleteBtn.innerText = "❌";
    deleteBtn.onclick = function () {
      deleteTask(index);
    };

    li.appendChild(span);
    li.appendChild(deleteBtn);
    taskList.appendChild(li);
  });
}

// Toggle Complete
function toggleComplete(index) {
  let tasks = JSON.parse(localStorage.getItem("tasks"));

  tasks[index].completed = !tasks[index].completed;

  localStorage.setItem("tasks", JSON.stringify(tasks));
  showTasks();
}

// Delete Task
function deleteTask(index) {
  let tasks = JSON.parse(localStorage.getItem("tasks"));

  tasks.splice(index, 1);

  localStorage.setItem("tasks", JSON.stringify(tasks));
  showTasks();
}