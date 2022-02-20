package by.htp.oop05_task01.text_file;

import java.util.Objects;

public class File {
	
	private String name;
	private String format;	
	
	public File(String name) {
		this.name = name;		
	}
	
	public static File createFile(String name, String format) {
		File file = new File(name);		
		file.setFormat(format);		
		return file;
	}
	
	public void renameFile(String name) {
		this.setName(name);
	}	
	
	public String getName() {
		return name;
	}
	
	public String getFormat() {
		return format;
	}	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}	

	@Override
	public int hashCode() {
		return Objects.hash(format, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		return Objects.equals(format, other.format) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "name: " + getName() + ", format: " + getFormat();
	}	
}
