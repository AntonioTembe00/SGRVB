<%-- 
    Document   : create
    Created on : Oct 8, 2019, 7:55:56 AM
    Author     : w.c
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>sgrvb-ActualizarSenha</title>
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/resources/assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/sb-admin-2.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/estilo.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/sb-admin-2.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </head>

    <body id="page-top">

         <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                
                <hr class="sidebar-divider">
                <!-- Nav Item - Charts -->

                <!-- Nav Item - Pages Collapse Menu -->
                

                <!-- Divider -->
                <hr class="sidebar-divider d-none d-md-block">

                <!-- Sidebar Toggler (Sidebar) -->
                

            </ul>
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                        <!-- Sidebar Toggle (Topbar) -->
                        <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                            <i class="fa fa-bars"></i>
                        </button>

                        <!-- Topbar Search -->
                        <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                            <div class="input-group">
                                <input type="text" class="form-control bg-light border-0 small" placeholder="Pesquise por..." aria-label="Search" aria-describedby="basic-addon2">
                                <div class="input-group-append">
                                    <button class="btn btn-primary" type="button">
                                        <i class="fas fa-search fa-sm"></i>
                                    </button>
                                </div>
                            </div>
                        </form>

                        <!-- Topbar Navbar -->
                        <ul class="navbar-nav ml-auto">

                            <div class="topbar-divider d-none d-sm-block"></div>

                            <!-- Nav Item - User Information -->
                            <li class="nav-item dropdown no-arrow">
                                <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span class="mr-2 d-none d-lg-inline text-gray-600 medium">Sgrvb Tpcazt</span>
                                    <img class="img-profile rounded-circle" src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
                                </a>
                                <!-- Dropdown - User Information -->
                                <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                                    <a class="dropdown-item" href="#">
                                        <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Perfil
                                    </a>
                                    <a class="dropdown-item" href="#">
                                        <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Definições
                                    </a>
                                    <a class="dropdown-item" href="<c:url value='/login'/>" data-toggle="modal" data-target="#logoutModal">
                                        <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Sair da Conta
                                    </a>
                                </div>
                            </li>

                        </ul>

                    </nav>
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- Page Heading -->
                        <h1 class="h3 mb-2 text-gray-800">Actualização de Senha</h1>

                        <!-- Content Row -->
                        <div class="row">

                            <div class="col-xl-8 col-lg-7">

                                <!-- Area Chart -->
                                <div class="card shadow mb-4">
                                     <c:if test="${succeedMessage != null }">
                                        <div class="alert alert-info alert-dismissible fade show" role="alert">
                                            ${succeedMessage}
                                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                    </c:if>
                                    <c:if test="${error != null }">
                                        <div class="alert alert-danger alert-dismissible fade show" role="alert">
                                            ${error}
                                            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                    </c:if>
                                    <div class="card-header py-3">
                                        <form action="<c:url value='/funcionario/trocar'/>" class="needs-validation" novalidate>
                                            <div class="form-group">
                                                <label for="uname"><b>Senha Antiga:</b></label>
                                                <input type="text" class="form-control" id="nome" name="senhaantiga"placeholder="Introduza a senha antiga" required>
                                                <!-- <div class="valid-feedback">Valido.</div> -->
                                                <div class="invalid-feedback">Obrigatório preencher.</div>
                                            </div>
                                            <div class="form-group">
                                                <label for="uname"><b>Senha Nova:</b></label>
                                                <input type="text" class="form-control" id="nome" name="senhanova" placeholder="Introduza a nova senha" required>
                                                <!-- <div class="valid-feedback">Valido.</div> -->
                                                <div class="invalid-feedback">Obrigatório preencher.</div>
                                            </div>
                                            <div class="form-group">
                                                <label for="uname"><b>Confirmar Senha:</b></label>
                                                <input type="text" class="form-control" id="nome" name="confirmarsenha"  placeholder="Confirme a nova senha"  required>
                                                <!-- <div class="valid-feedback">Valido.</div> -->
                                                <div class="invalid-feedback">Obrigatório preencher.</div>
                                            </div>
                                            
                                            <button type="submit" class="btn btn btn-success">Actualizar</button>
                                            <button type="button" class="btn btn-primary">
                                                <a style="color: white;"  href="<c:url value='/inicial/inicialtodos'/>">Voltar</a>
                                        </button>
                                            
                                            
                                        </form>
                                    </div>  
                                </div>
                            </div>

                            <!-- Donut Chart -->
                      
                        </div>

                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright &copy; TPCAZT 2020</span>
                        </div>
                    </div>
                </footer>
                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Logout Modal-->
          <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Deseja mesmo Sair?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">Ã</span>
                        </button>
                    </div>
                    <div class="modal-body">Selecione "Sair" se realmente deseja fechar esta sessão.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancelar</button>
                        <a class="btn btn-primary" href="<c:url value='/login'/>">Sair</a>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="${pageContext.request.contextPath}/resources/assets/vendor/jquery/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="${pageContext.request.contextPath}/resources/assets/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="${pageContext.request.contextPath}/resources/assets/js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="${pageContext.request.contextPath}/resources/assets/vendor/chart.js/Chart.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="${pageContext.request.contextPath}/resources/assets/js/demo/chart-area-demo.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/demo/chart-pie-demo.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/demo/chart-bar-demo.js"></script>
        <script>
            // Disable form submissions if there are invalid fields
            (function () {
                'use strict';
                window.addEventListener('load', function () {
                    // Get the forms we want to add validation styles to
                    var forms = document.getElementsByClassName('needs-validation');
                    // Loop over them and prevent submission
                    var validation = Array.prototype.filter.call(forms, function (form) {
                        form.addEventListener('submit', function (event) {
                            if (form.checkValidity() === false) {
                                event.preventDefault();
                                event.stopPropagation();
                            }
                            form.classList.add('was-validated');
                        }, false);
                    });
                }, false);
            })();
        </script>

    </body>

</html>
