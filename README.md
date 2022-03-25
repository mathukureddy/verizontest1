This repository to add the programming code given for Verizon test1 sample.
Input
1. file name "input.csv". This file will be in the system temp folder
Sample file contents:
x,y
12,59
34,60
9,12
Note: There is no limit for the number of entries in the file. The first line will be the header indicating x and y position.

2. A string which will contain an equation of the format  "c op Nx"
eg: "11.3 + 1.35x" or "-10 - 0.7x" - could be anything but will adhere to the above format.
c - can be possible or negative
N - will be always positive
op - will be either + or -

Implement a standalone java class which takes the file name and equation as input
1. For each row in the file use the equation to compute y' by using the value of x
Eg. y' = 11.3 + 1.35x ; 11.3 + 1.35*12; y' = 27.5
2. Delta Square (ds): Compute (y'-y)^2. Eg: (27.5-59)^2 = 992.25
3. Find the mean of the Delta (m) = sum of all delta square (ds) and divide it by the number of records in the file
4. Print the final output m
