
Most Frequent Element Finder
Problem Description
This program takes an array of integers as input and finds the most frequent element in the array. If multiple elements appear the maximum number of times, it will return any one of them. If the input contains no elements, the program will return -1.

Sample Input and Output
Sample Input 1:
Copy code
5
7 8 9 4 9
Sample Output 1:
Copy code
9
Explanation:
In the array [7, 8, 9, 4, 9], the number 9 appears twice, which is more than any other element. Therefore, the output is 9.

Sample Input 2:
Copy code
0
Sample Output 2:
diff
Copy code
-1
Explanation:
Since the input size is 0, there are no elements in the array, so the program returns -1.

Functionality Overview
Input:

The first input is an integer n representing the size of the array.
If n = 0, the program directly returns -1.
If n > 0, the program reads the next n integers as the array elements.
Process:

The program calculates the frequency of each element in the array.
It identifies the element with the highest frequency.
If multiple elements share the highest frequency, any one of them can be returned.
Output:

The most frequent element in the array, or -1 if the array is empty.
Edge Cases
If n = 0, the function will return -1 because no elements are provided.
If all elements have the same frequency, any one of them can be returned.
Usage
Run the program.
Input the size of the array n.
Provide the n integers (if n > 0).
The program will output the most frequent element, or -1 if no elements exist.
Example Walkthrough
Example 1:
Input:

Copy code
5
7 8 9 4 9
Steps:

n = 5, array is [7, 8, 9, 4, 9].
Frequency of elements:
7: 1 time
8: 1 time
9: 2 times
4: 1 time
The most frequent element is 9.
Output:

Copy code
9
Example 2:
Input:

Copy code
0
Steps:

n = 0, no elements are provided.
Output:

diff
Copy code
-1
How to Run
Clone the repository.
Run the program in your preferred environment.
Input the array size and elements as prompted.