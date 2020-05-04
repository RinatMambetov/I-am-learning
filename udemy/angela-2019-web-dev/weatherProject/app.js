const express = require('express');
const https = require('https');
const bodyParser = require('body-parser');
const app = express();

app.use(bodyParser.urlencoded({ extended: true }));

app.get('/', function (req, res) {
  res.sendFile(__dirname + '/index.html');
});

app.post('/', function (req, res) {
  const query = req.body.cityName;
  const apiKey = 'fcbb311ba73efd725faf2672d79fdf88';
  const url =
    'https://api.openweathermap.org/data/2.5/weather?q=' +
    query +
    '&units=metric&appid=' +
    apiKey +
    '#';

  https.get(url, function (response) {
    console.log(response.statusCode);

    response.on('data', function (data) {
      const weatherData = JSON.parse(data);
      const temp = weatherData.main.feels_like;
      console.log(temp);

      const weatherDesc = weatherData.weather[0].description;
      console.log(weatherDesc);

      const weatherIcon = weatherData.weather[0].icon;
      const iconURL =
        'http://openweathermap.org/img/wn/' + weatherIcon + '@2x.png';

      res.write(
        '<h1>The temperature in ' +
          query +
          ' is: ' +
          temp +
          ' degrees Celcius.</h1>'
      );
      res.write('<h2>The weather is currently: ' + weatherDesc + '.</h2>');
      res.write('<img src="' + iconURL + '" style="background: #aaa"/>');
      res.send();
    });
  });
});

app.listen(2000, function () {
  console.log('Server is running on 2000 port.');
});
