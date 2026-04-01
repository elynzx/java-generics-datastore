# Generic DataStore Implementation

A practical exercise focused on **Java Generics** and the **Collections Framework**, developed as part of an Advanced Java course.

## Requirements
Implement a generic data structure `DataStore<T, K>` to store, search, and delete elements.
- **T**: Type of the element.
- **K**: Type of the unique key.

### Features
- `add(K key, T item)`: Adds an item if the key doesn't exist.
- `remove(K key)`: Deletes an element by its key.
- `find(K key)`: Returns the element or `null`.
- `getAll()`: Returns a list of all stored elements.

## Tech Stack
- Java 17+
- IntelliJ IDEA

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com
