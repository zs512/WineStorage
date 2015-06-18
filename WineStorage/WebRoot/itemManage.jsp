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
            <span class="username">Jenifer Smith</span>
            <b class="caret"></b>
          </a>
          <ul class="dropdown-menu extended logout">
            <div class="log-arrow-up"></div>
            <li class="eborder-top">
              <a href="#"><i class="icon_profile"></i> My Profile</a>
            </li>
            <!--
            <li>
              <a href="#"><i class="icon_mail_alt"></i> My Inbox</a>
            </li>
            <li>
              <a href="#"><i class="icon_clock_alt"></i> Timeline</a>
            </li>
            <li>
              <a href="#"><i class="icon_chat_alt"></i> Chats</a>
            </li>
            -->
            <li>
              <a href="login.jsp"><i class="icon_key_alt"></i> Log Out</a>
            </li>
            <!--
            <li>
              <a href="documentation.html"><i class="icon_key_alt"></i> Documentation</a>
            </li>
            <li>
              <a href="documentation.html"><i class="icon_key_alt"></i> Documentation</a>
            </li>
            -->
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
            <span>Forms</span>
            <span class="menu-arrow arrow_carrot-right"></span>
          </a>
          <ul class="sub">
            <li><a class="" href="form_component.jsp">Form Elements</a></li>
            <li><a class="" href="form_validation.jsp">Form Validation</a></li>
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
                  <button type="button" class="btn btn-danger">删除</button>
                </div>
              </div>
            </div>
            <div class="panel-body">
              <table class="table bootstrap-datatable">
                <thead>
                <tr>
                  <th>选择</th>
                  <th>名称</th>
                  <th>品种</th>
                  <th>规格</th>
                  <th>库存</th>
                  <th>操作</th>
                </tr>
                </thead>
                <tbody id="itemBody">
                  <!--
                <tr><td>check</td><td class="hidden">402882e54dfc803a014dfc80843b0000</td><td>名称1</td><td>品种1</td><td>规格1</td><td>0</td><td><div class="btn-group"><a class="btn btn-warning" href="#"><i class="icon_pencil-edit_alt"></i></a><a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a></div></td></tr><tr><td>check</td><td class="hidden">402882e54dfc8cef014dfc8d43060000</td><td>名称1</td><td>品种1</td><td>规格2</td><td>0</td><td><div class="btn-group"><a class="btn btn-warning" href="#"><i class="icon_pencil-edit_alt"></i></a><a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a></div></td></tr><tr><td>check</td><td class="hidden">402882e54dff50ba014dff5123c20000</td><td>名称1</td><td>品种2</td><td>规格1</td><td>0</td><td><div class="btn-group"><a class="btn btn-warning" href="#"><i class="icon_pencil-edit_alt"></i></a><a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a></div></td></tr><tr><td>check</td><td class="hidden">402882e54dff5402014dff544c990000</td><td>名称2</td><td>品种1</td><td>规格1</td><td>0</td><td><div class="btn-group"><a class="btn btn-warning" href="#"><i class="icon_pencil-edit_alt"></i></a><a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a></div></td></tr>
                -->
                </tbody>
              </table>
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
                  <label for="name" class="control-label col-lg-2">名称<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="name" name="name" type="text"/>
                  </div>
                </div>

                <div class="form-group">
                  <label for="variety" class="control-label col-lg-2">品种<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="variety" name="variety" type="text"/>
                  </div>
                </div>

                <div class="form-group">
                  <label for="standard" class="control-label col-lg-2">规格<span class="required">*</span></label>
                  <div class="col-lg-9">
                    <input class="form-control" id="standard" name="standard" type="text"/>
                  </div>
                </div>

                <input type="hidden" id="storage" name="storage" value="0">
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-warning" data-dismiss="modal">取消</button>
                <button type="submit" class="btn btn-primary">添加</button>
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
              itemHtml += '<td>' + itemsArray[m][1] + '</td>';
              itemHtml += '<td>' + itemsArray[m][2] + '</td>';
              itemHtml += '<td>' + itemsArray[m][3] + '</td>';
              itemHtml += '<td>' + itemsArray[m][4] + '</td>';
              itemHtml += '<td><div class="btn-group"><a class="btn btn-warning" href="#"><i class="icon_pencil-edit_alt"></i></a>';
              itemHtml += '<a class="btn btn-danger" href="#"><i class="icon_close_alt2"></i></a></div></td></tr>';
            }
            document.getElementById("itemBody").innerHTML = itemHtml;

          }
  );
}
  $("#refreshItem").click(function(){
    refrashItem();
  });

  window.onload=refrashItem;
</script>

</body>
</html>