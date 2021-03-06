<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ruan
  Date: 6/14/15
  Time: 11:20 PM
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

  <title>Creative - Bootstrap Admin Template</title>

  <!-- Bootstrap CSS -->
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
<script src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
</script>
<!-- container section start -->
<section id="container" class="">


  <header class="header dark-bg">
    <div class="toggle-nav">
      <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
    </div>

    <!--logo start-->
    <a href="index.jsp" class="logo">Nice <span class="lite">Admin</span></a>
    <!--logo end-->
    <div class="nav search-row" id="top_menu">
      <!--  search form start -->
      <!--      <ul class="nav top-menu">
              <li>
                <form class="navbar-form">
                  <input class="form-control" placeholder="Search" type="text">
                </form>
              </li>
            </ul>
      -->
      <!--  search form end -->
    </div>

    <div class="top-nav notification-row">
      <!-- notificatoin dropdown start-->
      <ul class="nav pull-right top-menu">

        <!-- task notificatoin start -->
        <!--
        <li id="task_notificatoin_bar" class="dropdown">
          <a data-toggle="dropdown" class="dropdown-toggle" href="#">
            <span class="icon-task-l"></span>
            <span class="badge bg-important">5</span>
          </a>
          <ul class="dropdown-menu extended tasks-bar">
            <div class="notify-arrow notify-arrow-blue"></div>
            <li>
              <p class="blue">You have 6 pending letter</p>
            </li>
            <li>
              <a href="#">
                <div class="task-info">
                  <div class="desc">Design PSD </div>
                  <div class="percent">90%</div>
                </div>
                <div class="progress progress-striped">
                  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%">
                    <span class="sr-only">90% Complete (success)</span>
                  </div>
                </div>
              </a>
            </li>
            <li>
              <a href="#">
                <div class="task-info">
                  <div class="desc">
                    Project 1
                  </div>
                  <div class="percent">30%</div>
                </div>
                <div class="progress progress-striped">
                  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
                    <span class="sr-only">30% Complete (warning)</span>
                  </div>
                </div>
              </a>
            </li>
            <li>
              <a href="#">
                <div class="task-info">
                  <div class="desc">Digital Marketing</div>
                  <div class="percent">80%</div>
                </div>
                <div class="progress progress-striped">
                  <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                    <span class="sr-only">80% Complete</span>
                  </div>
                </div>
              </a>
            </li>
            <li>
              <a href="#">
                <div class="task-info">
                  <div class="desc">Logo Designing</div>
                  <div class="percent">78%</div>
                </div>
                <div class="progress progress-striped">
                  <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="78" aria-valuemin="0" aria-valuemax="100" style="width: 78%">
                    <span class="sr-only">78% Complete (danger)</span>
                  </div>
                </div>
              </a>
            </li>
            <li>
              <a href="#">
                <div class="task-info">
                  <div class="desc">Mobile App</div>
                  <div class="percent">50%</div>
                </div>
                <div class="progress progress-striped active">
                  <div class="progress-bar"  role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%">
                    <span class="sr-only">50% Complete</span>
                  </div>
                </div>

              </a>
            </li>
            <li class="external">
              <a href="#">See All Tasks</a>
            </li>
          </ul>
        </li>
        -->
        <!-- task notificatoin end -->
        <!-- inbox notificatoin start-->
        <!--
        <li id="mail_notificatoin_bar" class="dropdown">
          <a data-toggle="dropdown" class="dropdown-toggle" href="#">
            <i class="icon-envelope-l"></i>
            <span class="badge bg-important">5</span>
          </a>
          <ul class="dropdown-menu extended inbox">
            <div class="notify-arrow notify-arrow-blue"></div>
            <li>
              <p class="blue">You have 5 new messages</p>
            </li>
            <li>
              <a href="#">
                <span class="photo"><img alt="avatar" src="./img/avatar-mini.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Greg  Martin</span>
                                    <span class="time">1 min</span>
                                    </span>
                                    <span class="message">
                                        I really like this admin panel.
                                    </span>
              </a>
            </li>
            <li>
              <a href="#">
                <span class="photo"><img alt="avatar" src="./img/avatar-mini2.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Bob   Mckenzie</span>
                                    <span class="time">5 mins</span>
                                    </span>
                                    <span class="message">
                                     Hi, What is next project plan?
                                    </span>
              </a>
            </li>
            <li>
              <a href="#">
                <span class="photo"><img alt="avatar" src="./img/avatar-mini3.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Phillip   Park</span>
                                    <span class="time">2 hrs</span>
                                    </span>
                                    <span class="message">
                                        I am like to buy this Admin Template.
                                    </span>
              </a>
            </li>
            <li>
              <a href="#">
                <span class="photo"><img alt="avatar" src="./img/avatar-mini4.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Ray   Munoz</span>
                                    <span class="time">1 day</span>
                                    </span>
                                    <span class="message">
                                        Icon fonts are great.
                                    </span>
              </a>
            </li>
            <li>
              <a href="#">See all messages</a>
            </li>
          </ul>
        </li>
        -->
        <!-- inbox notificatoin end -->
        <!-- alert notification start-->
        <!--
        <li id="alert_notificatoin_bar" class="dropdown">
          <a data-toggle="dropdown" class="dropdown-toggle" href="#">

            <i class="icon-bell-l"></i>
            <span class="badge bg-important">7</span>
          </a>
          <ul class="dropdown-menu extended notification">
            <div class="notify-arrow notify-arrow-blue"></div>
            <li>
              <p class="blue">You have 4 new notifications</p>
            </li>
            <li>
              <a href="#">
                <span class="label label-primary"><i class="icon_profile"></i></span>
                Friend Request
                <span class="small italic pull-right">5 mins</span>
              </a>
            </li>
            <li>
              <a href="#">
                <span class="label label-warning"><i class="icon_pin"></i></span>
                John location.
                <span class="small italic pull-right">50 mins</span>
              </a>
            </li>
            <li>
              <a href="#">
                <span class="label label-danger"><i class="icon_book_alt"></i></span>
                Project 3 Completed.
                <span class="small italic pull-right">1 hr</span>
              </a>
            </li>
            <li>
              <a href="#">
                <span class="label label-success"><i class="icon_like"></i></span>
                Mick appreciated your work.
                <span class="small italic pull-right"> Today</span>
              </a>
            </li>
            <li>
              <a href="#">See all notifications</a>
            </li>
          </ul>
        </li>
        -->
        <!-- alert notification end-->
        <!-- user login dropdown start-->
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
          <h3 class="page-header"><i class="fa fa-laptop"></i> 商品管理</h3>
          <ol class="breadcrumb">
            <li><i class="fa fa-home"></i><a href="index.jsp"> 主页</a></li>
            <li><i class="fa fa-laptop"></i>商品管理</li>
          </ol>
        </div>
      </div>



      <div class="row">

        <div class="col-lg-12 col-md-12">
          <div class="panel panel-default">
            <div class="panel-heading">
              <h2><i class="fa fa-flag-o red"></i><strong>信息</strong></h2>
              <div class="panel-actions">
                <div class="btn-group">
                  <button type="button" id="refreshItem" class="btn btn-success">刷新</button>
                  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#addItem">添加</button>
                  <button type="button" class="btn btn-danger" onclick="delItems()">删除</button>
                </div>
              </div>
            </div>
            <div class="panel-body">
              <form method="post" action="" name="itemListForm">
                <input type="hidden" name="selectedIds">
                <table class="table bootstrap-datatable">
                  <thead>
                  <tr>
                    <th>选择</th>
                    <th>序号</th>
                    <th>条形码</th>
                    <th>名称</th>
                    <th>品种</th>
                    <th>规格</th>
                    <th>库存</th>
                    <th>操作</th>
                  </tr>
                  </thead>
                  <tbody id="itemBody">

                  </tbody>
                </table>
              </form>
            </div>

          </div>

        </div>
        <!--
        <div class="">
          <div class="btn-row">
            <div class="btn-group">
              <button type="button" class="btn btn-primary">添加</button>
              <button type="button" class="btn btn-warning">修改</button>
              <button type="button" class="btn btn-danger">删除</button>
            </div>
          </div>
         -->
      </div><br><br>

      <div class="modal fade" id="addItem" tabindex="-1" role="dialog" aria-labelledby="addItemModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
              <h4 class="modal-title text-center" id="addItemTitle">添加商品</h4>
            </div>

            <form class="form-validate form-horizontal" id="addItem_form" method="post" action="<%=request.getContextPath()%>/addItem.action">
              <div class="modal-body">

                <div class="form-group">
                  <label for="addbarcode" class="control-label col-lg-2">条形码<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="addbarcode" name="barcode" type="text"/>
                  </div>
                </div>

                <div class="form-group">
                  <label for="addname" class="control-label col-lg-2">名称<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="addname" name="name" type="text"/>
                  </div>
                </div>

                <div class="form-group">
                  <label for="addvariety" class="control-label col-lg-2">品种<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="addvariety" name="variety" type="text"/>
                  </div>
                </div>

                <div class="form-group">
                  <label for="addstandard" class="control-label col-lg-2">规格<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="addstandard" name="standard" type="text"/>
                  </div>
                </div>

                <input type="hidden" id="addstorage" name="storage" value="0">
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-warning" data-dismiss="modal">取消</button>
                <button type="submit" class="btn btn-primary">添加</button>
              </div>
            </form>

          </div>
        </div>
      </div>

      <div class="modal fade" id="editItem" tabindex="-1" role="dialog" aria-labelledby="editItemModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
              <h4 class="modal-title text-center" id="editItemTitle">修改商品</h4>
            </div>

            <form class="form-validate form-horizontal" id="editItem_form" method="post" action="<%=request.getContextPath()%>/editItem.action">
              <input type="hidden" id="editid" name="id"/>
              <div class="modal-body">

                <div class="form-group">
                  <label for="editbarcode" class="control-label col-lg-2">条形码<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="editbarcode" name="barcode" type="text"/>
                  </div>
                </div>

                <div class="form-group">
                  <label for="editname" class="control-label col-lg-2">名称<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="editname" name="name" type="text"/>
                  </div>
                </div>

                <div class="form-group">
                  <label for="editvariety" class="control-label col-lg-2">品种<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="editvariety" name="variety" type="text"/>
                  </div>
                </div>

                <div class="form-group">
                  <label for="editstandard" class="control-label col-lg-2">规格<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="editstandard" name="standard" type="text"/>
                  </div>
                </div>

                <input type="hidden" id="editstorage" name="storage" value="">
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-warning" data-dismiss="modal">取消</button>
                <button type="submit" class="btn btn-primary">修改</button>
              </div>
            </form>

          </div>
        </div>
      </div>

      <div class="modal fade" id="noIdWarn" tabindex="-1" role="dialog" aria-labelledby="noIdWarnLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
              <h4 class="modal-title text-center" id="noIdWarnTitle">警告</h4>
            </div>
            <div class="modal-body">
              <h2>请选择要删除的条目！</h2>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>
            </div>
          </div>
        </div>
      </div>

      <div class="modal fade" id="confirmDelItem" tabindex="-1" role="dialog" aria-labelledby="confirmDelItemLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
              <h4 class="modal-title text-center" id="confirmDelITitle">警告</h4>
            </div>
            <div class="modal-body">
              <h2>确定删除所选的条目？</h2>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
              <button type="button" class="btn btn-error" data-dismiss="modal">确定</button>
            </div>
          </div>
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
    </section>
    <!--main content end-->
  </section>
  <!-- container section start -->
