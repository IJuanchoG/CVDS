# Clases de Equivalencia

Hola, en este readme encontrarán información necesaria respecto a las clases de equivalencia del problema de la Registraduría.

|  Número        |Clase de equivalencia (en lenguaje natural o matemático).|Resultado correcto / incorrecto.        |
|----------------|-----------------------------------|-----------------------------|
|1		 | edad<0 \|\| edad>122              |Edad inválida           	   |
|2               |edad>=0 && edad<18 && vivo         |no tiene edad suficiente     |
|3	         |edad >= 0 && edad<=122 && no vivo  |muerto					   |
|4	         |edad>=18 && edad<=122 && vivo && registrado|ya registrado        |
|5	         |edad>=18 && edad<=122 && vivo && no registrado|válido para registrar|
