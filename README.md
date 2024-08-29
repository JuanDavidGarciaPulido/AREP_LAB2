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

    cd AREP_LAB1
    ```

2. Compile and run the server:
    ```sh
   javac -d bin src/main/java/edu/escuelaing/arep/app/SimpleWebServer.java
   java -cp bin edu.escuelaing.arep.app.SimpleWebServer
    ```

3. **Access the Web Server**:
   - Open a web browser and navigate to `http://localhost:8080/index.html`.
   - The server will serve files from the `src/main/webroot` directory.

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

                   
```

## Author
This project was developed by Juan David García Pulido.



