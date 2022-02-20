package by.htp.oop05_task01.text_file;

import java.util.Objects;

public class TextFile extends File {
	
	private TextBody body = new TextBody();
	private Directory directory;

	private TextFile(String name) {
		super(name);		
	}	
	
	public static TextFile createFile(String name, Directory directory) {
		TextFile textFile = new TextFile(name);
		textFile.setDirectory(directory);
		textFile.getDirectory().addFiles(textFile);
		textFile.setFormat(".txt");				
		return textFile;
	}	
	
	public void obtainBody(String text) {		
		body.setText(text);
	}	
	
	@Override
	public void renameFile(String name) {		
		super.renameFile(name);
	}

	@Override
	public String getName() {		
		return super.getName();
	}

	@Override
	public String getFormat() {		
		return super.getFormat();
	}	

	public TextBody getBody() {
		return body;
	}
	
	public Directory getDirectory() {
		return directory;
	}
	
	private void setDirectory(Directory directory) {
		this.directory = directory
;	}

	public class TextBody {		
		private String text;
		
		public TextBody() {}
		
		private void setText(String text) {
			this.text = text;
		}
		
		public String getText() {
			return text;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(text);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null || getClass() != obj.getClass())
				return false;
			TextBody other = (TextBody) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(text, other.text);
		}

		private TextFile getEnclosingInstance() {
			return TextFile.this;
		}

		@Override
		public String toString() {
			return text;
		}		
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(body, directory);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		return Objects.equals(body, other.body) && Objects.equals(directory, other.directory);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ", name: " + getName() + ", format: " + getFormat()
				+ ", directory: " + getDirectory() + ", body: " + getBody() + "]";
	}	
}
