fill(0, 0, 0);
ellipse(200, 200, 375, 375);
fill(67, 12, 245);
triangle(200, 104, 280, 280, 120, 280);
var answer = floor(random(1, 4));
if (answer === 1) {
    fill(255, 0, 0);
    text("VERY", 183, 200);
    text("DOUBTFUL", 170, 229); 
} else if (answer === 2) {
    fill(0, 255, 0);
    text("IT IS", 187, 200);
    text("CERTAIN", 174, 229);
} else if (answer === 3) {
    fill(255, 255, 0);
    text("ASK", 188, 200);
    text("AGAIN LATER", 162, 229);
}
