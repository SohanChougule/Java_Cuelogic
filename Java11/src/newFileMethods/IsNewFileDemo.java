package newFileMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsNewFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path;
		try {
			path = Files.createTempFile("test-file", ".txt");
			Path otherPath = Paths.get(path.toString());
	        boolean sameFile = Files.isSameFile(path, otherPath);
	        System.out.println(sameFile);

	        Path anotherPath = Files.createTempFile("test-file", ".txt");
	        sameFile = Files.isSameFile(path, anotherPath);
	        System.out.println(sameFile);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	}

}
