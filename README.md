Arquitectuta Hexagonal.

![](D:\workspace\AMARIS\hexagonal-architecture-features\hex.png)


CASO DE USO 1: devolver productos


LLega una petición de HTTP desde POSTMAN o cualquier otro cliente por medio de un adaptador REST.

1. ProductController (ADAPTADOR DE ENTRADA: adaptador WEB)
2. ProductReadInport (interfaz)


3. Product: Objeto de Dominio
4. ProductReadUseCase (Implementación del puerto de entrada)


5. ProductReadOutPort (interfaz)
6. ProductDAO (ADAPTADOR DE SALIDA: adaptador de persistencia)


CASO DE USO 2: registrar productos

1. ProductController (ADAPTADOR DE ENTRADA: adaptador WEB)
2. ProductWriteInport (interfaz)


3. Product: Objeto de Dominio
4. ProductWriteUseCase (Implementación del puerto de entrada)


5. ProductWriteOutPort (interfaz)
6. ProductDAO (ADAPTADOR DE SALIDA: adaptador de persistencia)