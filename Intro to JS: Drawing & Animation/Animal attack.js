var bodyX = 200;
var bodyY = 320;
var bodySize = 118;

strokeWeight(3);

draw = function() {
    
    background(207, 254, 255);
    fill(0, 0, 0);
    ellipse(bodyX, bodyY-70, bodySize/2, bodySize/2); // head
    ellipse(bodyX-60, bodyY-30, bodySize/4, bodySize/4); // paw top left
    ellipse(bodyX-60, bodyY+30, bodySize/4, bodySize/4); // paw bottom left
    ellipse(bodyX+60, bodyY-30, bodySize/4, bodySize/4); // paw top right
    ellipse(bodyX+60, bodyY+30, bodySize/4, bodySize/4); // paw bottom right
    fill(255, 255, 255);
    ellipse(bodyX-10, bodyY-90, bodySize/10, bodySize/10); // left eye
    ellipse(bodyX+10, bodyY-90, bodySize/10, bodySize/10); // right eye
    fill(255, 0, 0);
    ellipse(bodyX, bodyY, bodySize, bodySize); // body
    fill(255, 255, 255);
    line(bodyX, bodyY-59, bodyX, bodyY+57); //body
    fill(0, 0, 0);
    ellipse(bodyX+30, bodyY, bodySize/5, bodySize/5); // body
    ellipse(bodyX-30, bodyY, bodySize/5, bodySize/5); // body
    
    bodyY -= 1.5;
    
};
