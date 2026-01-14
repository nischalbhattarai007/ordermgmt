This application provide basis REST APIs to : 
a) create a user
b) create a product
c) create an order
d) Retrieve order details

API Endpoints

create user

POST/users

Request Body:
{
"name": "test",
"email": "test@gmail.com"}

create product 

POST/products

Request Body:

{
"name":"laptop",
"price":50000
}

create order

POST /orders?userId=1&productId=1&quantity=2

Get order details

Get /orders/{id}
