# Books API with Spring Boot 

### License

This project is licensed under **MIT** license. See the `LICENSE` file for more informations. 


[![NPM](https://img.shields.io/npm/l/react)](https://github.com/nathan00pdl/api-test/blob/main/LICENSE) 

# About the Project
Thsi is a basic project for pesonal study purposes regarding the operation and, mainly, the implementation of an **API** (Application Programming Interface) from its beginning.

Initialy, I followed the construction of this project based on the video **https://www.youtube.com/watch?v=MuF_jkfdqUo** by developer **Fernanda Kipper**, however the JSON request containing the book information was made by cloud services from **AWS**, so I chose to do something simpler, with local data access.

In short, the API returns a list of books, where the data for these books is derived from a JSON file stored in a local folder. Instead of fetching information from an external API or cloud service, the application reads the local JSON file, converts it to list of java objects, and make this data available through an API endpoint.

# Project Structure

## Layered implementation
**Book**
- Model or domain to represent the data of a workbook.

**BookController**
- Acts as the API entry point for book-related request.
- Defines an endpoint that, when accessed, calls the service to obtain the list of books and returns the data in JSON format.
- Utilizes DI (Dependency Injection) and HTTP response handling best practies.

**BookService**
- Service to get a list of books from a JSON file located on the local file system.  
- Uses the Jackson library's ObjectMapper to deserialize JSON content into a java objects, which will be returned by the API. 
  

## Web requests
- **Insomnia**.
- **Thunder Cient** extension in the vscode.
- Testing requests with **GET method**.


### Contact with me

Nathan Paiva de Lacerda

https://www.linkedin.com/in/nathan-paiva-636336236

