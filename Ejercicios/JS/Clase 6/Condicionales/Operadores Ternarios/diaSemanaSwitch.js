let diaDeLaSemana = "Lunes";
let actividad;

switch (diaDeLaSemana){
    case "Lunes":
        actividad="Reunión de equipo";
        break;
    case "Miércoles":
        actividad="Clase de JS";
        break;
    default:
        actividad="Día libre"
}
console.log(`Hoy es ${diaDeLaSemana} y la actividad es ${actividad}.`)
