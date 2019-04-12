

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    for (let char of s) {
        switch (char) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                console.log(char);
                break;
        }
    }
    for (let char of s) {
        if (char !== "a" && char !== "e" && char !== "i" && char !== "o" && char !== "u") {
            console.log(char);
        }
    }
}

