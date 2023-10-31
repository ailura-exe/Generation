let nombres=[];


function validarNombres(){
    const nombreInput=document.getElementById("nombre");
    const nombre=nombreInput.value;
    
    if (nombres!=="" && !nombres.includes(nombre)){
        
        nombres.push(nombre);
        nombreInput.value = "";
        
        agregarNombre();
    }
    else{
        
        alert("Nombre existente, ingrese otro");
    }               
}
function agregarNombre(){
    const listaNombres=document.getElementById("lista-nombres");
    listaNombres.innerHTML="";
    
    for (let i=0; i<nombres.length;i++){
        const muestraNombre=nombres[i];
        const li=document.createElement("li");
        li.textContent=muestraNombre;
        listaNombres.appendChild(li);
    }        
}





