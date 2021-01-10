use mysql;

/* 修改 root 用户加密规则 */
ALTER USER 'root'@'%' IDENTIFIED BY '123456' PASSWORD EXPIRE NEVER;

/* 更新 root 用户的密码 */
ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY '123456';

/* 刷新权限 */
FLUSH PRIVILEGES;

/* 创建 ruoyi 数据库 */
CREATE DATABASE IF NOT EXISTS ry DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;