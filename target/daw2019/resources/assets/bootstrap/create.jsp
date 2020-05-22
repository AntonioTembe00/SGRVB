<%-- 
    Document   : create
    Created on : Oct 8, 2019, 7:55:56 AM
    Author     : w.c
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/bootstrap/css/bootstrap.min.css" />
        <title>Categoria</title>
    </head>
    <body>
        <h1>Categoria</h1>

        <div class="tab-pane" id="mbox_new">
            <form name="reg_users" id="new_message_form" class="form-horizontal" action="<c:url value='/categoria/add'/>">
                <div class="col-md-3">
                </div>

                <div class="col-md-6"> 

                    <div class="col-md-12">
                        <label for="v_street">Nome Categoria</label>
                        <input type="text" name="entity.nome" id="v_username" class="input-sm form-control">
                    </div>
                  
                    <div class="col-md-12">
                        <label>Descricao</label>
                        <input type="text" name="entity.descricao" id="v_username" class="input-sm form-control">
                    </div>
                   
                    <div class="col-md-12">
                        <br>
                        <br>
                        <div class="col-md-12">
                            <button type="submit" class="btn btn-primary">Gravar</button>
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
                            <th width="22%">Nome</th>
                            <th width="10%">Descricao</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${list}" var="entity">
                            <tr class="read">
                                <td width="22%">${entity.nome}</td>
                                <td width="10%">${entity.descricao}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>

    </body>
</html>
