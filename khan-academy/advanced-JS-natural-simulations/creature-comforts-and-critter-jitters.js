
// Attractor: An object type for a draggable attractive body in our world
var Attractor = function() {
    this.position = new PVector(width/2, height/2);
    this.mass = 20;
    this.G = 3;
    this.dragOffset = new PVector(0, 0);
    this.dragging = false;
    this.rollover = false;
};

Attractor.prototype.calculateAttraction = function(mover) {
    // Calculate direction of force
    var force = PVector.sub(this.position, mover.position);
    // Distance between objects       
    var distance = force.mag();
    // Limiting the distance to eliminate "extreme"
    // results for very close or very far objects                            
    distance = constrain(distance, 5, 25);
    // Normalize vector                   
    force.normalize();
    // Calculate gravitional force magnitude  
    var strength = (this.G * this.mass * mover.mass) / (distance * distance);
    // Get force vector --> magnitude * direction
    force.mult(strength);
    return force;
};

// Method to display
Attractor.prototype.display = function() {
    imageMode(CENTER);
    if (this.dragging) {
        fill(50, 50, 50);
    } else if (this.rollover) {
        fill(100, 100, 100);
    } else {
        fill(175, 175, 175, 200);
    }
    image(getImage("creatures/BabyWinston"), this.position.x, this.position.y, this.mass*2, this.mass*2);
};

// The methods below are for mouse interaction
  
Attractor.prototype.handleHover = function(mx, my) {
    var d = dist(mx, my, this.position.x, this.position.y);
    if (d < this.mass) {
        this.rollover = true;
    } else {
        this.rollover = false;
    }
};

Attractor.prototype.handlePress = function(mx, my) {
    var d = dist(mx, my, this.position.x, this.position.y);
    if (d < this.mass) {
        debug("setting dragging to true");
        this.dragging = true;
        this.dragOffset.x = this.position.x - mx;
        this.dragOffset.y = this.position.y - my;
    }
};

Attractor.prototype.handleDrag = function(mx, my) {
    debug("should we be dragging?" + this.dragging);
    if (this.dragging) {
        this.position.x = mx + this.dragOffset.x;
        this.position.y = my + this.dragOffset.y;
    }
};

Attractor.prototype.stopDragging = function() {
    debug("setting dragging to false");
    this.dragging = false;
};


var Mover = function(mass, x, y) {
    this.position = new PVector(x, y);
    this.velocity = new PVector(1, 0);
    this.acceleration = new PVector(0, 0);
    this.mass = mass;
};
  
Mover.prototype.applyForce = function(force) {
    var f = PVector.div(force,this.mass);
    this.acceleration.add(f);
};
  
Mover.prototype.update = function() {
    this.velocity.add(this.acceleration);
    this.position.add(this.velocity);
    this.acceleration.mult(0);
};

Mover.prototype.display = function() {
    fill(255, 255, 255, 127);
    image(getImage("creatures/Winston"), this.position.x, this.position.y, this.mass*16, this.mass*16);
};

Mover.prototype.checkEdges = function() {
    if (this.position.x > width) {
        this.position.x = width;
        this.velocity.x *= -1;
    } else if (this.position.x < 0) {
        this.velocity.x *= -1;
        this.position.x = 0;
    }
    if (this.position.y > height) {
        this.velocity.y *= -1;
        this.position.y = height;
    }
};

var movers = [];
var attractor = new Attractor();

for (var i = 0; i < 10; i++) {
    movers[i] = new Mover(random(0.1, 2), random(width), random(height));
}

var draw = function() {
    background(50, 50, 70);

    attractor.display();
    for (var i = 0; i < movers.length; i++) {
        var force = attractor.calculateAttraction(movers[i]);
        movers[i].applyForce(force);

        movers[i].update();
        movers[i].display();
    }
};

var mouseMoved = function() {
    attractor.handleHover(mouseX, mouseY);
};

var mousePressed = function() {
    attractor.handlePress(mouseX, mouseY);
};

var mouseDragged = function() {
    attractor.handleHover(mouseX, mouseY);
    attractor.handleDrag(mouseX, mouseY);
};

var mouseReleased = function() {
    attractor.stopDragging();
};
