# spring-boot-unsij

### Endpoints imc

#### get all imc

`GET  /imc`

#### get imc by id

`GET  /imc/{id}`

#### create imc

`POST  /imc`

*Body:*
```json
{
    "id": 0,
    "nombre": "any",
    "apellido": "any",
    "edad": 0,
    "genero": "any",
    "estatura": 0.0,
    "peso": 0.0,
    "imc": 0.0,
    "fecha": "AAAA-MM-DD"
}
```

#### update imc

`PUT  /imc/{id}`

*Body:*
```json
{
    "id": 0,
    "nombre": "any",
    "apellido": "any",
    "edad": 0,
    "genero": "any",
    "estatura": 0.0,
    "peso": 0.0,
    "imc": 0.0,
    "fecha": "AAAA-MM-DD"
}
```



#### delete imc

`DELETE  /imc/{id}`

