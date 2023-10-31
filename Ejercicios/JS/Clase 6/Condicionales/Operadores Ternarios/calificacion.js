//if else
let calificacion=4.0;
let resultado;

if (calificacion>=3){
    resultado="Aprobado";
}else{
    resultado="Reprobado";
}

console.log(`El estudiante es ${resultado}`);

//ternarios

calificacion<=3? resultado="Reprobado": resultado="Aprobado";
console.log(`El estudiante es ${resultado}`);