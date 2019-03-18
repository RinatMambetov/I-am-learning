

/*
 * Determine the original side lengths and return an array:
 * - The first element is the length of the shorter side
 * - The second element is the length of the longer side
 * 
 * Parameter(s):
 * literals: The tagged template literal's array of strings.
 * expressions: The tagged template literal's array of expression values (i.e., [area, perimeter]).
 */
function sides(literals, ...expressions) {
    const area = expressions[0];
    const perimeter = expressions[1];
    const shorterSide = (perimeter - Math.sqrt(perimeter ** 2 - 16 * area)) / 4;
    const longerSide = (perimeter + Math.sqrt(perimeter ** 2 - 16 * area)) / 4;
    const result = [shorterSide, longerSide];
    return result.sort();
}

