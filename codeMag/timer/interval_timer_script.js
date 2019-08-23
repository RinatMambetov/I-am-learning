// переменная, которая отслеживает, сколько секунд прошло
var now_seconds = 0;
var now_times = 0;
// тренировка начинается с отсчёта рабочего времени, сразу ставим этот режим
var interval_type = 'work';
// переменная для отсчёта интервалов
var intervalVariable;
// переменная, которая следит за количеством секунд в таймерах
var seconds_1 = 0;
// ставим начальные значения счётчиков минут и секунд
var timer_minutes = 0;
var timer_seconds = 0;

// подготовка звукового оповещения
function audio_change() {
  // находим аудиоэлемент на странице
  var audio = $('#audio_beep');

  // подключаем нужный файл со звуком
  $('#audio_beep source[type="audio/mp3"]').attr('src', '13438.mp3');

  // ставим звук на паузу и подгружаем его
  audio[0].pause();
  audio[0].load();
}

// разбиваем секунды на часы, минуты и секунды
function secondsToTime(seconds) {
  var h = parseInt((seconds / 3600) % 24);
  var m = parseInt((seconds / 60) % 60);
  var s = parseInt(seconds % 60);
  return {
    hours: leadZero(parseInt(h)),
    minutes: leadZero(parseInt(m)),
    seconds: leadZero(parseInt(s))
  };
}

function leadZero(num) {
  var s = '' + num;
  if (s.length < 2) {
    s = '0' + s;
  }
  return s;
}

// отображение времени на табло
function renderTimerNums(seconds) {
  var timer_nums = secondsToTime(seconds);
  $('.timer_nums.minutes').text(timer_nums.minutes);
  $('.timer_nums.seconds').text(timer_nums.seconds);
}

// функция, которая отвечает за смену времени на таймере
function timerTick(type, timer_params) {
  // увеличиваем количество прошедших секунд на единицу
  now_seconds++;

  // если идёт время тренировки
  if (interval_type == 'work') {
    // и ещё осталось время на тренировку
    if (timer_params.time_work - now_seconds > 0) {
      // показываем, сколько осталось времени
      renderTimerNums(timer_params.time_work - now_seconds);
    }

    // иначе, если тренировка закончилась
    else {
      // обнуляем табло
      renderTimerNums(0);

      // проигрываем звук уведомления
      $('#audio_beep')[0].play();

      // обнуляем секунды тренировки
      now_seconds = 0;

      // ставим режим «Отдых»
      interval_type = 'rest';

      // меняем цвет цифр на таймере
      $('.timer_panel_nums .timer_nums').removeClass('green');
      $('.timer_panel_nums .timer_nums').addClass('red');
    }
  }

  // если началось время отдыха
  else if (interval_type == 'rest') {
    // и оно ещё не закончилось
    if (timer_params.time_rest - now_seconds > 0) {
      // показываем оставшееся время
      renderTimerNums(timer_params.time_rest - now_seconds);
    }

    // а если всё-таки время отдыха закончилось
    else {
      // обнуляем табло
      renderTimerNums(0);

      // проигрываем звук уведомления
      $('#audio_beep')[0].play();

      // обнуляем секунды
      now_seconds = 0;

      // увеличиваем счётчик повторов на единицу
      now_times++;

      // если мы выполнили все повторы
      if (now_times > timer_params.interval_count) {
        // обновляем информацию на панели настроек
        $('.timer_interval_nums.times').text(timer_params.interval_count);
        $('#timer_pause').trigger('click');
        now_seconds = 0;
        $('.timer_panel_nums .timer_nums').removeClass('red');
      }

      // иначе, если количество пройденных повторов меньше, чем было задано
      else {
        // обновляем информацию на панели настроек
        $('.timer_interval_nums.times').text(now_times);
        $('.timer_panel_nums .timer_nums').removeClass('red');
        $('.timer_panel_nums .timer_nums').addClass('green');
      }

      // ставим после отдыха снова режим тренировки
      interval_type = 'work';
    }
  }
}

