Language : us | [ru](./README.ru-RU.md)

# Traffic Lights
This is my traffic light program. The program has 3 buttons with pictures of 3 circles and when you click on any of the buttons, the background color changes

<h2 align="center">Compatibility</h2>  

| <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Android_robot.svg/800px-Android_robot.svg.png_48x48.png" alt="Edge" width="45px" height="50px" /></br>Android | <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Apple_logo_grey.svg/1724px-Apple_logo_grey.svg.png" alt="Edge" width="45px" height="50px" /></br>Apple |
:-------:|:-------:|
|    ✔️  |    ❌  |

![Gif](gif.gif) 

<h1 align="center">Important code moments</h1> 

In this project, instead of using a `Button`, I used `ImageButton`. This made it possible to insert an image into the button

The main code is Java. The code is quite simple, there is only one point

```
redButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mainLayout.setBackgroundColor(Color.RED);
                textView.setText("Red");
            }
        });
```
This is an example of using an `event handler`. In this case, it simply changes the appearance of the application interface in response to user actions
