function operaciones(){
    var num1=parseFloat(document.getElementById("num1").value);
    var num2=parseFloat(document.getElementById("num2").value);
    var resultadoSuma= num1+num2;
    var resultadoResta= num1-num2;
    var resultadoMultiplicacion= num1*num2;
    var resultadoDivision= num1/num2;

    document.getElementById("resultadoSuma").textContent = resultadoSuma;
    document.getElementById("resultadoResta").textContent = resultadoResta;
    document.getElementById("resultadoMultiplicacion").textContent = resultadoMultiplicacion;
    document.getElementById("resultadoDivision").textContent = resultadoDivision;
}