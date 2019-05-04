* Not all operators are symbols. Some are written as words. One example is the typeof operator, which produces a string value naming the type of the value you give it.
* The Number.isNaN function is a standard JavaScript function that returns true only if the argument it is given is NaN.
* Closure. A good mental model is to think of function values as containing both the code in their body and the environment in which they are created. When called, the function body sees the environment in which it was created, not the environment in which it is called.
* The **delete** operator cuts off a tentacle from such an octopus. It is a unary operator that, when applied to an object property, will remove the named property from the object. This is not a common thing to do, but it is possible.
```
let anObject = {left: undefined, right: 2};
console.log(anObject.left);
// → undefined
console.log("left" in anObject);
// → true
delete anObject.left;
console.log(anObject.left);
// → undefined
console.log("left" in anObject);
// → false
```
The binary **in** operator, when applied to a string and an object, tells you whether that object has a property with that name. The difference between setting a property to undefined and actually deleting it is that, in the first case, the object still has the property (it just doesn’t have a very interesting value), whereas in the second case the property is no longer present and in will return false.
* To find out what properties an object has, you can use the **Object.keys** function. You give it an object, and it returns an array of strings—the object’s property names.
```
console.log(Object.keys({x: 0, y: 0, z: 2}));
// → ["x", "y", "z"]
```
* There’s an **Object.assign** function that copies all properties from one object into another.
```
let objectA = {a: 1, b: 2};
Object.assign(objectA, {b: 3, c: 4});
console.log(objectA);
// → {a: 1, b: 3, c: 4}
```
* Arrays have an **includes** method that checks whether a given value exists in the array.
```
if (!events.includes(event)) {
  events.push(event);
}
```
* The **trim** method removes whitespace (spaces, newlines, tabs, and similar characters) from the start and end of a string.
```
console.log("  okay \n ".trim());
// → okay
```
* Method **padStart** and **padEnd** takes the desired length and padding character as arguments.
```
console.log(String(6).padStart(3, "0"));
// → 006
```
* A string can be **repeated** with the repeat method, which creates a new string containing multiple copies of the original string, glued together.
```
console.log("LA".repeat(3));
// → LALALA
```
* Destructuring object
```
const meal = {
  name: 'pizza',
  type: 'marinara',
  price: 6.25
};
const {name, type, price} = meal;
console.log(name, type, price);
```
* Destructuring arrays
```
const iceCreamFlavors = ['hazelnut', 'pistachio', 'tiramisu'];
const [flavor1, flavor2, flavor3] = iceCreamFlavors;
console.log(flavor1, flavor2, flavor3);
```
* JSON
```
let string = JSON.stringify({squirrel: false,
                             events: ["weekend"]});
console.log(string);
// → {"squirrel":false,"events":["weekend"]}
console.log(JSON.parse(string).events);
// → ["weekend"]
```
