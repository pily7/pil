<%@ page contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta HTTP-EQUIV="Pragma" CONTENT="no-cache">
<meta HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<meta HTTP-EQUIV="Expires" CONTENT="0">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${basePath}/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${basePath}/bootstrap/css/bootstrap-datepicker.min.css" />
<link rel="stylesheet"
	href="${basePath}/bootstrap/css/bootstrap-table.min.css">
<link rel="stylesheet"
	href="${basePath}/bootstrap/css/font-awesome.min.css">
<link rel="stylesheet" href="${basePath}/dist/css/ionicons.min.css">
<link rel="stylesheet" href="${basePath}/dist/css/AdminLTE.min.css">
<link rel="stylesheet"
	href="${basePath}/dist/css/skins/_all-skins.min.css">
<link rel="stylesheet"
	href="${basePath}/bootstrap/plugins/ztree/css/metroStyle/metroStyle.css">
<link rel="stylesheet"
	href="${basePath}/bootstrap/plugins/treegrid/jquery.treegrid.css">
	
	
<script src="${basePath}/jquery/jquery-3.2.1.min.js"></script>	
<script src="${basePath}/jquery/jquery-ui.min.js"></script>
<script src="${basePath}/jquery/jquery.validate.min.js"></script>
<script src="${basePath}/jquery/jquery.form.js"></script>
<script src="${basePath}/bootstrap/js/bootstrap.min.js"></script>
<script src="${basePath}/bootstrap/js/bootstrap-datepicker.min.js"></script>
<script src="${basePath}/bootstrap/js/bootstrap-table.min.js"></script>
<script src="${basePath}/bootstrap/plugins/layer/layer.js"></script>
<script
	src="${basePath}/bootstrap/plugins/treegrid/jquery.treegrid.min.js"></script>
<script
	src="${basePath}/bootstrap/plugins/treegrid/jquery.treegrid.bootstrap3.js"></script>
<script
	src="${basePath}/bootstrap/plugins/treegrid/jquery.treegrid.extension.js"></script>
<script src="${basePath}/bootstrap/plugins/treegrid/tree.table.js"></script>
<script
	src="${basePath}/bootstrap/plugins/ztree/jquery.ztree.all.min.js"></script>
   
   
       <script type="text/javascript" src="${basePath}/js/index.js"></script>
       <script type="text/javascript" src="${basePath}/js/page.js"></script>
       <script type="text/javascript" src="${basePath}/js/signup.js"></script>
      
       
       <!-- AdminLTE App -->
<script src="${basePath}/dist/js/app.min.js"></script>
   </head>
    <body style="font-size:30px;">
      这是首页
      <form method="post" id="queryFormId">
      <div>
         <span>
         <input type="text" id="gjzId"  placeholder="关键字" />
		</span>
          <span>
				<button type="button"  class="btn btn-primary btn-search">查询</button>	    
			</span>		
			<span>	
				<a id="wyftId">我要发帖</a>
			</span>
			<span>	
				<a id="loginId">登录</a>
			</span>
			<span>	
				<a id="signupId">注册</a>
			</span>
     </div>
      <div>
            <span>	
				<a id="ktId">看帖</a>
			</span>
			<span>	
				<a>图片</a>
			</span>
			<span>	
				<a>视频</a>
			</span>
			<span>	
				<a>资源</a>
			</span>
      </div>
      <div id="nrId">
          <table class="table table-bordered">
          <!-- ajax异步获得,并将数据填充到tbody中 -->
					<tbody id="tbodyId">
					</tbody>
		  </table>
      </div>
      <%@include file="../pages/page.jsp"%>
      <!-- Modal(模态框) -->
	<div class="modal fade" id="modal-dialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true"  >
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<!-- 此位置放置具体页面的位置 -->
				<div class="modal-body"></div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary ok">Save
						changes</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- modal -->
	</form>
    </body>
</html>