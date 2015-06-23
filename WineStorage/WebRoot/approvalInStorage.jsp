<%--
  Created by IntelliJ IDEA.
  User: ruan
  Date: 6/23/15
  Time: 12:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
  <meta name="author" content="GeeksLabs">
  <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
  <link rel="shortcut icon" href="img/favicon.png">

  <title>Profile | Creative - Bootstrap 3 Responsive Admin Template</title>

  <link href="css/bootstrap.min.css" rel="stylesheet"/>
  <!-- bootstrap theme -->
  <link href="css/bootstrap-theme.css" rel="stylesheet"/>
  <!--external css-->
  <!-- font icon -->
  <link href="css/elegant-icons-style.css" rel="stylesheet" />
  <link href="css/font-awesome.min.css" rel="stylesheet" />
  <!-- full calendar css-->
  <link href="assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
  <link href="assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
  <!-- easy pie chart-->
  <link href="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
  <!-- owl carousel -->
  <link rel="stylesheet" href="css/owl.carousel.css" type="text/css"/>
  <link href="css/jquery-jvectormap-1.2.2.css" rel="stylesheet"/>
  <!-- Custom styles -->
  <link rel="stylesheet" href="css/fullcalendar.css"/>
  <link href="css/widgets.css" rel="stylesheet"/>
  <link href="css/style.css" rel="stylesheet"/>
  <link href="css/style-responsive.css" rel="stylesheet" />
  <link href="css/xcharts.min.css" rel=" stylesheet"/>
  <link href="css/jquery-ui-1.10.4.min.css" rel="stylesheet"/>
  <link href="css/font-chinese.css" rel="stylesheet"/>

  <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
  <!--[if lt IE 9]>
  <script src="js/html5shiv.js"></script>
  <script src="js/respond.min.js"></script>
  <script src="js/lte-ie7.js"></script>
  <![endif]-->
</head>

