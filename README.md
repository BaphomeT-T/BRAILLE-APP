## 🐳 Ejecución con Docker

### Prerrequisitos
- Docker instalado
- Docker Compose instalado

### Instrucciones de ejecución

1. **Clonar el repositorio**
```bash
git clone <url-del-repositorio>
cd BRAILLE-APP
```

2. **Construir y ejecutar los contenedores**
```bash
docker-compose up --build
```

3. **Ejecutar en segundo plano**
```bash
docker-compose up -d
```

4. **Detener los contenedores**
```bash
docker-compose down
```

5. **Ver logs**
```bash
docker-compose logs -f
```

### Acceso a la aplicación
- Frontend: `http://localhost:3000`
- Backend: `http://localhost:8000`

### Comandos útiles
```bash
# Reconstruir contenedores
docker-compose up --build

# Eliminar volúmenes
docker-compose down -v

# Acceder al contenedor
docker exec -it <nombre-contenedor> /bin/bash
```
