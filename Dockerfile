FROM bellsoft/liberica-openjdk-alpine-musl
COPY ./target/CurrencyCbrService-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","CurrencyCbrService-0.0.1-SNAPSHOT.jar"]