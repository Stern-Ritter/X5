package ru.x5.hw5.Task1.Logger;

import ru.x5.hw5.Task1.Logger.Logger;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String str){
        System.out.printf("Log into console: {%s}\n", str);
    }
}
