# Read Me First
The purpose of this application is to provide a set of CRUD APIs for managing a store's warehouse

# Goal of the test:

1) Complete the logic to make the project work 

2) Change the updateProduct method: Before saving the product changes, reverse the product name string
   (E.g. If in the body of the request I receive "Mineral Water", the saved product name will be "retaW lareniM")


# Extra Point
The package it.eng.storemanager.error contains the business logic for handling every 
RuntimeExeption that may occour during the execution of the project.

Extend the code for allowing to raise custom exceptions with a custom message

(E.g. If I'm trying to add a product whose ID already exists, I'd like to throw a new CustomExcepion with
a custom message instead of a generic RunTimeException)

# Thank you!
Thanks for dedicating your time to us! :)