</section>

<form name="delItemForm" method="post" action="<%=request.getContextPath()%>/delItem.action">
  <input type="hidden" id="delId" name="id" value="123"/>
</form>

<form name="delItemsForm" method="post" action="<%=request.getContextPath()%>/delItems.action">
  <div id="delItemsInput">

  </div>
</form>

<script type="text/javascript">

  function delItem(i){

//   $("#confirmDelItem").modal("show");
    document.getElementById("delId").value=i;
    document.delItemForm.submit();
  }

  function delItems(){
    var itemIds = document.getElementsByName("itemId");
    var ids = new Array();
    var j = 0;
    for(var i = 0; i < itemIds.length; i++){
      if(itemIds[i].type == "checkbox" && itemIds[i].checked == true){
        ids[j++] = itemIds[i].value;
      }
    }
    if(j == 0){
      $("#noIdWarn").modal("show");
      return;
    }
    var delItemsFormInputHtml = '';
    for(var k = 0; k < ids.length; k++){
      delItemsFormInputHtml += '<input type="hidden" name="idList[' + k + ']" value="'+ ids[k] + '">';
    }
    document.getElementById("delItemsInput").innerHTML = delItemsFormInputHtml;
    document.delItemsForm.submit();
  }

  function confirmDelItem(i){

  }
  function editItem(id, barcode, name, variety, standard, storage){
    document.getElementById("editid").value=id;
    document.getElementById("editbarcode").value=barcode;
    document.getElementById("editname").value=name;
    document.getElementById("editvariety").value=variety;
    document.getElementById("editstandard").value=standard;
    document.getElementById("editstorage").value=storage;
    $("#editItem").modal("show");
  }
