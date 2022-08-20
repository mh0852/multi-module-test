package com.mh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mh.dao.mapper.SecPermissionMapper;
import com.mh.project.entity.model.SecPermission;
import com.mh.service.ISecPermissionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2022-08-18
 */
@Service
public class SecPermissionServiceImpl extends ServiceImpl<SecPermissionMapper, SecPermission> implements ISecPermissionService {

}
