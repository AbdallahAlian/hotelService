### Installation Instructions :

1. Create A Folder to clone the project inside it.
1. Open command line and navigate to the created folder directory.
1. Clone the project with the following command "git clone https://github.com/AbdallahAlian/hotelService.git"
1. Execute the following command to run the webapp "java -jar target/dependency/webapp-runner.jar target/*.war".

### Assumptions :
1. You should have JDK1.8.XX to be installed on your machine.
1. You should have git installed on your machine.


### Known issues :
1. Inconsistent date format , seperator and data type (ex : travelStartDate "[2017,8,3]" , "08/03/2017").
1. Performance concern , Json API does not have page size nor page number parameters which return a huge number of data.
