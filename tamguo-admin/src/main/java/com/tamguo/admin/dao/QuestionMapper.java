package com.tamguo.admin.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.tamguo.admin.model.QuestionEntity;
import com.tamguo.admin.mybatis.dao.BaseDao;

public interface QuestionMapper extends BaseDao<QuestionEntity>{

	Page<QuestionEntity> findByChapterId(@Param(value="chapterId")String chapterId);

	List<QuestionEntity> findByPaperId(@Param(value="paperId")String paperId);

	Page<QuestionEntity> queryPageByName(@Param(value="name")String name);

	Page<QuestionEntity> queryQuestionList(@Param(value="questionType")String questionType , @Param(value="uid")String uid , @Param(value="reviewPoint")String reviewPoint);

	QuestionEntity selectByUid(@Param(value="uid")String uid);

	QuestionEntity findNormalQuestion(@Param(value="uid")String uid);

}