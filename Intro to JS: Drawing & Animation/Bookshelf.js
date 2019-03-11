var books = [
    {   title: "Tom Sawyer",
        stars: 2,
        author: "M.Twain",
        color: color(230, 46, 46),
        recommend: false    },
    {   title: "A Farewell to Arms",
        stars: 3,
        author: "E.Hemingway",
        color: color(98, 181, 196),
        recommend: true     },
    {   title: "Oliver Twist",
        stars: 4,
        author: "C.Dickens",
        color: color(138, 189, 27),
        recommend: true     },
    {   title: "An ideal husband",
        stars: 3,
        author: "O.Wilde",
        color: color(98, 181, 196),
        recommend: true    },
    {   title: "The raven",
        stars: 2,
        author: "E.Poe",
        color: color(230, 46, 46),
        recommend: false     },
    {   title: "Richard II",
        stars: 4,
        author: "Shakespeare",
        color: color(98, 181, 196),
        recommend: true     },
    {   title: "Nature",
        stars: 4,
        author: "R.Emerson",
        color: color(138, 189, 27),
        recommend: true     },
    {   title: "White fang",
        stars: 3,
        author: "J.London",
        color: color(98, 181, 196),
        recommend: true     }
];
var i, j, yShift, xShift;
var shelfsAmount = ceil(books.length / 3); 

for (i = 1; i <= shelfsAmount; i++) {
    fill(173, 117, 33);
    rect(0, 120 * i, 399, 10); // draw shelf
}

for (j = 0; j < books.length; j++) {

    if (j >= 0 && j <= 2) {
        yShift = 0;
        xShift = 0;
    } else if (j >= 3 && j <= 5) {
        yShift = 120;
        xShift = 300;
    } else if (j >= 5 && j <= 7) {
        yShift = 240;
        xShift = 600;
    }

    fill(books[j].color);
    rect(100 * j + 53 - xShift, 20 + yShift, 90, 100); // draw some books
    fill(0, 0, 0);
    text(books[j].title, 100 * j + 60 - xShift, 29 + yShift, 70, 100);
    text(books[j].author, 100 * j + 60 - xShift, 59 + yShift, 70, 100);
    for (i = 0; i < books[j].stars; i++) {
        image(getImage("cute/Star"), j * 100 + i * 20 + 58 - xShift, 90 + yShift, 20, 30);
    }
    if (books[j].recommend) {
        text("recommend", 100 * j + 60 - xShift, 79 + yShift, 70, 100);
    }

}
