// aqui vamos a testear :)

const request=require('supertest');   //importamos modulo supertest para hacer pruebas al servidor 

const app=require('./app');    //traemos la aplicacion declarando una instancia

describe('Puebas unitarias para app.js', ()=> {    // iniciamos una descipción de las pruebas unitarias
    it('Debería devolver un mensaje de saludo al hacer la solicitud GET', async () => {
        const response=await request(app).get('/');     //realizamos una solicitud get a la ruta de la aplicación usando el supertest

        expect(response.status).toBe(200);  //verifica que el estado de la respuesta sea el 200

        expect(response.body.message).toBe('¡Hola mundo!');
    })
})