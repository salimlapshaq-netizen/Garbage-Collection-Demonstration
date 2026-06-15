# Garbage-Collection-Demonstration
This project is a simple Java application designed to demonstrate how "Garbage Collection" works within the Java Virtual Machine (JVM).
## This is how my Program Works

1. **Object Creation**: My program starts by creating two distinct `Vehicles` objects:
   - `c1` which i pointed to a "Red Toyota".
   - `c2` which i pointed to a "Blue Honda".
The key operation in my code is the statement "c1 = c2;". This tells the variable `c1` to stop pointing to the Toyota and start pointing to the same Honda object that `c2` is referencing.
After the assignment, the "Red Toyota" object no longer has any references pointing to it. It becomes unreachable.
In Java, this unreachable object is known as "Garbage." The JVM(Java Virtual Machine) automatically detects these objects and reclaims their memory through the Garbage Collector, ensuring that the system's memory is managed efficiently without manual intervention.
written by ISIIKO SALIM email(salimlapshaq@gmail.com)
