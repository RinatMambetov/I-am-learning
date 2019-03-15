var generator = new Random(1);
var standardDeviation = 6;
var defaultX = width/2;
var defaultY = height/2;

fill(255, 0, 0);
textSize(50);
textAlign(CENTER);
text("PRESS\nTHE MOUSE", defaultX, defaultY);

var Splatter = function() {
    this.x = defaultX;
    this.y = defaultY;
};

Splatter.prototype.display = function() {
    strokeWeight(10);
    stroke(random(0, 250), random(0, 250), random(0, 250));
    point(this.x, this.y);
};

Splatter.prototype.splat = function() {
    this.x += generator.nextGaussian() * standardDeviation;
    this.y += generator.nextGaussian() * standardDeviation;
    if (this.x > width || this.x < 0 || this.y > height || this.y < 0) {
        this.x = defaultX;
        this.y = defaultY;
    }
};

var s = new Splatter();

draw = function() {
    if (mouseIsPressed) {
        for (var i = 0; i < 60; i++) {
            s.splat();
            s.display();
        }
    }
};
