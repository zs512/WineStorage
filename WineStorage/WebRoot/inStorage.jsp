<%--
  Created by IntelliJ IDEA.
  User: ruanqx
  Date: 2015/6/19
  Time: 15:22
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


    <div class="top-nav notification-row">
      <!-- notificatoin dropdown start-->
      <ul class="nav pull-right top-menu">

        <li class="dropdown">
          <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="img/avatar1_small.jpg">
                            </span>
            <span class="username">Jenifer Smith</span>
            <b class="caret"></b>
          </a>
          <ul class="dropdown-menu extended logout">
            <div class="log-arrow-up"></div>
            <li class="eborder-top">
              <a href="#"><i class="icon_profile"></i> My Profile</a>
            </li>

            <li>
              <a href="login.jsp"><i class="icon_key_alt"></i> Log Out</a>
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
            <span>入库管理</span>
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
            <span>UI Fitures</span>
            <span class="menu-arrow arrow_carrot-right"></span>
          </a>
          <ul class="sub">
            <li><a class="" href="general.jsp">Elements</a></li>
            <li><a class="" href="buttons.jsp">Buttons</a></li>
            <li><a class="" href="grids.jsp">Grids</a></li>
          </ul>
        </li>
        <li>
          <a class="" href="widgets.jsp">
            <i class="icon_genius"></i>
            <span>Widgets</span>
          </a>
        </li>
        <li>
          <a class="" href="chart-chartjs.jsp">
            <i class="icon_piechart"></i>
            <span>Charts</span>

          </a>

        </li>

        <li class="sub-menu">
          <a href="javascript:;" class="">
            <i class="icon_table"></i>
            <span>Tables</span>
            <span class="menu-arrow arrow_carrot-right"></span>
          </a>
          <ul class="sub">
            <li><a class="" href="basic_table.jsp">Basic Table</a></li>
          </ul>
        </li>

        <li class="sub-menu">
          <a href="javascript:;" class="">
            <i class="icon_documents_alt"></i>
            <span>Pages</span>
            <span class="menu-arrow arrow_carrot-right"></span>
          </a>
          <ul class="sub">
            <li><a class="" href="profile.jsp">Profile</a></li>
            <li><a class="" href="login.jsp"><span>Login Page</span></a></li>
            <li><a class="" href="blank.jsp">Blank Page</a></li>
            <li><a class="" href="404.jsp">404 Error</a></li>
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
          <h3 class="page-header"><i class="fa fa-laptop"></i> 入库管理</h3>
          <ol class="breadcrumb">
            <li><i class="fa fa-home"></i><a href="index.jsp"> 主页</a></li>
            <li><i class="fa fa-laptop"></i>入库管理</li>
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
                  <button type="button" class="btn btn-danger" onclick="delInStorages()">删除</button>
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
                    <th>商品名称</th>
                    <th>入库数量</th>
                    <th>经办人</th>
                    <th>录入人员</th>
                    <th>录入时间</th>
                    <th>审批人</th>
                    <th>审批时间</th>
                    <th>状态</th>
                    <th>操作</th>
                  </tr>
                  </thead>
                  <tbody id="inStorageList">

                  </tbody>
                </table>
              </form>
            </div>

          </div>

        </div>
      </div><br><br>

      <div class="modal fade" id="addItem" tabindex="-1" role="dialog" aria-labelledby="addItemModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
              <h4 class="modal-title text-center" id="addInStorageTitle">入库录入</h4>
            </div>

            <form class="form-validate form-horizontal" id="addInStorage_form" method="post" action="<%=request.getContextPath()%>/addInStorage.action">
              <div class="modal-body">

                <div class="form-group">
                  <label for="addItemId" class="control-label col-lg-2">酒类<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <div class="input-group">
                      <input class="form-control" id="addItemId" name="itemId" type="hidden"/>
                      <input class="form-control" id="addItemName" type="text" readonly/>
                      <div class="input-group-btn">
                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" placeholder="">
                          <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu pull-right" role="menu" id="cropdownItemList">

                        </ul>
                      </div>
                    </div>
                  </div>
                </div>

                <div class="form-group">
                  <label for="addInCount" class="control-label col-lg-2">入库数量<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="addInCount" name="count" type="text"/>
                  </div>
                </div>

                <div class="form-group">
                  <label for="addSupplyPlace" class="control-label col-lg-2">来源地<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="addSupplyPlace" name="place" type="text"/>
                  </div>
                </div>

                <div class="form-group">
                  <label for="addAgent" class="control-label col-lg-2">经办人<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="addAgent" name="agent" type="text"/>
                  </div>
                </div>

                <div class="form-group">
                  <label for="addRemark" class="control-label col-lg-2">备注</label>
                  <div class="col-lg-9">
                    <input class="form-control" id="addRemark" name="remark" type="text"/>
                  </div>
                </div>

              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-warning" data-dismiss="modal">取消</button>
                <button type="submit" class="btn btn-primary">录入</button>
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

    </section>
    <!--main content end-->
  </section>
  <!-- container section start -->