<body>
<!-- container section start -->
<section id="container" class="">
  <!--header start-->
  <header class="header dark-bg">
    <div class="toggle-nav">
      <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
    </div>

    <!--logo start-->
    <a href="index.jsp" class="logo">Nice <span class="lite">Admin</span></a>
    <!--logo end-->


    <div class="top-nav notification-row">
      <!-- notificatoin dropdown start-->
      <ul class="nav pull-right top-menu">

        <li class="dropdown">
          <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="img/avatar1_small.jpg">
                            </span>
            <span class="username"><%=request.getSession().getAttribute("userName")%></span>
            <b class="caret"></b>
          </a>
          <ul class="dropdown-menu extended logout">
            <div class="log-arrow-up"></div>
            <li class="eborder-top">
              <a data-toggle="modal" data-target="#changePassword"><i class="icon_profile"></i> 修改密码</a>
            </li>

            <li>
              <a href="<%=request.getContextPath()%>/logout.action"><i class="icon_key_alt"></i> 退出</a>
            </li>

          </ul>
        </li>
        <!-- user login dropdown end -->
      </ul>
      <!-- notificatoin dropdown end-->
    </div>
  </header>
  <!--header end-->

  <!--sidebar start-->
  <aside>
    <div id="sidebar"  class="nav-collapse ">
      <!-- sidebar menu start-->
      <ul class="sidebar-menu">
        <li class="active">
          <a class="" href="<%=request.getContextPath()%>/itemManage.action">
            <i class="icon_house_alt"></i>
            <span>商品管理</span>
          </a>
        </li>
        <li class="sub-menu">
          <a href="javascript:;" class="">
            <i class="icon_document_alt"></i>
            <span>入出库管理</span>
            <span class="menu-arrow arrow_carrot-right"></span>
          </a>
          <ul class="sub">
            <li><a class="" href="<%=request.getContextPath()%>/inStorageManage.action">入库管理</a></li>
            <li><a class="" href="<%=request.getContextPath()%>/outStorageManage.action">出库管理</a></li>
          </ul>
        </li>
        <li class="sub-menu">
          <a href="javascript:;" class="">
            <i class="icon_desktop"></i>
            <span>审批管理</span>
            <span class="menu-arrow arrow_carrot-right"></span>
          </a>
          <ul class="sub">
            <li><a class="" href="<%=request.getContextPath()%>/approvalInStorage.action">入库审批</a></li>
            <li><a class="" href="<%=request.getContextPath()%>/approvalOutStorage.action">出库审批</a></li>
          </ul>
        </li>

      </ul>
      <!-- sidebar menu end-->
    </div>
  </aside>
  <!--sidebar end-->

  <!--main content start-->
  <section id="main-content">
    <section class="wrapper">
      <div class="row">
        <div class="col-lg-12">
          <h3 class="page-header"><i class="fa fa-user-md"></i> 入库审批</h3>
          <ol class="breadcrumb">
            <li><i class="fa fa-home"></i><a href="index.jsp">主页</a></li>
            <li><i class="icon_documents_alt"></i>审批</li>
            <li><i class="fa fa-user-md"></i>入库审批</li>
          </ol>
        </div>
      </div>
      <div class="row">
        <!-- profile-widget -->
        <div class="col-lg-12">
          <div class="profile-widget profile-widget-info">
            <div class="panel-body">

            </div>
          </div>
        </div>
      </div>
      <!-- page start-->
      <div class="row">
        <div class="col-lg-12">
          <section class="panel">
            <header class="panel-heading tab-bg-info">
              <ul class="nav nav-tabs">
                <li class="active">
                  <a data-toggle="tab" href="#pending">
                    <i class="icon-user"></i>
                    待审批
                  </a>
                </li>
                <li>
                  <a data-toggle="tab" href="#pended">
                    <i class="icon-user"></i>
                    已通过审批
                  </a>
                </li>
                <li>
                  <a data-toggle="tab" href="#rejected">
                    <i class="icon-user"></i>
                    未通过审批
                  </a>
                </li>
              </ul>
            </header>

            <div class="panel-body">
              <div class="tab-content">
                <div id="pending" class="tab-pane active">
                    <table class="table bootstrap-datatable">
                      <thead>
                      <tr>
                        <th>序号</th>
                        <th>商品名称</th>
                        <th>入库数量</th>
                        <th>来源地</th>
                        <th>经办人</th>
                        <th>状态</th>
                        <th>操作</th>
                      </tr>
                      </thead>
                      <tbody id="pendingInStorageList">

                      </tbody>
                    </table>
                </div>
                <!-- profile -->
                <div id="pended" class="tab-pane">
                    <table class="table bootstrap-datatable">
                      <thead>
                      <tr>
                        <th>序号</th>
                        <th>商品名称</th>
                        <th>入库数量</th>
                        <th>来源地</th>
                        <th>经办人</th>
                        <th>审批人</th>
                        <th>审批时间</th>
                        <th>状态</th>
                      </tr>
                      </thead>
                      <tbody id="pendedInStorageList">

                      </tbody>
                    </table>
                </div>

                <div id="rejected" class="tab-pane">
                  <table class="table bootstrap-datatable">
                    <thead>
                    <tr>
                      <th>序号</th>
                      <th>商品名称</th>
                      <th>入库数量</th>
                      <th>来源地</th>
                      <th>经办人</th>
                      <th>审批人</th>
                      <th>审批时间</th>
                      <th>状态</th>
                    </tr>
                    </thead>
                    <tbody id="rejectedInStorageList">

                    </tbody>
                  </table>
                </div>

              </div>

            </div>
          </section>
        </div>
      </div>


      <div class="modal fade" id="changePassword" tabindex="-1" role="dialog" aria-labelledby="changePasswordLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
              <h4 class="modal-title text-center" id="changePasswordTitle">修改密码</h4>
            </div>

            <form class="form-validate form-horizontal" id="changePassword_form" method="post" action="<%=request.getContextPath()%>/changePassword.action">
              <div class="modal-body">
                <div class="form-group">
                  <label for="name" class="control-label col-lg-3">登录名<span class="required">*</span></label>
                  <div class="col-lg-8">
                    <input class="form-control" id="name" name="name" type="text"/>
                  </div>
                </div>
                <div class="form-group">
                  <label for="oldPassword" class="control-label col-lg-3">旧密码<span class="required">*</span></label>
                  <div class="col-lg-8">
                    <input class="form-control password-field" id="oldPassword" name="oldPassword" type="password"/>
                  </div>
                </div>
                <div class="form-group">
                  <label for="newPassword" class="control-label col-lg-3">新密码<span class="required">*</span></label>
                  <div class="col-lg-8">
                    <input class="form-control password-field" id="newPassword" name="newPassword" type="password"/>
                  </div>
                </div>
                <div class="form-group">
                  <label for="newPasswordAgain" class="control-label col-lg-3">再输一次新密码<span class="required">*</span></label>
                  <div class="col-lg-8">
                    <input class="form-control password-field" id="newPasswordAgain" name="newPasswordAgain" type="password"/>
                  </div>
                </div>


              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-warning" data-dismiss="modal">取消</button>
                <button type="submit" class="btn btn-primary">确定修改</button>
              </div>
            </form>

          </div>
        </div>
      </div>

      <!-- page end-->
    </section>
  </section>
  <!--main content end-->
