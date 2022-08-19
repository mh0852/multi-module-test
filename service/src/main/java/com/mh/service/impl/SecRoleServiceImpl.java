package com.mh.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtQueryChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mh.dao.mapper.SecRoleMapper;
import com.mh.project.entity.model.SecRole;
import com.mh.service.ISecRoleService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2022-08-18
 */
@Service
public class SecRoleServiceImpl extends ServiceImpl<SecRoleMapper, SecRole> implements ISecRoleService {

    @Override
    public boolean save(SecRole entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<SecRole> entityList) {
        return super.saveBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<SecRole> entityList) {
        return super.saveOrUpdateBatch(entityList);
    }

    @Override
    public boolean removeById(SecRole entity) {
        return super.removeById(entity);
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return super.removeByMap(columnMap);
    }

    @Override
    public boolean remove(Wrapper<SecRole> queryWrapper) {
        return super.remove(queryWrapper);
    }

    @Override
    public boolean removeByIds(Collection<?> list, boolean useFill) {
        return super.removeByIds(list, useFill);
    }

    @Override
    public boolean removeBatchByIds(Collection<?> list) {
        return super.removeBatchByIds(list);
    }

    @Override
    public boolean removeBatchByIds(Collection<?> list, boolean useFill) {
        return super.removeBatchByIds(list, useFill);
    }

    @Override
    public boolean updateById(SecRole entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean update(Wrapper<SecRole> updateWrapper) {
        return super.update(updateWrapper);
    }

    @Override
    public boolean update(SecRole entity, Wrapper<SecRole> updateWrapper) {
        return super.update(entity, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<SecRole> entityList) {
        return super.updateBatchById(entityList);
    }

    @Override
    public SecRole getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public List<SecRole> listByIds(Collection<? extends Serializable> idList) {
        return super.listByIds(idList);
    }

    @Override
    public List<SecRole> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }

    @Override
    public SecRole getOne(Wrapper<SecRole> queryWrapper) {
        return super.getOne(queryWrapper);
    }

    @Override
    public long count() {
        return super.count();
    }

    @Override
    public long count(Wrapper<SecRole> queryWrapper) {
        return super.count(queryWrapper);
    }

    @Override
    public List<SecRole> list(Wrapper<SecRole> queryWrapper) {
        return super.list(queryWrapper);
    }

    @Override
    public List<SecRole> list() {
        return super.list();
    }

    @Override
    public <E extends IPage<SecRole>> E page(E page, Wrapper<SecRole> queryWrapper) {
        return super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<SecRole>> E page(E page) {
        return super.page(page);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<SecRole> queryWrapper) {
        return super.listMaps(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return super.listMaps();
    }

    @Override
    public List<Object> listObjs() {
        return super.listObjs();
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return super.listObjs(mapper);
    }

    @Override
    public List<Object> listObjs(Wrapper<SecRole> queryWrapper) {
        return super.listObjs(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<SecRole> queryWrapper, Function<? super Object, V> mapper) {
        return super.listObjs(queryWrapper, mapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<SecRole> queryWrapper) {
        return super.pageMaps(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return super.pageMaps(page);
    }

    @Override
    public QueryChainWrapper<SecRole> query() {
        return super.query();
    }

    @Override
    public LambdaQueryChainWrapper<SecRole> lambdaQuery() {
        return super.lambdaQuery();
    }

    @Override
    public KtQueryChainWrapper<SecRole> ktQuery() {
        return super.ktQuery();
    }

    @Override
    public KtUpdateChainWrapper<SecRole> ktUpdate() {
        return super.ktUpdate();
    }

    @Override
    public UpdateChainWrapper<SecRole> update() {
        return super.update();
    }

    @Override
    public LambdaUpdateChainWrapper<SecRole> lambdaUpdate() {
        return super.lambdaUpdate();
    }

    @Override
    public boolean saveOrUpdate(SecRole entity, Wrapper<SecRole> updateWrapper) {
        return super.saveOrUpdate(entity, updateWrapper);
    }
}
