<%-- 
    Document   : create
    Created on : Oct 8, 2019, 7:55:56 AM
    Author     : w.c
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dao.CategoriaDAO"%>
<%@page import="model.Categoria"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/bootstrap/css/bootstrap.min.css" />
        <title>Pagamento</title>
    </head>
    <body>
        <h1>Pagamento</h1>

        <div class="tab-pane" id="mbox_new">
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
            <form name="reg_users" id="new_message_form" class="form-horizontal" action="<c:url value='/pagamento/add'/>">
                <div class="col-md-3">
                    <input type="hidden" name="id" value="${entity.id }" >
                </div>

                <div class="col-md-6"> 

                    <div class="col-md-12">
                        <label for="v_street">Reserva</label>
                    </div>

                    <div class="col-md-12">

                        <select class="required" name="reserva">
                            <option value="selecione">Selecione Reserva</option>
                            <c:forEach items="${reslista}" var="re">
                                <option value="${re.id}">${re.id}</option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="col-md-12">
                        <label for="v_street">Tipo Pagamento</label>
                    </div>

                    <div class="col-md-12">

                        <select class="required" name="tipopagamento">
                            <option value="selecione">Selecione tipo</option>
                            <c:forEach items="${tipolista}" var="tip">
                                <option value="${tip.id}">${tip.nome}</option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="col-md-12">
                        <br>
                        <br>
                        <div class="col-md-12">
                            <button type="submit" class="btn btn-primary">Gravar</button>
                            <button type="submit" class="btn btn btn-success"><a href="edita1?id=${entity.id}">Actualizar</button>
                        </div>
                    </div>

                </div>

            </form>
        </div>

        <div class="col-md-12">
            <div class="col-md-3">
            </div>

            <div class="col-md-6"> 
                <br>
                <br>
                <table id="dt_inbox" class="table table_vam mbox_table dTableR" data-msg_rowlink="a">
                    <thead>
                        <tr>
                            <th width="50%">Reserva</th>
                            <th width="50%">Tipo Pagamento</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list}" var="entity">
                            <tr class="read">
                                <td width="50%">${entity.reserva}</td>
                                <td width="50%">${entity.tipopagamento}</td>
                                <td> <a style="margin-left: 23%" href="edita?id=${entity.id}" class="btn btn-warning btn-circle btn-sm" data-toggle="tooltip" data-placement="left" title="actuaizar">
                                    </a>
                                    <a style="margin-left: 20%" href="remove?id=${entity.id}" class="btn btn-danger btn-circle btn-sm" data-toggle="tooltip" title="apagar" data-placement="top">
                                        <i class="fas fa-trash"></i>
                                    </a></td>


                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>

    </body>
</html>
