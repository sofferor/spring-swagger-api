# spring-swagger-api

This project is a tutorial for building an Application using Spring Boot & Swagger.

### The components
1. SpringSwaggerApiApplication - the main Spring application.
2. SpringFoxConfig - the Spring Fox configuration (which is the Spring library for Swagger).
3. CustomController - with a POST methid API "/custom".
4. User Entity & UserRepository classes which generate automatically APIs functions with the "spring-boot-starter-data-rest" spring boot dependency.
5. This tutorial is from - https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
   with help of the following tutorial - https://youtu.be/gduKpLW_vdY


### Notes
1. There are Validations (with "spring-boot-starter-validation" spring boot dependency) over the "/users" API such as @NotNull, @Min and @Max.
2. There are descriptions using the annotations @ApiModelProperty, @ApiOperation and @ApiParam
3. The Swagger UI Docket configuration is defined to display only two Endpoints "/custom" & "/users" (without all Spring default endpoints) (with the ".apis" function in the Docket configuration).
4. The Swagger URL is http://localhost:8080/swagger-ui/



This is how the "/users" API should look like:


![usersAPI](/images/usersAPI.png?raw=true)




This is how the saveUser API should look like with Validations and Notes:


![saveUserAPIWithValidationsAndNotes](/images/saveUserAPIWithValidationsAndNotes.png?raw=true)




This is how the "/custom" API should look like with Description and Example:


![customApiWithDescriptionAndExample](/images/customApiWithDescriptionAndExample.png?raw=true)
