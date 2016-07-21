package com.designpattern.creational.abstractfactory.datasource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.designpattern.creational.abstractfactory.connections.Connections;

public class FileSystemDataSource extends DataSource {

	@Override
	public Connections getConnections() {
		Stream<String> lineStream=null;
		
		try {
			lineStream=Files.lines(Paths.get(System.getProperty("user.dir")+filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lineStream.forEach(System.out::println);
		
		return null;
	}


}
