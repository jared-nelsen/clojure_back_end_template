FROM clojure:temurin-20-lein-alpine

COPY . /app

WORKDIR /app

RUN lein uberjar

EXPOSE 3000

CMD ["java", "-jar", "/app/target/priora_backend-1.0.0-standalone.jar"]
