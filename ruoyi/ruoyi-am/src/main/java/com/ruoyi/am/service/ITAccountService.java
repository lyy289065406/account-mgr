package com.ruoyi.am.service;

import java.util.List;
import com.ruoyi.am.domain.TAccount;

/**
 * 应用账密Service接口
 * 
 * @author ruoyi
 * @date 2021-01-10
 */
public interface ITAccountService 
{
    /**
     * 查询应用账密
     * 
     * @param iId 应用账密ID
     * @return 应用账密
     */
    public TAccount selectTAccountById(Long iId);

    /**
     * 查询应用账密列表
     * 
     * @param tAccount 应用账密
     * @return 应用账密集合
     */
    public List<TAccount> selectTAccountList(TAccount tAccount);

    /**
     * 新增应用账密
     * 
     * @param tAccount 应用账密
     * @return 结果
     */
    public int insertTAccount(TAccount tAccount);

    /**
     * 修改应用账密
     * 
     * @param tAccount 应用账密
     * @return 结果
     */
    public int updateTAccount(TAccount tAccount);

    /**
     * 批量删除应用账密
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTAccountByIds(String ids);

    /**
     * 删除应用账密信息
     * 
     * @param iId 应用账密ID
     * @return 结果
     */
    public int deleteTAccountById(Long iId);
}
