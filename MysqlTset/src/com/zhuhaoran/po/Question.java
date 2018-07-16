package com.zhuhaoran.po;

public class Question {
	
	private int tid;
	private String question;
	private String opA;
	private String opB;
	private String opC;
	private String opD;
	private String answer;
	public int getIdd() {
		return tid;
	}
	public void setIdd(int idd) {
		this.tid = idd;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOpA() {
		return opA;
	}
	public void setOpA(String opA) {
		this.opA = opA;
	}
	public String getOpB() {
		return opB;
	}
	public void setOpB(String opB) {
		this.opB = opB;
	}
	public String getOpC() {
		return opC;
	}
	public void setOpC(String opC) {
		this.opC = opC;
	}
	public String getOpD() {
		return opD;
	}
	public void setOpD(String opD) {
		this.opD = opD;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		return "Question [tid=" + tid + ",question=" + question + ",opA=" + opA
		+ ", opB=" + opB + ", opC=" + opC + ", opD=" + opD
		+ ", answer=" + answer + "]";
	}
	
	

}
