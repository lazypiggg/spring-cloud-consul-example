# Modification

this version, add swagger-ui, and runs on alauda k8s.

upgrade :
zipkin to 2.6,
consule to 1.0.*,
spring cloud to Edgware.SR2

# spring-cloud-consul-example
README: [English](https://github.com/wangzheng422/spring-cloud-consul-example/blob/master/README.md) | [中文](https://github.com/wangzheng422/spring-cloud-consul-example/blob/master/README-zh.md)

spring-cloud-consul-example is an example for microservices system.

It's contain 
**configuration management, service discovery, circuit breakers, intelligent routing, distributed tracing, application monitor**.

The registry center uses the consul, if you want to use eureka, you can refer to
https://github.com/wangzheng422/spring-cloud-netflix-example

## Getting Started
```shell
./gradlew clean build -x test
./buildDockerImage.sh
docker-compose up -d
```
if you want to start more serve, you should use 
```shell
docker-compose scale service-a=2 service-b=3  
```

## Technology List
* Spring Cloud Consul
* Spring Cloud Sleuth
* Spring Cloud Config
* Spring Boot Admin
* Spring Boot
* ZipKin
* Docker
* Swagger

## Architecture Overview
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-consul-example/master/screenshots/Architecture.png">

## Screenshots
### Api Route(Zuul)
[](url "title")
<img src="https://raw.githubusercontent.com/wangzheng422/spring-cloud-consul-example/master/screenshots/zuul.png">

### Consul DashBoard
[](url "title")
<img src="https://raw.githubusercontent.com/wangzheng422/spring-cloud-consul-example/master/screenshots/consul.png">

### Consul Key/Value DashBoard
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-consul-example/master/screenshots/Selection_003.png">

### ZipKin DashBoard
[](url "title")
<img src="https://raw.githubusercontent.com/wangzheng422/spring-cloud-consul-example/master/screenshots/zipkin-dash.png">

### ZipKin Trace Detail
[](url "title")
<img src="https://raw.githubusercontent.com/wangzheng422/spring-cloud-consul-example/master/screenshots/zipkin.png">

### ZipKin Dependencies Overview
[](url "title")
<img src="https://raw.githubusercontent.com/wangzheng422/spring-cloud-consul-example/master/screenshots/zipkin-dep.png">

### Spring Boot Admin DashBoard
[](url "title")
<img src="https://raw.githubusercontent.com/wangzheng422/spring-cloud-consul-example/master/screenshots/boot-admin.png">

### Spring Boot Admin Detail
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-consul-example/master/screenshots/Selection_008.png">

### Spring Boot Admin Environment
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-consul-example/master/screenshots/Selection_009.png">

### Spring Boot Admin Thread Dump
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-consul-example/master/screenshots/Selection_010.png">

### Spring Boot Admin Trace
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-consul-example/master/screenshots/Selection_011.png">

### Hystrix Dashboard
[](url "title")
<img src="https://raw.githubusercontent.com/yidongnan/spring-cloud-consul-example/master/screenshots/Selection_012.png">

### Hystrix Dashboard Detail
[](url "title")
<img src="https://raw.githubusercontent.com/wangzheng422/spring-cloud-consul-example/master/screenshots/hystrix.png">


### Swagger
[](url "title")
<img src="https://raw.githubusercontent.com/wangzheng422/spring-cloud-consul-example/master/screenshots/swagger.png">

