Язык : [us](./README.md) | ru

# Светофор
Это моя программа `Светофор`. В программе есть 3 кнопки с изображениями 3 кругов, и когда вы нажимаете на любую из кнопок, цвет фона меняется

<h2 align="center">Совместимость</h2>  

| <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Android_robot.svg/800px-Android_robot.svg.png_48x48.png" alt="Edge" width="45px" height="50px" /></br>Android | <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Apple_logo_grey.svg/1724px-Apple_logo_grey.svg.png" alt="Edge" width="45px" height="50px" /></br>Apple |
:-------:|:-------:|
|    ✔️  |    ❌  |

![Gif](gif.gif) 

<h1 align="center">Важные моменты кода</h1> 

В этом проекте вместо использования `Button` я использовал `ImageButton`. Это позволило вставить изображение в кнопку

Основной код - Java. Код довольно прост, есть только один момент

```
redButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mainLayout.setBackgroundColor(Color.RED);
                textView.setText("Red");
            }
        });
```
Это пример использования "обработчика событий". В данном случае он просто изменяет внешний вид интерфейса приложения в ответ на действия пользователя
