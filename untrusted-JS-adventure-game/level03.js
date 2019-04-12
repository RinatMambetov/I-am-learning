/************************
 * validationEngaged.js *
 ************************
 *
 * They're really on to us now! The validateLevel function
 * has been activated to enforce constraints on what you can
 * do. In this case, you're not allowed to remove any blocks.
 *
 * They're doing all they can to keep you here. But you
 * can still outsmart them.
 */

function startLevel(map) {
    map.placePlayer(map.getWidth()-7, map.getHeight()-5);

    for (y = 10; y <= map.getHeight() - 3; y++) {
        map.placeObject(5, y, 'block');
        map.placeObject(map.getWidth() - 5, y, 'block');
    }

    for (x = 5; x <= map.getWidth() - 5; x++) {
        map.placeObject(x, map.getHeight() - 2, 'block');
        map.placeObject(x, map.getHeight() - 3, 'block');
    }

    map.placeObject(7, 5, 'exit');
}

function validateLevel(map) {
    numBlocks = 2 * (map.getHeight()-13) + 2 * (map.getWidth()-10);

    map.validateAtLeastXObjects(numBlocks, 'block');
    map.validateExactlyXManyObjects(1, 'exit');
}
 
