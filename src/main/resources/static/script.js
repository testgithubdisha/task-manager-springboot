const API_URL = "http://localhost:8080/api/tasks";

function loadTasks() {
    fetch(API_URL)
        .then(res => res.json())
        .then(data => {
            const list = document.getElementById("taskList");
            list.innerHTML = "";
            data.forEach(task => {
                const li = document.createElement("li");
                li.innerHTML = task.title +
                    ` <button onclick="deleteTask(${task.id})">❌</button>`;
                list.appendChild(li);
            });
        });
}

function addTask() {
    const title = document.getElementById("taskInput").value;
    fetch(API_URL, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ title: title, completed: false })
    }).then(loadTasks);
}

function deleteTask(id) {
    fetch(`${API_URL}/${id}`, { method: "DELETE" })
        .then(loadTasks);
}

loadTasks();
