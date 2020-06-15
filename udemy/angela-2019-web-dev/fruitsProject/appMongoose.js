const mongoose = require('mongoose');

// Connection URL
mongoose.connect('mongodb://localhost:27017/fruitsDB', {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

const fruitSchema = new mongoose.Schema({
  name: {
    type: String,
    required: [true, 'check your data entry, no name!'],
  },
  rating: {
    type: Number,
    min: 1,
    max: 10,
  },
  review: String,
});

const Fruit = mongoose.model('Fruit', fruitSchema);

const pineapple = new Fruit({
  name: 'pineapple',
  rating: 10,
  review: 'sweet',
});

// pineapple.save();

const personSchema = new mongoose.Schema({
  name: String,
  age: Number,
  favouriteFruit: fruitSchema,
});

const Person = mongoose.model('Person', personSchema);

const person = new Person({
  name: 'Amy',
  age: 37,
  favouriteFruit: pineapple,
});

// person.save();

const kiwi = new Fruit({
  name: 'kiwi',
  rating: 8,
  review: 'good',
});

const orange = new Fruit({
  name: 'orange',
  rating: 9,
  review: 'great',
});

const banana = new Fruit({
  name: 'banana',
  rating: 8,
  review: 'good',
});

// Person.updateOne(
//   { _id: '5ee5d9e47bd4b963305b86b0' },
//   { favouriteFruit: banana },
//   function (err) {
//     if (err) console.log(err);
//     else console.log('Data succesfully updated!');
//   }
// );

// Fruit.insertMany([kiwi, orange, banana], function (err) {
//   if (err) console.log(err);
//   else console.log('Succesfully saved all the fruits to fruitsDB');
// });

// Fruit.updateOne(
//   { _id: '5ee5b5ba962ff714a14ef44c' },
//   { name: 'plum' },
//   function (err) {
//     if (err) console.log(err);
//     else console.log('Data succesfully updated!');
//   }
// );

// Person.deleteMany(
//   {
//     name: 'Rin',
//   },
//   function (err) {
//     if (err) console.log(err);
//     else console.log('Persons deleted succesfull!');
//   }
// );

Fruit.find(function (err, fruits) {
  if (err) console.log(err);
  else {
    mongoose.connection.close();

    fruits.forEach((element) => {
      console.log(element.name);
    });
  }
});

Person.find(function (err, people) {
  if (err) console.log(err);
  else {
    mongoose.connection.close();

    people.forEach((element) => {
      console.log(element.name);
    });
  }
});
