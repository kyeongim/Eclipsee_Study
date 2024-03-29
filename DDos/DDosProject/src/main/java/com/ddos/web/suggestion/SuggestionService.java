package com.ddos.web.suggestion;

import java.util.List;

public interface SuggestionService {
	public void insertSuggestion(SuggestionVO vo);
	public void updateSuggestion(SuggestionVO vo);
	public void deleteSuggestion(SuggestionVO vo);
	public void increaseCnt(SuggestionVO vo);
	public SuggestionVO getSuggestion(SuggestionVO vo);
	public List<SuggestionVO> getSuggestionList(SuggestionVO vo);
	public void create(SuggestionVO vo);
	public SuggestionVO AdmingetSuggestion(SuggestionVO vo);
	public List<SuggestionVO> AdmingetSuggestionList(SuggestionVO vo);

	// 전체 건수
	public int getCount(SuggestionVO vo);
}