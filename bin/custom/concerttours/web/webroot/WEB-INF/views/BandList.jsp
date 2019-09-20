<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<title>Band List</title>
<body>
<h1>ConcertTours Project</h1>
<h2>Band List</h2>
<ul>
    <c:forEach var="band" items="${bands}">
        <li><a href="./bands/${band.id}">${band.name}<img src="${band.imageURL}"/></a></li>
    </c:forEach>
</ul>
</body>
</html>