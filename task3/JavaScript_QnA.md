# JavaScript Assignment - Task 3

## 1. Difference between var, let, and const
- **var**: Old way to declare variables. It works inside the whole function (function scoped). It can be re-declared and updated.
- **let**: New way (ES6). It works only inside the block `{}` where it is defined (block scoped). It can be updated but not re-declared in the same block.
- **const**: Like `let` (block scoped), but it cannot be changed (re-assigned) after giving a value relative to the variable reference. Use it for values that should stay the same.

```javascript
var a = 10;
let b = 20;
const c = 30;
// c = 40; // Error!
```

## 2. Hoisting
Hoisting is when JavaScript moves variable and function declarations to the top of the code before running it.
- Functions work even if you call them before writing them.
- Variables (`var`) exist but are `undefined`.
- `let` and `const` are also hoisted but give an error if you try to use them before the line they are written.

```javascript
console.log(x); // undefined
var x = 5;

hello(); // Works!
function hello() {
    console.log("Hi");
}
```

## 3. Closure
Classification of a function remembering variables from outside its scope, even after the outer function has finished.
Used for: Data privacy (making private variables) and function factories.

```javascript
function outer() {
    let count = 0;
    return function inner() {
        count++;
        console.log("Count is " + count);
    };
}
const counter = outer();
counter(); // Count is 1
counter(); // Count is 2
```

## 4. Difference between == and ===
- `==` (Loose Equality): Checks value only. Steps: converts types if needed, then compares. (e.g., `5 == "5"` is true).
- `===` (Strict Equality): Checks both value AND type. No type conversion. (e.g., `5 === "5"` is false).

## 5. Event Bubbling and Capturing
These are ways events move through HTML elements.
- **Bubbling**: Event starts at the clicked element and goes UP to parents (most common).
- **Capturing**: Event goes DOWN from top parent to the target element.

## 6. Callback Functions
A function passed into another function as an argument, which is then called later. Used often in async code (like waiting for a file or a timer).

```javascript
function greet(name, callback) {
    console.log("Hello " + name);
    callback();
}

function sayBye() {
    console.log("Bye!");
}

greet("Madhu", sayBye);
```

## 7. Promises
A Promise is an object representing a task that might finish later (like downloading data).
It has 3 states:
1. **Pending**: In progress.
2. **Resolved (Fulfilled)**: Success.
3. **Rejected**: Failed.

```javascript
let myPromise = new Promise((resolve, reject) => {
    let success = true;
    if(success) resolve("Done!");
    else reject("Error!");
});

myPromise.then(msg => console.log(msg));
```

## 8. Synchronous vs Asynchronous
- **Synchronous**: Code runs line by line. One thing must finish before the next starts. (Blocking).
- **Asynchronous**: Code can start a task (like a timer) and move to the next line without waiting. The task finishes in the background. (Non-blocking).

## 9. Purpose of async and await
They make asynchronous code (Promises) look and behave like synchronous code. It's easier to read than `.then()`.
- `async`: Put in front of a function to returns a Promise.
- `await`: Pauses the function until the Promise resolves.

```javascript
async function getData() {
    let data = await fetch('url'); // wait for it
    console.log(data);
}
```

## 10. Scope Chain
When you use a variable, JS looks for it in the current scope. If not found, it looks in the outer scope, then the next outer scope, all the way to global scope. That chain of looking up is the Scope Chain.

## 11. "this" Keyword
Refers to the object that is executing the current function.
- Global scope: `window` (browser).
- Object method: The object itself.
- Event handler: The element that received the event.

## 12. Null vs Undefined
- **undefined**: Variable is declared but has no value yet. (Automatic).
- **null**: Assignment value representing "no value" or "empty". (Manual).

```javascript
let x; // undefined
let y = null; // specifically empty
```

## 13. Debouncing and Throttling
Techniques to limit how often a function runs (performance).
- **Debouncing**: Waints for a pause. "Run this only if I haven't been called for X ms". (Good for search bars).
- **Throttling**: Limits rate. "Run this at most once every X ms". (Good for scrolling).

## 14. JSON (JavaScript Object Notation)
Standard text format for storing and sending data.
- **JSON.stringify()**: Object -> JSON String.
- **JSON.parse()**: JSON String -> Object.

```javascript
let obj = { name: "A", age: 20 };
let jsonStr = JSON.stringify(obj); // '{"name":"A","age":20}'
let newObj = JSON.parse(jsonStr);
```

## 15. Map, Filter, Reduce
Array methods.
- **map()**: Creates new array by transforming every element.
- **filter()**: Creates new array with only elements that pass a test.
- **reduce()**: Reduces array to a single value (like sum).

```javascript
let nums = [1, 2, 3, 4];

// Map
let doubled = nums.map(n => n * 2); // [2, 4, 6, 8]

// Filter
let evens = nums.filter(n => n % 2 === 0); // [2, 4]

// Reduce
let sum = nums.reduce((total, n) => total + n, 0); // 10
```
