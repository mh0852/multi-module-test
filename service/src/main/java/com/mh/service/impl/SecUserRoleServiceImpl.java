//package com.mh.service.impl;
//
//import com.baomidou.mybatisplus.core.conditions.Wrapper;
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
//import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
//import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
//import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
//import com.baomidou.mybatisplus.extension.kotlin.KtQueryChainWrapper;
//import com.baomidou.mybatisplus.extension.kotlin.KtUpdateChainWrapper;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.mh.dao.mapper.SecUserRoleMapper;
//import com.mh.project.entity.model.SecUserRole;
//import com.mh.service.ISecUserRoleService;
//import org.springframework.stereotype.Service;
//
//import java.io.Serializable;
//import java.util.Collection;
//import java.util.List;
//import java.util.Map;
//import java.util.function.Function;
//
///**
// * <p>
// * 用户角色关系表 服务实现类
// * </p>
// *
// * @author baomidou
// * @since 2022-08-18
// */
//@Service
//public class SecUserRoleServiceImpl extends ServiceImpl<SecUserRoleMapper, SecUserRole> implements ISecUserRoleService {
//
//    @Override
//    public boolean save(SecUserRole entity) {
//        return super.save(entity);
//    }
//
//    @Override
//    public boolean saveBatch(Collection<SecUserRole> entityList) {
//        return super.saveBatch(entityList);
//    }
//
//    @Override
//    public boolean saveBatch(Collection<SecUserRole> entityList, int batchSize) {
//        return false;
//    }
//
//    @Override
//    public boolean saveOrUpdateBatch(Collection<SecUserRole> entityList) {
//        return super.saveOrUpdateBatch(entityList);
//    }
//
//    @Override
//    public boolean saveOrUpdateBatch(Collection<SecUserRole> entityList, int batchSize) {
//        return false;
//    }
//
//    @Override
//    public boolean removeById(SecUserRole entity) {
//        return super.removeById(entity);
//    }
//
//    @Override
//    public boolean removeByMap(Map<String, Object> columnMap) {
//        return super.removeByMap(columnMap);
//    }
//
//    @Override
//    public boolean remove(Wrapper<SecUserRole> queryWrapper) {
//        return super.remove(queryWrapper);
//    }
//
//    @Override
//    public boolean removeByIds(Collection<?> list, boolean useFill) {
//        return super.removeByIds(list, useFill);
//    }
//
//    @Override
//    public boolean removeBatchByIds(Collection<?> list) {
//        return super.removeBatchByIds(list);
//    }
//
//    @Override
//    public boolean removeBatchByIds(Collection<?> list, boolean useFill) {
//        return super.removeBatchByIds(list, useFill);
//    }
//
//    @Override
//    public boolean updateById(SecUserRole entity) {
//        return super.updateById(entity);
//    }
//
//    @Override
//    public boolean update(Wrapper<SecUserRole> updateWrapper) {
//        return super.update(updateWrapper);
//    }
//
//    @Override
//    public boolean update(SecUserRole entity, Wrapper<SecUserRole> updateWrapper) {
//        return super.update(entity, updateWrapper);
//    }
//
//    @Override
//    public boolean updateBatchById(Collection<SecUserRole> entityList) {
//        return super.updateBatchById(entityList);
//    }
//
//    @Override
//    public boolean updateBatchById(Collection<SecUserRole> entityList, int batchSize) {
//        return false;
//    }
//
//    @Override
//    public boolean saveOrUpdate(SecUserRole entity) {
//        return false;
//    }
//
//    @Override
//    public SecUserRole getById(Serializable id) {
//        return super.getById(id);
//    }
//
//    @Override
//    public List<SecUserRole> listByIds(Collection<? extends Serializable> idList) {
//        return super.listByIds(idList);
//    }
//
//    @Override
//    public List<SecUserRole> listByMap(Map<String, Object> columnMap) {
//        return super.listByMap(columnMap);
//    }
//
//    @Override
//    public SecUserRole getOne(Wrapper<SecUserRole> queryWrapper) {
//        return super.getOne(queryWrapper);
//    }
//
//    @Override
//    public SecUserRole getOne(Wrapper<SecUserRole> queryWrapper, boolean throwEx) {
//        return null;
//    }
//
//    @Override
//    public Map<String, Object> getMap(Wrapper<SecUserRole> queryWrapper) {
//        return null;
//    }
//
//    @Override
//    public <V> V getObj(Wrapper<SecUserRole> queryWrapper, Function<? super Object, V> mapper) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return super.count();
//    }
//
//    @Override
//    public long count(Wrapper<SecUserRole> queryWrapper) {
//        return super.count(queryWrapper);
//    }
//
//    @Override
//    public List<SecUserRole> list(Wrapper<SecUserRole> queryWrapper) {
//        return super.list(queryWrapper);
//    }
//
//    @Override
//    public List<SecUserRole> list() {
//        return super.list();
//    }
//
//    @Override
//    public <E extends IPage<SecUserRole>> E page(E page, Wrapper<SecUserRole> queryWrapper) {
//        return super.page(page, queryWrapper);
//    }
//
//    @Override
//    public <E extends IPage<SecUserRole>> E page(E page) {
//        return super.page(page);
//    }
//
//    @Override
//    public List<Map<String, Object>> listMaps(Wrapper<SecUserRole> queryWrapper) {
//        return super.listMaps(queryWrapper);
//    }
//
//    @Override
//    public List<Map<String, Object>> listMaps() {
//        return super.listMaps();
//    }
//
//    @Override
//    public List<Object> listObjs() {
//        return super.listObjs();
//    }
//
//    @Override
//    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
//        return super.listObjs(mapper);
//    }
//
//    @Override
//    public List<Object> listObjs(Wrapper<SecUserRole> queryWrapper) {
//        return super.listObjs(queryWrapper);
//    }
//
//    @Override
//    public <V> List<V> listObjs(Wrapper<SecUserRole> queryWrapper, Function<? super Object, V> mapper) {
//        return super.listObjs(queryWrapper, mapper);
//    }
//
//    @Override
//    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<SecUserRole> queryWrapper) {
//        return super.pageMaps(page, queryWrapper);
//    }
//
//    @Override
//    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
//        return super.pageMaps(page);
//    }
//
//    @Override
//    public QueryChainWrapper<SecUserRole> query() {
//        return super.query();
//    }
//
//    @Override
//    public LambdaQueryChainWrapper<SecUserRole> lambdaQuery() {
//        return super.lambdaQuery();
//    }
//
//    @Override
//    public KtQueryChainWrapper<SecUserRole> ktQuery() {
//        return super.ktQuery();
//    }
//
//    @Override
//    public KtUpdateChainWrapper<SecUserRole> ktUpdate() {
//        return super.ktUpdate();
//    }
//
//    @Override
//    public UpdateChainWrapper<SecUserRole> update() {
//        return super.update();
//    }
//
//    @Override
//    public LambdaUpdateChainWrapper<SecUserRole> lambdaUpdate() {
//        return super.lambdaUpdate();
//    }
//
//    @Override
//    public boolean saveOrUpdate(SecUserRole entity, Wrapper<SecUserRole> updateWrapper) {
//        return super.saveOrUpdate(entity, updateWrapper);
//    }
//}
