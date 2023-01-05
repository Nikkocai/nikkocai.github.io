const htmlCard = document.querySelector(".html-card");
const cssCard = document.querySelector(".css-card");
const jsCard = document.querySelector(".js-card");
const bsCard = document.querySelector(".bs-card");
const nodeCard = document.querySelector(".node-card");
const expCard = document.querySelector(".exp-card");
const javaCard = document.querySelector(".java-card");
const pyCard = document.querySelector(".py-card");
const rubyCard = document.querySelector(".ruby-card");
const cCard = document.querySelector(".c-card");
const csCard = document.querySelector(".cs-card");
const gitCard = document.querySelector(".git-card");
const unityCard = document.querySelector(".unity-card");
const gdCard = document.querySelector(".gd-card");

const cards = [htmlCard, cssCard, jsCard, bsCard, nodeCard, expCard, javaCard, pyCard, rubyCard, cCard, csCard, gitCard, unityCard, gdCard]

function toggleVisibilityCardItems(card){
    let cardImage = card.children[0];
    let cardDescription = card.children[1];
    if (cardImage.style.display == "none" && cardDescription.display == "block"){
        cardImage.style.display = "block";
        cardDescription.style.display = "none";
    } else {
        cardImage.style.display = "none"
        cardDescription.style.display = "block";
    }
}

for (let card of cards) {
    card.addEventListener("cl")
}
