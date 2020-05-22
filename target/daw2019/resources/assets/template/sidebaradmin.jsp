<!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<c:url value='/inicial/inicia'/>">
                    <div class="sidebar-brand-icon rotate-n-15">
                        <i class="fas fa-laugh-wink"></i>
                    </div>
                   <c:forEach items="${lista}" var="uso">
                        <div class="sidebar-brand-text mx-3">Admin: ${uso.nome}<sup></sup></div>
                    </c:forEach>
                </a>

                <!-- Divider -->
                <hr class="sidebar-divider my-0">

                <!-- Nav Item - Dashboard -->
                <li class="nav-item active">
                    <a class="nav-link" href="<c:url value='/inicial/inicia'/>">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Painel de Controle</span></a>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider">

                <!-- Heading -->
                <div class="sidebar-heading">
                    Acções
                </div>

                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Paines de Registo</span>
                    </a>
                    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <h6 class="collapse-header">registar:</h6>
                            <a class="collapse-item" href="<c:url value='/grupo/create'/>">Grupo</a>
                            <a class="collapse-item" href="<c:url value='/especialidade/create'/>">Especialidade</a>
                            <a class="collapse-item" href="<c:url value='/funcionario/create'/>">Funcionario</a>
                            <a class="collapse-item" href="<c:url value='/categoria/create'/>" >Categorias de Jogo</a>
                            <a class="collapse-item"  href="<c:url value='/mensagem/create'/>">Mensagem</a>
                            <a class="collapse-item" href="<c:url value='/jogo/create'/>">Jogo</a>
                            <a class="collapse-item" href="<c:url value='/evento/create'/>">Evento do Jogo</a>
                            <a class="collapse-item" href="<c:url value='/tipopagamento/create'/>">Tipo de Pagamento</a>
                        </div>
                    </div>
                </li>

                <!-- Nav Item - Utilities Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
                        <i class="fas fa-fw fa-wrench"></i>
                        <span>Paines de Visualização</span>
                    </a>
                    <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <h6 class="collapse-header">Visualizar:</h6>
                              <a class="collapse-item" href="<c:url value='/grupo/visualizar'/>">Grupo</a>
                            <a class="collapse-item" href="<c:url value='/especialidade/visualizar'/>">Especialidade</a>
                            <a class="collapse-item" href="<c:url value='/funcionario/visualizar'/>">Funcionario</a>
                            <a class="collapse-item" href="<c:url value='/categoria/visualizar'/>" >Categorias de Jogo</a>
                            <a class="collapse-item"  href="<c:url value='/mensagem/visualizar'/>">Mensagem</a>
                            <a class="collapse-item" href="<c:url value='/jogo/visualizar'/>">Jogo</a>
                            <a class="collapse-item" href="<c:url value='/evento/visualizar'/>">Evento do Jogo</a>
                            <a class="collapse-item" href="<c:url value='/tipopagamento/visualizar'/>">Tipo de Pagamento</a>
                            <a class="collapse-item" href="<c:url value='/pagamento/visualizar'/>">Confirmação Pagamento</a>
                        </div>
                    </div>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider">

                <!-- Heading -->
                <div class="sidebar-heading">
                    Estatisticas
                </div>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value='/grafico/grafico'/>">
                        <i class="fas fa-fw fa-chart-area"></i>
                        <span>Gráficos</span></a>
                </li>

                <!-- Nav Item - Tables -->
<!--                <li class="nav-item">
                    <a class="nav-link" href="#">
                        <i class="fas fa-fw fa-table"></i>
                        <span>Relatórios</span></a>
                </li>-->

                <hr class="sidebar-divider">
                <!-- Nav Item - Charts -->

                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
                        <i class="fas fa-fw fa-cog"></i>
                        <span>Definições</span>
                    </a>
                    <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <h6 class="collapse-header">Definições:</h6>
                            <a class="collapse-item" href="forgot-password.html">Alterar Senha</a>
                            <a class="collapse-item" href="#" data-toggle="modal" data-target="#logoutModal">Sair da Conta</a>
                        </div>
                    </div>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider d-none d-md-block">

                <!-- Sidebar Toggler (Sidebar) -->
                <div class="text-center d-none d-md-inline">
                    <button class="rounded-circle border-0" id="sidebarToggle"></button>
                </div>

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
                                    <span class="mr-2 d-none d-lg-inline text-gray-600 medium">Sgrbc Tpcazt</span>
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