package com.zhuhaoran.mapper;

import java.util.List;

import com.zhuhaoran.po.Question;

public interface QuestionMapper {

	public List<Question> findAllQuestion() throws Exception;
}
