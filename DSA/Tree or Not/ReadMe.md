# Check Whether an Undirected Graph is a Tree or Not

This program determines if a given undirected graph is a tree. A graph is a tree if it is connected and has no cycles. In other words, a tree is an undirected graph where any two vertices are connected by exactly one path.

## Table of Contents

- [Overview](#overview)
- [Input Format](#input-format)
- [Output Format](#output-format)
- [Edge Cases](#edge-cases)
- [Sample Test Cases](#sample-test-cases)
- [Usage](#usage)
- [Explanation](#explanation)

## Overview

The program checks if an undirected graph with N vertices and n edges is a tree by verifying that the graph is connected and has no cycles. It uses Depth-First Search (DFS) or Breadth-First Search (BFS) to detect cycles.

## Input Format

1. The first line contains an integer `N` representing the number of vertices in the graph.
2. The second line contains an integer `n` representing the number of edges in the graph.
3. Each of the next `n` lines contains two space-separated integers representing an edge between two vertices.

Example:
5 4 1 2 2 3 3 4 4 5



## Output Format

- Print `Yes` if the graph is a tree.
- Print `No` if the graph is not a tree.

## Edge Cases

- If the number of vertices far outnumbers the number of edges, the graph is not connected.
- If the graph contains a cycle, it is not a tree.
- If `N` is `0`, the graph is not considered valid.

## Sample Test Cases

### Input 1:
15 4 1 10 10 12 10 13 13 14


### Output 1:
No
Explanation: The graph is not connected as there are vertices that can't be reached from others.

### Input 2:
6 5 1 0 0 2 0 3 3 4 4 5


### Output 2:
Yes
Explanation: The graph is connected and has no cycles, so it is a tree.

## Usage

1. Clone the repository.
2. Run the program in your preferred environment.
3. Input the number of vertices and edges as prompted.
4. Provide the vertex pairs for each edge.
5. The program will output `Yes` if the graph is a tree, otherwise `No`.

## Explanation

### Properties of a Tree:
1. **No Cycles**: The graph must not contain any cycles.
2. **Connected**: All vertices must be reachable from any other vertex.

### Hint for Cycle Detection:
Use DFS or BFS to check if any vertex is visited more than once, indicating a cycle.

---

Feel free to adjust as per your requirements!
