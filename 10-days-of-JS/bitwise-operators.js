
function getMaxLessThanK(n, k) {
    let max = 0;
    for (let a = 1; a < n; a++) {
        for (let b = a + 1; b <= n; b++) {
            const aAndb = a & b;
            if (aAndb < k && max < aAndb) {
                max = aAndb;
            }
        }
    }
    return max;
}
