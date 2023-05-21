<%@ page import="java.util.Random" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String[] jokes = { "I don’t have a carbon footprint.\n" +
        "I just drive everywhere.","The most corrupt CEOs are those of the pretzel companies.\n" +
        "They’re always so twisted.","When we were kids, we used to be afraid of the dark.\n" +
        "But when we grew up, the electricity bill made us afraid of the light!","What did the asteroid that killed the dinosaurs say?\n" +
        "T.rex, I’m coming for my hug!","An apple a day keeps the doctor away…\n" +
        "Or at least it does if you throw it hard enough.","I have a stepladder because my real ladder left when I was just a kid.","I visited my friend at his new house. He told me to make myself at home.\n" +
        "So I threw him out. I hate having visitors.","I was playing chess with my friend and he said, \n" +
        "Let’s make this interesting.\n" +
        "So we stopped playing chess.","Why did Mozart hate all of his chickens?\n" +
        "When he asked them who the best composer was, they all replied, Bach, Bach, Bach."}; %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> AI2 - LAB8 </title>
</head>
<body>
<div style="margin: auto; margin-top: 14%; width: 50%;padding: 10px;">
    <% if (session.getAttribute("name") != null) {%>
    <h1 style="width: 100%; text-align: center;">
        Hello <%= session.getAttribute("name") %>!
    </h1>
    <% } else { %>
    <h1 style="width: 100%; text-align: center;">
        You are unknown user!
    </h1>
    <% } %>

    <div style="display: flex; justify-content: center; align-items: center;">
        <h2> Log in: </h2>

        <form action="save" method="post" style="display:flex; flex-direction: row; justify-content: center; align-items: center;">
            <input type = "text" name="name" style="margin-left: 10px;">
            </br> </br> <input type="submit" value="Submit" style="margin-left: 10px;">
        </form>

        <form action="forget" method="get">
            <input type="submit" value="Log out" style="margin-left: 10px;">
        </form>
    </div>
    <% if (session.getAttribute("name") != null) {%>
        <h2> Your joke for the day: </h2>
            <%
        Random rand = new Random();
        int randomNumber = rand.nextInt(7);
    %>
            <%= jokes[randomNumber] %>
    <% } else { %>
    <h1>
        Unknown user don't get a joke!
    </h1>
    <% } %>
</div>
</body>
</html>