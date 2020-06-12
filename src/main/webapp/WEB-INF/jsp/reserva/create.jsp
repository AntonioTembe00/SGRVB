
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dao.CategoriaDAO"%>
<%@page import="model.Categoria"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="pt-pt">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>sgrbv</title>

        <!-- Custom fonts for this theme -->
        <link href="${pageContext.request.contextPath}/resources/assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

        <!-- Theme CSS -->
        <link href="${pageContext.request.contextPath}/resources/assets/css/freelancer.min.css" rel="stylesheet">

    </head>

    <body id="page-top">

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-gradient-primary bg-secondary text-uppercase fixed-top" id="mainNav">
            <div class="container">
                <c:forEach items="${lista}" var="uso">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/user_avatar.png" alt="">
                    <a class="navbar-brand js-scroll-trigger" href="<c:url value='/inicial/paginacliente'/>">${uso.nome}</a>
                </c:forEach>
                <button class="navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item mx-0 mx-lg-1">
                            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#contacto">Contactos</a>
                        </li>
                        <li class="nav-item mx-0 mx-lg-1">
                            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" style="color:#00b386" href="<c:url value='/inicial/paginacliente'/>">Voltar</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <!-- Portfolio Section -->
    <section class="page-section portfolio" id="portfolio">
        <div class="container">
            <br>
            <br>
            <br>
            <!-- Portfolio Section Heading -->
            <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">Reserva</h2>
            <br>
            <br>
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
            <!-- Portfolio Grid Items -->
            <form action="<c:url value='/reserva/add'/>">

                <div class="form-group">
                    <label for="usr"><b>Evento</b></label>
                    <select class="form-control" id="sel1" name="evento">
                        <%--<c:forEach items="${eventolista}" var="ev">--%>
                        <option value="${eventolista.id}">${eventolista.jogo}</option>
                        <%--</c:forEach>--%>
                    </select>
                </div>

                <div class="form-group">
                    <label for="usr"><b>Quantidade Bilhetes:</b></label>
                    <select class="form-control" name="quantidade" id="bilhetes">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="usr"><b>Tipo Pagamento:</b></label>
                    <select class="form-control" id="sel1" name="tipopagamento">
                        <c:forEach items="${tipopagamentolista}" var="us">
                            <option value="${us.id}">${us.nome}</option>
                        </c:forEach>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">Reservar</button>
            </form>
        </div>

    </section>	
    <!-- About Section -->


    <!-- Footer -->
    <footer class="footer text-center">
        <div class="container">
            <div class="row">

                <!-- Footer Location -->
                <div class="col-lg-4 mb-5 mb-lg-0">
                    <h4 class="text-uppercase mb-4">Localização</h4>
                    <p class="lead mb-0">Bairro do Jardim
                        <br>Rua das Dalias, P 86</p>
                </div>

                <!-- Footer Social Icons -->
                <div class="col-lg-4 mb-5 mb-lg-0">
                    <h4 class="text-uppercase mb-4">Encontre-nos nas redes sociais</h4>
                    <a class="btn btn-outline-light btn-social mx-1" href="https://www.facebook.com/SGRVB-107177634040594/ad_center/?refSource=pages_manager_bar">
                        <i class="fab fa-fw fa-facebook-f"></i>
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/fab.jpg" alt="">
                    </a>
                    <a class="btn btn-outline-light btn-social mx-1" href="https://api.whatsapp.com/send?phone=841278345&text=SGRVB">
                        <i class="fab fa-fw fa-twitter"></i>
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/wat.png" alt="">
                    </a>
                    <a class="btn btn-outline-light btn-social mx-1" href="https://www.instagram.com/SGRVB">
                        <i class="fab fa-fw fa-linkedin-in"></i>
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/ins.jpg" alt="">
                    </a>
                    <a class="btn btn-outline-light btn-social mx-1" href="https://twitter.com/SGRVB">
                        <i class="fab fa-fw fa-dribbble"></i>
                        <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/tiw.png" alt="">
                    </a>
                </div>

                <!-- Footer About Text -->
                <div class="col-lg-4" id="contacto">
                    <h4 class="text-uppercase mb-4">Contacto</h4>
                    <p class="lead mb-0">841278345</p>
                    <p class="lead mb-1">sgrbv@gmail.com</p>
                </div>

            </div>
        </div>
    </footer>

    <!-- Copyright Section -->
    <section class="copyright py-4 text-center text-white">
        <div class="container">
            <small>Copyright &copy; TPCAZT 2020</small>
        </div>
    </section>

    <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
    <div class="scroll-to-top d-lg-none position-fixed ">
        <a class="js-scroll-trigger d-block text-center text-white rounded" href="#page-top">
            <i class="fa fa-chevron-up"></i>
        </a>
    </div>

    <!-- Portfolio Modals -->



    <!-- Bootstrap core JavaScript -->
    <script src="${pageContext.request.contextPath}/resources/assets/vendor/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="${pageContext.request.contextPath}/resources/assets/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="${pageContext.request.contextPath}/resources/assets/js/jqBootstrapValidation.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/contact_me.js"></script>

    <!-- Custom scripts for this template -->
    <script src="${pageContext.request.contextPath}/resources/assets/js/freelancer.min.js"></script>

</body>

</html>