</section>
<form name="failInStorageForm" method="post" action="<%=request.getContextPath()%>/failInStorage.action">
  <input type="hidden" id="failId" name="inStorageId" value=""/>
</form>

<form name="passInStorageForm" method="post" action="<%=request.getContextPath()%>/passInStorage.action">
  <input type="hidden" id="passId" name="inStorageId" value=""/>
</form>
<!-- container section end -->
<!-- javascripts -->
<script src="js/jquery.js"></script>
<script src="js/jquery-ui-1.10.4.min.js"></script>
<script src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.9.2.custom.min.js"></script>
<!-- bootstrap -->
<script src="js/bootstrap.min.js"></script>
<!-- nice scroll -->
<script src="js/jquery.scrollTo.min.js"></script>
<script src="js/jquery.nicescroll.js" type="text/javascript"></script>
<!-- charts scripts -->
<script src="assets/jquery-knob/js/jquery.knob.js"></script>
<script src="js/jquery.sparkline.js" type="text/javascript"></script>
<script src="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
<script src="js/owl.carousel.js" ></script>
<!-- jQuery full calendar -->
<script src="js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
<script src="assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
<!--script for this page only-->
<script src="js/calendar-custom.js"></script>
<script src="js/jquery.rateit.min.js"></script>
<!-- custom select -->
<script src="js/jquery.customSelect.min.js" ></script>
<script src="assets/chart-master/Chart.js"></script>

<!--custome script for all page-->
<script src="js/scripts.js"></script>
<!-- custom script for this page-->
<script src="js/sparkline-chart.js"></script>
<script src="js/easy-pie-chart.js"></script>
<script src="js/jquery-jvectormap-1.2.2.min.js"></script>
<script src="js/jquery-jvectormap-world-mill-en.js"></script>
<script src="js/xcharts.min.js"></script>
<script src="js/jquery.autosize.min.js"></script>
<script src="js/jquery.placeholder.min.js"></script>
<script src="js/gdp-data.js"></script>
<script src="js/morris.min.js"></script>
<script src="js/sparklines.js"></script>
<script src="js/charts.js"></script>
<script src="js/jquery.slimscroll.min.js"></script>

