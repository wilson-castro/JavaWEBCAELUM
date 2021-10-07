<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,
          dao.*,
          modelo.*" %>          
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <table>
   
   
  	 <thead>
  	 	<tr>
  	 	 <th>Nome</th>
   	 	 <th>Email</th>
   	 	 <th>Endereco</th>
   	 	 <th>Data de Nascimento</th>
 		 <th></th>
  		 </tr>
  	 </thead>
  	 <tbody>
  	 <%
      ContatoDao dao = new ContatoDao();
      List<Contato> contatos = dao.getLista();

      for (Contato contato : contatos ) {
    %>
      <tr>
        <td><%=contato.getNome() %></td>
        <td><%=contato.getEmail() %></td>
        <td><%=contato.getEndereco() %></td>
        <td><%=contato.getDataNascimento().getTime() %></td>
        <td>
        <a href="mvc?logica=RemoveContatoLogica&id=${contato.id}">Remover</a>
        </td>
      </tr>
    <%
      }
    %>
  	 </tbody>
    
  </table>
</body>
</html>