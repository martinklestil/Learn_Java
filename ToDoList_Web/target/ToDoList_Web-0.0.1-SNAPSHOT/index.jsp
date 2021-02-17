<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">       
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <title>To Do List</title>
    </head>
    <body>
        <div class="container">
            <div class="App">
                <h1>To Do List</h1>
                <input id="inputField" type="text"><button id="addButton">+</button></input>
                <!--Container for to dos-->
                <div class="toDos" id="toDoList">
                </div>
            </div>
        </div>
        <!--JS File-->
        <script src="/js/main.js"></script>
    </body>
</html>