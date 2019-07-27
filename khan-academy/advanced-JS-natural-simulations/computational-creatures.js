//add random mover constructor
var RandomMover = function() {
  this.position = new PVector(width/2, height/2);
  this.velocity = new PVector(0, 0);
  this.acceleration = new PVector(-0.001, 0.01);
};

//add mouse mover constructor
var MouseMover = function() {
  this.position = new PVector(random(width), random(height));
  this.velocity = new PVector(0, 0);
  this.acceleration = new PVector(0, 0);
};

RandomMover.prototype.update = function() {
  this.acceleration = PVector.random2D();
  this.acceleration.mult(random(1));
  this.velocity.add(this.acceleration);
  this.velocity.limit(5);
  this.position.add(this.velocity);
};

MouseMover.prototype.update = function() {
    var mouse = new PVector(mouseX, mouseY);
    var dir = PVector.sub(mouse, this.position);
    dir.normalize();
    dir.mult(0.15);
    this.acceleration = dir;
    this.velocity.add(this.acceleration);
    this.velocity.limit(5);
    this.position.add(this.velocity);
};

RandomMover.prototype.display = function() {
    image(getImage("creatures/Winston"), this.position.x, this.position.y, 30, 30);
};

MouseMover.prototype.display = function() {
    image(getImage("creatures/OhNoes-Hmm"), this.position.x, this.position.y, 20, 20);
};


RandomMover.prototype.checkEdges = function() {
  if (this.position.x > width) {
    this.position.x = 0;
  } 
  else if (this.position.x < 0) {
    this.position.x = width;
  }

  if (this.position.y > height) {
    this.position.y = 0;
  } 
  else if (this.position.y < 0) {
    this.position.y = height;
  }
};

MouseMover.prototype.checkEdges = function() {
  if (this.position.x > width) {
    this.position.x = 0;
  } 
  else if (this.position.x < 0) {
    this.position.x = width;
  }

  if (this.position.y > height) {
    this.position.y = 0;
  } 
  else if (this.position.y < 0) {
    this.position.y = height;
  }
};

var randomMovers = [];
var mouseMovers = [];

for (var i = 0; i < 5; i++) {
    randomMovers[i] = new RandomMover();
}

for (var i = 0; i < 15; i++) {
    mouseMovers[i] = new MouseMover(); 
}

draw = function() {
    background(200, 200, 220);
    for (var i = 0; i < randomMovers.length; i++) {
        randomMovers[i].update();
        randomMovers[i].checkEdges();
        randomMovers[i].display();
    }
    for (var i = 0; i < mouseMovers.length; i++) {
        mouseMovers[i].update();
        mouseMovers[i].checkEdges();
        mouseMovers[i].display(); 
    }
};
