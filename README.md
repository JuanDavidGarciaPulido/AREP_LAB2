# AREP LAB2: Microframeworks WEB

This project aims to enhance an existing web server, which currently supports HTML files, JavaScript, CSS, and images, by converting it into a fully functional web framework. This framework will enable the development of web applications with backend REST services. The new framework will provide developers with tools to define REST services using lambda functions, manage query values within requests, and specify the location of static files.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Before install and run the project you will need:

1. **Java** (version 21)


2. **Maven**
    - Download Maven from [here](http://maven.apache.org/download.html)
    - Follow the installation instructions [here](http://maven.apache.org/download.html#Installation)

3. **Git**
    - Install Git by following the instructions [here](http://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

### Installing

1. Clone the repository and navigate into the project directory:
    ```sh
    git clone https://github.com/JuanDavidGarciaPulido/AREP_LAB2.git

    cd AREP_LAB2
    ```

2. Compile and run the server:
    ```sh
   javac -d bin src/main/java/edu/escuelaing/arep/app/*.java
   java -cp bin edu.escuelaing.arep.app.App
    ```

3. **Access the Web Server**:
   - Open a web browser and navigate to `http://localhost:8080/index.html`.
   - The server will serve files from the `src/main/webroot` directory.
     
**Static Files**:

![image](https://github.com/user-attachments/assets/fcbfc896-2723-47de-b8b7-5ffe44ee6173)

![image](https://github.com/user-attachments/assets/1dd02b6e-f21e-48ef-9b01-c4bc46e3ade9)

**GET Requests**:
- **Greeting**: Access the URL `/App/hello` with and without query parameters to verify the greeting functionality. Example: `http://localhost:8080/App/hello?name=JuanDavid`.

![image](https://github.com/user-attachments/assets/894367b2-66eb-449a-95e1-daf6c647e78c)

- **Pi Value**: Access the URL `/App/pi` to check that the server correctly returns the value of pi.

![image](https://github.com/user-attachments/assets/ff13af99-102e-43ff-991e-f11c48647aea)

## Configuration
- **Web Root Directory**: The server serves files from the `src/main/webroot/` directory by default.
- **Port**: The server listens on port `8080` by default.
- **Thread Pool**: The server uses a thread pool with a fixed size of 10 threads to handle concurrent requests.

## Project Structure
```
SimpleWebServer/
│
├───src/
│   ├───main/
│   │   ├───java/
│   │   │   └───edu/
│   │   │       └───escuelaing/
│   │   │           └───arep/
│   │   │               └───app/
│   │   │                   ├───SimpleWebServer
│   │   │                   ├───App
│   │   │                   ├───Request
│   │   │                   ├───Response
│   │   │                   ├───Service
│   │   │               
│   │   │
│   │   │
│   │   └───webroot/        
│   │       ├───index.html  
│   │       ├───styles.css  
│   │       ├───app.js      
│   │       ├───manzanas.png
│   │       └───... (other resources)
│   │    
│   │
│   │
│   │                 
│   └───test/
│       └───java/
│           └───edu/
│               └───escuelaing/
│                   └───arep/
│                       └───app/
│                            ├───AppTest
│                            ├───RequestTest
│                            ├───ResponseTest
│                            ├───WebServerTest
│                   
```

## Running the tests
Run the command:
```sh
   mvn test
```

![image](https://github.com/user-attachments/assets/c22c039b-7bfb-4285-9b16-fc805256cd68)

### Test Descriptions
#### 1. AppTest
testGet: Verifies that a GET route is registered correctly and appears in the service map.
testStaticFiles: Ensures that the static files location is set properly in the application.
#### 2. RequestTest
testEmptyQueryString: Checks that a request with an empty query string returns null for any parameter value.
testNullQueryString: Ensures that a request with a null query string returns null for any parameter value.
testGetValues: Verifies that a request with a properly formatted query string correctly retrieves parameter values.
testGetValuesWithMalformedQuery: Tests that a request with a malformed query string returns the expected values for well-formed parameters and null for incomplete parameters.
#### 3. ResponseTest
testSetAndGetBody: Verifies that the body of the response can be set and retrieved correctly.
testSetBodyWithNull: Ensures that setting the response body to null is handled properly.
testSetBodyWithEmptyString: Confirms that setting the response body to an empty string is managed correctly.
#### 4. WebServerTest
testGetInstance: Verifies that the SimpleWebServer singleton pattern returns the same instance for multiple calls.
testStartServer: Checks that a ServerSocket can be created on port 8080, ensuring the server can start without issues.

## Author
This project was developed by Juan David García Pulido.

## Date

Wednesday, August 28 - 2024

## License

This project is licensed under the GNU license; See the [LICENSE.txt](LICENSE.txt) file for details.


