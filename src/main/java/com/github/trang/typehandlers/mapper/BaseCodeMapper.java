package com.github.trang.typehandlers.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.trang.typehandlers.domain.BaseCode;
import com.github.trang.typehandlers.domain.BaseCodeExample;

public interface BaseCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_base_code
     *
     * @mbg.generated
     */
    long countByExample(BaseCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_base_code
     *
     * @mbg.generated
     */
    int deleteByExample(BaseCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_base_code
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_base_code
     *
     * @mbg.generated
     */
    int insert(BaseCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_base_code
     *
     * @mbg.generated
     */
    int insertSelective(BaseCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_base_code
     *
     * @mbg.generated
     */
    List<BaseCode> selectByExample(BaseCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_base_code
     *
     * @mbg.generated
     */
    BaseCode selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_base_code
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BaseCode record, @Param("example") BaseCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_base_code
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BaseCode record, @Param("example") BaseCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_base_code
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BaseCode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_base_code
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BaseCode record);
}