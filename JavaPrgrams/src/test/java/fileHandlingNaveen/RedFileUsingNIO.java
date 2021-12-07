package fileHandlingNaveen;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class RedFileUsingNIO {

	public static void main(String[] args) {

		String path="C:\\Users\\pandu.damera\\Downloads\\FileHandle\\Pandu.txt";

		try {
			List<String> li = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);

			Iterator<String> it = li.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}