package codelearning.basic.io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FilesWalkFileTreeExample {

	public static void main(String[] args) {
		Path path = Paths.get("c:/DELL");
		try {
			Files.walkFileTree(path, new FileVisitor<Path>() {
				@Override
				public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
					System.out.println("Post Visit Directory: " + dir);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
					System.out.println("Pre Visit Directory: " + dir);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					System.out.println("Visit File: " + file);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
					System.out.println("Visit Failed File: " + file);
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
