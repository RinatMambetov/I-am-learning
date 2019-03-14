// Scroll down to "About" for instructions on this project ↓
var backgroundColor = [214, 247, 202];
var hoverBackgroundColor = [200, 230, 200];

var Tile = function(x, y, face) {
    this.x = x;
    this.y = y;
    this.width = 70;
    this.face = face;
    this.isFaceUp = false;
    this.isMatch = false;
    this.backgroundColorR = backgroundColor[0];
    this.backgroundColorG = backgroundColor[1];
    this.backgroundColorB = backgroundColor[2];
};

Tile.prototype.draw = function() {
    fill(this.backgroundColorR, this.backgroundColorG, this.backgroundColorB);
    strokeWeight(2);
    rect(this.x, this.y, this.width, this.width, 10);
    if (this.isFaceUp) {
        image(this.face, this.x, this.y, this.width, this.width);
    } else {
        image(getImage("avatars/leaf-green"), this.x, this.y, this.width, this.width);
    }
};

Tile.prototype.isUnderMouse = function(x, y) {
    return x >= this.x && x <= this.x + this.width  &&
        y >= this.y && y <= this.y + this.width;
};

// Add a hover state to the tiles
Tile.prototype.changeBackgroundColor = function(mouseX, mouseY) {
    if (mouseX >= this.x && mouseX <= this.x + this.width  &&
        mouseY >= this.y && mouseY <= this.y + this.width) {
        this.backgroundColorR = hoverBackgroundColor[0];
        this.backgroundColorG = hoverBackgroundColor[1];
        this.backgroundColorB = hoverBackgroundColor[2];
    } else {
        this.backgroundColorR = backgroundColor[0];
        this.backgroundColorG = backgroundColor[1];
        this.backgroundColorB = backgroundColor[2];
    }
};

// Add cooler win state
Tile.prototype.cascading = function() {
    this.y += 15;
};

// Global config
var NUM_COLS = 5;
var NUM_ROWS = 4;

// Declare an array of all possible faces
var faces = [
    getImage("avatars/leafers-seed"),
    getImage("avatars/leafers-seedling"),
    getImage("avatars/leafers-sapling"),
    getImage("avatars/leafers-tree"),
    getImage("avatars/leafers-ultimate"),
    getImage("avatars/marcimus"),
    getImage("avatars/mr-pants"),
    getImage("avatars/mr-pink"),
    getImage("avatars/old-spice-man"),
    getImage("avatars/robot_female_1")
];

// Make an array which has 2 of each, then randomize it
var possibleFaces = faces.slice(0);
var selected = [];
for (var i = 0; i < (NUM_COLS * NUM_ROWS) / 2; i++) {
    // Randomly pick one from the array of remaining faces
    var randomInd = floor(random(possibleFaces.length));
    var face = possibleFaces[randomInd];
    // Push twice onto array
    selected.push(face);
    selected.push(face);
    // Remove from array
    possibleFaces.splice(randomInd, 1);
}

// Now shuffle the elements of that array
var shuffleArray = function(array) {
    var counter = array.length;

    // While there are elements in the array
    while (counter > 0) {
        // Pick a random index
        var ind = Math.floor(Math.random() * counter);
        // Decrease counter by 1
        counter--;
        // And swap the last element with it
        var temp = array[counter];
        array[counter] = array[ind];
        array[ind] = temp;
    }
};
shuffleArray(selected);

// Add a timer
var seconds = 0;
var minutes = 0;
var startTime = floor(millis() / 1000);
var countTime = function() {
    var count = floor(millis() / 1000) - startTime;
    return count;
};

// Add restart button
var drawRestartButton = function() {
    fill(255, 255, 200);
    rect(10, 7, 100, 25, 5);
    fill(0, 0, 0);
    textSize(12);
    text("NEW GAME", 26, 24);
};

// Create the tiles
var tiles = [];
for (var i = 0; i < NUM_COLS; i++) {
    for (var j = 0; j < NUM_ROWS; j++) {
        var tileX = i * 78 + 10;
        var tileY = j * 78 + 40;
        var tileFace = selected.pop();
        tiles.push(new Tile(tileX, tileY, tileFace));
    }
}

background(255, 255, 255);

var numTries = 0;
var numMatches = 0;
var flippedTiles = [];
var delayStartFC = null;

mouseClicked = function() {
    for (var i = 0; i < tiles.length; i++) {
        var tile = tiles[i];
        if (tile.isUnderMouse(mouseX, mouseY)) {
            if (flippedTiles.length < 2 && !tile.isFaceUp) {
                tile.isFaceUp = true;
                flippedTiles.push(tile);
                if (flippedTiles.length === 2) {
                    numTries++;
                    if (flippedTiles[0].face === flippedTiles[1].face) {
                        flippedTiles[0].isMatch = true;
                        flippedTiles[1].isMatch = true;
                        flippedTiles.length = 0;
                        numMatches++;
                    }
                    if (numMatches === tiles.length/2) {
                        seconds = floor(countTime() % 60);
                        minutes = floor(countTime() - seconds) / 60;
                    }
                    delayStartFC = frameCount;
                }
            } 
            loop();
        }
    }
    if (mouseX >= 10 && mouseX <= 100 && mouseY >= 7 && mouseY <= 25) {
        Program.restart();
    }
};

draw = function() {
    background(255, 255, 255);
    if (delayStartFC && (frameCount - delayStartFC) > 30) {
        for (var i = 0; i < tiles.length; i++) {
            var tile = tiles[i];
            if (!tile.isMatch) {
                tile.isFaceUp = false;
            }
        }
        flippedTiles = [];
        delayStartFC = null;
        noLoop();
    }
    
    for (var i = 0; i < tiles.length; i++) {
        tiles[i].draw();
        tiles[i].changeBackgroundColor(mouseX, mouseY);
    }
    
    if (numMatches === tiles.length/2) {
        for (var i = 0; i < tiles.length; i++) {
            tiles[i].cascading();
        }
        fill(100, 100, 100);
        textSize(28);
        text("You found them all in " + numTries + " tries\n" + "in " + minutes + " minutes and " + seconds + " seconds!", 15, 200);
    }
    
    drawRestartButton();
};

noLoop();
    
