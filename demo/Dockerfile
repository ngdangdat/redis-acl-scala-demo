FROM hseeberger/scala-sbt:graalvm-ce-19.3.0-java11_1.3.7_2.13.1 as build
COPY . /app
WORKDIR /app
RUN sbt assembly
CMD ["java", "-cp", "target/scala-2.13/redis-acl-assembly-1.0.jar", "com.ngdangdat.Main"]
