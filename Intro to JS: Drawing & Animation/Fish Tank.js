background(28, 85, 102);

var fishX, fishY, bodyLength, bodyHeight, bodyColor, eyeSize, tailWidth, pebbleX, pebbleY;

var drawFish = function(fishX, fishY, bodyLength, bodyHeight, bodyColor, eyeSize, tailWidth) {
    fill(bodyColor);
    // body
    ellipse(fishX, fishY, bodyLength, bodyHeight);
    // tail
    var tailHeight = bodyHeight/2;
    triangle(fishX-bodyLength/2, fishY,
             fishX-bodyLength/2-tailWidth, fishY-tailHeight,
             fishX-bodyLength/2-tailWidth, fishY+tailHeight);
    // eye
    fill(33, 33, 33);
    ellipse(fishX+bodyLength/4, fishY, eyeSize, eyeSize);
};

var drawPebble = function(pebbleX, pebbleY) {
    ellipse(pebbleX, pebbleY, 30, 20);
};

draw = function() {
    fishX = random(20, 380);
    fishY = random(10, 330);
    bodyLength = random(30, 70);
    bodyHeight = bodyLength / 1.7;
    bodyColor = color(random(100, 255), random(100, 255), random(100, 255));
    eyeSize = bodyHeight/5;
    tailWidth = bodyLength / 4;
    pebbleX = random(10, 390);
    pebbleY = random(350, 390);
};

mouseClicked = function() {
    drawFish(fishX, fishY, bodyLength, bodyHeight, bodyColor, eyeSize, tailWidth);
    drawPebble(pebbleX, pebbleY);
};
