# Generic DataStore Implementation

A practical exercise focused on **Java Generics** and the **Collections Framework**, developed as part of an Advanced Java course.

## Project Overview
The goal of this project is to implement a generic data structure, `DataStore<T, K>`, capable of managing any type of object (`T`) associated with a unique key (`K`). This exercise demonstrates type safety and efficient data retrieval using internal Java Collections.

## Technical Requirements
- **Generics**: Implementation of `DataStore<T, K>`.
- **Internal Storage**: Hybrid use of `Map<K, T>` for fast lookups and `List<T>` for data export.
- **Key Features**:
  - `add(K key, T item)`: Adds an element if the key is not already present.
  - `remove(K key)`: Removes an element by its unique identifier.
  - `find(K key)`: Efficiently retrieves an element or returns `null`.
  - `getAll()`: Returns a list containing all stored elements.

## Project Structure
- `DataStore<T, K>`: The core generic logic.
- `User`: A sample model class (`id`, `name`) to test the implementation.
- `Main`: Driver class to demonstrate functionality (Add, Find, Delete).

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com