</script>

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
  $(function() {
    $(".knob").knob({
      'draw' : function () {
        $(this.i).val(this.cv + '%')
      }
    })
  });
  //carousel
  $(document).ready(function() {
    $("#owl-slider").owlCarousel({
      navigation : true,
      slideSpeed : 300,
      paginationSpeed : 400,
      singleItem : true
    });
  });
  //custom select box
  $(function(){
    $('select.styled').customSelect();
  });
  /* ---------- Map ---------- */
  $(function(){
    $('#map').vectorMap({
      map: 'world_mill_en',
      series: {
        regions: [{
          values: gdpData,
          scale: ['#000', '#000'],
          normalizeFunction: 'polynomial'
        }]
      },
      backgroundColor: '#eef3f7',
      onLabelShow: function(e, el, code){
        el.html(el.html()+' (GDP - '+gdpData[code]+')');
      }
    });
  });
function refrashItem(){
  $.getJSON("<%=request.getContextPath()%>/getAllItem.action",
          function(data){
            var itemsArray = new Array();
            var map = eval("(" + data + ")");
            var i = 0;
            for(var key in map){
              itemsArray[i] = new Array();
              var a = map[key];
              var j = 0;
              for(var k in a){
                itemsArray[i][j] = a[k];
                j = j + 1;
              }
              i = i + 1;
            }
            var itemHtml = '';

            for(var m = 0; m < itemsArray.length; m++){

              itemHtml += '<tr>';
              itemHtml += '<td><input type="checkbox" name="itemId" value="' + itemsArray[m][0] + '"></td>';
              itemHtml += '<td>' + (m + 1) + '</td>';
              itemHtml += '<td>' + itemsArray[m][4] + '</td>';
              itemHtml += '<td>' + itemsArray[m][1] + '</td>';
              itemHtml += '<td>' + itemsArray[m][2] + '</td>';
              itemHtml += '<td>' + itemsArray[m][3] + '</td>';
              itemHtml += '<td>' + itemsArray[m][5] + '</td>';
              itemHtml += '<td><div class="btn-group">';
              itemHtml += '<a class="btn btn-warning pop" data-toggle="popover" data-placement="left" data-content="编辑" onclick="editItem(\'' + itemsArray[m][0] + '\',';
              itemHtml += '\'' + itemsArray[m][4] + '\',';
              itemHtml += '\'' + itemsArray[m][1] + '\',';
              itemHtml += '\'' + itemsArray[m][2] + '\',';
              itemHtml += '\'' + itemsArray[m][3] + '\',';
              itemHtml += '\'' + itemsArray[m][5] + '\')"><i class="icon_pencil-edit_alt"></i></a>';
              itemHtml += '<a class="btn btn-danger pop" data-toggle="popover" data-placement="left" data-content="删除"  onclick="delItem(\'' + itemsArray[m][0] + '\')"><i class="icon_close_alt2"></i></a></div></td></tr>';
            }
            document.getElementById("itemBody").innerHTML = itemHtml;
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
  );
}
  $("#refreshItem").click(function(){
    refrashItem();
  });

  window.onload=refrashItem;
  $(function(){
    $("#editButton").popover();
  });
</script>

</body>
</html>