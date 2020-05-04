const express = require('express');
const app = express();

app.get('/', function (req, res) {
  res.send('<h1>HELLO</h1>');
  // console.log(req);
});

app.get('/contact', function (req, res) {
  res.send('<p>My email: astrakhan.rinat@gmail.com</p>');
});

app.get('/about', function (req, res) {
  res.send("<p>I'm Rinat. I want to be a super programmer!</p>");
});

app.listen(3000, function () {
  console.log('Server started on 3000 port');
});
