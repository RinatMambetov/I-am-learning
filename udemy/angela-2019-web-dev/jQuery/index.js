let title = $('h1');
title.css('color', 'red');
title.addClass('big-font margin-50');
title.removeClass('margin-50');
title.text('Good');
$('button').html('<em>Click!</em>');
$('a').attr('href', 'https://www.google.com');

$(document).keypress(function (event) {
  title.text(event.key);
});

$('a').mouseover(function () {
  $('a').addClass('big-font');
});

$('a').mouseleave(function () {
  $('a').removeClass('big-font');
});

let paragraph = $('.paragraph');

$('.last-button').before('<p>text before last button</p>');
$('.last-button').after('<p>text after last button</p>');
paragraph.prepend('<p>inner text before</p>');
paragraph.append('<p>inner text after</p>');
paragraph.addClass('bg-grey');

title.click(function () {
  title.fadeOut();
  title.fadeIn();
});

$(document).keypress(function (event) {
  if (event.key === 's') {
    paragraph.slideUp().slideDown().animate({ opacity: 0.5 });
  }
});
