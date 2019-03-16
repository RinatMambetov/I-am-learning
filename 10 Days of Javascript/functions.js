
/*
 * Create the function factorial here
 */
const factorial = function (n) {
    if (n > 1) {
        return n * factorial(n - 1);
    } else return 1;
}
