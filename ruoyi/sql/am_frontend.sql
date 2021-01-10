use account_mgr;

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用账密', '', '1', '/am/account', 'C', '0', 'am:account:view', '#', 'admin', sysdate(), '', null, '应用账密菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用账密查询', @parentId, '1',  '#',  'F', '0', 'am:account:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用账密新增', @parentId, '2',  '#',  'F', '0', 'am:account:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用账密修改', @parentId, '3',  '#',  'F', '0', 'am:account:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用账密删除', @parentId, '4',  '#',  'F', '0', 'am:account:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用账密导出', @parentId, '5',  '#',  'F', '0', 'am:account:export',       '#', 'admin', sysdate(), '', null, '');
