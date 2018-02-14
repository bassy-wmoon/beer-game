# beer-game

## Over view
このアプリケーションは、ビールの写真を見てブルワリーとビールの組み合わせを暗記するためのゲームです。

## Requirement
- Java8 +
- MySQL5.6 +

## Preparation
### 1. Create database
```
create database beer_game;
```

### 2. Flyway migrate
```
./mvnw flyway:migrate -P flyway
```

## Run application
```
./mvnw spring-boot:run
```

## Start the game
```
http://localhost:8080/index
```
