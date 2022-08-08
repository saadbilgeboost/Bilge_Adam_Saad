package com.bilgeadam_8thAugust2022.Question6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Optional;

public class Log {

	public void saveLog(Log log) {
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\mdsaa\\OneDrive\\Desktop\\Example\\log.txt");
			ObjectOutputStream write = new ObjectOutputStream(file);
			write.writeObject(log);
			write.close();

		} catch (Exception e) {
			System.out.println("File Operation error: " + e.toString());
		}
	}

	public Optional<Log> getLogFile() {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\mdsaa\\OneDrive\\Desktop\\Example\\log.txt");
			ObjectInputStream read = new ObjectInputStream(file);
			Log log = (Log) read.readObject();
			return Optional.of(log);
		} catch (Exception e) {
			System.out.println("File Operation error: " + e.toString());
			return Optional.empty();
		}
	}
}
