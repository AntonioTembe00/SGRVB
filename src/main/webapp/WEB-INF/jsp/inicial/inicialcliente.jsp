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

        <title>sgrvb</title>

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
                <a class="navbar-brand js-scroll-trigger" href="#page-top">SGRVB</a>
                <button class="navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item mx-0 mx-lg-1">
                            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#masthead">Inicio</a>
                        </li>
                        <li class="nav-item mx-0 mx-lg-1">
                            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#portfolio">Eventos</a>
                        </li>
                        <li class="nav-item mx-0 mx-lg-1">
                            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#about">Sobre-nós</a>
                        </li>
                        <li class="nav-item mx-0 mx-lg-1">
                            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#contacto">Contactos</a>
                        </li>
                    </ul>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item mx-0 mx-lg-1">
                            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" style="color:#00b386" href="<c:url value='/cliente/create'/>">Criar Conta</a>
                        </li>
                    </ul>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item mx-0 mx-lg-1">
                            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" style="color:#00b386" href="<c:url value='/logincliente'/>">Entrar na Conta</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <!-- Masthead -->
        <header class="masthead bg-primary text-white text-center" id="masthead">
            <div class="container d-flex align-items-center flex-column">

                <!-- Masthead Avatar Image -->
                <img class="masthead-avatar mb-5" src="" alt="">

                <!-- Masthead Heading -->
                <h1 class="masthead-heading text-uppercase mb-0">RESERVA DE BILHETES</h1>
                <br>
                <br>
                <!-- Masthead Subheading -->
                <p class="masthead-subheading font-weight-light mb-0">RESERVE BILHETES E PAGUE ATRAVÉS DOS NOSSOS VARIADOS METODOS DE PAGAMENTO</p>

            </div>
        </header>
        <!-- <DIV>
              <form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
                      <input type="hidden" name="cmd" value="_s-xclick">
                      <input type="hidden" name="hosted_button_id" value="DD3VVJ6SQLAZN">
                      <input type="image" src="https://www.paypalobjects.com/en_US/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
                      <img alt="" border="0" src="https://www.paypalobjects.com/en_US/i/scr/pixel.gif" width="1" height="1">
              </form>
      
        </DIV> -->

        <!-- Portfolio Section -->
        <section class="page-section portfolio" id="portfolio">
            <div class="container">

                <!-- Portfolio Section Heading -->
                <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">EVENTOS</h2>
                <br>
                <br>
                <!-- Portfolio Grid Items -->
                <div class="row">

                    <!-- Portfolio Item 1 -->
                    <div class="col-md-6 col-lg-4">
                        <div class="portfolio-item mx-auto" data-toggle="modal" data-target="#portfolioModal1">
                            <div class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
                                <div class="portfolio-item-caption-content text-center text-white">
                                    <i class="fas fa-plus fa-3x"></i>
                                </div>
                            </div>
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/mb.jpg" alt="">

                        </div>
                    </div>

                    <!-- Portfolio Item 2 -->
                    <div class="col-md-6 col-lg-4">
                        <div class="portfolio-item mx-auto" data-toggle="modal" data-target="#portfolioModal2">
                            <div class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
                                <div class="portfolio-item-caption-content text-center text-white">
                                    <i class="fas fa-plus fa-3x"></i>
                                </div>
                            </div>
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/BR.png" alt="">
                        </div>
                    </div>

                    <!-- Portfolio Item 3 -->
                    <div class="col-md-6 col-lg-4">
                        <div class="portfolio-item mx-auto" data-toggle="modal" data-target="#portfolioModal3">
                            <div class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
                                <div class="portfolio-item-caption-content text-center text-white">
                                    <i class="fas fa-plus fa-3x"></i>
                                </div>
                            </div>
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/bp.jpg" alt="">
                        </div>
                    </div>

                    <!-- Portfolio Item 4 -->
                    <div class="col-md-6 col-lg-4">
                        <div class="portfolio-item mx-auto" data-toggle="modal" data-target="#portfolioModal4">
                            <div class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
                                <div class="portfolio-item-caption-content text-center text-white">
                                    <i class="fas fa-plus fa-3x"></i>
                                </div>
                            </div>
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/ji.jpg" alt="">
                        </div>
                    </div>

                    <!-- Portfolio Item 5 -->
                    <div class="col-md-6 col-lg-4">
                        <div class="portfolio-item mx-auto" data-toggle="modal" data-target="#portfolioModal5">
                            <div class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
                                <div class="portfolio-item-caption-content text-center text-white">
                                    <i class="fas fa-plus fa-3x"></i>
                                </div>
                            </div>
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/lm.jpg" alt="">
                        </div>
                    </div>

                    <!-- Portfolio Item 6 -->
                    <div class="col-md-6 col-lg-4">
                        <div class="portfolio-item mx-auto" data-toggle="modal" data-target="#portfolioModal6">
                            <div class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
                                <div class="portfolio-item-caption-content text-center text-white">
                                    <i class="fas fa-plus fa-3x"></i>
                                </div>
                            </div>
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/bd.jpg" alt="">
                        </div>
                    </div>

                </div>
                <!-- /.row -->

            </div>
        </section>

        <!-- About Section -->
        <section class="page-section bg-primary text-white mb-0" id="about">
            <div class="container">

                <!-- About Section Heading -->
                <h2 class="page-section-heading text-center text-uppercase text-white">Sobre nós</h2>
                <br>
                <br>
                <!-- About Section Content -->
                <div class="row">
                    <div class="col-lg-4 ml-auto">
                        <p class="lead">Somos uma plataforma que tem como seu principal objectivo proporcionar a venda de diversos bilhetes para jogos aos clientes.</p>
                    </div>
                    <div class="col-lg-4 mr-auto">
                        <p class="lead">Vendemos os bilhetes a um preço muito reduzido, isso torna a nossa empresa uma das melhores.</p>
                    </div>
                </div>
            </div>
        </section>


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
                        <p class="lead mb-1">sgrvb@gmail.com</p>
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

        <!-- Portfolio Modal 1 -->
        <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-labelledby="portfolioModal1Label" aria-hidden="true">
            <div class="modal-dialog modal-xl" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">
                            <i class="fas fa-times"></i>
                        </span>
                    </button>
                    <div class="modal-body text-center">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-lg-8">
                                    <!-- Portfolio Modal - Title -->
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">AC MILAN Vs BENFICA</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>
                                        <br>
                                        <br>
                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/mb.jpg" alt="">
                                    <br>
                                    <b>DATA: ${ev1.datajogo}</b> <br>
                                    <b>VALOR: ${ev1.valor}</b> <br>
                                    <b>BILHETES DISPONÍVEIS: ${ev1.bilhetesDisponiveis}</b> <br> <br>

                                    <button class="btn btn-primary" href="#" data-dismiss="modal">
                                        <i class="fas fa-times fa-fw"></i>
                                        Fechar
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Portfolio Modal 2 -->
        <div class="portfolio-modal modal fade" id="portfolioModal2" tabindex="-1" role="dialog" aria-labelledby="portfolioModal2Label" aria-hidden="true">
            <div class="modal-dialog modal-xl" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">
                            <i class="fas fa-times"></i>
                        </span>
                    </button>
                    <div class="modal-body text-center">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-lg-8">
                                    <!-- Portfolio Modal - Title -->
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">FC Barcelona Vs Real Madrid</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>

                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/BR.png" alt="">
                                    <br>
                                    <b>DATA: ${ev2.datajogo}</b> <br>
                                    <b>VALOR: ${ev2.valor}</b> <br>
                                    <b>BILHETES DISPONÍVEIS: ${ev2.bilhetesDisponiveis}</b> <br> <br>

                                    <button class="btn btn-primary" href="#" data-dismiss="modal">
                                        <i class="fas fa-times fa-fw"></i>
                                        Fechar
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Portfolio Modal 3 -->
        <div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" role="dialog" aria-labelledby="portfolioModal3Label" aria-hidden="true">
            <div class="modal-dialog modal-xl" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">
                            <i class="fas fa-times"></i>
                        </span>
                    </button>
                    <div class="modal-body text-center">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-lg-8">
                                    <!-- Portfolio Modal - Title -->
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">S. L. Benfica Vs FC Porto</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>

                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/bp.jpg" alt="">
                                    <br>
                                    <b>DATA: ${ev3.datajogo}</b> <br>
                                    <b>VALOR: ${ev3.valor}</b> <br>
                                    <b>BILHETES DISPONÍVEIS: ${ev3.bilhetesDisponiveis}</b> <br> <br>
                                  
                                   
                                    <button class="btn btn-primary" href="#" data-dismiss="modal">
                                        <i class="fas fa-times fa-fw"></i>
                                        Fechar
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Portfolio Modal 4 -->
        <div class="portfolio-modal modal fade" id="portfolioModal4" tabindex="-1" role="dialog" aria-labelledby="portfolioModal3Label" aria-hidden="true">
            <div class="modal-dialog modal-xl" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">
                            <i class="fas fa-times"></i>
                        </span>
                    </button>
                    <div class="modal-body text-center">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-lg-8">
                                    <!-- Portfolio Modal - Title -->
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">JUVENTUS Vs Inter de Milão</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>

                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/ji.jpg" alt="">
                                    <br>
                                    <b>DATA: ${ev4.datajogo}</b> <br>
                                    <b>VALOR: ${ev4.valor}</b> <br>
                                    <b>BILHETES DISPONÍVEIS: ${ev4.bilhetesDisponiveis}</b> <br> <br>

                                    <button class="btn btn-primary" href="#" data-dismiss="modal">
                                        <i class="fas fa-times fa-fw"></i>
                                        Fechar
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Portfolio Modal 5 -->
        <div class="portfolio-modal modal fade" id="portfolioModal5" tabindex="-1" role="dialog" aria-labelledby="portfolioModal5Label" aria-hidden="true">
            <div class="modal-dialog modal-xl" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">
                            <i class="fas fa-times"></i>
                        </span>
                    </button>
                    <div class="modal-body text-center">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-lg-8">
                                    <!-- Portfolio Modal - Title -->
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">Liverpool Vs Man. United</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>

                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/lm.jpg" alt="">
                                    <br>
                                    <b>DATA: ${ev5.datajogo}</b> <br>
                                    <b>VALOR: ${ev5.valor}</b> <br>
                                    <b>BILHETES DISPONÍVEIS: ${ev5.bilhetesDisponiveis}</b> <br> <br>

                                    <button class="btn btn-primary" href="#" data-dismiss="modal">
                                        <i class="fas fa-times fa-fw"></i>
                                        Fechar
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Portfolio Modal 6 -->
        <div class="portfolio-modal modal fade" id="portfolioModal6" tabindex="-1" role="dialog" aria-labelledby="portfolioModal6Label" aria-hidden="true">
            <div class="modal-dialog modal-xl" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">
                            <i class="fas fa-times"></i>
                        </span>
                    </button>
                    <div class="modal-body text-center">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-lg-8">
                                    <!-- Portfolio Modal - Title -->
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">Borussia Dortmund Vs Bayern Muchen</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>

                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/bd.jpg" alt="">
                                    <br>
                                    <b>DATA: ${ev6.datajogo}</b> <br>
                                    <b>VALOR: ${ev6.valor}</b> <br>
                                    <b>BILHETES DISPONÍVEIS: ${ev6.bilhetesDisponiveis}</b> <br> <br>

                                    <button class="btn btn-primary" href="#" data-dismiss="modal">
                                        <i class="fas fa-times fa-fw"></i>
                                        Fechar
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="portfolio-modal modal fade" id="portfolioModal7" tabindex="-1" role="dialog" aria-labelledby="portfolioModal7Label" aria-hidden="true">
            <div class="modal-dialog modal-xl" role="document">
                <div class="modal-content">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">
                            <i class="fas fa-times"></i>
                        </span>
                    </button>

                </div>
            </div>
        </div>
    </div>
</div>
</div>
</div>

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
