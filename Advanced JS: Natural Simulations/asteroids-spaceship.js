angleMode = "radians";

var Spaceship = function() {
    this.position = new PVector(width/2, height - 100);
    this.velocity = new PVector(0, 0);
    this.acceleration = new PVector(0, 0);
    this.topspeed = 4;
};

Spaceship.prototype.update = function () {
    this.velocity.add(this.acceleration);
    this.velocity.limit(this.topspeed);
    this.position.add(this.velocity);
    this.acceleration.mult(0);
};

Spaceship.prototype.applyForce = function(force) {
    this.acceleration.add(force);
};

Spaceship.prototype.turnLeft = function() {
    var f = this.velocity.get();
    f.rotate(-PI/20);
    this.applyForce(f);
};

Spaceship.prototype.turnRight = function() {
    var f = this.velocity.get();
    f.rotate(PI/20);
    this.applyForce(f);
};

Spaceship.prototype.brake = function() {
    this.topspeed = 4;
};

//I don't know how to accelerate to move direction.
//My acceleration only to top (

Spaceship.prototype.turbo = function() {
    this.topspeed = 10;
    this.acceleration.mult(1000000);
};

Spaceship.prototype.display = function () {
    var angle = this.velocity.heading();
    stroke(0, 0, 0);
    strokeWeight(2);
    fill(127, 127, 127);
    
    pushMatrix();
    rectMode(CENTER);
    translate(this.position.x, this.position.y);
    rotate(angle);
    fill(255, 0, 0);
    rect(-10, -20, 10, 20);
    rect(-10, 20, 10, 20);
    triangle(0, 40, 0, -40, 60, 0);
    popMatrix();
};

Spaceship.prototype.checkEdges = function () {
    if (this.position.x > width) {
        this.position.x = 0;
    } else if (this.position.x < 0) {
        this.position.x = width;
    }
    
    if (this.position.y > height) {
        this.position.y = 0;
    } else if (this.position.y < 0) {
        this.position.y = height;
    }
};

var spaceship = new Spaceship();
var engine = new PVector(0, -0.01);

draw = function() {
    background(200, 200, 200);
    fill(255, 255, 255);
    textAlign(CENTER);
    textSize(20);
    text("Left and right arrow\nare turns to the left and to the right\npress z for acceleration top\n down arrow for break", width/2, height/2.5);
    spaceship.update();
    spaceship.checkEdges();
    spaceship.display();
    spaceship.applyForce(engine);
    keyPressed = function() {
        if (keyCode === 37) {
            spaceship.turnLeft();
        } else if (keyCode === 39) {
            spaceship.turnRight();
        } else if (keyCode === 40) {
            spaceship.brake();            
        } else if (keyCode === 90) {
            spaceship.turbo();
        }
    };
};
