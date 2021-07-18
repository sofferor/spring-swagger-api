# spring-swagger-api

This project is a tutorial for building an Application using Spring Boot & Swagger.

### The components
1. SpringSwaggerApiApplication - the main Spring application.
2. SpringFoxConfig - the Spring Fox configuration (which is the Spring library for Swagger).
3. CustomController - with a POST methid API "/custom".
4. User Entity & UserRepository classes which generate automatically APIs functions with the "spring-boot-starter-data-rest" spring boot dependency.
5. There are Validations (with "spring-boot-starter-validation" spring boot dependency) over the "/users" API such as @NotNull, @Min and @Max.
6. There are descriptions using the annotations @ApiModelProperty, @ApiOperation and @ApiParam



This is how the "/users" API should look like:

![usersAPI](/images/usersAPI.png?raw=true)



This is how the saveUser API should look like with Validations and Notes:

![saveUserAPIWithValidationsAndNotes](/images/saveUserAPIWithValidationsAndNotes.png?raw=true)

This is how the "/custom" API should look like with Description and Example:

![customApiWithDescriptionAndExample](/images/customApiWithDescriptionAndExample.png?raw=true)
