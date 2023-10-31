let numeros=[];

function obtenerNumeros(){
    const cantidadInput=document.getElementById("cantidad");
    const cantidad=parseFloat(cantidadInput.value);

    if (cantidad>0){
        const listaNumeros=document.getElementById("lista-numeros");
        listaNumeros.innerHTML="";

        for (let i=0;i<cantidad;i++){
            const numero=prompt("Ingrese el número " + (i+1) + ":");
            numeros.push(parseFloat(numero)); 
            const li=document.createElement("li"); //creamos un nuevo elemento en HTML para almacenar los datos
            li.textContent=numero; //establecer el text del elemento li para guardalo en la lista
            listaNumeros.appendChild(li);

        }

        
    }
}

function calcularPromedio(){
    const resultadoElemento=document.getElementById("resultado");

    if(numeros.length>0){
       // const suma=numeros.reduce((total, numero) => total + numero, 0); /*Estudiar esto*/
        let suma=0;
        for (i=0;i<numeros.length;i++){
            suma+=numeros[i];           
        }
        const promedio=suma/numeros.length;
    
        resultadoElemento.textContent="El promedio es: " + promedio.toFixed(2); //toFixed es para redondear cifras
    } else{
        resultadoElemento.textContent="No se ingresaron datos"
    }
    
    
}

