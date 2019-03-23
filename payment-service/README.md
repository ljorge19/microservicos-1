# fiap-mba-microservices-exercicio-1

## Inicialização projeto

```sh
mvn sprint-boot:run
```

## Pedidos

#### Listar por id
```sh
curl -X GET \
  http://localhost:8080/orders/1 \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 2d4256c0-5a4d-5ec3-569d-68e36e42fbf4' \
  -d '{}'
```
#### Inserir

```sh
curl -X POST \
  http://localhost:8080/orders/ \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 88ec268b-c178-8fcc-7165-c7ddd0eb25dc' \
  -d '
{
    "id": 15,
    "email": "jose.silva@brasil.com.br",
    "nome": "Jose Silva",
    "shippingAddress": "Praca Sete, 56 - casa, CEP 34500-980, BH",
    "orderDate": "01-23-2019",
    "item": [{
    	"id":"1";
    	"description": "CD Great Hits of Tiririca",
    	"price": 290.90
    },{
    	"id":"2";
    	"description": "Fone LBJ",
    	"price": 200.00
    }],
    "payment": {
        "idTransaction": "1234",
        "cardNumber": "4024 0071 6276 2636",
        "expDate": "01/25",
        "brand": "VISA"
    }
}'
```

#### Atualizar

```sh
curl -X PUT \
  http://localhost:8080/orders/45 \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 8f427254-e923-f0de-7c03-97c0e7cedf44' \
  -d '{
    "id": 15,
    "email": "jose.silva@colombia.com.br",
    "nome": "Jose Silva",
    "shippingAddress": "Avenida Amazonas, 56 - casa, CEP 21045-120, BH",
    "orderDate": "01-23-2019",
    "item": [{
    	"id":"1";
    	"description": "CD Great Hits of Tiririca",
    	"price": 290.90
    },{
    	"id":"2";
    	"description": "Fone LBJ",
    	"price": 200.00
    }],
    "payment": {
        "idTransaction": "1234",
        "cardNumber": "4024 0071 6276 2636",
        "expDate": "01/25",
        "brand": "VISA"
    }
}'
```
#### Remover

```sh
curl -X DELETE \
  http://localhost:8080/orders/1
  {}
```

