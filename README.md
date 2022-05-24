Proyecto API Rest para incendios

Este proyecto permite realizar 4 consultas diferentes a un conjunto de documentos sobre incendios en América Latina almacenados en una base de datos de Mongo.

Se desplegó MongoDB en un contenedor Docker, luego se realizo la ingesta de los datos con la herramienta Logstash y se codificó en Spring Boot (Eclipse)

Consultas:

Listar todos  los documentos entre dos fechas
endpoint: http://localhost:9090/api/incendios_fecha?fromDate=2020/09/27 00:00:00&toDate=2020/09/29 23:59:59
*Formato de Fechas: {yyyy/MM/dd HH:mm:ss)

Listar los incendios producidos en un punto ("long" y "lat") y "radio" determinados
endpoint: http://localhost:9090/api/incendios_radio?long=-72.4120&lat=-7.9280&radio=5000

Listar los documentos donde los diasinlluvia supera el valor "dias" establecido
endpoint: http://localhost:9090/api/incendios_sinlluvia?dias=10

Listar por pais la cantidad de documentos que existen y la suma de los dias sin lluvia
endpoint: http://localhost:9090/api/incendios_promSinlluvia

