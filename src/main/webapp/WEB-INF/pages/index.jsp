<%@ page contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8" %>
<html>
   <head></head>
    <body style="font-size:30px;">
      这是首页
      
      <div>
         <span>
         <input type="text" id="searchNameId" class="form-control" placeholder="关键字">
		</span>
          <span>
				<button type="button" class="btn btn-primary btn-search">查询</button>	    
			</span>		
			<span>	
				<a>我要发帖</a>
			</span>
			<span>	
				<a>登录</a>
			</span>
			<span>	
				<a>注册</a>
			</span>
     </div>
      <div>
            <span>	
				<a>看帖</a>
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
      <div></div>
      <!-- Modal(模态框) -->
	<div class="modal fade" id="modal-dialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
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
    </body>
</html>