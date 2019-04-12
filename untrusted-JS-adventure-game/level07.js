/*************
* colors.js *
 *************
 *
 * You're almost at the exit. You just need to get past this
 * color lock.
 *
 * Changing your environment is no longer enough. You must
 * learn to change yourself. I've sent you a little something
 * that should help with that.
 */

function startLevel(map) {
    map.placePlayer(0, 12);

    map.placeObject(5, 12, 'phone');

    // The function phone lets you call arbitrary functions,
    // as defined by player.setPhoneCallback() below.
    // The function phone callback is bound to Q or Ctrl-6.
    map.getPlayer().setPhoneCallback(function () {
        var player = map.getPlayer();
        
		if (player.atLocation(24, 12) || player.atLocation(33, 12)) {
        	player.setColor('#f00');
        } else if (player.atLocation(27, 12) || player.atLocation(36, 12)) {
        	player.setColor('#ff0');
        } else {player.setColor('#0f0')};
        
    });


    map.defineObject('redLock', {
        symbol: '☒',
        color: "#f00", // red
        impassable: function(player, object) {
            return player.getColor() != object.color;
        }
    });

    map.defineObject('greenLock', {
        symbol: '☒',
        color: "#0f0", // green
        impassable: function(player, object) {
            return player.getColor() != object.color;
        }
    });

    map.defineObject('yellowLock', {
        symbol: '☒',
        color: "#ff0", // yellow
        impassable: function(player, object) {
            return player.getColor() != object.color;
        }
    });

    for (var x = 20; x <= 40; x++) {
        map.placeObject(x, 11, 'block');
        map.placeObject(x, 13, 'block');
    }
    map.placeObject(22, 12, 'greenLock');
    map.placeObject(25, 12, 'redLock');
    map.placeObject(28, 12, 'yellowLock');
    map.placeObject(31, 12, 'greenLock');
    map.placeObject(34, 12, 'redLock');
    map.placeObject(37, 12, 'yellowLock');
    map.placeObject(40, 12, 'exit');
    for (var y = 0; y < map.getHeight(); y++) {
        if (y != 12) {
            map.placeObject(40, y, 'block');
        }
        for (var x = 41; x < map.getWidth(); x++) {
            map.setSquareColor(x, y, '#080');
        }
    }
}

function validateLevel(map) {
    map.validateExactlyXManyObjects(1, 'exit');
}

function onExit(map) {
    if (!map.getPlayer().hasItem('phone')) {
        map.writeStatus("We need the phone!");
        return false;
    } else {
        return true;
    }
}
 
