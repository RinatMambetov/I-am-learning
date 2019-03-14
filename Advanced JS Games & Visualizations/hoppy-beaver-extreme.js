//add start scene
var scene = 0;
mouseClicked = function() {
    if (scene === 0) {
        scene = 1;
    } else if (scene === 1) {
        scene = 0;
    }
};

var Beaver = function(x, y) {
    this.x = x;
    this.y = y;
    this.img = getImage("creatures/Hopper-Jumping");
    this.stars = 0;
    this.bugs = 0;
};

Beaver.prototype.draw = function() {
    fill(255, 0, 0);
    this.y = constrain(this.y, 0, height-40);
    this.x = constrain(this.x, 0, width-40);
    image(this.img, this.x, this.y, 40, 40);
};

//Add beaver's moves
Beaver.prototype.moveUp = function() {
    this.y -= 5;
};
Beaver.prototype.moveDown = function() { 
    this.y += 5;
};
Beaver.prototype.moveLeft = function() {
    this.x -= 5;
};
Beaver.prototype.moveRight = function() {
    this.x += 5;
};

Beaver.prototype.checkForStarsGrab = function(star) {
    if ((star.x >= this.x - 20 && star.x <= (this.x + 20)) &&
        (star.y >= this.y - 20 && star.y <= (this.y + 20))) {
        star.y = -400;
        this.stars++;
        playSound(getSound("retro/coin"));
    }
};

Beaver.prototype.checkForBugsGrab = function(bug) {
    if ((bug.x >= this.x - 20 && bug.x <= (this.x + 20)) &&
        (bug.y >= this.y - 20 && bug.y <= (this.y + 20))) {
        this.bugs++;
    }
};

var Star = function(x, y) {
    this.x = x;
    this.y = y;
    this.img = getImage("cute/Star");
};

Star.prototype.draw = function() {
    imageMode(CENTER);
    image(this.img, this.x, this.y, 30, 40);
};

//add enemies
var Bug = function(x, y) {
    this.x = x;
    this.y = y;
    this.img = getImage("cute/EnemyBug");
};

Bug.prototype.draw = function() {
    imageMode(CENTER);
    image(this.img, this.x, this.y, 30, 50);
};

var beaver = new Beaver(200, 200);

var stars = [];
for (var i = 0; i < 40; i++) {  
    stars.push(new Star(-i * 50 + 50, random(10, 350)));
}

var bugs = [];
for (var i = 0; i < 20; i++) {
    bugs.push(new Bug(-i * 200, random(10, 350)));
}

var grassXs = [];
for (var i = 0; i < 21; i++) { 
    grassXs.push(i*20);
}

draw = function() {
    if (scene === 0) {
        background(100, 100, 100);
        fill(255, 255, 255);
        textSize(30);
        textAlign(CENTER);
        text("Welcome to\nHoppy Beaver Extreme!!!\n\nclick for Start & Pause\npress arrows for control\ncollect stars\navoid enemy bugs\n\nGood Luck!!!", 200, 70);
    }
    
    if (scene === 1) {
        // static
        background(227, 254, 255);
        noStroke();
        fill(130, 79, 43);
        rectMode(CORNER);
        rect(0, height*0.955, width, height*0.05);
        
        for (var i = 0; i < grassXs.length; i++) {
            image(getImage("cute/GrassBlock"), grassXs[i], height*0.93, 20, 20);
            grassXs[i] += 1;
            if (grassXs[i] >= 410) {
                grassXs[i] = width - 410;
            }
        }
        
        for (var i = 0; i < stars.length; i++) {
            stars[i].draw();
            beaver.checkForStarsGrab(stars[i]);
            stars[i].x += 1;
        }
        
        for (var i = 0; i < bugs.length; i++) {
            bugs[i].draw();
            beaver.checkForBugsGrab(bugs[i]);
            bugs[i].x += 2;
        }
        
        textAlign(LEFT);
        textSize(18);
        text("Score: " + beaver.stars, 20, 30);
        
        if (beaver.stars >= 35) {
            textSize(36);
            text("YOU WIN!!!", 100, 200);
            beaver.img = getImage("creatures/Hopper-Cool");
            bugs = [];
        }
        
        if (beaver.bugs >= 1) {
            textSize(36);
            text("GAME OVER!!!", 100, 200);
            beaver.img = getImage("avatars/spunky-sam-red");
            stars = [];
        }
        
        if (keyIsPressed && keyCode === 38) {
            beaver.moveUp();
        } else if (keyIsPressed && keyCode === 40) {
            beaver.moveDown();
        } else if (keyIsPressed && keyCode === 37) {
            beaver.moveLeft();
        } else if (keyIsPressed && keyCode === 39) {
            beaver.moveRight();
        }
        beaver.draw();
    }
};
