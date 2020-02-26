<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>登录</title>
</head>
<body>
    <div ng-app="myApp" ng-controller="myController">
        <input ng-model="username">
        <span>{{username}}</span>
        <button ng-click="myupload()">
            上传2
        </button>
        <span>
            dfdfd---{{data}}
        </span>
    </div>
<%--<script src="/js/angular-1.5.8/angular.js"></script>--%>
<script src="https://cdn.staticfile.org/angular.js/1.6.3/angular.min.js"></script>

<script src="/js//jquery/dist/jquery.min.js"></script>
    <script>
        var myApp=angular.module('myApp',[]);
/*        myApp.controller('myController', function($scope, $http) {
            $scope.username='sun';
            $http({
                method: 'GET',
                url: '/ais/sendData',
                params:{mydata:$scope.username}
            }).then(function successCallback(response) {
                $scope.data = response.data;
            }, function errorCallback(response) {
                // 请求失败执行代码
                console.log('2222222');
            });
        });*/
        myApp.controller('myController',function ($scope) {
            $scope.username='sun';
            $scope.data=1;

            $scope.myupload=function ($http) {

                $.ajax({
                    //请求方式
                    type : "GET",
                    //请求的媒体类型
                    contentType: "application/json;charset=UTF-8",
                    //请求地址
                    url : "/ais/sendData",
                    //数据，json字符串
                    data : {mydata:$scope.username},
                    //请求成功
                    success : function(result) {
                        $scope.data=result;
                        console.log("==="+result);
                    },
                    //请求失败，包含具体的错误信息
                    error : function(e){
                        console.log(e.status);
                        console.log(e.responseText);
                    }
                });
            }

        });
    </script>
<%--<script type="text/javascript" src="/js/user/login.js"></script>--%>
</body>
</html>