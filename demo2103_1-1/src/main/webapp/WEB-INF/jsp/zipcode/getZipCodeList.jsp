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
   out.print("�鿣�忡�� �Ѿ�� ���� ũ�� " +size);
   out.print("<br>");
   out.print("�鿣�忡�� �Ѿ�� ���� " + zipList.get(0).getAddress());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>getZipCodeList.jsp[WEB-INF]</title>
</head>
<body>
���� ��ȣ �˻��� ������ �Դϴ�.
</body>
</html>