var xPositions = [];
var yPositions = [];

for (var i = 0; i < 50; i++) {
    xPositions[i] = random(0, 400);
    yPositions[i] = random(0, 400);
}

mouseClicked = function() {
    xPositions.push(mouseX);
    yPositions.push(mouseY);
};

draw = function() {
    background(84, 177, 194);

    for (var i = 0; i < xPositions.length; i++) {
        noStroke();
        image(getImage("creatures/Winston"), xPositions[i], yPositions[i], 15, 15);
        yPositions[i] += 5;
        if (yPositions[i] > 400) {
            yPositions[i] = 0;
        }
    }
};
