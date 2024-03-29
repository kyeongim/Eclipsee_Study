package com.ddos.web.notice;

public class NoticeVO {
	private int noticeNum;
	private String noticeTitle;
	private String noticeDate;
	private String noticeCont;
	private String memberId;
	private int noticeCnt;
	// 검색
	private String searchType;
	private String searchKeyword;

	// 페이징 처리
	private int First;
	private int Last;

	public int getFirst() {
		return First;
	}

	public void setFirst(int first) {
		First = first;
	}

	public int getLast() {
		return Last;
	}

	public void setLast(int last) {
		Last = last;
	}

	public int getNoticeNum() {
		return noticeNum;
	}

	public void setNoticeNum(int noticeNum) {
		this.noticeNum = noticeNum;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getNoticeCont() {
		return noticeCont;
	}

	public void setNoticeCont(String noticeCont) {
		this.noticeCont = noticeCont;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getNoticeCnt() {
		return noticeCnt;
	}

	public void setNoticeCnt(int noticeCnt) {
		this.noticeCnt = noticeCnt;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	@Override
	public String toString() {
		return "NoticeVO [noticeNum=" + noticeNum + ", noticeTitle=" + noticeTitle + ", noticeDate=" + noticeDate
				+ ", noticeCont=" + noticeCont + ", memberId=" + memberId + ", noticeCnt=" + noticeCnt + ", searchType="
				+ searchType + ", searchKeyword=" + searchKeyword + ", First=" + First + ", Last=" + Last + "]";
	}


}
