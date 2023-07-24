<%@ page contentType="text/html; charset=UTF-8" %>
<form method="POST" action="ex02_ps.jsp">
    아이디 : <input type="text" name="userId"><br>
    비밀번호 : <input type="password" name="userPw"><br>
    비밀번호확인 : <input type="password" name="userPwRe"><br>
    취미 :
    <input type="checkbox" name="hobby" value="축구">축구
    <input type="checkbox" name="hobby" value="야구">야구
    <input type="checkbox" name="hobby" value="독서">독서
    <input type="checkbox" name="hobby" value="피아노">피아노

    <button type="submit">회원가입</button>
</form>