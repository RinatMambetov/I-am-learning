// https://habr.com/ru/company/ruvds/blog/456338/

// 1. Приведение значений к логическому типу
//    const myBoolean = !!myVariable;

const myBoolean = !!1;
// console.log(myBoolean);

// 2. Избавление от повторяющихся значений в массивах
//    const deDupe = [... new Set(myArray)];

const myArray = [1, 2, 1, 3, 5, 5, 4, 3];
const deDupe = [...new Set(myArray)];
// console.log(deDupe);

// 3. Создание и установка свойств объектов по условию
//    const myObject = { ...(myProperty && { propName: myProperty }) };

const myObject = { ...(1 && { test: 2 }) };
// console.log(myObject);

// Если в результате вычисления левой части выражения будет получено нечто, воспринимаемое JS как ложное значение, то && не будет проводить дальнейшие вычисления и новое свойство не будет создано и установлено. Объект myObject будет пустым. Если же конструкция ...myProperty вернёт какой-то результат, воспринимаемый JS как истинный, благодаря конструкции && в объекте появится свойство propName, хранящее полученное значение.

// 4. Слияние объектов
//    const mergedObject = { ...objectOne, ...objectTwo };

const objectOne = [1, 2, 3];
const objectTwo = {
  five: 5,
  four: 4,
  three: 3,
  1: 2,
};
const mergedObject = { ...objectOne, ...objectTwo };
// console.log(mergedObject);

// Этот подход можно использовать для организации слияния неограниченного числа объектов. При этом если у объектов будут свойства с одинаковыми именами, в итоговом объекте останется лишь одно такое свойство, принадлежащее тому из исходных объектов, который расположен правее других. Обратите внимание на то, что здесь используется мелкое копирование свойств объектов.

// 5. Обмен значений переменных
//    [varA, varB] = [varB, varA];

let varA = 'a';
let varB = 'b';
[varA, varB] = [varB, varA];

// После этого то, что было в varA, попадёт в varB, и наоборот. Это возможно благодаря использованию внутренних механизмов деструктурирования.

// 6. Удаление ложных значений из массива
//    const clean = dirty.filter(Boolean);

const dirty = [0, 1, false, 2, null, 3, undefined, 4, NaN, '', [], {}, 5];
const clean = dirty.filter(Boolean);
// console.log(clean);

// 7. Преобразование чисел в строки и наоборот
//    const stringArray = numberArray.map(String);
//    const numberArray = stringArray.map(Number);

let numberArray = [1, 2, 3, 4, 5];
const stringArray = numberArray.map(String);
// console.log(stringArray);
numberArray = stringArray.map(Number);
// console.log(numberArray);

// 8. Извлечение значений свойств объектов
//    const {original: newName} = myObject;

const myNewObject = { one: 1, two: 2, three: 3 };
const { two: newTwo } = myNewObject;
// console.log(newTwo);

// 9. Форматирование JSON-кода
//    const formatted = JSON.stringify(myObj, null, 2);

// Метод stringify принимает три параметра. Первый — это JavaScript-объект. Второй, необязательный, представляет собой функцию, которую можно использовать для обработки JSON-кода, получающегося в ходе преобразования объекта. Последний параметр указывает на то, сколько пробелов нужно использовать при формировании отступов в JSON-коде. Если опустить последний параметр, то весь полученный JSON-код будет представлять собой одну длинную строку. Если в объекте myObj есть циклические ссылки, преобразовать его в формат JSON не удастся.

// 10. Быстрое создание числовых массивов
//     const numArray = Array.from(new Array(52, (x, i) => i));

const numArray = Array.from(new Array(20), (x, i) => i);
// console.log(numArray);

// 11. Создание кодов для двухфакторной аутентификации
const code = Math.floor(Math.random() * 1000000)
  .toString()
  .padStart(6, '0');
// console.log(code);

// 12. Перемешивание массива
//     myArray.sort(() => Math.random() - 0.5);
numArray.sort(() => Math.random() - 0.5);
// console.log(numArray);

// 13. Создание глубоких копий объектов
//     const myClone = JSON.parse(JSON.stringify(originalObject));
// если в originalObject есть циклические ссылки, то создать его копию не удастся. Эту технику рекомендуется использовать на простых объектах, которые вы создаёте сами.

// Мелкую копию объекта можно создать с помощью синтаксиса spread:
// const myClone = { ...orignalObject };

const myClone = [...numArray];
// console.log(myClone);
