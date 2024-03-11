# Запуск minikube узла
```
minikube start
```

# Конфигурация product-service-cfg
```
kubectl apply -f product-service-config.yaml
```

## Проверка конфигурации
```
kubectl describe configmap product-service-cfg
```

# Запуск БД
```
kubectl apply -f product-db-deployment.yaml
```
## Проверка деплоймента БД
```
kubectl describe deploy product-db
```

## Проверка сервиса БД
```
kubectl describe svc product-db
```

# Запуск сервиса
```
kubectl apply -f product-service-deployment.yaml
```

## Проверка деплоймента продуктового-сервиса
```
kubectl describe deploy product-service
```

## Проверка сервиса продуктового-сервиса
```
kubectl describe svc product-service
```

# Запуск тунеля, чтобы можно было локально делать запросы
```
minikube tunnel
```

# Вызов сервиса
GET http://localhost:9999/product-service/v1/products
