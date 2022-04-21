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
    "nombre": "any",
    "apellido": "any",
    "edad": "any",
    "genero": "any",
    "estatura": "any",
    "peso": "any",
    "imc": "any",
    "fecha": "any"
}
```

#### update imc

`PUT  /imc/{id}`

*Body:*
```json
{
    "nombre": "any",
    "apellido": "any",
    "edad": "any",
    "genero": "any",
    "estatura": "any",
    "peso": "any",
    "imc": "any",
    "fecha": "any"
}
```



#### delete imc

`DELETE  /imc/{id}`

