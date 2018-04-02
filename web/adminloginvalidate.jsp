<<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.*,javax.servlet.http.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html lang="en">
<head>
  
  <title>Welcome</title>
</head>

<body>
      <sql:setDataSource 
		var="usr"
			url="jdbc:mysql://127.0.0.1:330/eventproject"
			driver="com.mysql.jdbc.Driver"
			user="root" password="adtu2k15" 
		/>
		<sql:query dataSource="${usr}" var="result1" >
				select * from admin where a_username=? 
				<sql:param value="${param.a_username}"/>
		</sql:query>

		<c:forEach var="row1" items="${result1.rows}">
			<c:set var="flag1" scope="application" value="1"/>
		</c:forEach>

		<sql:query dataSource="${usr}" var="result2" >
			select * from admin where a_username=? and a_password=?
			<sql:param value="${param.a_username}"/>
			<sql:param value="${param.a_password}"/>
		</sql:query>

		<c:forEach var="row2" items="${result2.rows}">
		<c:set var="flag2" scope="application" value="1"/>
		</c:forEach>

			
			<c:choose>
			<c:when test="${flag2 eq 1}">
			<c:forEach var="row2" items="${result2.rows}">
		    <c:set var="flag2" scope="application" value="1"/>
			
				<h1>
					Welcome !!  ... <c:out value="${row2.a_username}"/>
                                        
			
		    </c:forEach>
			    <c:set var="flag1" scope="application" value="0"/>
				<c:set var="flag2" scope="application" value="0"/>
			
			</c:when>
			
			<c:when test="${flag1 eq 0}">
			
				<h1>
					Looks Like You Are Not An Admin :P
				</h1>
			
			
				<c:set var="user_flag" scope="application" value="0"/>
				<c:set var="flag" scope="application" value="0"/>
			</c:when>
			
			<c:otherwise>
			
				<h1>
					Invalid Password , Try Again !!!
				</h1>
			
				<c:set var="user_flag" scope="application" value="0"/>
				<c:set var="flag" scope="application" value="0"/>
			</c:otherwise>
			</c:choose>
		