const request=require('supertest');
const app=require('./app');

describe('Pruebas untarias para la aplicación', ()=>{
    it('Debería crear un usuario y volver a hacer la solicitud post', async()=>{
        const newUser={
            username: 'Ailura',
            email: 'example@email.com'
        };
        const response=await request(app)
        .post('/users')
        .send(newUser)

        expect(response.status).toBe(201)
        expect(response.body.username).toEqual(newUser.username)
        expect(response.body.email).toEqual(newUser.email)
    })


    it('Deberia obtener los datos a traves de una petición GET', async()=>{
        const response=await request (app).get('/users')
        expect(response.status).toBe(200);
        expect(Array.isArray(response.body)).toBe(true);
    })
})