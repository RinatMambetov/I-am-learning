const express = require('express');
const bodyParser = require('body-parser');
const ejs = require('ejs');
const date = require(__dirname + '/date.js');

const items = ['one', 'two', 'three'];
const workItems = [];

const app = express();
app.set('view engine', 'ejs');
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static('public'));

app.get('/', function (req, res) {
  const day = date.getDate();
  res.render('list', { currentDay: day, newItems: items });
});

app.get('/work', function (req, res) {
  res.render('list', { currentDay: 'Work Day', newItems: workItems });
});

app.get('/about', function (req, res) {
  res.render('about', { currentDay: 'About Page' });
});

app.post('/', function (req, res) {
  let item = req.body.newItem;

  if (req.body.list === 'Work') {
    workItems.push(item);
    res.redirect('/work');
  } else {
    items.push(item);
    res.redirect('/');
  }
});

app.listen(3000, function () {
  console.log('server is running on 3000 port');
});
