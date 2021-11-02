<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<%@ page import="com.qna.dao.QnaDao" %>
<%@ page import="com.qna.dto.QnaDto" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	
	.qna{
		text-align: center;
		position: relative;
		top:20%;
		width:99%;
		margin: 0 auto;
		
	}
	.faq{
		display: inline-block;
		width : 500px;
		height : 300px;
		margin: 10px;
		border : 1px solid black;
	}
	.faq_type{
		display: inline-block;
		width : 100px;
		margin: 5px;
		text-align: center;
		float: left;
	}
	.faq_type tbody{
		display: inline-block;
	}
	.faq_list{
		display: inline-block;
		width : 300px;
		margin: 5px;
	}
	.faq_list tbody{
		display: inline-block;
	}
	.qna_list{
		width : 500px;
		height : 200px;
		display: inline-block;
	}
	.qna_table{
		margin: 10px;
		width:480px;
	}
	.qna_button{
		display: in
	}
</style>
<script type="text/javascript"	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

</script>
</head>
<% 
	QnaDao dao = new QnaDao(); 
	List<QnaDto> list = dao.selectAll();
%>
<body>
	<header><%@ include file="form/header.jsp" %></header>
	<br>
	<div class="qna">
		<div class="faq">
			<table class="faq_type">
				<tr>
					<th>유형</th>	
				</tr>
				<div style="overflow: auto;">
					<tr>
					
					</tr>
				</div>
			</table>
			<table class="faq_list">
				<tr>
					<th>자주하는 질문 리스트</th>
				</tr>
				<div style="overflow: auto;">
					<tr>
					
					</tr>			
				</div>	
			</table>
		</div>
		<br><br>
		<div style="text-align: right; width: 500px; display: inline-block;">
			<input type="button" value="1대1 문의" class="qna_button" onclick="location.href='MainController?command=writeform'">
		</div>
		<div class="qna_list">
			<table class="qna_table" border="1">
				<tr>
					<th style="width:50px;">NO.</th>
					<th>제목</th>
					<th style="width:50px;">답변상태</th>
				</tr>
<%
	for(int i = 0; i<list.size(); i++){
%>				

					<tr>
						<td><%=list.get(i).getQano() %></td>
						<td><a href="question_board_selectone.jsp?qano=<%=list.get(i).getQano()%>"><%=list.get(i).getQatitle() %></a></td>
						<td><%=list.get(i).getQastatus() %></td>
					</tr>

<%
	}

	final int ROWSIZE = 4;	// 한 페이지에 보일 게시물 수
	final int BLOCK = 10; // 아래에 보일 페이지 최대개수 1~5 / 6~10 / 11~15 식으로 5개로 고정
	
	int pg = 1; // 기본 페이지 값
	
	if(request.getParameter("pg")!=null){
		pg = Integer.parseInt(request.getParameter("pg"));
	}
	
	int start = (pg*ROWSIZE) - (ROWSIZE-1);
	int end = (pg*ROWSIZE);
	
	int allPage = 0;
	
	int startPage = ((pg-1)/BLOCK*BLOCK)+1;
	int endPagee = ((pg-1)/BLOCK*BLOCK)+BLOCK;

%>				
			</table>
		</div>
		<br>
	</div>
	<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<footer><%@ include file="form/footer.jsp" %></footer>
</body>
</html>