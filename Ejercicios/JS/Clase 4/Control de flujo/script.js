function generarTabla(){
    const numero=parseInt(document.getElementById("numero").value); //value recibe el valor 

    const tablaBody=document.querySelector("#tabla tbody"); //querySelector nos ayuda a elegir que clase de datos queremos recibir

    for(let i=1; i<=10; i++){
        const resultado=numero*i; 
        
        const row=document.createElement("tr");
        const numeroCell=document.createElement("td"); //crea elementos (etiquetas)
        const resultadoCell=document.createElement("td");

        numeroCell.textContent=numero;
        resultadoCell.textContent=resultado;

        row.appendChild(numeroCell); //appendChild ayuda a ingresar los elementos de forma continua, uno debajo de otro
        row.appendChild(resultadoCell);

        tablaBody.appendChild(row);
    }
}