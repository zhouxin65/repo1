<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>账户列表</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="${pageContext.request.contextPath}/js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <h3 style="text-align: center">员工信息列表</h3>
        <div class="col-lg-2"></div>
        <div class="col-lg-8">

                <table border="1" class="table table-bordered table-hover">
                    <tr class="success">
                        <th>员工号</th>
                        <th>姓名</th>
                        <th>部门号</th>
                        <th>职位</th>
                        <th>入职时间</th>
                        <th>联系方式</th>
                    </tr>

                    <c:forEach items="${list}" var="emp">

                        <tr>
                            <td>${emp.emp_id}</td>
                            <td>${emp.emp_name}</td>
                            <td>${emp.dept_id}</td>
                            <td>${emp.job_name}</td>
                            <td><fmt:formatDate pattern="yyyy年MM月dd日" value="${emp.join_date}"></fmt:formatDate></td>
                            <td>${emp.telephone}</td>
                        </tr>
                    </c:forEach>

                    <tr>
                        <td colspan="9" align="center">
                            <a class="btn btn-primary" href="${pageContext.request.contextPath}/add.jsp">添加账户</a>
                        </td>
                    </tr>
                </table>
        </div>
        <div class="col-lg-2"></div>
    </div>
</div>
</body>
</html>

