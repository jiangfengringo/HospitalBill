package idControl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
	static File file = new File("d:/demo.txt");

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream(file)) {
			// if file doesn't exist, then create it
			// 写入操作
			if (!file.exists()) {
				file.createNewFile();
			}
			String content = "这是创建的Java文档";
			// get the content in bytes
			byte[] contentInBytes = content.getBytes();
			fos.write(contentInBytes);
			fos.flush();
			fos.close();
			System.out.println("Done");
			// 读取操作
			if (!file.exists() || file.isDirectory())
				throw new FileNotFoundException();
			BufferedReader br = new BufferedReader(new FileReader(file));
			String temp = null;
			StringBuffer sb = new StringBuffer();
			temp = br.readLine();
			while (temp != null) {
				sb.append(temp + " ");
				temp = br.readLine();
			}
			System.out.println(sb);
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}

}
