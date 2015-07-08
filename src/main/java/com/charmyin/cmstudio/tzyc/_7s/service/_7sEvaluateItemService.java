package com.charmyin.cmstudio.tzyc._7s.service;

import com.charmyin.cmstudio.tzyc._7s.vo._7sEvaluateItem;
import com.charmyin.cmstudio.tzyc._7s.vo._7sEvaluateItemExample;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface _7sEvaluateItemService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_item
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_item
     *
     * @mbggenerated
     */
    int insert(_7sEvaluateItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_item
     *
     * @mbggenerated
     */
    int insertSelective(_7sEvaluateItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_item
     *
     * @mbggenerated
     */
    List<_7sEvaluateItem> selectByExample(_7sEvaluateItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_item
     *
     * @mbggenerated
     */
    _7sEvaluateItem selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(_7sEvaluateItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(_7sEvaluateItem record);
    
    List<_7sEvaluateItem> selectByTypeId(String typeId);
    
    List<_7sEvaluateItem> getList_7sEvaluateItem();
    
    List<_7sEvaluateItem> findAll_7sEvaluateItem(_7sEvaluateItem record);
}