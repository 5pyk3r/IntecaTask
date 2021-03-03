# IntecaTask 
### Microservices app created with SpringBoot and Docker.


## Requirements to run the application

  - Java 11
  - Docker 3+
  
  Unfortunately I didn't know how to create maven script for running all docker containers.
  Anyway for running docker containers you should:
  1. Pull repository
  2. In parent directory run: 
   ```
   docker-compose up --build
   ```
  
## API:

### SpringBoot Credit

#### /credits/CreateCredit
![]( https://raw.githubusercontent.com/5pyk3r/IntecaTask/main/screenshots/post.PNG)

#### /credits/GetCredits
  Aggregates ids of credits.
  Don't work properly - work in progress.
  
### SpringBoot Product

#### /products/GetProducts
   It should gets all products which has credit with id passed from /credits/GetCredits
#### /products/CreateProducts
   It saves new product.
    
###SpringBoot Customer

#### /customers//GetCustomers
   It should gets all customers which has credit with ids passed from /credits/GetCredits
    
#### /customers/CreateCustomer
   It saves new customer in db.
    
### Structure of database visualization
![db1]( https://raw.githubusercontent.com/5pyk3r/IntecaTask/main/screenshots/baza1.PNG)
![db2]( https://raw.githubusercontent.com/5pyk3r/IntecaTask/main/screenshots/baza2.PNG)
![db3]( https://raw.githubusercontent.com/5pyk3r/IntecaTask/main/screenshots/baza3.PNG)




