

/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */
function reverseString(s) {
    try {
        let arr = s.split("");
        arr = arr.reverse();
        s = arr.join("");
        return console.log(s);
    }
    catch (e) {
        console.log(e.message);
        console.log(s);
    }
    // finally {
    // }
}

