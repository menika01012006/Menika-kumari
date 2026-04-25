// Smooth Scroll
function scrollToSection(id) {
    document.getElementById(id).scrollIntoView({
        behavior: "smooth"
    });
}

// Typing Animation
const text = ["Web Developer", "Problem Solver", "AI Enthusiast"];
let i = 0, j = 0;
let currentText = "", isDeleting = false;

function type() {
    currentText = text[i];

    if (!isDeleting) {
        document.getElementById("typing").innerHTML = currentText.substring(0, j++);
        if (j > currentText.length) {
            isDeleting = true;
            setTimeout(type, 1000);
            return;
        }
    } else {
        document.getElementById("typing").innerHTML = currentText.substring(0, j--);
        if (j === 0) {
            isDeleting = false;
            i = (i + 1) % text.length;
        }
    }
    setTimeout(type, isDeleting ? 50 : 100);
}

type();

// Scroll Animation
const faders = document.querySelectorAll(".fade");

window.addEventListener("scroll", () => {
    faders.forEach(el => {
        const rect = el.getBoundingClientRect();
        if (rect.top < window.innerHeight - 100) {
            el.classList.add("show");
        }
    });
});