# microservicos-1

```sh
curl -X POST \
  http://localhost:8080/order-service/create \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: fb82ea23-bfbc-a094-da1a-f4b3897572c2' \
  -d '{
    "idPedido": 1,
    "nomeCliente": "Leandro Jorge",
    "itemAdquirido": "Placa raspberry",
    "email": "leandro.jorge19@gmail.com",
    "shipping": "frei inacio da conceição 635, SP vila são luis",
    "nome": "empresa 1"
}'

```

```sh
curl -X GET \
  http://localhost:8080/order-service/findById/1 \
  -H 'cache-control: no-cache' \
  -H 'postman-token: 501d1173-08ac-1be8-adb5-868a8fc3aa3a'
  
```

```sh
curl -X GET \
  http://localhost:8080/order-service/delete/1 \
  -H 'cache-control: no-cache' \
  -H 'postman-token: 837d457f-0617-4a64-7dee-903d67255f22'
```

```sh
curl -X POST \
  http://localhost:8080/order-service/alterar/1 \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 3f097728-8cbe-83b3-56c1-e8315dd06658' \
  -d '{
    "idPedido": 1,
    "nomeCliente": "Leandro jorge",
    "itemAdquirido": "Placa raspberry alterada",
    "email": "leandro.jorge19@gmail.com",
    "shipping": "frei inacio da conceição 635, SP vila são luis",
    "nome": "empresa 99"
}'

```
