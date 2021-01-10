package com.ruoyi.am.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.am.domain.TAccount;
import com.ruoyi.am.service.ITAccountService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 应用账密Controller
 * 
 * @author ruoyi
 * @date 2021-01-10
 */
@Controller
@RequestMapping("/am/account")
public class TAccountController extends BaseController
{
    private String prefix = "am/account";

    @Autowired
    private ITAccountService tAccountService;

    @RequiresPermissions("am:account:view")
    @GetMapping()
    public String account()
    {
        return prefix + "/account";
    }

    /**
     * 查询应用账密列表
     */
    @RequiresPermissions("am:account:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TAccount tAccount)
    {
        startPage();
        List<TAccount> list = tAccountService.selectTAccountList(tAccount);
        return getDataTable(list);
    }

    /**
     * 导出应用账密列表
     */
    @RequiresPermissions("am:account:export")
    @Log(title = "应用账密", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TAccount tAccount)
    {
        List<TAccount> list = tAccountService.selectTAccountList(tAccount);
        ExcelUtil<TAccount> util = new ExcelUtil<TAccount>(TAccount.class);
        return util.exportExcel(list, "account");
    }

    /**
     * 新增应用账密
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存应用账密
     */
    @RequiresPermissions("am:account:add")
    @Log(title = "应用账密", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TAccount tAccount)
    {
        return toAjax(tAccountService.insertTAccount(tAccount));
    }

    /**
     * 修改应用账密
     */
    @GetMapping("/edit/{iId}")
    public String edit(@PathVariable("iId") Long iId, ModelMap mmap)
    {
        TAccount tAccount = tAccountService.selectTAccountById(iId);
        mmap.put("tAccount", tAccount);
        return prefix + "/edit";
    }

    /**
     * 修改保存应用账密
     */
    @RequiresPermissions("am:account:edit")
    @Log(title = "应用账密", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TAccount tAccount)
    {
        return toAjax(tAccountService.updateTAccount(tAccount));
    }

    /**
     * 删除应用账密
     */
    @RequiresPermissions("am:account:remove")
    @Log(title = "应用账密", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tAccountService.deleteTAccountByIds(ids));
    }
}
