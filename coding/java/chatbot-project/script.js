function sendMessage() {
  let inputField = document.getElementById("user-input");
  let input = inputField.value.trim();
  let chatBox = document.getElementById("chat-box");

  if (input === "") return;

  // user message
  chatBox.innerHTML += `<p class="user">${input}</p>`;
  chatBox.scrollTop = chatBox.scrollHeight;

  inputField.value = "";

  // typing effect
  chatBox.innerHTML += `<p class="bot" id="typing">Typing...</p>`;

  setTimeout(() => {
    let reply = "";
    let text = input.toLowerCase();

    if (text.includes("java")) {
      reply = "Java ek programming language hai jo software aur web development me use hoti hai.";
    } 
    else if (text.includes("hello") || text.includes("hi")) {
      reply = "Hello 👋 kaise ho?";
    } 
    else if (text.includes("python")) {
      reply = "Python ek easy aur powerful programming language hai.";
    }
    else {
      reply = "Main AI chatbot hoon 🤖 aur abhi learning phase me hoon.";
    }

    // remove typing
    document.getElementById("typing").remove();

    // bot reply
    chatBox.innerHTML += `<p class="bot">${reply}</p>`;
    chatBox.scrollTop = chatBox.scrollHeight;

  }, 1000); // 1 second delay
}