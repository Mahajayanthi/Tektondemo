FROM java:8
EXPOSE 8080
ADD target/tektondemo.jar tektondemo.jar 
ENTRYPOINT ["java","jar","tektondemo.jar"]