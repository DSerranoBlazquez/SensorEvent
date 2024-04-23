# SensorEvent
# Aspectos generales
Antes de poder ejecutar el microservicio se deben instalar y configurar los siguientes componentes
# Implementación de mongodb

Se debe descargar e instalar Mongodb siguiendo las instrucciones de https://www.mongodb.com/try/download/community

docker-compose up --build

# Implementación de docker 

Se debe descargar e instalar Docker siguiendo las instrucciones de https://www.mongodb.com/try/download/community](https://www.docker.com/products/docker-desktop/
Navega hasta la raíz de tu proyecto en la terminal y ejecuta el siguiente comando para construir y arrancar los contenedores Docker ejecutando
docker-compose up --build

# Implementación de kafka

Se debe descargar el zip: Scala 2.12  - kafka_2.12-3.7.0.tgz  de  https://kafka.apache.org/downloads y descomprimirlo en la ruta deseada.
En mi caso fue en la ruta C:\Broker y le cambié el nombre a la carpeta por kafka
Se deben crear las vairiables de entorno con las configuraciones de kafka:
KAFKA_CONFIG  = C:\Broker\kafka\config
KAFKA_SCRIPTS = C:\Broker\kafka\bin\windows

Se deben crear las siguientes carpetas:
md C:\Broker\kafka\data\kafka\broker_1,C:\Broker\kafka\data\zookeeper


Se deben modificar los siguientes archivos:
C:\Broker\kafka\config\zookeeper.properties ----> dataDir=C:/Broker/kafka/data/zookeeper

C:\Broker\kafka\config\server1.properties
broker.id=0
listeners=PLAINTEXT://:9092
delete.topic.enable = true
log.dirs=C:/Broker/kafka/data/kafka/broker_1

A continuación se deben abrir diferentes consolas y ejecutar los siguientes comandos para iniciar kafka

zookeeper-server-start C:\Broker\kafka\config\zookeeper.properties
kafka-server-start C:\Broker\kafka\config\server.properties

# Descripción del REST
Se debe ejecutar desde postaman la solicitud POST http://localhost:8090/sensorevent/create
En su body deberá pasarse en tipo JSON algo similar a 
{
    "sensorId": "sensor_124",
    "timestamp": "2024-02-15T12:34:56Z",
    "type": "temperature",
    "value": 25.3
}
Una vez ejecutado, se habrán creado dos registros en mongodb, una con el mensaje de kafka en la colección processed_sensorevents y otra con el objeto pasado en sensor_event
