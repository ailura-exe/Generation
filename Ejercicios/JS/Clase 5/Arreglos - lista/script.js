let tareas=[];

function agregarTarea(){
    const tareaInput=document.getElementById("tarea");
    const tareaTexto=tareaInput.value;

    if (tareaTexto != ""){
        tareas.push(tareaTexto);
        tareaInput.value=""; //el valor del elemento input para borrar el contenido del campo de entrada

        mostrarLista();
        
    }
}

function mostrarLista(){
    const listaTareas=document.getElementById("listaTareas");
    listaTareas.innerHTML=""; //borra el contenido del HTML de la constante, dejándolo vacío

    for (let i=0; i<tareas.length; i++){
        const tarea=tareas[i];
        const li=document.createElement("li"); //creamos un nuevo elemento en HTML para almacenar los datos
        li.textContent=tarea; //establecer el text del elemento li para guardalo en la lista
        listaTareas.appendChild(li);
    }
}

agregarTarea();