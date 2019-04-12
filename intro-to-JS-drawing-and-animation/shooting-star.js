var xPos = 100;
var xPos2 = 100;
var xPos3 = 100;
var yPos = 100;
var yPos2 = 100;
var yPos3 = 100;

draw = function() {
    
    image(getImage("space/background"), 0, 0);
    
    image(getImage("cute/Star"), xPos2 + 60, yPos2);
    image(getImage("cute/Star"), xPos, yPos3 - 90);
    image(getImage("cute/Star"), xPos, yPos + 90);
    image(getImage("creatures/Winston"), 10, 140);
    
    xPos++;
    yPos++;
    yPos3--;
    xPos2 *= 1.01;
    
};
