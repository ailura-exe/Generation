let notas=[];

function calcularPromedio(){
    const valorMateria1=parseFloat(document.getElementById("materia1").value);
    const valorMateria2=parseFloat(document.getElementById("materia2").value);
    const valorMateria3=parseFloat(document.getElementById("materia3").value);
    const valorMateria4=parseFloat(document.getElementById("materia4").value);
    const valorMateria5=parseFloat(document.getElementById("materia5").value);

    
    console.log(notas); 


    if ((valorMateria1>0 && valorMateria1<=10)&&(valorMateria2>0 && valorMateria2<=10)&&(valorMateria3>0 && valorMateria3<=10)&&(valorMateria4>0 && valorMateria4<=10)&&(valorMateria5>0 && valorMateria5<=10)){
            
        notas.push(parseFloat(valorMateria1));
        notas.push(parseFloat(valorMateria2));
        notas.push(parseFloat(valorMateria3));
        notas.push(parseFloat(valorMateria4));
        notas.push(parseFloat(valorMateria5));

        const resultadoPromedio=document.getElementById("resultadoPromedio");
        
        const suma=notas.reduce((total, nota) => total+nota,0);
        const promedio = suma/notas.length;

        resultadoPromedio.textContent=promedio.toFixed(2);
        
        console.log(promedio);

    }else{
        alert("Ingrese un número válido");
    }

}

function reiniciarDatos(){
    let reiniciar=document.getElementById("reiniciar");
    reiniciar.addEventListener("click", _=>{
        location.reload();
    })
}