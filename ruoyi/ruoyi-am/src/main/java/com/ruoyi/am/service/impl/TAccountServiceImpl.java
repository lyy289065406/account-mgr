package com.ruoyi.am.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.am.mapper.TAccountMapper;
import com.ruoyi.am.domain.TAccount;
import com.ruoyi.am.service.ITAccountService;
import com.ruoyi.common.core.text.Convert;

/**
 * 应用账密Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-01-10
 */
@Service
public class TAccountServiceImpl implements ITAccountService 
{
    @Autowired
    private TAccountMapper tAccountMapper;

    /**
     * 查询应用账密
     * 
     * @param iId 应用账密ID
     * @return 应用账密
     */
    @Override
    public TAccount selectTAccountById(Long iId)
    {
        return tAccountMapper.selectTAccountById(iId);
    }

    /**
     * 查询应用账密列表
     * 
     * @param tAccount 应用账密
     * @return 应用账密
     */
    @Override
    public List<TAccount> selectTAccountList(TAccount tAccount)
    {
        return tAccountMapper.selectTAccountList(tAccount);
    }

    /**
     * 新增应用账密
     * 
     * @param tAccount 应用账密
     * @return 结果
     */
    @Override
    public int insertTAccount(TAccount tAccount)
    {
        return tAccountMapper.insertTAccount(tAccount);
    }

    /**
     * 修改应用账密
     * 
     * @param tAccount 应用账密
     * @return 结果
     */
    @Override
    public int updateTAccount(TAccount tAccount)
    {
        return tAccountMapper.updateTAccount(tAccount);
    }

    /**
     * 删除应用账密对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTAccountByIds(String ids)
    {
        return tAccountMapper.deleteTAccountByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除应用账密信息
     * 
     * @param iId 应用账密ID
     * @return 结果
     */
    @Override
    public int deleteTAccountById(Long iId)
    {
        return tAccountMapper.deleteTAccountById(iId);
    }
}
