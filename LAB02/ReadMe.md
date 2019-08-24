# Clases de Equivalencia

Hola, en este readme encontrar�n informaci�n necesaria respecto a las clases de equivalencia del problema de la Registradur�a.

|  N�mero        |Clase de equivalencia (en lenguaje natural o matem�tico).                          |Resultado correcto / incorrecto.        |
|----------------|-----------------------------------|-----------------------------|
|1				 | edad<0 \|\| edad>122              |Edad inv�lida           	   |
|2               |edad>=0 && edad<18 && vivo         |no tiene edad suficiente     |
|3	             |edad >= 0 && edad<=122 && no vivo  |muerto					   |
|4	             |edad>=18 && edad<=122 && vivo && registrado|ya registrado        |
|5	             |edad>=18 && edad<=122 && vivo && no registrado|v�lido para registrar|

Para los casos especificados anteriormente vamos a verificar la valides de los rangos con los siguientes valores
EI = Edad Inv�lida
NE = Edad insuficiente
DD = Muerto
RD = Registrado
VD = V�lido para registrar
CV = caso a verificar
|caso  |Limite Izq-1|Limite Izq|Limite Izq+1|Valor Central|Limite Der-1|Limite Der|Limite Der+1| 
|------|------------|----------|------------|-------------|------------|----------|------------|
|muerto| -1 --> EI  | 0 --> DD |  1 --> DD  | NN          |  121 --> DD|122 --> DD| 123 --> EI |
|VyR   | -1 --> EI  | 0 --> DD |  1 --> DD  | NN          |  121 --> DD|122 --> DD| 123 --> EI |
|muerto| -1 --> EI  | 0 --> DD |  1 --> DD  | NN          |  121 --> DD|122 --> DD| 123 --> EI |
