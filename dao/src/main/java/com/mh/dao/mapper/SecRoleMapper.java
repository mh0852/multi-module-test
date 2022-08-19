package com.mh.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mh.project.entity.model.SecRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author baomidou
 * @since 2022-08-18
 */
@Mapper
@Repository
public interface SecRoleMapper extends BaseMapper<SecRole> {

}
