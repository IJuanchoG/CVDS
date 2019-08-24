# Clases de Equivalencia

Hola, en este readme encontrarán información necesaria respecto a las clases de equivalencia del problema de la Registraduría.

|  Número        |Clase de equivalencia (en lenguaje natural o matemático).                          |Resultado correcto / incorrecto.        |
|----------------|-----------------------------------|-----------------------------|
|1				 | edad<0 \|\| edad>122              |Edad inválida           	   |
|2               |edad>=0 && edad<18 && vivo         |no tiene edad suficiente     |
|3	             |edad >= 0 && edad<=122 && no vivo  |muerto					   |
|4	             |edad>=18 && edad<=122 && vivo && registrado|ya registrado        |
|5	             |edad>=18 && edad<=122 && vivo && no registrado|válido para registrar|

Para los casos especificados anteriormente vamos a verificar la valides de los rangos con los siguientes valores
EI = Edad Inválida
NE = Edad insuficiente
DD = Muerto
RD = Registrado
VD = Válido para registrar
CV = caso a verificar

|caso  |Limite Izq-1|Limite Izq|Limite Izq+1|Valor Central|Limite Der-1|Limite Der|Limite Der+1| 
|------|------------|----------|------------|-------------|------------|----------|------------|
|muerto| -1 --> EI  | 0 --> DD |  1 --> DD  | NN          |  121 --> DD|122 --> DD| 123 --> EI |
|VyR   | -1 --> EI  | 0 --> DD |  1 --> DD  | NN          |  121 --> DD|122 --> DD| 123 --> EI |
|muerto| -1 --> EI  | 0 --> DD |  1 --> DD  | NN          |  121 --> DD|122 --> DD| 123 --> EI |