<script type="text/javascript">
  //knob
  var items = new Array();
  var inStorages = new Array();
  function getJson(){
    $.getJSON("<%=request.getContextPath()%>/getAllInStorage.action",
            function(data){
              items.length = 0;
              inStorages.length = 0;
              var map = JSON.parse(data);
              var itemStr = JSON.stringify(map["items"]);
              var inStorageStr = JSON.stringify(map["inStorages"]);
              var itemMapInside = eval("(" + itemStr + ")");
              var inStorageMapInside = eval("(" + inStorageStr + ")");
              var itemIndex = 0;
              var inStorageIndex = 0;
              for(var key in itemMapInside){
                var itemMap = {};
                for(var inKey in itemMapInside[key]){
                  itemMap[inKey] = itemMapInside[key][inKey].toString();
                }
                items[itemIndex++] = itemMap;
              }
              for(var key in inStorageMapInside){
                var inStorageMap = {};
                for(var inKey in inStorageMapInside[key]){
                  inStorageMap[inKey] = inStorageMapInside[key][inKey].toString();
                }
                inStorages[inStorageIndex++] = inStorageMap;
              }
              replaceModelSelectHtml();

    })
  }

  function failInStorage(id){
    document.getElementById("failId").value = id;
    document.failInStorageForm.submit();
  }
  function passInStorage(id){
    document.getElementById("passId").value = id;
    document.passInStorageForm.submit();
  }

  function replaceModelSelectHtml(){
    var Html = '';
    var index = 1;
    for(var i = 0; i < inStorages.length; i++) {
      var inStorage = inStorages[i];
      if (inStorage["status"] == "0") {
        var content = '<strong>条形码: </strong>' + inStorage["itemBarcode"] + '<br/>' +
                '<strong>品种: </strong>' + inStorage["itemVariety"] + '<br/>'+
                '<strong>规格: </strong>' + inStorage["itemStandard"] + '<br/>'+
                '<strong>库存: </strong>' + inStorage["itemStorage"] + '<br/>';
      Html += '<tr>' +
              '<td>' + (index++) + '</td>' +
              '<td><a class="pop" data-toggle="popover" data-placement="left" data-content="' + content + '">' + inStorage["itemName"] + '</a></td>' +
              '<td>' + inStorage["count"] + '</td>' +
              '<td>' + inStorage["place"] + '</td>' +
              '<td>' + inStorage["agent"] + '</td>' +
              '<td>待审</td>' +
              '<td><div class="btn-group">' +
              '<a class="btn btn-warning pop" data-toggle="popover" data-placement="left" data-content="不通过" onclick="failInStorage(\'' + inStorage["id"] + '\')"><i class="icon_pencil-edit_alt"></i></a>' +
              '<a class="btn btn-success pop" data-toggle="popover" data-placement="left" data-content="通过" onclick="passInStorage(\'' + inStorage["id"] + '\')"><i class="icon_pencil-edit_alt"></i></a></div></tr>';
      }

    }
    document.getElementById("pendingInStorageList").innerHTML=Html;

    Html = '';
    index = 1;
    for(var i = 0; i < inStorages.length; i++) {
      var inStorage = inStorages[i];
      if (inStorage["status"] == "1") {
        var content = '<strong>条形码: </strong>' + inStorage["itemBarcode"] + '<br/>' +
                '<strong>品种: </strong>' + inStorage["itemVariety"] + '<br/>'+
                '<strong>规格: </strong>' + inStorage["itemStandard"] + '<br/>'+
                '<strong>库存: </strong>' + inStorage["itemStorage"] + '<br/>';
        Html += '<tr>' +
                '<td>' + (index++) + '</td>' +
                '<td><a class="pop" data-toggle="popover" data-placement="left" data-content="' + content + '">' + inStorage["itemName"] + '</a></td>' +
                '<td>' + inStorage["count"] + '</td>' +
                '<td>' + inStorage["place"] + '</td>' +
                '<td>' + inStorage["agent"] + '</td>' +
                '<td>' + inStorage["approval"] + '</td>' +
                '<td>' + inStorage["approvalTime"] + '</td>' +
                '<td>未通过</td></tr>';
      }

    }
    document.getElementById("rejectedInStorageList").innerHTML=Html;

    Html = '';
    index = 1;
    for(var i = 0; i < inStorages.length; i++) {
      var inStorage = inStorages[i];
      if (inStorage["status"] == "2") {
        var content = '<strong>条形码: </strong>' + inStorage["itemBarcode"] + '<br/>' +
                '<strong>品种: </strong>' + inStorage["itemVariety"] + '<br/>'+
                '<strong>规格: </strong>' + inStorage["itemStandard"] + '<br/>'+
                '<strong>库存: </strong>' + inStorage["itemStorage"] + '<br/>';
        Html += '<tr>' +
                '<td>' + (index++) + '</td>' +
                '<td><a class="pop" data-toggle="popover" data-placement="left" data-content="' + content + '">' + inStorage["itemName"] + '</a></td>' +
                '<td>' + inStorage["count"] + '</td>' +
                '<td>' + inStorage["place"] + '</td>' +
                '<td>' + inStorage["agent"] + '</td>' +
                '<td>' + inStorage["approval"] + '</td>' +
                '<td>' + inStorage["approvalTime"] + '</td>' +
                '<td>已生效</td></tr>';
      }
      document.getElementById("pendedInStorageList").innerHTML=Html;

    }

    $(".pop").popover({ trigger: "manual" , html: true, animation:false})
            .on("mouseenter", function () {
              var _this = this;
              $(this).popover("show");
              $(".popover").on("mouseleave", function () {
                $(_this).popover('hide');
              });
            }).on("mouseleave", function () {
              var _this = this;
              setTimeout(function () {
                if (!$(".popover:hover").length) {
                  $(_this).popover("hide");
                }
              }, 1);
            });
  }




  window.onload=getJson;

</script>


</body>
</html>
