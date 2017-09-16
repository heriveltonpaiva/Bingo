<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<title>Bingo</title>
<meta name="description" content="Bingo">
<meta name="author" content="Dennis Ji">
<meta name="keyword"
	content="Bingo, Cartela, Sorteio">

<meta name="viewport" content="width=device-width, initial-scale=1">

<link id="bootstrap-style" href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-responsive.min.css" rel="stylesheet">
<link id="base-style" href="css/style.css" rel="stylesheet">
<link id="base-style-responsive" href="css/style-responsive.css"
	rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext'
	rel='stylesheet' type='text/css'>
<!-- end: CSS -->

<style>
.numeroBingo {
	font-size: 35px;
	margin: 2px;
	text-align: center;
}
</style>

</head>

<body>
	<!-- start: Content -->
	<div id="box-content" class="span10" style="margin: 20px; !important">
		<ul class="modal hide fade">
			<li><i class="icon-home"></i> <a href="index.html">Bingo</a> <i
				class="icon-angle-right"></i></li>
			<li><a href="/">Geração de Cartelas</a></li>
		</ul>

		<div class="row-fluid">
			<div class=" span18" style="width: 1400px;">
				<div class="box-header" style="width: 1400px;">
					<h2>
						<i class="halflings-icon white white hand-top"></i></span>Cartelas do
						Bingo
					</h2>
				</div>
				<div class="box-content" style="width: 1400px;">
					<c:forEach items="${listaCartelas}" var="cartela"
						varStatus="status">

						<div class="span3" style="margin: 5px;">
							<div class="box-header">
								<h2>
									<i>N° ${cartela.numero}</i><span class="break"></span>
								</h2>
							</div>
							<table
								class="table table-striped table-bordered bootstrap-datatable"
								style="width: 300px%; height: 280px;" border="2">
								<thead>
									<tr>
										<th width="4%" style="text-align: center;"><span
											class="numeroBingo">B</span></th>
										<th width="4%" style="text-align: center;"><span
											class="numeroBingo">I</span></th>
										<th width="4%" style="text-align: center;"><span
											class="numeroBingo">N</span></th>
										<th width="4%" style="text-align: center;"><span
											class="numeroBingo">G</span></th>
										<th width="4%" style="text-align: center;"><span
											class="numeroBingo">O</span></th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td class="center"><span class="numeroBingo"><c:if
													test="${cartela.b1 < 10}">0</c:if>${cartela.b1}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.i1}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.n1}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.g1}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.o1}</span>
									</tr>
									<tr>
										<td class="center"><span class="numeroBingo"><c:if
													test="${cartela.b2 < 10}">0</c:if>${cartela.b2}</span></td>
										<td class="center"><span class="numeroBingo">
												${cartela.i2}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.n2}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.g2}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.o2}</span></td>
									</tr>
									<tr>
										<td class="center"><span class="numeroBingo"><c:if
													test="${cartela.b3 < 10}">0</c:if>${cartela.b3}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.i3}</span></td>
										<td class="center"><span class="numeroBingo"></span></td>
										<td class="center"><span class="numeroBingo">${cartela.g3}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.o3}</span></td>
									</tr>
									<tr>
										<td class="center"><span class="numeroBingo"><c:if
													test="${cartela.b4 < 10}">0</c:if>${cartela.b4}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.i4}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.n4}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.g4}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.o4}</span></td>
									</tr>
									<tr>
										<td class="center"><span class="numeroBingo"><c:if
													test="${cartela.b5 < 10}">0</c:if>${cartela.b5}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.i5}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.n5}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.g5}</span></td>
										<td class="center"><span class="numeroBingo">${cartela.o5}</span></td>
									</tr>
								</tbody>
							</table>
						</div>

					</c:forEach>
					<div class="clearfix"></div>
				</div>
			</div>
			<!--/span-->

		</div>
		<!--/row-->
	</div>
	<!--/.fluid-container-->
	<!-- end: Content -->
	</div>
	<!--/#content.span10-->
	</div>
	<!--/fluid-row-->
	<div class="clearfix"></div>
	<footer>
		<p>
			<span style="text-align: left; float: left">&copy; 2017 <a
				href="#">Bingo Dashboard</a></span>
		</p>
	</footer>
	<!-- start: JavaScript-->

	<script src="js/jquery-1.9.1.min.js"></script>
	<script src="js/jquery-migrate-1.0.0.min.js"></script>

	<script src="js/jquery-ui-1.10.0.custom.min.js"></script>

	<script src="js/jquery.ui.touch-punch.js"></script>

	<script src="js/modernizr.js"></script>

	<script src="js/bootstrap.min.js"></script>

	<script src="js/jquery.cookie.js"></script>

	<script src='js/fullcalendar.min.js'></script>

	<script src='js/jquery.dataTables.min.js'></script>

	<script src="js/excanvas.js"></script>
	<script src="js/jquery.flot.js"></script>
	<script src="js/jquery.flot.pie.js"></script>
	<script src="js/jquery.flot.stack.js"></script>
	<script src="js/jquery.flot.resize.min.js"></script>

	<script src="js/jquery.chosen.min.js"></script>

	<script src="js/jquery.uniform.min.js"></script>

	<script src="js/jquery.cleditor.min.js"></script>

	<script src="js/jquery.noty.js"></script>

	<script src="js/jquery.elfinder.min.js"></script>

	<script src="js/jquery.raty.min.js"></script>

	<script src="js/jquery.iphone.toggle.js"></script>

	<script src="js/jquery.uploadify-3.1.min.js"></script>

	<script src="js/jquery.gritter.min.js"></script>

	<script src="js/jquery.imagesloaded.js"></script>

	<script src="js/jquery.masonry.min.js"></script>

	<script src="js/jquery.knob.modified.js"></script>

	<script src="js/jquery.sparkline.min.js"></script>

	<script src="js/counter.js"></script>

	<script src="js/retina.js"></script>

	<script src="js/custom.js"></script>
	<!-- end: JavaScript-->

</body>
</html>
