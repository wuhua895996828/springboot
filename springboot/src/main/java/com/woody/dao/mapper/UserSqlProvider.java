package com.woody.dao.mapper;

import com.woody.domain.User;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user");
        
        if (record.getAccount() != null) {
            sql.VALUES("account", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            sql.VALUES("nickName", "#{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadIcon() != null) {
            sql.VALUES("headIcon", "#{headIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=SMALLINT}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("`password`", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("`status`", "#{status,jdbcType=SMALLINT}");
        }
        
        if (record.getLastLoginTime() != null) {
            sql.VALUES("lastLoginTime", "#{lastLoginTime,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterTime() != null) {
            sql.VALUES("registerTime", "#{registerTime,jdbcType=INTEGER}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getWeixin() != null) {
            sql.VALUES("weixin", "#{weixin,jdbcType=VARCHAR}");
        }
        
        if (record.getQq() != null) {
            sql.VALUES("qq", "#{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getAlipay() != null) {
            sql.VALUES("alipay", "#{alipay,jdbcType=VARCHAR}");
        }
        
        if (record.getRealName() != null) {
            sql.VALUES("realName", "#{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleId() != null) {
            sql.VALUES("roleId", "#{roleId,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getAccount() != null) {
            sql.SET("account = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            sql.SET("nickName = #{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadIcon() != null) {
            sql.SET("headIcon = #{headIcon,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=SMALLINT}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("`password` = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("`status` = #{status,jdbcType=SMALLINT}");
        }
        
        if (record.getLastLoginTime() != null) {
            sql.SET("lastLoginTime = #{lastLoginTime,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterTime() != null) {
            sql.SET("registerTime = #{registerTime,jdbcType=INTEGER}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getWeixin() != null) {
            sql.SET("weixin = #{weixin,jdbcType=VARCHAR}");
        }
        
        if (record.getQq() != null) {
            sql.SET("qq = #{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getAlipay() != null) {
            sql.SET("alipay = #{alipay,jdbcType=VARCHAR}");
        }
        
        if (record.getRealName() != null) {
            sql.SET("realName = #{realName,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleId() != null) {
            sql.SET("roleId = #{roleId,jdbcType=BIGINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}