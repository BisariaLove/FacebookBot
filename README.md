# FacebookBot
- To compile and run
  - mvn clean package
  - java -jar "path_to_jar"
  
- Version: 1.0

- Request Path: /bot/v1

- Available Endpoints:
  - /webhook
  
- CURL command Example:
  - curl -X "GET" -H "Content-type: application/json" -H "Accept: application/json" -d'{"hub":{"verify_token":"Hello", "challenge": "Maybe"}}' http://ec2-dummy.compute-1.amazonaws.com:8080/bot/v1/webhook
