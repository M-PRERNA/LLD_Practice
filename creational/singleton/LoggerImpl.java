package com.learn.spring.lld.creational.singleton;

import java.io.FileWriter;
import java.io.PrintWriter;
import org.springframework.boot.logging.LogLevel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.IOException;


public class LoggerImpl implements Logger {

    private static LoggerImpl log = null;
    private String filePath;
    private PrintWriter writer;

    private LoggerImpl(){} //preventing external object creation

    public static LoggerImpl getInstance(){
        if(log == null){
            log = new LoggerImpl();
        }
        return log;
    }

    public static void resetInstance(){
        if(log != null){
            log.close();
        }
        log = null;
    }


    @Override
    public void log(LogLevel level, String message) {
        if(writer==null){
            throw new IllegalStateException("logger not initialised");



        }
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);

        StringBuilder sb = new StringBuilder();

        sb.append(timestamp)
                .append(" ")
                .append(level)
                .append(" ")
                .append(message);

        writer.println(sb.toString());

    }

    @Override
    public void setLogFile(String filePath) {
        this.filePath = filePath;
        try{

            writer = new PrintWriter(new FileWriter(filePath, true));
        }

        catch(IOException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public String getLogFile() {
        return filePath;
    }

    @Override
    public void flush() {
        if(writer != null){
            writer.flush();
        }
    }

    @Override
    public void close() {
        if(writer != null){
            writer.flush();
            writer.close();
            writer = null;
        }
    }
}
