const express = require('express');
const bodyParser = require('body-parser');
const ejs = require('ejs');

const items = ['one', 'two', 'three'];
const workItems = [];
const date = require(__dirname + '/date.js');

const app = express();
app.use(bodyParser.urlencoded({ extended: true }));
app.set('view engine', 'ejs');
app.use(express.static('public'));

app.get('/', function (req, res) {
  const day = date.getDate();
  res.render('list', { listTitle: day, newItems: items });
});

app.get('/work', function (req, res) {
  res.render('list', { listTitle: 'Work List', newItems: workItems });
});

app.get('/about', function (req, res) {
  res.render('about');
});

app.post('/', function (req, res) {
  const newItem = req.body.newItem;
  if (req.body.list === 'Work') {
    workItems.push(newItem);
    res.redirect('/work');
  } else {
    items.push(newItem);
    res.redirect('/');
  }
});

app.listen(3000, function () {
  console.log('server is starting on 3000 port');
});
