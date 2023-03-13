package com.phms.mapper;

import com.phms.pojo.Pet;
import com.phms.pojo.PetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     */
    long countByExample(PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     */
    int deleteByExample(PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     */
    int insert(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     */
    int insertSelective(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     */
    List<Pet> selectByExample(PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     */
    Pet selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     */
    int updateByExampleSelective(@Param("record") Pet record, @Param("example") PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     */
    int updateByExample(@Param("record") Pet record, @Param("example") PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     */
    int updateByPrimaryKeySelective(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     */
    int updateByPrimaryKey(Pet record);

    List<Pet> getAllByLimit(Pet po);

    int countAllByLimit(Pet po);
}