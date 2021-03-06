package com.woody.dao.mapper;

import com.woody.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Insert({
        "insert into user (account, nickName, ",
        "headIcon, sex, ",
        "`password`, `status`, ",
        "lastLoginTime, registerTime, ",
        "phone, email, weixin, ",
        "qq, alipay, realName, ",
        "roleId)",
        "values (#{account,jdbcType=VARCHAR}, #{nickName,jdbcType=VARCHAR}, ",
        "#{headIcon,jdbcType=VARCHAR}, #{sex,jdbcType=SMALLINT}, ",
        "#{password,jdbcType=VARCHAR}, #{status,jdbcType=SMALLINT}, ",
        "#{lastLoginTime,jdbcType=INTEGER}, #{registerTime,jdbcType=INTEGER}, ",
        "#{phone,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{weixin,jdbcType=VARCHAR}, ",
        "#{qq,jdbcType=VARCHAR}, #{alipay,jdbcType=VARCHAR}, #{realName,jdbcType=VARCHAR}, ",
        "#{roleId,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, account, nickName, headIcon, sex, `password`, `status`, lastLoginTime, registerTime, ",
        "phone, email, weixin, qq, alipay, realName, roleId",
        "from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickName", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="headIcon", property="headIcon", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.SMALLINT),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="lastLoginTime", property="lastLoginTime", jdbcType=JdbcType.INTEGER),
        @Result(column="registerTime", property="registerTime", jdbcType=JdbcType.INTEGER),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="weixin", property="weixin", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="alipay", property="alipay", jdbcType=JdbcType.VARCHAR),
        @Result(column="realName", property="realName", jdbcType=JdbcType.VARCHAR),
        @Result(column="roleId", property="roleId", jdbcType=JdbcType.BIGINT)
    })
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Update({
        "update user",
        "set account = #{account,jdbcType=VARCHAR},",
          "nickName = #{nickName,jdbcType=VARCHAR},",
          "headIcon = #{headIcon,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=SMALLINT},",
          "`password` = #{password,jdbcType=VARCHAR},",
          "`status` = #{status,jdbcType=SMALLINT},",
          "lastLoginTime = #{lastLoginTime,jdbcType=INTEGER},",
          "registerTime = #{registerTime,jdbcType=INTEGER},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "weixin = #{weixin,jdbcType=VARCHAR},",
          "qq = #{qq,jdbcType=VARCHAR},",
          "alipay = #{alipay,jdbcType=VARCHAR},",
          "realName = #{realName,jdbcType=VARCHAR},",
          "roleId = #{roleId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(User record);
}