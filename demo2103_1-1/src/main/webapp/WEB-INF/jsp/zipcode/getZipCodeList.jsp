<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@   page import="java.util.List,java.util.Map, com.vo.ZipCodeVO"%>
<%
   List<ZipCodeVO> zipList =
   (List<ZipCodeVO>)request.getAttribute("zipList");
   int size = 0;
   if(zipList!=null){
      size = zipList.size();
   }
   out.print("백엔드에서 넘어온 값의 크기 " +size);
   out.print("<br>");
   out.print("백엔드에서 넘어온 정보 " + zipList.get(0).getAddress());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>getZipCodeList.jsp[WEB-INF]</title>
</head>
<body>
우편 번호 검색기 페이지 입니다.
</body>
</html>