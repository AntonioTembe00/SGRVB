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
                <c:forEach items="${lista}" var="uso">
                    <a class="navbar-brand js-scroll-trigger" href="#page-top">${uso.nome}</a>
                </c:forEach>
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
                <p class="masthead-subheading font-weight-light mb-0">RESERVE BILHETES E PAGUE ATRAVES DOS NOSSOS VARIADOS METODOS DE PAGAMENTO</p>

            </div>
        </header>
        

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
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme2.jpg" alt="">

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
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme1.jpg" alt="">
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
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme3.jpg" alt="">
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
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme4.jpg" alt="">
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
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme6.jpg" alt="">
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
                            <img class="img-fluid" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme5.jpg" alt="">
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
                        <p class="lead">Somos um cinema que tem como seu principal objectivo proporcionar diversão aos clientes.</p>
                    </div>
                    <div class="col-lg-4 mr-auto">
                        <p class="lead">Apresentar filmes de qualidade e em bom horarios torna a nossa empresa uma das melhores.</p>
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
                        <a class="btn btn-outline-light btn-social mx-1" href="https://www.facebook.com/SGRBC-107177634040594/ad_center/?refSource=pages_manager_bar">
                            <i class="fab fa-fw fa-facebook-f"></i>
                            
                        </a>
                        <a class="btn btn-outline-light btn-social mx-1" href="#">
                            <i class="fab fa-fw fa-twitter"></i>
                        </a>
                        <a class="btn btn-outline-light btn-social mx-1" href="#">
                            <i class="fab fa-fw fa-linkedin-in"></i>
                        </a>
                        <a class="btn btn-outline-light btn-social mx-1" href="#">
                            <i class="fab fa-fw fa-dribbble"></i>
                        </a>
                    </div>

                    <!-- Footer About Text -->
                    <div class="col-lg-4" id="contacto">
                        <h4 class="text-uppercase mb-4">Contacto</h4>
                        <p class="lead mb-0">841278345</p>
                        <p class="lead mb-1">sgrbc@gmail.com</p>
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
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">JOKER</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>
                                        <br>
                                        <br>
                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme2.jpg" alt="">
                                    <br>
                                    <b>DATA: 4-12-2019</b> <br>
                                    <b>HORA: 17H30</b> <br> <br>

                                    <!-- Portfolio Modal - Text -->
                                    <p class="mb-5"> <b>DESCRIÇÃO:</b> Titulo original : Joker
                                        Lançamento: 3 de outubro de 2019 Cinema
                                        Gênero: Crime, Drama, Thriller
                                        Qualidade: 2D
                                        Idioma: Português
                                        Duração: 2h 2min.
                                    </p>
                                    <p><b>SINOPSE:</b> O comediante falido Arthur Fleck encontra violentos bandidos pelas ruas de Gotham City. Desconsiderado pela sociedade, Fleck começa a ficar louco e se transforma no criminoso conhecido como Coringa.</p>
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
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">REI LEÃO</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>

                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme1.jpg" alt="">
                                    <br>
                                    <b>DATA: 20-11-2019</b> <br>
                                    <b>HORA: 17H30</b> <br> <br>

                                    <!-- Portfolio Modal - Text -->
                                    <p class="mb-5"> <b>DESCRIÇÃO:</b> Título Traduzido: O Rei Leão
                                        Título Original: The Lion King
                                        IMDb: 6,3/10
                                        Gênero: Animação, Aventura, Drama
                                        Lançamento: 2019
                                        Qualidade: 3D
                                        Áudio: Inglês
                                        Legenda: Português
                                        Duração: 1h 58 Min.
                                    </p>
                                    <p><b>SINOPSE:</b> Simba idolatra seu pai, Rei Mufasa, e leva a sério seu futuro real. Mas nem todos do reino celebram sua chegada. Scar, o irmão de Mufasa e anterior herdeiro do trono, tem seus próprios planos. A batalha pela Pedra do Reino será repleta de traições, tragédia e drama, resultando no exilo de Simba. Com ajuda de uma curiosa dupla de novos amigos, Simba deverá descobrir como crescer e tomar o que é seu por direito.</p>
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
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">IRMÃOS URSO</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>

                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme3.jpg" alt="">
                                    <br>
                                    <b>DATA: 19-11-2019</b> <br>
                                    <b>HORA: 14H30</b> <br> <br>

                                    <!-- Portfolio Modal - Text -->
                                    <p class="mb-5"> <b>DESCRIÇÃO:</b> Irmãos Urso – A Viagem de Volta Para Casa
                                        Título Original: Boonie Bears: Homeward Journey
                                        Lançamento no Brasil: 2015
                                        Gênero: Animação, Aventura, Comédia
                                        INFORMAÇÕES DO ARQUIVO
                                        Formato: Mkv
                                        Qualidade: 3D
                                        Idioma: Português
                                        Legenda: Português
                                        Duração: 1h 08Min.
                                    </p>
                                    <p><b>SINOPSE:</b> Simba idolatra seu pai, Rei Mufasa, e leva a sério seu futuro real. Mas nem todos do reino celebram sua chegada. Scar, o irmão de Mufasa e anterior herdeiro do trono, tem seus próprios planos. A batalha pela Pedra do Reino será repleta de traições, tragédia e drama, resultando no exilo de Simba. Com ajuda de uma curiosa dupla de novos amigos, Simba deverá descobrir como crescer e tomar o que é seu por direito.</p>
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
        <div class="portfolio-modal modal fade" id="portfolioModal4" tabindex="-1" role="dialog" aria-labelledby="portfolioModal4Label" aria-hidden="true">
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
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">TRAPACEIRAS</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>

                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme4.jpg" alt="">
                                    <br>
                                    <b>DATA: 14-11-2019</b> <br>
                                    <b>HORA: 17H30</b> <br> <br>

                                    <!-- Portfolio Modal - Text -->
                                    <p class="mb-5"> <b>DESCRIÇÃO:</b> Titulo Original: The Hustle
                                        Ano de Lançamento: 2019
                                        Gênero: Comédia, Crime
                                        Qualidade: 3D
                                        Idioma: Português, Inglês
                                        Legenda: Português
                                        Duração: 1h 33 Min.
                                    </p>
                                    <p><b>SINOPSE:</b> Duas vigaristas, uma de baixo nível e outra de alto nível, competem para conseguir extorquir a fortuna de um ingênuo prodígio da tecnologia.</p>
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
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">REI LEÃO</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>

                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme6.jpg" alt="">
                                    <br>
                                    <b>DATA: 20-11-2019</b> <br>
                                    <b>HORA: 17H30</b> <br> <br>

                                    <!-- Portfolio Modal - Text -->
                                    <p class="mb-5"> <b>DESCRIÇÃO:</b> Título Traduzido: O Rei Leão
                                        Título Original: The Lion King
                                        IMDb: 6,3/10
                                        Gênero: Animação, Aventura, Drama
                                        Lançamento: 2019
                                        Qualidade: 3D
                                        Áudio: Inglês
                                        Legenda: Português
                                        Duração: 1h 58 Min.
                                    </p>
                                    <p><b>SINOPSE:</b> Simba idolatra seu pai, Rei Mufasa, e leva a sério seu futuro real. Mas nem todos do reino celebram sua chegada. Scar, o irmão de Mufasa e anterior herdeiro do trono, tem seus próprios planos. A batalha pela Pedra do Reino será repleta de traições, tragédia e drama, resultando no exilo de Simba. Com ajuda de uma curiosa dupla de novos amigos, Simba deverá descobrir como crescer e tomar o que é seu por direito.</p>
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
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">WATCHMEN</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>

                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme5.jpg" alt="">
                                    <br>
                                    <b>DATA: 02-11-2019</b> <br>
                                    <b>HORA: 19H30</b> <br> <br>

                                    <!-- Portfolio Modal - Text -->
                                    <p class="mb-5"> <b>DESCRIÇÃO:</b> Título Original: Watchmen
                                        Ano de Lançamento: 2019
                                        Gênero: Ação | Drama | Mistério
                                        Qualidade: 2D
                                        Áudio: Inglês, Português
                                        Legenda: Português
                                        Duração: 60 Minutos.
                                    </p>
                                    <p><b>SINOPSE:</b> Numa realidade alternativa dos Estados Unidos, vigilantes mascarados se tornam fora-da-lei por conta de seus métodos violentos. Apesar disso, alguns deles se reúnem para iniciar uma revolução enquanto outros tentam pará-la antes que seja tarde demais. Mas o maior questionamento que surge é: quem observa os Watchmen?.</p>
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
                    <div class="modal-body text-center">
                        <div class="container">
                            <div class="row justify-content-center">
                                <div class="col-lg-8">
                                    <!-- Portfolio Modal - Title -->
                                    <h2 class="portfolio-modal-title text-secondary text-uppercase mb-0">Submarine</h2>
                                    <!-- Icon Divider -->
                                    <div class="divider-custom">
                                        <div class="divider-custom-line"></div>
                                        <div class="divider-custom-icon">
                                            <i class="fas fa-star"></i>
                                        </div>
                                        <div class="divider-custom-line"></div>
                                    </div>
                                    <!-- Portfolio Modal - Image -->
                                    <img class="img-fluid rounded mb-5" src="${pageContext.request.contextPath}/resources/assets/img/portfolio/filme6.jpg" alt="">
                                    <br>
                                    <b>DATA: 28-10-2019</b> <br>
                                    <b>HORA: 17H30</b> <br> <br>

                                    <!-- Portfolio Modal - Text -->
                                    <p class="mb-5"> <b>DESCRIÇÃO:</b> Título Traduzido: O Rei Leão
                                        Título Original: The Lion King
                                        IMDb: 6,3/10
                                        Gênero: Animação, Aventura, Drama
                                        Lançamento: 2019
                                        Qualidade: 3D
                                        Áudio: Inglês
                                        Legenda: Português
                                        Duração: 1h 58 Min.
                                    </p>
                                    <p><b>SINOPSE:</b> Simba idolatra seu pai, Rei Mufasa, e leva a sério seu futuro real. Mas nem todos do reino celebram sua chegada. Scar, o irmão de Mufasa e anterior herdeiro do trono, tem seus próprios planos. A batalha pela Pedra do Reino será repleta de traições, tragédia e drama, resultando no exilo de Simba. Com ajuda de uma curiosa dupla de novos amigos, Simba deverá descobrir como crescer e tomar o que é seu por direito.</p>
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
