var col = 0;

draw = function() {
    
    background(0, 0, 100);
    fill(255, col, 0);
    textSize(40);
    var head = createFont('cursive');
    textFont(head);
    text("STUFFED HOPPER!", 20, 70);
    textSize(15);
    text("SO SOFT! DON'T GO TO SWiM WITHOUT ONE!", 25, 130);
    image(getImage("creatures/Hopper-Happy"), 140, 200);
   
    col += 2;
    if (col === 254) {
        col = 0;
    }
    
};
