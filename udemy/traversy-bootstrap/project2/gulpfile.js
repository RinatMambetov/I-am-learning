const gulp = require('gulp');
const sass = require('gulp-sass');
const browserSync = require('browser-sync').create();
const autoprefixer = require('gulp-autoprefixer');

function goSass() {
  return gulp
    .src('app/scss/**/*.scss')
    .pipe(sass().on('error', sass.logError))
    .pipe(gulp.dest('app/afterSass'))
    .pipe(browserSync.stream());
}

function goAutoprefixer() {
  return gulp
    .src('app/afterSass/*.css')
    .pipe(
      autoprefixer({
        cascade: false
      })
    )
    .pipe(gulp.dest('app/afterAutoprefixer'));
}

function goServer() {
  browserSync.init({
    notify: false,
    server: {
      baseDir: 'app'
    }
  });
  gulp.watch('app/scss/**/*.scss', goSass);
  gulp.watch('app/afterSass/*.css', goAutoprefixer);
  gulp.watch(['app/*.html', 'app/js/**/*.js']).on('change', browserSync.reload);
}

exports.go = goServer;
