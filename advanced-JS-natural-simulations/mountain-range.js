background(110, 160, 255);

var drawRangeFarther = function() {
    stroke(80, 80, 80);
    var incAmount = 0.01;
    for (var t = 0; t < incAmount*width; t += incAmount) {
        var n = noise(t);
        var y = map(n, -0.6, 1, 0, height/1.4);
        rect(t*100, height-y, 1, y);
    }
};

var drawRangeMiddle = function() {
    stroke(50, 50, 50);
    var incAmount = 0.01;
    for (var t = 0; t < incAmount*width; t += incAmount) {
        var n = noise(t);
        var y = map(n, 0, 1, 0, height/1.6);
        rect(t*120, height-y, 1, y);
    }
};

var drawRangeFront = function() {
    stroke(20, 20, 20);
    var incAmount = 0.01;
    for (var t = 0; t < incAmount*width; t += incAmount) {
        var n = noise(t);
        var y = map(n, 0, 1, 0, height/3);
        rect(t*150, height-y, 1, y);
    }
};

var drawCloud = function() {
    stroke(240, 240, 240);
    var incAmount = 0.01;
    for (var t = 0; t < incAmount*width; t += incAmount) {
        var n = noise(t);
        var y = map(n, 0, 1, 30, height/7);
        rect(t*150, 0, 1, y - 10);
    }
};

var drawBirds = function() {
    for (var i = 0; i < 10; i++) {
        var x = random(0, width - 30);
        var y = random(30, 180);
        image(getImage("space/rocketship"), x, y, 25, 30);
    }
};

var drawTrees = function() {
    for (var i = 0; i < 20; i++) {
        var x = random(0, width - 30);
        var y = random(220, height - 20);
        image(getImage("cute/TreeUgly"), x, y, 10, 20);
    }
};

drawRangeFarther();
drawRangeMiddle();
drawRangeFront();
drawCloud();
drawBirds();
drawTrees();
