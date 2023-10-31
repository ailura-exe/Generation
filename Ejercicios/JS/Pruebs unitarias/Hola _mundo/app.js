// hola mundo :D

const express=require('express');    //importamos modulo express
const app=express();    //le asignamos el modulo a la variable 

app.get('/', (req, res)=>{   //configuramos un aruta para manejar la solicitud get a la raiz de la aplicacion

    res.status(200).json({message: '¡Hola mundo!'});   //cuando se recibe una solicitud get en la raiz, responde con un estado 200* y muestra el mensaje

})

module.exports=app;    // la instancia también se puede usar en otros archivos 