# Evive Meal Ordering System

## About The Project
This system takes in meal order for breakfast, lunch, or dinner, 
and takes in the order number 1 to 3 for breakfast and lunch, 1 to 4 for dinner.
It returns the dishes ordered. 

### Design Idea
This project uses Java Object-Oriented Programming design principle, and exploits the inheritance hierarchical structure. 
The meal class is the super class, which has common attributes and methods for all 3 meals.
Breakfast, Lunch, and Dinner are children class, which inherits Meal but have some unique attributes. 
They override some methods in Meal. 

### Results
- All functions in the design doc are implemented
- All rules are followed
- A total of 31 Junit tests are provided, covering every requirement in the design doc and some additional once.
- Some additional features are added. For instance, the program can run repeatedly by selecting "y"


## Getting Started



### Prerequisites: Java

Make sure java is installed. If not, please download the latest version of Java here:
- Download Java
  ```sh
  https://www.oracle.com/java/technologies/downloads/
  ```
- Install Java based on instructions here
  ```sh
  https://www.java.com/en/download/help/download_options.html
  ```

### Getting the code

After Java is installed, get the code from https://github.com/Frederic-Chopin/Evive

1. Open a local terminal and clone the repo
   ```sh
   git clone https://github.com/Frederic-Chopin/Evive.git
   ```
2. Go to src folder
   ```sh
   cd src
   ```
3. Compile the Java program
   ```sh
   javac Main.java
   ```
4. Execute the program
    ```sh
   java Main 
   #Provide input in the next line
   ```
   or 
   ```sh
   java Main breakfast 1 2 3
   ```
### Input
- Inputs can be provided along with java Main, or can be provided in the next line. 
  Follow the steps below to provide the input:
  1. Input a meal type, Breakfast, Lunch, or Dinner (case-insensitive). 
  2. Enter integer from 1 to 3 for Breakfast and Lunch, 1 to 4 for Dinner, 
  separated by comma.
    - e.g. Breakfast 1, 2, 3 
    - Lunch 3, 2, 1, 2
    - Dinner 1, 3, 4, 4, 2
  3. The program will output the ordering
  4. A prompt will appear, enter y to continue, n to quit





## Code Details

### Components
- meal 
  - src
    - main/java
      - Meal.java: The superclass, provides common functions and features
      - Breakfast.java: child class, implements Meal in more detail
      - Lunch.java: child class, implements Meal in more detail
      - Dinner.java: child class, implements Meal in more detail
      - Main.java: driver function, parses in and processes input, creates Meal object
    - test
      - regular.java: 10 Junit tests, targeting all functioning requirements
      - exceptions.java: 21 Junit tests, targeting all exceptional cases

### Rules
- An order consists of a meal and collection of comma separated item Ids
- The system should return the name of the items ordered
- The system should always return items in the following order: meal, side, drink
- If multiple items are ordered, the number of items should be indicated
- Each meal must contain a main and a side
- If no drink is ordered, water is returned as a default
- At breakfast, multiple cups of coffee can be ordered
- At lunch, multiple sides can be ordered
- At dinner, dessert must be ordered
- At dinner, water is always provided


### Sample inputs and outputs
- breakfast 3 --> Unable to process: Main is missing, side is missing
- breakfast 2, 3 --> Unable to process: Main is missing
- breakfast 1, 3 --> Unable to process: Side is missing
- breakfast 1, 2, 3 --> Eggs, Toast, Coffee
- Breakfast 3, 3, 1, 2 --> Eggs, Toast, Coffee(2)
- LUNCH 2, 3, 2, 2 --> Sandwich, Chips(3), Soda
- dinner 1, 3, 2, 1 -->  Unable to process: Dessert is missing
- dinner 4, 4, 3, 2, 1 --> Steak, Potatoes, Wine, Water, Cake(2)
- Dinner 1, 1, 2, 3, 4 --> Steak cannot be ordered more than once
- dinner 1, 2, 3, 4, 5 --> Please enter number in the range 1 ~ 4


## Acknowledgments
This project is intended for and only for a take home assignment for Evive.
Visit their website www.goevive.com for more information. 
