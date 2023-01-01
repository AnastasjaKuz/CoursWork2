package ru.itmoCoursProject;

import java.io.*;

public class Operations<T> {
    private File file;

    public Operations() {
        setFile();
    }

    public void setFile() {
        file = new File("game_progress.txt");
    }

    public T readFromFile(){
        Object result = null;

        try(FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput)){

            result = objectInput.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return (T) result;
    }

    public void writeToFile(T object){
        try(FileOutputStream fileOutput = new FileOutputStream(file);
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {

            objectOutput.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
