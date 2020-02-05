<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>登录</title>
    <link rel="stylesheet" href="/js/layui/css/layui.css">
</head>
<body>
    <div style="width: 30%;margin-left: 35%;margin-top: 15%">
    <form class="layui-form" action="" style="width: 100%;">
        <h2 style="text-align: center;margin-bottom: 10px;margin-left: 15%;">登录</h2>
        <div class="layui-form-item">
            <label class="layui-form-label">账号</label>
            <div class="layui-input-block">
                <input type="text" id="username" name="username" lay-verify="username" autocomplete="off" placeholder="请输入用户名" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-block">
                <input type="password" id="password" name="password" lay-verify="pass" lay-reqtext="用户名是必填项，岂能为空？" placeholder="请输入密码" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="text-align: center">
            <div class="layui-input-block">
                <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
    </div>
<script src="/js/layui/layui.js"></script>
<script src="/js//jquery/dist/jquery.min.js"></script>
<script type="text/javascript" src="/js/user/login.js"></script>
</body>
</html>