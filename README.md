1. Follow setup steps:
  a. download/setup code into local eclipse project workspace
  b. make sure the code compiles locally using jdk 1.8.x
  c. deploy to apache-tomcat 7.x or above stable build

2. Fix the error in page 'helloworld.jsp' for the variable '${name}' (invking url http://localhost:8080/SpringAppExercise/hello?name=VZT)
3. In AppController add a 'default' value for the variable 'name' to the controller RequestMapping /hello
4. Add JSON request-type in AppController
  a. Add a new RequestMapping 'usersList' for json request for the UI layer
  b. consume the object 'User', populate dummy values for its properties and return it in a List (json) through annotation such as @ResponseBody
  c. compile and deploy to apache-tomcat...make sure no runtime errors
  b. invoke the request from browser url 
  
5. At a high level conceptual/walk through the code structure to add
  a. In AppController add Webservice client (preferred annotations for JaxWsPortProxyFactoryBean) to invoke a soap-endpoint 'http://www.vzt.com/getAddresses'
  b. In AppController add a dao call to get a data row from oracle table. you may assume a simple table with 2 columns in it.
