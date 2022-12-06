# GeometryBasicJava

<!-- ABOUT -->
## About the project

Geometry Basic by using Java
This repository is an attempt to implement some basic geometric functions in Java.  
The main class, Geometry, implements some functions that can be used to calculate the area and perimeter of shapes.
For example, various shape of Squares, Triangle and Circle.

### Example

This is how the calculation works.

  ```java
        System.out.println("Please input radius of the circle: ");
        double r = scan.nextDouble();
        
        System.out.println("Calculating... ");
        double resultCircle = (2 * (Math.PI) * r);
        
        System.out.println("The result is " + resultCircle);
        
        /* Cross check result if the answer provide above is correct. */
        System.out.println("Cross check result = " + Math.PI * (r + r));
  
  ```


<!-- TODO -->
## To Do

- [ ] Add more complex and challenging area calculation
- [ ] Correcting the issue and reforming the code to be more easy to read
