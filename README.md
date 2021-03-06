# WebRest Provincias

## Modo de uso

_Obtener listado de todas las provincias:_


http://localhost:8090/api/provincias


_Obtener detalles de una provincia en específico:_

http://localhost:8090/api/provincias/1

En esta URL el número *1* representa el código de la provincia de la cual se desea obtener detalles.

_Obtener todos los municipios de una provincia:_

http://localhost:8090/api/provincias/4/municipios

En este caso estamos obteniendo todos los municipios de la provincia cuyo código es *4*.

_Obtener todos los distritos municipales de una provincia:_

http://localhost:8090/api/provincias/6/distritos_municipales

En este caso estamos obteniendo todos los distritos municipales de la provincia cuyo código es *6*.

_Obtener listado de todos los municipios:_

http://localhost:8090/api/municipios

_Obtener detalles de un municipio en específico:_

http://localhost:8090/api/municipios/9

En esta URL el *9* representa el código del municipio que se desea obtener.

_Obtener listado de los distritos municipales de un municipio en específico:_

http://localhost:8090/api/municipios/7/distritos_municipales

En esta URL el *7* representa el código del municipio del cual se desean obetener los distritos municipales.

_Obtener listado de todos las distritos municipales:_


http://localhost:8090/api/distritos_municipales


_Obtener detalles de un distrito municipal en específico:_

http://localhost:8090/api/distritos_municipales/9

En esta URL el *9* representa el código del distrito municipal del cual se desea obtener detalles.

## Docker

Dentro de la ruta principal del proyecto abrimos la terminal, ejecutamos `docker-compose up` y automaticamente generara la base de datos con la data necesaria para funcionar...


### nota:

Esto es literamente lo mismo que [ESTO](https://github.com/raydelto/provincias_dominicanas_api), la unica diferencia que hay entre este proyecto y el del link es que este esta desarrollado en JS y docker.
