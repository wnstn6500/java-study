package sec01.exam02;

public class Board {
	private String subject;
	private String content;
	private String writer;
	
	public Board(String subject,String content,String writer) {
		this.setSubject(subject);
		this.setContent(content);
		this.setWriter(writer);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	
	
	
}
