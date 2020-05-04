const express = require('express');
const bodyParser = require('body-parser');
const app = express();

app.use(bodyParser.urlencoded({ extended: true }));

app.get('/', function (req, res) {
  res.sendFile(__dirname + '/index.html');
});

app.post('/', function (req, res) {
  // res.send('hello');
  let num1 = Number(req.body.num1);
  let num2 = Number(req.body.num2);
  let result = num1 + num2;

  res.send('The result is: ' + result);
});

app.get('/bmicalculator', function (req, res) {
  res.sendFile(__dirname + '/bmiCalculator.html');
});

app.post('/bmicalculator', function (req, res) {
  let weight = Number(req.body.weight);
  let height = Number(req.body.height) / 100;
  let result = Math.round(weight / (height * height));

  res.send('Your BMI is: ' + result);
});

app.listen(3000, function () {
  console.log('Server started on 3000 port');
});
