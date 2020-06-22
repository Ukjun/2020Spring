package com.kita.first.level3;

public class BoardVO {
	private String title;
	private String content;
	private int writeId;
	public BoardVO() {}
	
	
	public BoardVO(String title, String content, int writeId) {
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}
	void printInfo() {
		System.out.printf("제목은: %s 내용은: %s 쓴사람 아이디는: %d입니다",this.title,this.content,this.writeId);
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public void setWriteId(int writeId) {
		this.writeId = writeId;
	}
	public int getwriteId() {
		return writeId;
	}
}