// обрабатываем нажатие на кнопку «Старт»
$('#timer_run').click(function() {
  // настраиваем аудио
  audio_change();

  // делаем кнопку «Старт» невидимой
  $(this).addClass('hide');

  // а кнопку «Пауза», наоборот, видимой
  $('#timer_pause').removeClass('hide');

  // записываем установленные минуты и секунды
  timer_minutes = $('.timer_nums.minutes').text();
  timer_seconds = $('.timer_nums.seconds').text();

  // переменная, которая будет хранить параметры интервального цикла
  var timer_params = {};

  // запускаем звуковое оповещение
  $('#audio_beep')[0].play();

  // устанавливаем размер тренировки...
  timer_params.time_work =
    $('.timer_interval_work .minutes').text() * 60 +
    $('.timer_interval_work .seconds').text() * 1;

  // ...отдыха,
  timer_params.time_rest =
    $('.timer_interval_rest .minutes').text() * 60 +
    $('.timer_interval_rest .seconds').text() * 1;
  // ...и количество повторений
  timer_params.interval_count =
    $('.timer_interval_count .all_times').text() * 1;

  // обновляем информацию о том, сколько подходов уже сделано
  now_times = $('.timer_interval_count .times').text() * 1;

  // если все тренировки прошли — начнём сначала
  if (now_times >= timer_params.interval_count) {
    now_times = 1;
    $('.timer_interval_count .times').text(now_times);
  }

  // если сейчас режим тренировки, то делаем табло зелёным и запоминаем количество секунд
  if (interval_type == 'work') {
    $('.timer_panel_nums .timer_nums').addClass('green');
    seconds_1 = timer_params.time_work;
  }

  // если сейчас режим отдыха, то делаем табло красным и запоминаем количество секунд
  else if ((interval_type = 'rest')) {
    $('.timer_panel_nums .timer_nums').addClass('red');
    seconds_1 = timer_params.time_rest;
  }

  // задаём интервал обновления — одна секунда
  intervalVariable = setInterval(timerTick, 1000, 'interval', timer_params);
  // выходим из функции
  return false;
});

// что будет, если мы нажмём на кнопку «Пауза»
$('#timer_pause').click(function(event, params) {
  // если кнопка сработала нормально
  if (params !== undefined) {
    // но аудиопараметры ещё не задавались
    if (params.audio === undefined) {
      // задаём параметры оповещения
      params.audio = 1;
    }
  }

  // иначе сразу задаём параметры звука
  else {
    params = { audio: 1 };
  }

  // после нажатия на кнопку «Пауза» делаем её невидимой
  $(this).addClass('hide');

  // а кнопку «Старт» — наоборот, видимой
  $('#timer_run').removeClass('hide');

  // останавливаем таймер
  clearInterval(intervalVariable);

  // если со звуком всё в порядке
  if (params.audio) {
    // проигрываем звуковое оповещение
    $('#audio_beep')[0].play();
  }

  // выходим из функции
  return false;
});

// что будет, если нажмём на кнопку «Сброс»
$('#timer_clear').click(function() {
  // имитируем нажатие на кнопку «Пауза», чтобы остановить таймер
  $('#timer_pause').trigger('click', { audio: 0 });

  // ставим режим тренировки
  interval_type = 'work';

  // убираем красный цвет на табло, которое там осталось от включения паузы
  $('.timer_panel_nums .timer_nums').removeClass('green red');

  // обнуляем табло
  renderTimerNums(0);

  // обнуляем значения служебных переменных
  now_seconds = 0;
  now_times = 0;

  // задаём начальное значение первого блока секунд
  seconds_1 = 25;

  // устанавливаем начальные значения времени тренировки, отдыха и количества повторов
  $('.timer_interval_work .minutes').text('00');
  $('.timer_interval_work .seconds').text('25');
  $('.timer_interval_rest .minutes').text('00');
  $('.timer_interval_rest .seconds').text('05');
  $('.timer_interval_count .times').text('1');
  $('.timer_interval_count .all_times').text('10');

  // выходим из функции
  return false;
});
