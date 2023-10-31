// readline de node.js para datos de entrada
const readline=require('readline');
//interfaz de lectura para leer los datos de entrada
const rl=readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

function tablaMultiplicar(){
    rl.question('Ingrese un número: ', (numero)=>{ //question solicita el dato 
        numero = parseInt(numero); 

        for(let i=1;i<=10; i++){
            console.log(`${numero} x ${i} = ${numero*i}`);
        }

        rl.close();

    });
}

tablaMultiplicar();