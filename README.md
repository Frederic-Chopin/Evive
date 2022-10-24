# Evive Meal Ordering System


## About The Project



### Built With




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
###Input
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
###Design Idea

    
    
    

###Components
- src
    - Meal.java
    - Breakfast.java
    - Lunch.java
    - Dinner.java
    - Main.java
- test
    - regular.java
    - exceptions.java

###Rules
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


###Sample inputs and outputs
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
This project is intended for a take home assignment for Evive.
Visit their website www.goevive.com for more information. 
