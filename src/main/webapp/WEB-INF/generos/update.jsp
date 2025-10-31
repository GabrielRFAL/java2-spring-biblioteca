<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Editar Gênero</title>
    </head>
    <body>
        <h1>Editar Gênero</h1>
        <form action="/generos/update" method="post">
            <input type="hidden" name="id" value="${genero.id}">
            <label for="genero">Novo Gênero</label>
            <input type="text" name="genero" value="${genero.nome}" />
            <button type="submit">Salvar</button>
        </form>
    </body>
</html>