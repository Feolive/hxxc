package com.charmyin.cmstudio.tzyc._7s.service;

import com.charmyin.cmstudio.tzyc._7s.vo._7sEvaluateType;
import com.charmyin.cmstudio.tzyc._7s.vo._7sEvaluateTypeExample;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface _7sEvaluateTypeService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_type
     *
     * @mbggenerated
     */
    int insert(_7sEvaluateType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_type
     *
     * @mbggenerated
     */
    int insertSelective(_7sEvaluateType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_type
     *
     * @mbggenerated
     */
    List<_7sEvaluateType> selectByExample(_7sEvaluateTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_type
     *
     * @mbggenerated
     */
    _7sEvaluateType selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(_7sEvaluateType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_7s_evaluate_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(_7sEvaluateType record);
    
    
    
    List<_7sEvaluateType> findAll_7sEvaluateTypes(_7sEvaluateType _7sEvaluateType);
    
    
    List<_7sEvaluateType> getlist_7sEvaluateTypes();
    
	int deleteItem(String typeId);
    
}