</section>

<form name="delInStorageForm" method="post" action="<%=request.getContextPath()%>/delInStorage.action">
  <input type="hidden" id="delId" name="id" value="123"/>
</form>

<form name="delInStoragesForm" method="post" action="<%=request.getContextPath()%>/delInStorages.action">
  <div id="delInStoragesInput">

  </div>
</form>

<script type="text/javascript">

  var items = new Array();
  var inStorages = new Array();
  function delInStorage(i){

//   $("#confirmDelItem").modal("show");
    document.getElementById("delId").value=i;
    document.delInStorageForm.submit();
  }

  function delInStorages(){
    var inStorageIds = document.getElementsByName("inStorageId");
    var ids = new Array();
    var j = 0;
    for(var i = 0; i < inStorageIds.length; i++){
      if(inStorageIds[i].type == "checkbox" && inStorageIds[i].checked == true){
        ids[j++] = inStorageIds[i].value;
      }
    }
    if(j == 0){
      $("#noIdWarn").modal("show");
      return;
    }
    var delInStoragesFormInputHtml = '';
    for(var k = 0; k < ids.length; k++){
      delInStoragesFormInputHtml += '<input type="hidden" name="idList[' + k + ']" value="'+ ids[k] + '">';
    }
    document.getElementById("delInStoragesInput").innerHTML = delInStoragesFormInputHtml;
    document.delInStoragesForm.submit();
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

  $(function(){
    $("#example").popover();
  });
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

  function setInputValue(id, name){
    document.getElementById("addItemId").value = id;
    document.getElementById("addItemName").value = name;
  }

  function replaceModelSelectHtml(){
    var Html = '';
    for(var i = 0; i < items.length; i++){
      var content = '';
      item = items[i];
      content += '<strong>条形码:</strong> ' + item["barcode"] + '<br/>' +
                 '<strong>名称: </strong>' + item["name"] + '<br/>'+
                 '<strong>品种: </strong>' + item["variety"] + '<br/>'+
                 '<strong>规格: </strong>' + item["standard"] + '<br/>'+
                 '<strong>库存: </strong>' + item["storage"] + '<br/>';
      Html+='<li><a href="javascript:setInputValue(\'' + item["id"] + '\',\'' + item["name"] + '\')" class="pop" data-toggle="popover" data-placement="left" data-content="' + content + '" data-original-title="" title="">  ' + item["name"] + '</a></li>';
    }
    document.getElementById("cropdownItemList").innerHTML=Html;

    Html = '';
    var index = 1;
    for(var i = 0; i < inStorages.length; i++){
      inStorage = inStorages[i];
      content = '<strong>来源地:</strong> ' + inStorage["place"] + '<br/>';
      content += '<strong>备注:</strong> ' + inStorage["remark"] + '<br/>';
      Html += '<tr>' +
              '<td><input type="checkbox" name="inStorageId" value="' + inStorage["id"] + '"></td>' +
              '<td>' + (index++) + '</td>' +
              '<td><a class="pop" data-toggle="popover" data-placement="left" data-content="' + content + '">' + inStorage["itemName"] + '</a></td>' +
              '<td>' + inStorage["count"] + '</td>' +
              '<td>' + inStorage["agent"] + '</td>' +
              '<td>' + inStorage["keyboarder"] + '</td>' +
              '<td>' + inStorage["keyboarderTime"] + '</td>' +
              '<td>' + inStorage["approval"] + '</td>' +
              '<td>' + inStorage["approvalTime"] + '</td>';
      if(inStorage["status"] == "0"){
        Html += '<td>待审</td>';
      }else if(inStorage["status"] == "1"){
        Html += '<td>未通过</td>'
      }else{
        Html += '<td>已录入</td>'
      }
      Html += '<td><div class="btn-group">';
      Html += '<a class="btn btn-warning pop" data-toggle="popover" data-placement="left" data-content="编辑"><i class="icon_pencil-edit_alt"></i></a>';
      Html += '<a class="btn btn-danger pop" data-toggle="popover" data-placement="left" data-content="删除" onclick="delInStorage(\'' + inStorage["id"] + '\')"><i class="icon_close_alt2"></i></a></div></td></tr>';
    }
    document.getElementById("inStorageList").innerHTML=Html;

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
  $("#refreshItem").click(function(){
    refrashItem();
  });

  window.onload=getJson;

</script>

</body>
</html>

