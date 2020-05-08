exports.getDate = function () {
  const date = new Date();
  const options = {
    weekday: 'long',
    day: 'numeric',
    month: 'long',
  };
  return date.toLocaleDateString('en-GB', options);
};