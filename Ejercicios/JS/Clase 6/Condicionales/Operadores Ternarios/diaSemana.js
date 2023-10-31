let diaDeLaSemana = "Lunes";
let actividad = (diaDeLaSemana==="Lunes")? "Reunión de equipos":((diaDeLaSemana==="Miércoles")? "Clases de JS":"Día libre");

/*
if(diaDeLaSemana==="Lunes"){
    actividad="Reunión de equipos";
}else if (diaDeLaSemana==="Miércoles"){
    actividad="Clase de JS";
}else{
    actividad="Día libre"
}*/

console.log(`Hoy es ${diaDeLaSemana} y la actividad es ${actividad}`);