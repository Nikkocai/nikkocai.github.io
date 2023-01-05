const showSkillsBtn = document.getElementById("show-skills");
const skillsList = document.getElementById("skills-list");

showSkillsBtn.addEventListener("click", ()=>{
    showSkillsBtn.classList.replace("bg-dark", "bg-success");
    showSkillsBtn.innerHTML = "Una buena excusa para usar JavaScript";

    skillsList.innerHTML = `<ul class="p-4 m-0">
        <li>Aprendizaje Rápido</li>
        <li>Desarrollo Web Frontend (HTML, CSS, JS)</li>
        <li>Buen desempeño bajo presión</li>
        <li>Desarrollo Web Backend (Node, Express, MongoDB)</li>
        <li>Proactividad</li>
        <li>Desarrollo de Videojuegos 2D (Unity, Godot Engine)</li>
        <li>Trabajo en equipo</li>
        <li>Desarrollo de Aplicaciones (Java)</li>
        <li>Buena Comunicación</li>
        <li>Edición de Imagen (Photoshop, GIMP)</li>
        <li>Paquete Office (Word, Excel, PowerPoint, Access)</li>
        <li>Edición de Video y Audio (VEGAS Pro, DaVinci Resolve)</li>
    </ul>
    <span>NOTA: Cargué la lista con innerHTML, pero una forma más correcta es creando cada elemento y anexandolo a un documentFragment</span>`
})