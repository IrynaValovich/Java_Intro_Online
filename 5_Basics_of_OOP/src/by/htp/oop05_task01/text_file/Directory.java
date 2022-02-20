package by.htp.oop05_task01.text_file;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {
	
	private String title;	
	private List<TextFile> textFiles = new ArrayList<TextFile>();
	
	public Directory(String title) {
		this.title = title;	
		textFiles = new ArrayList<TextFile>();
	}
	
	public final void addFiles(TextFile... file) {
		for (int i = 0; i < file.length; i++) {
			textFiles.add(file[i]);
		}
	}
	
	public void renameDirectory(String name) {
		this.setTitle(name);
	}
	
	public void removeTextFile(TextFile file) {
		for (int i = 0; i < textFiles.size(); i++) {
			if (textFiles.get(i).equals(file)) {
				textFiles.remove(i);
			}			
		}
	}
	
	public String getTitle() {
		return title;
	}	
	
	public List<TextFile> getTextFiles() {
		return textFiles;
	}
	
	private void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(textFiles, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		return Objects.equals(textFiles, other.textFiles) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "title: " + getTitle() + ", textFiles: " + getTextFiles();
	}
}
