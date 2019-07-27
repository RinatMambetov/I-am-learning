var roof = getImage("cute/RoofSouth");
var wall = getImage("cute/WoodBlock");
var grass = getImage("cute/GrassBlock");
var windows = getImage("cute/WindowTall");
var i, j;

background(219, 255, 255);

noStroke();

for(i = 1; i < 12; i++) {
    for(j = 3; j < 9; j++) {
        image(wall, i * 30, j * 40, 30, 60);
    }
}

for(i = 0; i < 20; i++) {
    image(grass, i * 30, 340, 30, 60);
}

for(i = 0; i < 4; i++) {
    image(windows, i * 64 + 85, 165, 40, 90);
}

fill(219, 255, 255);
rect(0, 150, 60, 207);
rect(340, 150, 400, 207);

for(i = 1; i < 7; i++) {
    for(j = 0; j < 3; j++) {
        image(roof, i * 50, j * 49, 50, 70);
    }
}

fill(50, 51, 40);
rect(180, 280, 40, 77);

image(getImage("cute/Key"), 175, 280, 50, 70);

fill(219, 255, 255);
triangle(0, 0, 250, 0, 0, 200);
triangle(400, 0, 150, 0, 400, 200);
